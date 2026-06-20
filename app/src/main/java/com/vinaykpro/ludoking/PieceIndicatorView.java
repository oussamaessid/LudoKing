package com.vinaykpro.ludoking;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatImageView;

public class PieceIndicatorView extends AppCompatImageView {

    private final Paint strokePaint = new Paint(Paint.ANTI_ALIAS_FLAG);
    private final Paint fillPaint   = new Paint(Paint.ANTI_ALIAS_FLAG);

    private boolean dashed = false;
    private DashPathEffect dashEffect;

    public PieceIndicatorView(Context context) {
        super(context);
        applyColor(0xFF6E1414);
    }

    public PieceIndicatorView(Context context, AttributeSet attrs) {
        super(context, attrs);
        initFromAttrs(context, attrs);
    }

    public PieceIndicatorView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        initFromAttrs(context, attrs);
    }

    private void initFromAttrs(Context ctx, AttributeSet attrs) {
        TypedArray a = ctx.obtainStyledAttributes(attrs, R.styleable.PieceIndicatorView);
        int color = a.getColor(R.styleable.PieceIndicatorView_pieceColor, 0xFF6E1414);
        a.recycle();
        applyColor(color);
    }

    private void applyColor(int color) {
        strokePaint.setStyle(Paint.Style.STROKE);
        strokePaint.setColor(color);

        fillPaint.setStyle(Paint.Style.FILL);
        fillPaint.setColor((color & 0x00FFFFFF) | 0x30000000);
    }

    public void setDashed(boolean d) {
        if (dashed == d) return;
        dashed = d;
        invalidate();
    }

    @Override
    protected void onDraw(Canvas canvas) {
        float cx = getWidth()  / 2f;
        float cy = getHeight() / 2f;
        float r  = Math.min(cx, cy) * 0.82f;

        float sw = r * 0.28f;
        strokePaint.setStrokeWidth(sw);

        if (dashed) {
            if (dashEffect == null) {
                dashEffect = new DashPathEffect(new float[]{sw * 1.4f, sw * 1.0f}, 0);
            }
            strokePaint.setPathEffect(dashEffect);
            // dashed: only the ring, no fill
            canvas.drawCircle(cx, cy, r - sw / 2f, strokePaint);
        } else {
            strokePaint.setPathEffect(null);
            canvas.drawCircle(cx, cy, r, fillPaint);
            canvas.drawCircle(cx, cy, r - sw / 2f, strokePaint);
        }
    }
}

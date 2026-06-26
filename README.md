# Ludo King Clone Project

## Overview

Welcome to the repository for my Ludo King Clone project! This project was developed as a demonstration of my Android app development skills using Android Studio. Inspired by the popular Ludo King game, I aimed to recreate the classic board game experience for mobile devices — with an added **Penalty Mode** that brings a new layer of strategy and consequence to every match.

## Game Preview

![Ludo King Clone Preview](https://github.com/Vinaykpro/Ludo_King_Clone/blob/master/ludo_clone_preview.gif)

## Features

### Game Modes
- **Classic** — Standard Ludo rules for 2–4 players
- **Team Up** — Players compete in teams
- **Quick** — Shorter match variant
- **vs Computer (AI)** — Play against bot-controlled opponents

### Penalty Mode (Added Feature)
Before each match, players select one of three penalty strategies applied when a player ignores an available kill:

| Mode | Punishment |
|------|-----------|
| **Kill Penalty** | The offending player's piece is sent back home |
| **Skip Turn** | The offending player loses their next turn |
| **Warning + Replacement** | First offense shows a warning and records the victim; on the next turn the victim plays in the offender's place |

### Other Features
- Pass-and-play local multiplayer (up to 4 players)
- Customizable player names and token colors
- Bot players per individual slot
- In-game penalty message overlay for real-time feedback

## Technologies Used

- **Android Studio:** The project is developed using Android Studio, making use of its powerful tools and features for Android app development.
- **Java Programming Language:** Java is used for all backend game logic, ensuring efficient and reliable performance.
- **ConstraintLayout / XML:** Responsive UI designed to work across various screen sizes.

## Project Structure

```
app/src/main/
├── java/.../
│   ├── SplashActivity.java     # Startup splash screen
│   ├── HomeActivity.java       # Menus, mode selection, penalty mode screen
│   └── MainActivity.java       # All game logic (board, dice, pieces, penalty engine)
└── res/
    ├── layout/
    │   ├── activity_home.xml   # Home/menu layouts + penalty mode overlay
    │   └── activity_main.xml   # Game board layout + in-game penalty message view
    └── values/
        └── strings.xml
```

## How to Use

1. **Clone the Repository:**
   ```bash
   git clone https://github.com/OussamaEssid/Ludo_King_Penalty.git
   ```

2. **Open in Android Studio:**
   Open the cloned project and let Gradle sync finish.

3. **Run on device or emulator:**
   Select a target device and press **Run**.

## How to Play

1. Launch the app and choose a game mode from the home screen.
2. Select a **Penalty Mode** (Kill / Skip / Warning) before the match starts.
3. Configure player names, colors, and which slots are controlled by bots.
4. Tap **Start** — the board launches with penalty rules active.
5. Any player who rolls a killable number and ignores it will face the chosen penalty.

## Developer

Developed by **Oussama Essid** as a portfolio Android project.

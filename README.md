# MonopolyProject

## Project Description

Monopoly Team Repo for Term Project CSCI 234

This project is a adaptation of the classic Monopoly board game, developed as a term project for CSCI 234. It allows
multiple players to engage in the game, simulating property trading, rent payments, and strategic financial planning.

## Installation and Setup

### Prerequisites

Before running the project, ensure you have the following installed:

- Java version 23 or higher
- Git (for cloning the repository)
- An ide with java support such as: Intellij Idea, Vscode

### Steps to Install

1. **Clone the Repository:**
   ```bash
   git clone https://github.com/AJamell/MonopolyProject.git
   cd MonopolyProject
   ```
2. **Build the Project:** 
    - Open the project in your preferred IDE (e.g., IntelliJ IDEA, VS Code with Java support).
    - Ensure all dependencies are resolved.
    - Compile the project.

3. **Run the Application:**

     #### (In your IDE)<br>
    - Locate the main class in the source files.
    - Run the main class to start the game.
     #### (In terminal)<br>
    - Navigate to the project directory and run the main class using:
    ```bash
    mvn clean package
    java -jar target/MonopolyProject-1.0-Project.jar 

    ```
## How to Play

### Starting the Model.GameTests

- Launch the application to access the main menu.
- Choose the number of players (2-4).

### Gameplay Overview

- Players take turns rolling dice to move around the board.
- Depending on the landed property, players can buy, pay rent, or draw cards.
- The objective is to accumulate wealth and bankrupt opponents.

### Controls

- Use on-screen buttons to roll dice, manage properties, and end turns.
- Follow in-game prompts for specific actions.

## Design Patterns used
**Model, View, Control design pattern** as the pattern for the entire project. There is a seperation of concerns between each componenet which has its own responsibilities. 
- Model: Handles all game data 
- View: Graphical User Interface
- Controller: Bridges Model and View
**Singleton Pattern** is used in the Banker, GameBoard, Deck, Dice, and Game

## Contributors

- **Giovanny Teran** - TeranG@moravian.edu
- **Jamell Alvarez** - alvarezj@moravian.edu
- **Matthew Kraus** - Krausm@moravian.edu
- **Deborah Rabinovich** - rabinovichd@moravian.edu

## Progress Report
The majority of the project works correctly. The way that some of the controllers are implemented causes the gameplay when inside of the GUI to be incorrect. While the logic of the actual game passes all of the tests, that implementation still needs adjustment. 

## License

This project is for educational purposes and does not have an official license yet.

---



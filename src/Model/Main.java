/*
* CSCI 234: Intro to Software Engineering
* Group: Giovanny, Jamell, Matt, Deborah
* Purpose: This class is responsible for creating the game board, players, and running the game loop.
* Team Member(s) responsible: Giovanny, Jamell
* */

package Model;
import Model.Board.*;
import Model.Exceptions.PlayerNotFoundException;
import Model.Property.Property;
import View.Gui;

import javax.swing.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws PlayerNotFoundException {



            // Use the Event Dispatch Thread for Swing applications
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                    new Gui();
            }
        });


//        System.out.println("");
//        System.out.println("**Sprint 3 House Demo**");
//        Game.resetInstance();
//        Game demoGame = Game.getInstance();
//        GameBoard gameBoardDemo = GameBoard.getInstance();
//        Banker bankerHouses = Banker.getInstance();
//        Player player1Houses = new HumanPlayer("Alice", gameBoardDemo);
//        Player player2Houses = new HumanPlayer("Bob", gameBoardDemo);
//        demoGame.addPlayer(player1Houses);
//        demoGame.addPlayer(player2Houses);
//        System.out.println("Added players: " + player1Houses.getName() + ", " + player2Houses.getName());
//        demoGame.startGame();
//        Property mediterranean = (Property) gameBoardDemo.getSpace(1);
//        Property baltic = (Property) gameBoardDemo.getSpace(3);
//
//        bankerHouses.addTitleDeed(player1Houses, mediterranean);
//        bankerHouses.addTitleDeed(player1Houses, baltic);
//
//        System.out.println(player1Houses.getName() + " owns: " + bankerHouses.getPlayerProperties(player1Houses));
//        System.out.println("Monopoly achieved: " + mediterranean.getColorGroup().hasMonopoly(player1Houses));
//        for (int i = 0; i < 4; i++) {
//            if (mediterranean.canBuyHouse(bankerHouses)) {
//                mediterranean.buyHouse(bankerHouses);
//            }
//            if (baltic.canBuyHouse(bankerHouses)) {
//                baltic.buyHouse(bankerHouses);
//            }
//        }
//        System.out.println("\nHouse purchase results:");
//        System.out.println(mediterranean.getName() + " has " + mediterranean.getNumHouses() + " house(s)");
//        System.out.println(baltic.getName() + " has " + baltic.getNumHouses() + " house(s)");
//        System.out.println("Banker has " + bankerHouses.getAvailableHouses() + " houses left");
//
//        if (baltic.canBuyHotel(bankerHouses)) {
//            boolean hotelSuccess = baltic.buyHotel(bankerHouses);
//            System.out.println("\nHotel purchase on Baltic: " + (hotelSuccess ? "Success" : "Failed"));
//        } else {
//            System.out.println("\nBaltic not eligible for hotel purchase.");
//        }
//
//        System.out.println("\nAfter hotel purchase:");
//        System.out.println(baltic.getName() + " has hotel: " + baltic.hasHotel());
//        System.out.println(baltic.getName() + " houses after hotel: " + baltic.getNumHouses());
//        System.out.println("Banker has " + bankerHouses.getAvailableHotels() + " hotels left");
//        System.out.println("Banker has " + bankerHouses.getAvailableHouses() + " houses left");
//        Banker.reset();
//
//
//        System.out.println("");
//        System.out.println("**Sprint 3 Player Turn Demo**");
//        Game.resetInstance();
//        Game newGame = Game.getInstance();
//        GameBoard newGameBoard = GameBoard.getInstance();
//        Banker banker = Banker.getInstance();
//        Player player1 = new HumanPlayer("Alice", newGameBoard);
//        Player player2 = new HumanPlayer("Bob", newGameBoard);
//        newGame.addPlayer(player1);
//        newGame.addPlayer(player2);
//        System.out.println("Added players: " + player1.getName() + ", " + player2.getName());
//        newGame.startGame();
//        ArrayList<Player> players = newGame.getPlayers();
//        TurnManager turnManager = new TurnManager(players);
//        System.out.println("Turn order: ");
//        for (Player p : turnManager.getTurnOrder()) {
//            System.out.println("- " + p.getName());
//        }
//        for (int turn = 1; turn <= 3; turn++) {
//            System.out.println("\n--- Turn " + turn + " ---");
//            Player currentPlayer = turnManager.getCurrentPlayer();
//            System.out.println("Current player: " + currentPlayer.getName());
//            String turnResult = turnManager.processTurn(currentPlayer);
//            System.out.print(turnResult);
//            turnManager.nextTurn();
//        }
//        Banker.reset();
//        GameBoard.resetInstance();
//
//        System.out.println("");
//        System.out.println("**Sprint 3 Cpu Player Actions Demo**");
//        Game.resetInstance();
//        Game game = Game.getInstance();
//        GameBoard gameBoard = GameBoard.getInstance();
//        Player cpuPlayer3 = new ComputerPlayer("Cpu", gameBoard);
//        Player humanPlayer3 = new HumanPlayer("HumanPlayer", gameBoard);
//        Banker banker4 = Banker.getInstance();
//        game.addPlayer(cpuPlayer3);
//        game.addPlayer(humanPlayer3);
//        game.startGame();
//        System.out.println("Cpu Player: " + cpuPlayer3.getName() + " Added to the game");
//        banker4.getBalance(cpuPlayer3);
//        cpuPlayer3.move(cpuPlayer3,3);
//        System.out.println(cpuPlayer3.getName() + " owns: " + banker4.getPlayerProperties(cpuPlayer3));
//        game.endGame();
//
//

//        System.out.println("");
//        System.out.println("**Sprint 2 Demo Banker Balance Demo**");
//        Banker banker = Banker.getInstance();
//        GameBoard gameBoard = new GameBoard();
//        Player player1 = new HumanPlayer("Alice", gameBoard);
//        Player player5 = new HumanPlayer("Bob", gameBoard);
//        banker.addPlayer(player1);
//        banker.addPlayer(player5);
//        System.out.println("Banker Added Player: " + player1.getName());
//        System.out.println("Banker Added Player: " + player5.getName());
//        System.out.println(player1.getName() + " Balance: " + banker.getBalance(player1));
//        banker.deposit(player1, 900);
//        System.out.println("Balance after deposit: " + banker.getBalance(player1));
//        banker.withdraw(player1, 100);
//        System.out.println("Balance after withdrawal: " + banker.getBalance(player1));
//        banker.transferMoney(player1, player5, 800);
//        System.out.println("Balance after transfer of $800 to Bob: " + banker.getBalance(player1) + " " + banker.getBalance(player5));


//        System.out.println("");
//        System.out.println("**Property Ownership Demo Sprint 2**");
//        Banker banker2 = Banker.getInstance();
//        GameBoard gameBoard2 = new GameBoard();
//        Player player2 = new HumanPlayer("Bob", gameBoard2);
//        ColorGroup colorGroup2 = new ColorGroup(PropertyColor.DARK_BLUE, 2);
//        Property property2 = new Property("Park Place", 37, 350,
//                35, new int[]{175, 500, 1100, 1300}, 1500,
//                200, PropertyColor.DARK_BLUE, colorGroup2);
//        banker2.addTitleDeed(player2, property2);
//        System.out.println("Player 2 owns: " + banker.getPlayerProperties(player2));


//        System.out.println("");
//        System.out.println("**Property Ownership Of Players Sprint 2**");
//        Game game = new Game();
//        Player player8 = new HumanPlayer("Alice", gameBoard2);
//        Player player9 = new HumanPlayer("Bob", gameBoard2);
//        Player player10 = new ComputerPlayer("Cpu", gameBoard2);
//        game.addPlayer(player8);
//        game.addPlayer(player9);
//        game.addPlayer(player10);
//        System.out.println("Player: " + player8.getName() + " Added to the game");
//        System.out.println("Player: " + player9.getName() + " Added to the game");
//        System.out.println("Cpu Player: " + player10.getName() + " Added to the game");
//        game.startGame();
//        game.outputGameState();


//        System.out.println("");
//        System.out.println("**Game Demo Sprint 2**");
//        Banker banker3 = Banker.getInstance();
//        GameBoard gameBoard3 = new GameBoard();
//        Player player3 = new HumanPlayer("Charlie", gameBoard3);
//        banker3.addPlayer(player3);
//        Token token = new Token("Dog");
//        player3.setTokenToPlayer(token);
//        player3.move(player3,5);
//        player3.move(player3,10);


//        system.out.println("**sprint 1 demo**");
//        Banker banker = new Banker();
//        GameBoard gameBoard = new GameBoard(banker);
//        System.out.println("**Player and token demo sprint 1**");
//        Player humanPlayer = new HumanPlayer("Alice", gameBoard);
//        Token token = new Token("Dog");
//        humanPlayer.setTokenToPlayer(token);
//        System.out.println(humanPlayer.getName() + " has a " + humanPlayer.getToken().getType() + " token.");
//        System.out.println("");

//        System.out.println("**Cards demo sprint 1**");
//        CommunityChestCard communityChestCard = new CommunityChestCard();
//        ChanceCard chanceCard = new ChanceCard();
//        int chanceCardCounter = 0;
//        int communityChestCounter = 0;
//        for(int i = 0; i < chanceCard.getCardDeck().size(); i++){
//            System.out.println("Community Chest Card: " + communityChestCard.drawCard());
//            System.out.println("Chance Card: " + chanceCard.drawCard());
//            chanceCardCounter++;
//            communityChestCounter++;
//        }
//        System.out.println("Chance Card Counter: " + chanceCardCounter + '\n' + "Community Chest Card Counter: " + communityChestCounter);
//        System.out.println("");


//        System.out.println("**shuffle deck sprint 1**");
//        communityChestCard.cardRestore();
//        chanceCard.cardRestore();
//        communityChestCard.shuffleDeck();
//        chanceCard.shuffleDeck();
//        int chanceCardCounter2 = 0;
//        int communityChestCounter2 = 0;
//        for(int i = 0; i < communityChestCard.getCardDeck().size(); i++){
//            System.out.println("Community Chest Card: " + communityChestCard.drawCard());
//            System.out.println("Chance Card: " + chanceCard.drawCard());
//            chanceCardCounter2++;
//            communityChestCounter2++;
//        }
//        System.out.println("Chance Card Counter: " + chanceCardCounter2 + '\n' + "Community Chest Card Counter: " + communityChestCounter2);
//        System.out.println("");


//        System.out.println("**Dice Roll Double Demo sprint 1**");
//        Dice dice2 = new Dice();
//        int doubleCount = 0;
//        while (doubleCount < 3) {
//            dice2.roll();
//            if (dice2.isDouble()) {
//                doubleCount++;
//                System.out.println("Double rolled! Count: " + doubleCount);
//            }
//        }
//        if (dice2.goToJail()) {
//            System.out.println("Player goes to jail after rolling 3 doubles!");
//        }


//        Banker banker2 = new Banker();
//        GameBoard gameBoard2 = new GameBoard(banker2);
//        System.out.println("**Turn manager demo sprint 1**");
//        Player player1 = new HumanPlayer("Alice", gameBoard2);
//        Player player2 = new HumanPlayer("Bob", gameBoard2);
//        Player player3 = new HumanPlayer("Charlie", gameBoard2);
//        Player player4 = new HumanPlayer("Dave", gameBoard2);
//        List<Player> players = Arrays.asList(player1, player2, player3, player4);
//        TurnManager turnManager = new TurnManager(players);
//        for (int i = 0; i < 8; i++) {
//            Player currentPlayer = turnManager.getCurrentPlayer();
//            System.out.println("It's " + currentPlayer.getName() + "'s turn!");
//            turnManager.nextTurn();
//        }
//        System.out.println("");

//        System.out.println("**Dice demo sprint 1**");
//        Dice dice = new Dice();
//        Set<Integer> rolledSums = new HashSet<>();
//        while (rolledSums.size() < 12) {
//            dice.roll();
//            int sum = dice.getSum();
//
//            if (!rolledSums.contains(sum)) {
//                rolledSums.add(sum);
//                System.out.println("Die 1: " + dice.getDie1() + ", Die 2: " + dice.getDie2() + ", Sum: " + sum);
//            }
//        }
//        System.out.println("");


    }
}

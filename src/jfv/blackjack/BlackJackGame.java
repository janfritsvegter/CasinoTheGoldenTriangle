package jfv.blackjack;

import java.util.Scanner;
import java.util.Random;


public class BlackJackGame {
    private Scanner inputScanner;
    private Random random;

    private boolean gameIsRunning;

 //   private Deck deck;
//    private Player player;
 //   private Dealer dealer;

    public BlackJackGame(Scanner inputScanner, Random rando) {
        this.inputScanner = inputScanner;
        this.random = random;
    //      this.deck = new Deck();
    }

    public void playGame() {}

}


    /*
    public void playGame() {
        gameIsRunning = true;

        player = new Player();
        dealer = new Dealer();

        deck.shuffle();
        dealer.addCardsToHand(deck.getNextCard());
        player.addCardsToHand(deck.getNextCard(), deck.getNextCard());git

        while (gameIsRunning) {
            runGameLoop();
        }
    }

    public void runGameLoop() {
        renderTableState();

        if (dealer.isBust() || dealer.isStaying() && player.getHandValue() > dealer.getHandValue()) {
            System.out.println("You won!");
            gameIsRunning = false;
            return;
        }

        if (player.isBust() || player.isStaying() && player.getHandValue() <= dealer.getHandValue()) {
            System.out.println("You lost!");
            gameIsRunning = false;
            return;
        }

        if (!player.isStaying()) {
            String move = getNextUserMove();
            player.performMove(deck, move);
        }

        if (!dealer.isStaying() && !player.isBust()) {
            dealer.performMove(deck);
        }
    }

    private String getNextUserMove() {
        while (true) {
            System.out.println("What do you want to do? (hit or stay)");
            String input = inputScanner.nextLine();

            if (input.equals("hit") || input.equals("stay")) {
                return input;
            }
        }
    }

    private void renderTableState() {
        System.out.println("");
        System.out.println("Dealers hand:");
        System.out.println(dealer.renderHand());
        System.out.println("");

        System.out.println("your hand:");
        System.out.println(player.renderHand());
        System.out.println("");
    }
}
*/









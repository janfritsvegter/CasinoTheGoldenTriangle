package jfv.higherlower;

import java.util.Random;
import java.util.Scanner;

public class HigherLowerGame {
    private Scanner inputScanner;
    private Random random;

    private boolean guessedRight;
    private boolean stopPlaying;

    private int numberToGuess;
    private int numberOfTurns;
    private int guess;

    public HigherLowerGame(Scanner inputScanner, Random random) {
        this.inputScanner = inputScanner;
        this.random = random;
    }

    public void playGame() {

        stopPlaying = false;

        while (!stopPlaying) {
            guessedRight = false;
            numberOfTurns = 0;
            numberToGuess = random.nextInt(99) + 1;
            while (!guessedRight) {
                System.out.println("Wat denk je dat het is een geheel getal van 1 to 99?");
                String guessInput = inputScanner.nextLine();
                try {
                    guess = Integer.parseInt(guessInput);
                    if (guess >= 1 && guess <= 99) {
                        checkGuess(guess);
                    } else {
                    }
                } catch (Exception e) {
                }
            }
            System.out.println("Wilt U nog een keer spelen? Ja/Nee");
            String playAgain = inputScanner.nextLine();
            char firstLetterSmall = playAgain.toLowerCase().charAt(0);
            if (firstLetterSmall != 'j') {
                stopPlaying = true;
            }
        }

    }

    public void checkGuess(int guess) {
        numberOfTurns++;
        if (guess < numberToGuess) {
            System.out.println("Je raadde te laag probeer opnieuw");
        } else if (guess > numberToGuess) {
            System.out.println("Je raadde te hoog probeer opnieuw");
        } else if (guess == numberToGuess) {
            System.out.println("Je raadde goed gefeliciteerd");
            guessedRight = true;
        } else {
            System.out.println("Er gebeurde iets raars");
        }

    }

}

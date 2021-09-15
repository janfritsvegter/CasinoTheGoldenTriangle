package jfv;

import jfv.higherlower.HigherLowerGame;

import java.util.Random;
import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        Random random = new Random();

        HigherLowerGame game = new HigherLowerGame(inputScanner,random);
        // BlackjackGame game = new BlackjackGame(inputScanner);

        game.playGame();
    }
}

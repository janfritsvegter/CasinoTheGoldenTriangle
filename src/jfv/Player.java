package jfv;

import java.util.Random;
import java.util.Scanner;

public class Player {
    // private Scanner inputScanner;
    private String firstName;
    private String lastName;
    private String token;


    public Player(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.token = ".";
    }


    public Player(String firstName, String lastName, String token) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.token = token;
    }

    public static String[] inputPlayer(Scanner inputScanner,boolean tokenRequired,int playerNumber){
        String token = " ";
        System.out.print("Speler " + playerNumber + " wat is je voornaam?");
        String firstName = inputScanner.nextLine();
        System.out.print("Speler " + playerNumber + " wat is je achternaam?");
        String lastName = inputScanner.nextLine();

        if(tokenRequired){
           System.out.print("Speler " + playerNumber + " waarmee wil je spelen?");
           token = inputToken(inputScanner, " ");
        }

        String[] data = new String[3];
        data[0] = firstName;
        data[1] = lastName;
        data[2] = token;

        return data;
    }

    // gives a String back
    // and after a max amount of tries a X or a O if X is chosen by the first player
    public static String inputToken(Scanner inputScanner,  String tokenOtherPlayer) {
        String inputToken = " ";
        boolean inputSucces = false;
        System.out.println("Met wat voor teken wil je spelen (1 letter) bij meerdere tekens wordt de eerste genomen");
        while (!inputSucces) {
            inputToken = inputScanner.nextLine();
            char tempToken = inputToken.charAt(0);
            if (tempToken != tokenOtherPlayer.charAt(0)) {
                inputToken = String.valueOf(inputToken);
                inputSucces = true;
            } else {
                System.out.println("Het mag geen " + tokenOtherPlayer + " zijn probeer opnieuw");
            }
        }
        return inputToken;

    }

}

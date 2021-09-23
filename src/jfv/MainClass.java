package jfv;

import jfv.VierOpEenRij.VierOpEenRij;
import jfv.higherlower.HigherLowerGame;
import jfv.blackjack.BlackJackGame;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        Random random = new Random();
        List<Player> players = new ArrayList<>();
        int gameNumber =0;
        String[] gameNames = new String[]{" " , "TicTacToe" , "VierOpEenRij" , "HogerLager" , "BlackJack"};
        int amoutPlayers = 0;
        boolean tokenRequired = true;
        String[] playerData = new String[3];

        /*
        System.out.println(amoutPlayers);
        System.out.println(tokenRequired);
        */

        gameNumber = inputGameNumber(gameNames,inputScanner);

        System.out.println("U hebt gekozen voor " + gameNames[gameNumber]);

        // get from the gameclasses the amount of players and the tokenrequired
        switch(gameNumber){
            case 1: {
                System.out.println("TicTacToe");
                break;
            }
            case 2: {
                amoutPlayers = VierOpEenRij.amountPlayers;
                tokenRequired = VierOpEenRij.tokenRequired;
                System.out.println("Vier op een Rij");
                break;
            }
            case 3:{
                HigherLowerGame game = new HigherLowerGame(inputScanner,random);
                game.playGame();
                break;
            }
            default: {
                BlackJackGame game = new BlackJackGame(inputScanner,random);
                game.playGame();
            }
        }

        for(int i=1; i<=amoutPlayers;i++){
            playerData = Player.inputPlayer(inputScanner,tokenRequired,i);
            Player player = new Player(playerData[0],playerData[1],playerData[2]);
            players.add(player);
        }

    }

    public static int inputGameNumber(String[] gameNames, Scanner inputScanner){
        boolean inputGameNumberSucces = false;
        int gameNumber =0;
        for(int i=1; i<gameNames.length;i++){
            System.out.println(i + " " + gameNames[i]);
        }
        System.out.print("Welk spel wilt U spelen geef aan met het nummer voor de naam");
        inputGameNumberSucces = false;
        while(!inputGameNumberSucces){
            try{
                gameNumber = Integer.parseInt(inputScanner.nextLine());
                if(gameNumber>0 && gameNumber<gameNames.length){
                    inputGameNumberSucces = true;
                }
                else{
                    System.out.println("Het moet een getal tussen de 1 en de " + (gameNames.length-1) + " zijn.");
                    System.out.print("Probeer opnieuw.");
                }
            }
            catch (Exception e){
                System.out.println("Het moet een getal tussen de 1 en de " + (gameNames.length-1) + " zijn.");
                System.out.print("Probeer opnieuw.");
            }
        }
        return gameNumber;
    }
}

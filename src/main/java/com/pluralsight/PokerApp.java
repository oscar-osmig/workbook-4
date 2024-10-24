package com.pluralsight;

import java.util.Scanner;

public class PokerApp {
    private static Scanner scanner = new Scanner(System.in);

    public static void playPoker(String player1, String player2){

        Deck deck = new Deck();
        deck.shuffle();
        Hand hand1 = new Hand();
        Hand hand2 = new Hand();
        // deal 5 cards
        for(int i = 0; i < 2; i++) {
            // get a card from the deck
            Card card = deck.deal();
            // deal that card to the hand
            hand1.Deal(card);

            Card card2 = deck.deal();
            hand2.Deal(card2);
        }
        int handPlayer1 = hand1.getValue();
        int handPlayer2 = hand2.getValue();

        System.out.println("\n" + player1 + " your hand is worth: " + handPlayer1);
        System.out.println(player2 + " your hand is worth: " + handPlayer2);

        int x = 21 - handPlayer1;
        int y = 21 - handPlayer2;
        if (x < y) {
            System.out.println("\n" + player1 + " you win!");
            if(x == 0){
                System.out.println("you hit black jack!");
            }else {
                System.out.println("\nyou were " + x + " away to hitting 21 ...");
            }
        }else if (y < x){
            System.out.println(player2 + " you win!");

            if(y == 0){
                System.out.println("you hit black jack!");
            }else {
                System.out.println("you were " + y + " away to hitting 21 ...");
            }

        }else{
            System.out.println("It's a tie!\nBoth got " + handPlayer1);
        }
    }

    private String[] names = {"player1"};

    public static void main(String[] args) {
        do{
            System.out.print("\nPlayer 1s name: ");
            String player1 = scanner.nextLine();
            System.out.print("Player 2s name: ");
            String player2 = scanner.nextLine();
            playPoker(player1, player2);
            System.out.print("\nWanna play again? y/n ");
            String a = scanner.nextLine();
            if(a.equalsIgnoreCase("n")){
                System.out.println("\nYou suck!");
                return;
            }
        }while (true);

    }
}



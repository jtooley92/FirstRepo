/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mylesson.helloworld;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Jtooleyful
 */
public class RockPaperScissors {
    public static void main(String[] args) {
        int rounds;
        int maxRounds = 10;
        int minRounds = 1;
        int rock = 1;
        int paper = 2;
        int scissors = 3;
        int choice;
        
        System.out.println("How many rounds would you like to play? Minimum to start is 1, Max is 10.");
        rounds = howManyRounds();
        System.out.println("Choose rock, paper, scissors.  Type 1 for rock, 2 for paper, and 3 for scissors");
        runsGames(rounds);
    }
    public static int howManyRounds(){
        Scanner roundChoice = new Scanner(System.in);
        int rounds;
        rounds = roundChoice.nextInt();
        if(rounds >= 1 && rounds <=10){
            System.out.println("Ok let's play " + rounds + " rounds!");
        } else {
            System.out.println("Invalid amount of rounds entered. Please enter a digit between 1-10 to begin!");
            System.exit(0);
        } 
        return rounds;
        }
    
    public static void runsGames(int roundsChosen){
        Scanner choiceOfRPS = new Scanner(System.in);
        Random rng = new Random();
        int wins = 0;
        int ties = 0;
        int computerWins = 0;
        int pick;
        int computerChoice;
        for(int i = 1; i <= roundsChosen; i++){
            pick = choiceOfRPS.nextInt();
            computerChoice = rng.nextInt(3) + 1;
            System.out.println("Computer chooses " + computerChoice);
            if (pick == 1 && computerChoice == 1 || pick == 2 &&
                    computerChoice == 2 || pick == 3 && computerChoice == 3){
                ties++;
            } else if (pick == 1 && computerChoice == 2 || pick == 2 &&
                    computerChoice == 3 || pick == 3 && computerChoice == 1){
                computerWins++;
            } else if (pick == 1 && computerChoice == 3 || pick == 2 && computerChoice == 1 || pick == 3 && computerChoice == 2){
                wins++;
            }
        }   System.out.println("Wins: " + wins);
            System.out.println("Ties: " + ties);
            System.out.println("Computer Wins: " + computerWins);
            if (wins > computerWins && wins >= ties){
            System.out.println("You win!");
        }  else if (wins < computerWins && computerWins >= ties){
            System.out.println(" The computer Wins");
        } else {
            System.out.println("It's a tie");
        }
    }

}
package com.company;
import java.util.Scanner;
import java.util.Random;
public class stone_paper_scissor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Random ran = new Random();
        int rnum = ran.nextInt(3);

        System.out.println("RULES OF THE GAME:-\n1. PRESS \"1\" FOR STONE, PRESS \"2\" FOR PAPER AND PRESS \"3\" FOR SCISSOR\n2. YOU HAVE ONLY 6 MOVES");

        String[] utilities = {"STONE", "PAPER", "SCISSOR"};
        String cc = utilities[rnum];

            int ms = 6;
            int cp = 0;
            int pp = 0;
            
            System.out.println("                                                                     Moves left:- 6");
            while (ms > 0) {
                System.out.print("Please enter your choice:-  ");
                int pc = sc.nextInt();
//        player looses condition
                if (pc == 1 && cc == "PAPER" || pc == 2 && cc == "SCISSOR" || pc == 3 && cc == "STONE") {
                    System.out.println("your choice was " + utilities[pc - 1] + " and computer choice was " + cc + "\nComputer Won                                                         Moves left:- " + (ms - 1));
                    pp = pp - 1;
                    cp = cp + 1;
                    ms = ms - 1;
                }
//        player winning condition
                else if (pc == 1 && cc == "SCISSOR" || pc == 2 && cc == "STONE" || pc == 3 && cc == "PAPER") {
                    System.out.println("your choice was " + utilities[pc - 1] + " and computer choice was " + cc + "\nYou Won                                                              Moves left:- " + (ms - 1));
                    pp = pp + 1;
                    cp = cp - 1;
                    ms = ms - 1;
                }
//        DRAW CONDITION
                else if (pc == 1 && cc == "STONE" || pc == 2 && cc == "PAPER" || pc == 3 && cc == "SCISSOR") {
                    System.out.println("your choice was " + utilities[pc - 1] + " and computer choice was " + cc + "\nDRAW                                                                 Moves left:- " + (ms - 1));
                    pp = pp + 1;
                    cp = cp + 1;
                    ms = ms - 1;
                }
            }
            System.out.println("\nTotal Score of Computer is:- " + cp + "\nTotal  Score of  your's is:- " + pp);
            if (cp > pp) {
                System.out.println("Computer is the real winner");
            } else if (pp > cp) {
                System.out.println("you are the real winner");
            } else if (pp == cp) {
                System.out.println("The Match was Draw");
            }
    }
}

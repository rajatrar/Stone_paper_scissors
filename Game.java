package com.game;
import java.util.*;

public class Game {
    public static void main(String[] args) {

        Scanner sc = new Scanner((System.in));
        System.out.println(("Enter 0 for Rock, 1 for paper , 2 for Scissor"));
        int user = sc.nextInt();

        Random random = new Random();
        int cinput = random.nextInt(3);

        if (user == cinput){
            System.out.println("Draw");
        }else if (user == 0 && cinput == 2 ) {
            System.out.println("you win");

        }else if (user  == 1 && cinput == 0) {
            System.out.println("you win");

        }else if (user == 2 && cinput == 1) {
            System.out.println("you win");

        }else {
            System.out.println("computer wins");
        }

    }
}

package com.hawkesrules;

import java.lang.instrument.ClassDefinition;

public class Main {

    public static void main(String[] args) {
	    // write your code here

        Player player1 = new Player("Josh", "Rhodes", 3, 2, 0, -2, 1);
        Player player2 = new Player();
        player2.setFirstName("Brian");
        player2.setLastName("Weidinger");
        player2.setNumber(6);
        player2.setAssists(10);
        player2.setGoals(59);
        player2.setPlusMinus(400);
        player2.calculatePoints();
        player2.setFights(0);

        Player bestPlaya = null;
        if (player1.getPoints() > player2.getPoints()) {
            bestPlaya = player1;
        } else {
            bestPlaya = player2;
        }

        System.out.println ("The player with most points is " + bestPlaya);

    }
}

package com.syntax.class07;

import java.util.Scanner;

public class LotteryGame {

	public static void main(String[] args) {
		// We are playing a lottery game and the lucky number is 17;
		// We want to keep asking the user to enter any numbers from 1-20;
		// until he guesses the lucky number --> In that case we print "Congrats, you
		// won!"
		// You can try to solve it with do-while or while, whichever is the best
		// choice...
		/*
		 * Scanner scan = new Scanner(System.in);
		 * 
		 * int num = 0; boolean lotNum = true;
		 * 
		 * while (num != 17) {
		 * System.out.println("Please enter number from 1 to 20 to win the price!!");
		 * num = scan.nextInt(); if (num == 17) { System.out.println("Congrats"); lotNum
		 * = false; } else if (num <= 1 || num >= 16) {
		 * System.out.println("Please tray again!!"); }
		 * 
		 * else if (num <= 18 || num >= 20) { System.out.println("Please tray again!!");
		 * } else { System.out.println("Number out of range"); }
		 * 
		 * }
		 */

		Scanner scan = new Scanner(System.in);
		int lucky = 17;
		int num;

		do {
			System.out.println("Please enter a number 1-20:");
			num = scan.nextInt();
		} while (num != lucky);
		
			System.out.println("Congrats, you won!");
		
	
		}

	}



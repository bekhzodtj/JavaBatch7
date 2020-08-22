package com.syntax.class04;

public class NestingElseIf {

	public static void main(String[] args) {
		// if student completed the quiz we'll check the score
		// if score > 90 --> A, Great job!
		// if score > 80 --> B, Well done!
		// if score > 70 --> C, Just passed!
		// otherwise --> F, You failed
		//
		// if student did't complete the quiz, please finish your quiz!
		boolean quizCompleted = true;
		int score = 86;
		if (quizCompleted) {
			System.out.println("Let's check your score");
			if (score > 90) {
				System.out.println("Great job, you study a lot");
			} else if (score > 80) {
				System.out.println("Well done");
			} else if (score > 70) {
				System.out.println("You could have done better");
			} else {
				System.out.println("You failed");
			}
		} else {
			System.out.println("Please do HW ontime");
		}
	}
}

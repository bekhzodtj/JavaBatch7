package com.syntax.class24;

public class BirdTest {

	public static void main(String[] args) {
		Bird bird = new BabyBird();//upcasting-->object of subclass is reffered by a Superclass
		//achieving runtime polymorphism
		bird.fly();
		bird.eat();
		bird.sleep();
		//bird.cry not available
		//during compilation give an access based on reference type
		
		BabyBird bb = new BabyBird();
		bb.fly();
		bb.sleep();
		bb.eat();
		bb.cry();
	}

}

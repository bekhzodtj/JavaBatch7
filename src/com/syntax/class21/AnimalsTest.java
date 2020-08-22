package com.syntax.class21;

public class AnimalsTest {
	public static void main(String[] args) {
		Animal a = new Animal();
		a.breed = "Something";
		a.color = "Grey";
		a.paws = 4;

		a.sleep();
		a.eat();

		Dog dog = new Dog();
		dog.breed = "Husky";
		dog.color = "Yellow";
		dog.paws = 4;
		dog.tail = true;
		
		dog.bark();
		dog.eat();
		dog.sleep();
		

		Cat cat = new Cat();
		cat.breed = "Siamese";
		cat.color = "Black";
		cat.paws = 4;
		cat.eyes = true;
		cat.tail = true;
		cat.fur = "soft";
		
		cat.purr();
		cat.eat();
		cat.sleep();
		

		Monkey mon = new Monkey();
		mon.breed="Mandrill";
		mon.color="Gray";
		mon.paws=5;
		mon.tail=true;
		
		mon.jump();
		mon.eat();
		mon.sleep();
		
		
		Kitten kitten = new Kitten();
		kitten.breed = "Persian";
		kitten.color = "White";
		kitten.paws = 4;
		kitten.eyes = true;
		kitten.tail = true;
		kitten.fur = "soft";
		kitten.purr();
		kitten.eat();
		kitten.sleep();
		

	}

}

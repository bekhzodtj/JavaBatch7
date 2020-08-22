package com.syntax.class24;

public class Degree {
	// Create a class 'Degree' having a method 'getPrerequisite' that prints ""To
	// get a degree you need high school diploma"".
	// Class 'Degree' has 2 subclasses namely 'Bachelors' and Masters’. In Masters
	// class override method 'getPrerequisite'.
	// Call the method by creating an object of each of the three classes.
	boolean diploma;

	public Degree(boolean diploma) {
		this.diploma = diploma;
	}

	void getPrerequisite() {
		if (diploma=false)
		System.out.println("To get a degree you need high school diploma");
	}

}

class Bachelors extends Degree {
	public Bachelors(boolean diploma) {
		super(diploma);
	}
}

class Masters extends Degree {
	public Masters(boolean diploma) {
		super(diploma);
	}

	void getPrerequisite() {
		if (diploma = false)
		System.out.println("To get a degree you need high Bachelors diploma");
	}

	public static void main(String[] args) {
		Degree deg = new Degree(true);
		deg.getPrerequisite();
		
		Bachelors bach = new Bachelors(true);
		bach.getPrerequisite();
		
		Masters mas= new Masters (false);
		mas.getPrerequisite();
		
	}
}
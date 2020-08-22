package com.syntax.class21;

public class TeacherTest {

	public static void main(String[] args) {
		MathTeacher math = new MathTeacher();
		math.name="John";
		math.lastName="Smith";
		math.age=38;
		math.teaches="Math";
		math.experience=6;
		
		math.algebra=true;
		math.teaching=true;
		math.displayMath();
		math.display();
		
		System.out.println("-------------------");
		ChemistryTeacher chem = new ChemistryTeacher();
		chem.name="Ashly";
		chem.lastName="Handerson";
		chem.age=44;
		chem.teaches="Chemistry";
		chem.experience=9;
		
		chem.lab=true;
		chem.displayChem();
		chem.displayChemistry();
		
		System.out.println("-------------------");
		PianoTeacher piano = new PianoTeacher();
		piano.name="Olga";
		piano.lastName="Sharapova";
		piano.age=55;
		piano.teaches="Piano";
		piano.experience=11;
		
		piano.pianoteacher();
		piano.displayPiano();
	}
}

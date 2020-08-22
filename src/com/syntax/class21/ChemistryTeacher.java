package com.syntax.class21;

public class ChemistryTeacher extends Teacher{
	boolean lab=true;
	
	void displayChem() {
		System.out.println(name+" "+lastName+" " +age+ " years old "
				+teaches+" teacher years of experience "+experience+" year, teacher at the lab "+lab);
	}

}

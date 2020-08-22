package com.syntax.class22;

public class Employee {
	
	public static String companyName;
	protected String fullName;
	double salary;
	private long ssn;

	void work() {
		System.out.println("Employee works");
	}

	void getPaid() {
		System.out.println("Employee gets paid");
	}
}

class ScrumTeam extends Employee {

	String ceremonies;

	void attendMeetings() {
		System.out.println("attends meetings");
	}

	void workBuildingSoft() {
		System.out.println("works on building software");
	}
}

class ProductOwner extends ScrumTeam {

	void communicate() {
		System.out.println("gets requirements form BA");
	}

	void prioritizePb() {
		System.out.println("prioritizes product backlog");
	}
}

class ScrumMaster extends ScrumTeam {
	String quality;

	void shieldTeam() {
		System.out.println("All team shielded");
	}

	void doMeetings() {
		System.out.println("All team do attending meeting");
	}
}

class Tester extends ScrumTeam {

	void test() {
		System.out.println("tests software for bugs");
	}
}

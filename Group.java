package edu.ilstu.it226;

import java.util.ArrayList;

public class Group {
	private int number;
	private ArrayList<Student> members;
	
	public Group(int number) {
		this.number = number;
		members = new ArrayList<Student>();
	}
	
	public Group(int number, Student firstMember) {
		this.number = number;
		members = new ArrayList<Student>();
		members.add(firstMember);
	}
	
	public boolean add(Student newMember) {
		members.add(newMember);
		return true;
	}
	
	public int countFemales() {
		int numFemales = 0,
			numMembers = members.size();
		for (int i = 0; i < numMembers; ++i) {
			if (!members.get(i).getGender()) {
				++numFemales;
			}
		}
		return numFemales;
	}
	
	public int countMales() {
		int numMales = 0,
			numMembers = members.size();
		for (int i = 0; i < numMembers; ++i) {
			if (members.get(i).getGender()) {
				++numMales;
			}
		}
		return numMales;
	}
	
	public Student get(int index) {
		return members.get(index);
	}
	
	public int getNumber() {
		return number;
	}
	
	public boolean hasPreviousMember(Student toCheck) {
		boolean hasPreviousMember = false;
		int numMembers = members.size();
		for (int i = 0; i < numMembers; ++i) {
			if (toCheck.getPrevGroup() == members.get(i).getPrevGroup()) {
				hasPreviousMember = true;
				break;
			}
		}
		return hasPreviousMember;
	}
	
	
	public int size() {
		return members.size();
	}
}

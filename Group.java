package edu.ilstu.it226;

import java.util.ArrayList;

public class Group {
	private int number;
	private ArrayList<Student> members;
	
	/**
	 * The Constructor for an empty group
	 * 
	 * @param number The group's number - not guaranteed to be unique
	 */
	public Group(int number) {
		this.number = number;
		members = new ArrayList<Student>();
	}
	
	/**
	 * The Constructor for a group with one student
	 * @param number The group's number
	 * @param firstMember The first student to add to the group
	 */
	public Group(int number, Student firstMember) {
		this.number = number;
		members = new ArrayList<Student>();
		members.add(firstMember);
	}
	
	/**
	 * This method adds 
	 * 
	 * @param newMember
	 * @return
	 */
	public boolean add(Student newMember) {
		members.add(newMember);
		return true;
	}
	
	/**
	 * 
	 * @return
	 */
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
	
	/**
	 * 
	 * @return
	 */
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
	
	/**
	 * 
	 * @param index
	 * @return
	 */
	public Student get(int index) {
		return members.get(index);
	}
	
	/**
	 * 
	 * @return
	 */
	public int getNumber() {
		return number;
	}
	
	/**
	 * 
	 * @param toCheck
	 * @return
	 */
	public boolean hasPreviousMember(Student toCheck) {
		boolean hasPreviousMember = false;
		int numMembers = members.size();
		for (int i = 0; i < numMembers; ++i) {
			if (toCheck.getPrevGroup() == 0 && members.get(i).getPrevGroup() == 0) {
				break;
			}
			
			if (toCheck.getPrevGroup() == members.get(i).getPrevGroup()) {
				hasPreviousMember = true;
				break;
			}
		}
		return hasPreviousMember;
	}
	
	/**
	 * 
	 * @return
	 */
	public int size() {
		return members.size();
	}
}

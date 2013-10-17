package edu.ilstu.it226;

import java.util.ArrayList;

public class Group {
	private int number;
	private ArrayList<Student> members;

	/**
	 * The Constructor for an empty group
	 * 
	 * @param number
	 *            The group's number - not guaranteed to be unique
	 */
	public Group(int number) {
		this.number = number;
		members = new ArrayList<Student>();
	}

	/**
	 * The Constructor for a group with one student
	 * 
	 * @param number
	 *            The group's number
	 * @param firstMember
	 *            The first student to add to the group
	 */
	public Group(int number, Student firstMember) {
		this.number = number;
		members = new ArrayList<Student>();
		members.add(firstMember);
	}

	/**
	 * This method adds a student to the group.
	 * 
	 * @param newMember
	 *            The student to add
	 * @return True
	 */
	public boolean add(Student newMember) {
		members.add(newMember);
		return true;
	}

	/**
	 * Returns the number of females in the group.
	 * 
	 * @return The number of females in the group
	 */
	public int countFemales() {
		int numFemales = 0, numMembers = members.size();
		for (int i = 0; i < numMembers; ++i) {
			if (!members.get(i).getGender()) {
				++numFemales;
			}
		}
		return numFemales;
	}

	/**
	 * Returns the number of males in the group.
	 * 
	 * @return The number of males in the group
	 */
	public int countMales() {
		int numMales = 0, numMembers = members.size();
		for (int i = 0; i < numMembers; ++i) {
			if (members.get(i).getGender()) {
				++numMales;
			}
		}
		return numMales;
	}

	/**
	 * Returns the student at the given index
	 * 
	 * @param index
	 *            The given index
	 * @return The student
	 */
	public Student get(int index) {
		return members.get(index);
	}

	/**
	 * Returns the group number.
	 * 
	 * @return The group number
	 */
	public int getNumber() {
		return number;
	}

	/**
	 * Checks whether the group has a student who was in the same previous group
	 * as the given student.
	 * 
	 * @param toCheck
	 *            The student to check against the group
	 * @return True if at least one of the students was in the same group as the
	 *         given student
	 */
	public boolean hasPreviousMember(Student toCheck) {
		boolean hasPreviousMember = false;
		int numMembers = members.size();
		for (int i = 0; i < numMembers; ++i) {
			if (toCheck.getPrevGroup() == 0
					&& members.get(i).getPrevGroup() == 0) {
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
	 * Returns the number of students in the group.
	 * 
	 * @return The number of students in the group
	 */
	public int size() {
		return members.size();
	}
}

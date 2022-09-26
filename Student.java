package com.que3;

import java.util.HashSet;

public class Student implements Comparable<Student> {
	
private int	rollNo;
private String	name;
private int	mathsMarks;
private int	scienceMarks;
private int	engMarks;


public Student() {
	super();
}


public Student(int rollNo, String name, int mathsMarks, int scienceMarks, int engMarks) {
	super();
	this.rollNo = rollNo;
	this.name = name;
	this.mathsMarks = mathsMarks;
	this.scienceMarks = scienceMarks;
	this.engMarks = engMarks;
}


public int getRollNo() {
	return rollNo;
}


public void setRollNo(int rollNo) {
	this.rollNo = rollNo;
}


public String getName() {
	return name;
}


public void setName(String name) {
	this.name = name;
}


public int getMathsMarks() {
	return mathsMarks;
}


public void setMathsMarks(int mathsMarks) {
	this.mathsMarks = mathsMarks;
}


public int getScienceMarks() {
	return scienceMarks;
}


public void setScienceMarks(int scienceMarks) {
	this.scienceMarks = scienceMarks;
}


public int getEngMarks() {
	return engMarks;
}


public void setEngMarks(int engMarks) {
	this.engMarks = engMarks;
}


@Override
public String toString() {
	return "Student [rollNo=" + rollNo + ", name=" + name + ", mathsMarks=" + mathsMarks + ", scienceMarks="
			+ scienceMarks + ", engMarks=" + engMarks + "]";
}


@Override
public int compareTo(Student o) {
	// TODO Auto-generated method stub
	
	int marks=this.engMarks+this.mathsMarks+this.scienceMarks;
	int marks2=o.engMarks+o.mathsMarks+o.scienceMarks;
	
	if(marks>marks2) {
		return 1;
		
	}
	else if (marks==marks2) {
		if(this.name.equals(o.name))
		{
			if(this.rollNo<o.rollNo) {
				return 1;
			}
			
		}
		else
		return this.getName().compareTo(o.getName());
	}
	
	else 
		return -1;
	return marks2;
	
	

	
}



public static void main(String[] args) {
	
	HashSet<Student> students=new HashSet<Student>();
	students.add(new Student(3, "women", 40, 40, 40));
	students.add(new Student(4, "boy", 54, 54, 54));
	students.add(new Student(2, "men", 51, 51, 51));
	students.add(new Student(5, "girl", 58, 58, 58));
	
	
	System.out.println(students);
}







}

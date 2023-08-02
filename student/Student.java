package org.student;

import org.department.Department;

public class Student extends Department {
	public void studName() {
		System.out.println("Stud Name: Rama");
		
	}
	public void studDept() {
		System.out.println("Stud Dept: CS");
	}
	public void studId() {
		System.out.println("Stud ID: E6CS32");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student st=new Student();
		st.collegeName();
		st.collegeCode();
		st.CollegeRank();
		st.deptName();
		st.studName();
		st.studDept();
		st.studId();

	}

}
/* Package   :org.college
     Class     :College
     Methods   :collegeName(),collegeCode(),collegeRank()

     Package   :org.department
     Class        :Department
     Methods   :deptName()
 
     Package   :org.student
     Class        :Student
     Methods   :studentName(),studentDept(),studentId()
  
Description:
create above 3 class and call all your class methods into the Student using multilevel inheritance.


*/
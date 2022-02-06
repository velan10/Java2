package com.collegeinfo;

public class College {
		public void collegename(){
			System.out.println("S.R.M College ");
		}
		public static void main(String[] args) {
			College a = new College();
			Student b = new Student();
			Staff c = new Staff();
			a.collegename();
			b.studentName();
			b.studentID();
			b.studentDept();
			c.staffName();
			c.staffID();c.staffDept();
		}
	}



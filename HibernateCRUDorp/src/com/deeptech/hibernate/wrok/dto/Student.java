package com.deeptech.hibernate.wrok.dto;

	import javax.persistence.Column;
	import javax.persistence.Entity;
	import javax.persistence.GeneratedValue;
	import javax.persistence.GenerationType;
	import javax.persistence.Id;
	import javax.persistence.Table;

	@Entity
	@Table(name="student")
	public class Student 
	{
		@Id //responsible for creating constraints as primary key
		@Column(name="S_id")
		@GeneratedValue(strategy=GenerationType.IDENTITY)
	    private int id;
		@Column(name="S_name")
	    private String SudentName;
		
		@Column(name="S_rnumber")
	    private int RollNumber;
		
		@Column(name="S_course")
	    private String Course;
		
		//generate getter and setter method
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getSudentName() {
			return SudentName;
		}
		public void setSudentName(String sudentName) {
			SudentName = sudentName;
		}
		public int getRollNumber() {
			return RollNumber;
		}
		public void setRollNumber(int rollNumber) {
			RollNumber = rollNumber;
		}
		public String getCourse() {
			return Course;
		}
		public void setCourse(String course) {
			Course = course;
		}
		
		
		
	}



package com.example.StudentDb.entity;

import java.util.List;

import jakarta.persistence.*;


@Entity
@Table(name="student")
public class Student {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	@Column(name="name")
	private String sName;
	private String sEmail;
	@OneToMany(targetEntity=Course.class,cascade=CascadeType.ALL)
	@JoinColumn(referencedColumnName="id",name="s_id")
	private List<Course> course;
	public List<Course> getCourse() {
		return course;
	}
	public void setCourse(List<Course> course) {
		this.course = course;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getsName() {
		return sName;
	}
	public void setsName(String sName) {
		this.sName = sName;
	}
	public String getsEmail() {
		return sEmail;
	}
	
	public void setsEmail(String sEmail) {
		this.sEmail = sEmail;
	}
	
	
	

}

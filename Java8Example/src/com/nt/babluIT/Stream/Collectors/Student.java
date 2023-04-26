package com.nt.babluIT.Stream.Collectors;

public class Student {
	private String name;

	private Integer id;

	private String subject;

	private Double percentage;

	public Student(String name, Integer id, String subject, Double percentage) {
		this.name = name;
		this.id = id;
		this.subject = subject;
		this.percentage = percentage;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public Double getPercentage() {
		return percentage;
	}

	public void setPercentage(Double percentage) {
		this.percentage = percentage;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + ", subject=" + subject + ", percentage=" + percentage + "]";
	}

}

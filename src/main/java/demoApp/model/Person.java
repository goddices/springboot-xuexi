package demoApp.model;

import com.fasterxml.jackson.annotation.JsonIgnore; 


public class Person {
	public Person(int id,String name, int age) {
		super();
		this.id=id;
		this.name = name;
		this.age = age;
	}
	public Person(){
		this(0,"",0);
	}
	
	private int id;
	private String name;
	private int age;
	
	@JsonIgnore
	private String uniqueNo;
	@JsonIgnore
	private String decription;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age; 
	}
	
	@Override
	public String toString(){
		return String.format("id = %d,its name is %s and age is %d ,unique no is %s description is %s ", id,name,age,uniqueNo,decription);
	}
	
	
	public String getUniqueNo() {
		return uniqueNo;
	}
	public void setUniqueNo(String uniqueNo) {
		this.uniqueNo = uniqueNo;
	}
	public String getDecription() {
		return decription;
	}
	public void setDecription(String decription) {
		this.decription = decription;
	}
}

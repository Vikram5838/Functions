package coll1;

public class Employee {
	private String name;
	private int age;
	private String gender;
	private int salary;
	private String designation;
	
	public void setName(String n) {
		name=n;
	}
	public String getName() {
		return name;
	}
	public void setAge(int a) {
		age=a;
	}
	public int getAge() {
		return age;
	}
	public void setGender(String g) {
		gender=g;
	}
	public String getGender() {
		return gender;
	}
	public void setSalary(int s) {
		salary=s;
	}
	public int getSalary() {
		return salary;
	}
	public void setDesignation(String d) {
		designation=d;
	}
	public String getDesignation() {
		return designation;
	}
	
	
	public Employee(String n,int a,String g,int s,String d) {
		name=n;
		age=a;
		gender=g;
		salary=s;
		designation=d;
	}
	
	public String toString() {
		return name+" "+age+" "+gender+" "+salary+" "+designation;
	}
	

}

package coll1;

import java.util.ArrayList;

public class UseEmployee {
	public static void main(String[] args) {
		Employee e1=new Employee("Vikram",23,"Male",30000,"Developer");
		Employee e2=new Employee("Vignesh",22,"Male",30000,"System ENgineer");
		Employee e3=new Employee("Dhinesh",26,"Male",26000,"Supervisor");
		Employee e4=new Employee("Priya",24,"Female",25000,"Designer");
		Employee e5=new Employee("Benjamin",22,"Male",40000,"Sales Executive");
		Employee e6=new Employee("Ram",28,"Male",45000,"Senior Manager");
		
		ArrayList<Employee> emp=new ArrayList<>();
		emp.add(e1);
		emp.add(e2);
		emp.add(e3);
		emp.add(e4);
		emp.add(e5);
		emp.add(e6);
		
		/*for(int i=0;i<emp.size();i++) {
			System.out.println(emp.get(i));
		}*/
		/*for(Employee e:emp) {
			System.out.println(e);
		}*/
		//emp.forEach(e->System.out.println(e));//forEach lambda...........
		
		
		/*for(int i=0;i<emp.size();i++) {
			if(emp.get(i).getSalary()>25000) {
				System.out.println(emp.get(i).getName());
			}
		}
		
		for(int i=0;i<emp.size();i++) {
			if(emp.get(i).getName().startsWith("s")) {
				System.out.println(emp.get(i).getName());
			}
		}*/
		
		//emp.forEach(e->{if(e.getAge()>25) {System.out.println(e);}});
		
		/*for(Employee e:emp) {
			if(e.getAge()>25) {
				System.out.println(e.getName());
			}
		}*/
		
		ArrayList<Employee> femaleEmp=new ArrayList<>();
		/*for(int i=0;i<emp.size();i++) {
			if(emp.get(i).getGender().equalsIgnoreCase("female")) {
				femaleEmp.add(emp.get(i));
				
			}
		}
		System.out.println(femaleEmp);*/
		
		/*for(Employee e:emp) {
			if(e.getGender().equalsIgnoreCase("female")) {
				femaleEmp.add(e);
				System.out.println(femaleEmp);
			}
		}*/
		
		
		emp.forEach(e->{if(e.getGender().equalsIgnoreCase("female")) {femaleEmp.add(e);}});
		
	}

}

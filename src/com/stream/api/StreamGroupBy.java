package com.stream.api;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamGroupBy {

	public static void  main(String[] args)
	{
		Map<Employee.Gender, Long> countByGender  = Employee.persons()
		        .stream()
		        .collect(Collectors.groupingBy(Employee::getGender, Collectors.counting())); 
		    System.out.println(countByGender);
		    
		Map<Employee.Name,Long> countByName=Employee.persons()
				.stream().collect(Collectors.groupingBy(Employee::getName,Collectors.counting()));
		
		System.out.println(countByName);
		
	}
}

class Employee 
{
	  public static enum Gender {
	    MALE, FEMALE
	  }
	  
	  public static enum Name {
		  Mahendra, Aniket,Sayali
		  }

	  private long id;
	  private Name name;
	  private Gender gender;

	  public Employee(long id, Name name, Gender gender) {
	    this.id = id;
	    this.name = name;
	    this.gender = gender;
	  }
	  public Gender getGender() {
	    return gender;
	  }
	  
	  
	  public Name getName() {
		return name;
	}
	public void setName(Name name) {
		this.name = name;
	}
	public static List<Employee> persons() {
	    Employee p1 = new Employee(1, Name.Mahendra, Gender.MALE);
	    Employee p2 = new Employee(2,Name.Aniket, Gender.MALE);
	    Employee p3 = new Employee(3, Name.Sayali, Gender.FEMALE);
	    Employee p4 = new Employee(4, Name.Mahendra, Gender.MALE);
	    Employee p5 = new Employee(5, Name.Sayali, Gender.FEMALE);
	    Employee p6 = new Employee(6, Name.Aniket, Gender.MALE);

	    List<Employee> persons = Arrays.asList(p1, p2, p3, p4, p5, p6);

	    return persons;
	  }
	}

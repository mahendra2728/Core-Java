package com.date.example;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class DifferenceBetweenTwoDate {

	public static void main(String[] args) {

    System.out.println("\nLocalDateTime date ");
    LocalDateTime time=LocalDateTime.now();
    System.out.println(time);
    System.out.println("Current Date & Time : "+LocalDateTime.now());
    
    System.out.println("\nLocalDate Difference ");
    LocalDate date1=LocalDate.now();
    System.out.println(date1);
    
    LocalDate date2=date1.plusWeeks(2);
    System.out.println(date2);
    
    Period diff=Period.between(date1, date2);
    System.out.println("Difference is : "+diff.getDays());
    
    System.out.println("\nLocalTime Difference ");
   
    LocalTime time1=LocalTime.now();
    System.out.println("Current Time : "+time1);
    
     Duration twohr=Duration.ofHours(2);
     
     LocalTime time2=time1.plus(twohr);
     System.out.println("Current+ 2 hr Time : "+time2);
     
     Duration duration=Duration.between(time1, time2);
     System.out.println("Hours Difference : "+duration.toHours()+" Seconds : "+duration.getSeconds());
    
    
     
     DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d/MM/yyyy");

 	 String dateF1 = "10/11/2019";
 	 String dateF2 = "08/11/2019";
 	 
 	
 	//convert String to LocalDate
 	LocalDate localDate1 = LocalDate.parse(dateF1, formatter);
 	LocalDate localDate2 = LocalDate.parse(dateF2, formatter);
 	
 	Period diff3=Period.between(localDate2, localDate1);
    System.out.println("Day Difference is : "+diff3.getDays());
    
    
    
	}

}

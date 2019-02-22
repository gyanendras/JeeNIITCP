package com.mysystems;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.util.Date;

public class DateTest {
	public static void main(String args[]) {
		
	LocalDate date1 = LocalDate.of(2014, 01, 01);
	LocalDate now = LocalDate.now();

	  LocalDateTime dateTime = LocalDateTime.of(1988, 7, 4, 0, 0);
	     LocalDateTime dateTime2 = LocalDateTime.now();

Period diff = Period.between(date1, now);
 
System.out.printf("Difference is %d years, %d months and %d days old \n",
                    diff.getYears(), diff.getMonths(), diff.getDays());


//long diffInHours = java.time.Duration.between(now, endofCentury).toHours();
long diffInHours1 = Duration.between(dateTime, dateTime2).toHours();
System.out.printf("Difference is %d hours",diffInHours1);
}
}

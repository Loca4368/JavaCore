package localDateTime;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class TestLocalDateTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Local date and time
		LocalDateAndTime ldt = new  LocalDateAndTime();
		
		System.out.println(ldt.toString());
		
		
		//Format date in Java8
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		LocalDate  ld = LocalDate.now();
		
		System.out.println(ld.format(dtf));
			

	}

}

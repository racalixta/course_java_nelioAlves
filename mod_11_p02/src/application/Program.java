package application;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Program {

	public static void main(String[] args) {
		LocalDate d04 = LocalDate.parse("2022-07-20");
		LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:26");
		Instant d06 = Instant.parse("2022-07-20T01:30:26Z");

		LocalDate pastWeekLocalDate = d04.minusDays(7);
		LocalDate nextWeekLocalDate = d04.plusDays(7);
		
		System.out.println("pastWeekLocalDate: " + pastWeekLocalDate);
		System.out.println("nextWeekLocalDate: " + nextWeekLocalDate);
		System.out.println();
		
		LocalDateTime pastWeekLocalDateTime = d05.minusDays(7);
		LocalDateTime nextWeekLocalDateTime = d05.plusDays(7);
		
		System.out.println("pastWeekLocalDateTime: " + pastWeekLocalDateTime);
		System.out.println("nextWeekLocalDateTime: " + nextWeekLocalDateTime);
		System.out.println();
		
		Instant pastWeekInstant = d06.minus(7, ChronoUnit.DAYS);
		Instant nextWeekInstant = d06.plus(7, ChronoUnit.DAYS);
		
		System.out.println("pastWeekInstant: " + pastWeekInstant);
		System.out.println("nextWeekInstant: " + nextWeekInstant);
		System.out.println();
		
		Duration t1 = Duration.between(pastWeekLocalDate.atStartOfDay(), d04.atStartOfDay());
		// ^ a conversão de LocalDate para LocalDateTime pode ser feita assim tbem: pastWeekLocalDate.atTime(0, 0)
		System.out.println("Duration between T1: " + t1.toDays());
		System.out.println();
		
		
		Duration t2 = Duration.between(pastWeekLocalDateTime, d05);
		System.out.println("Duration between T2: " + t2.toDays());
		System.out.println();
		
		Duration t3 = Duration.between(pastWeekInstant, d06);
		System.out.println("Duration between T3: " + t3.toDays());
		System.out.println();
		
		// invertendo, colocando a data mais futura primeiro
		Duration t4 = Duration.between(d06, pastWeekInstant);
		System.out.println("Duration between T4: " + t4.toDays());
		System.out.println();
	}

}

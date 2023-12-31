package application;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Program {

	public static void main(String[] args) {
		
		// pode utilizar d0X.toString() para já colocar no padrão ISO 
		
		// data local
		LocalDate d01 = LocalDate.now();
		System.out.println("d01 LocalDate:  " + d01);

		// hora e data local 
		LocalDateTime d02 = LocalDateTime.now();
		System.out.println("d02 LocalDateTime: " + d02);
		
		// zulu/GMT date time
		Instant d03 = Instant.now();
		System.out.println("d03 Instant: " + d03);
		
		// especicando um data
		LocalDate d04 = LocalDate.parse("2022-07-20");
		System.out.println("d04 LocalDate.parse:  " + d04);
		
		// especificando um hora e date 
		LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:25");
		System.out.println("d05 LocalDateTime.parse: " + d05);
		
		// horario zulu = gmt
		Instant d06 = Instant.parse("2022-07-20T01:30:25Z");
		System.out.println("d06 Instant.parse: " + d06);
		
		// especificando o horario de minas e irá converter para o horario do GMT
		Instant d07 = Instant.parse("2022-07-20T01:30:25-03:00");
		System.out.println("d07 Instant.parse-03:00: " + d07);
		
		System.out.println("\n-------------------------\n");
		
		// formatos de data e hora
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		
		LocalDate d08 = LocalDate.parse("20/07/2022", fmt1);
		System.out.println("d08 + fmt1: " + d08);
		
		LocalDateTime d09 = LocalDateTime.parse("20/07/2022 01:30", fmt2);
		System.out.println("d09 + fmt2: " + d09);
		
		LocalDate d10 = LocalDate.of(2022, 7, 20);
		System.out.println("d10: " + d10);
		
		LocalDateTime d11 = LocalDateTime.of(2022, 7, 20, 1, 33);
		System.out.println("d11: " + d11);
		
		
		System.out.println("\n-------------------------\n");
		// formas de imprimir data
		
		DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
		DateTimeFormatter fmt4 = DateTimeFormatter.ISO_DATE_TIME;
		
		System.out.println("d04 + fmt1:  " + d04.format(fmt1));
		System.out.println("fmt1 + d04:  " + fmt1.format(d04));
		
		System.out.println();
		
		System.out.println("d05 + fmt1:  " + d05.format(fmt1));
		System.out.println("d05 + fmt2:  " + d05.format(fmt2));
		
		System.out.println();
		System.out.println("fmt3 + d06:  " + fmt3.format(d06));
		
		System.out.println();
		System.out.println("d05 + fmt4:  " + d05.format(fmt4));
		
		
		LocalDate r1 = LocalDate.ofInstant(d06, ZoneId.systemDefault());
		LocalDate r2 = LocalDate.ofInstant(d06, ZoneId.of("Portugal"));
		LocalDateTime r3 = LocalDateTime.ofInstant(d06, ZoneId.systemDefault());
		LocalDateTime r4 = LocalDateTime.ofInstant(d06, ZoneId.of("Portugal"));
		
		System.out.println();
		System.out.println("r1 + ZoneId:  " + r1);
		
		System.out.println();
		System.out.println("r2 + ZoneId:  " + r2);
		
		System.out.println();
		System.out.println("r3 + ZoneId:  " + r3);
		
		System.out.println();
		System.out.println("r4 + ZoneId:  " + r4);
		
		System.out.println();
		System.out.println("r1 + ZoneId:  " + r1);
		
		System.out.println();
		System.out.println("d04 + dia:  " + d04.getDayOfMonth());
		System.out.println("d04 + mes:  " + d04.getMonthValue());
		System.out.println("d04 + ano:  " + d04.getYear());
		
		System.out.println("\nd05 + hora:  " + d05.getHour());
		System.out.println("d05 + minutos:  " + d05.getMinute());
	}

}

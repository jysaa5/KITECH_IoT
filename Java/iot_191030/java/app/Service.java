package iot.java.app;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Service {

	private DA parking;
	public Service() {
		parking = new DA(20);
	}
	
	public void diff(
			LocalDateTime inDateTime,
			LocalDateTime outDateTime) {

		LocalDateTime tempDateTime = LocalDateTime.from(inDateTime);

		long years = tempDateTime.until(outDateTime, ChronoUnit.YEARS);
		tempDateTime = tempDateTime.plusYears(years);

		long months = tempDateTime.until(outDateTime, ChronoUnit.MONTHS);
		tempDateTime = tempDateTime.plusMonths(months);

		long days = tempDateTime.until(outDateTime, ChronoUnit.DAYS);
		tempDateTime = tempDateTime.plusDays(days);

		long hours = tempDateTime.until(outDateTime, ChronoUnit.HOURS);
		tempDateTime = tempDateTime.plusHours(hours);

		long minutes = tempDateTime.until(outDateTime, ChronoUnit.MINUTES);
		tempDateTime = tempDateTime.plusMinutes(minutes);

		long seconds = tempDateTime.until(outDateTime, ChronoUnit.SECONDS);

		System.out.println(years + " years " + months + " months " + days + " days " + hours + " hours " + minutes
				+ " minutes " + seconds + " seconds.");

		// prints: 29 years 8 months 24 days 22 hours 54 minutes 50 seconds.
	}

	public Space[] getStateAll() {
		// TODO Auto-generated method stub
		Space[] space = parking.selectAll();
		if( space == null || space.length == 0) {
			space = null;
		}
		return space;
	}

}

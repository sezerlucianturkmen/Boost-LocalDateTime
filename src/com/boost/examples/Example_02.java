package com.boost.examples;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Example_02 {

	public static void main(String[] args) {

		LocalDate myBrithDate = LocalDate.of(1991, 10, 30);

		long years = myBrithDate.until(LocalDate.now(), ChronoUnit.YEARS);
		long months = myBrithDate.until(LocalDate.now(), ChronoUnit.MONTHS);
		long days = myBrithDate.until(LocalDate.now(), ChronoUnit.DAYS);
		long weeks = myBrithDate.until(LocalDate.now(), ChronoUnit.WEEKS);

		System.out.println(years + " years " + months + "months " + weeks + " weeks " + days + " days ");
		;
	}

}

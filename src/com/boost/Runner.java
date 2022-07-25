package com.boost;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.ZonedDateTime;
import java.util.Date;

public class Runner {

	public static void main(String[] args) {

		/**
		 * 1-Bir kişinin doğum tarihi 2-Uygulama içinde kullanılan zamanlar 3-Uygulama
		 * içinde yapılan işlemler bir şekilde kayıt altına alınır.Bu kayıt altına alma
		 * ve günceleme işlemleri veri tabanlarında ayrıca programdan bağımsız şekilde
		 * tutulur.
		 */

		System.out.println(new Date().getTime());
		System.out.println(LocalDate.now());
		System.out.println(LocalTime.now());
		System.out.println(LocalDateTime.now());
		System.out.println(ZonedDateTime.now());

		LocalDate localDate = LocalDate.of(2020, Month.AUGUST, 6);
		LocalTime localTime = LocalTime.of(15, 30, 2, 159);

		System.out.println(localDate.toString());
		System.out.println(localTime.toString());

		Period period = Period.ofDays(5);
		localDate.plus(period);
		System.out.println(localDate.toString());

		Instant instant = Instant.now();
		Long start1 = System.currentTimeMillis();
		Long start2 = System.nanoTime();

		Long timeLong = new Date().getTime();

	}

}

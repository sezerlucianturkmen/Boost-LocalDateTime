package com.boost.examples;

import java.time.LocalDate;

public class Example_01 {

	public static void main(String[] args) {
		Example_01 example_01 = new Example_01();

		LocalDate shoppingDate = LocalDate.of(2022, 6, 3);
		LocalDate paymentDate = LocalDate.of(shoppingDate.getYear(), shoppingDate.getMonth(), 15);

	}

	}

	public boolean isPaymentTimeBefore(LocalDate date) {

		// LocalDate currentDate = LocalDate.now();

		LocalDate paymentDate = LocalDate.of(date.getYear(), date.getMonth(), 15);

		return date.isBefore(paymentDate);

	}

}

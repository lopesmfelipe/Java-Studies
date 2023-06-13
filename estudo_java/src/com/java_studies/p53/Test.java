package com.java_studies.p53;

public class Test {

	public static void main(String[] args) {
		diasemana();
	}

	private static void printWeekDay(DayWeek day) {
		switch (day) {
		case MONDAY:
			System.out.println("Monday!");
			break;
		case TUESDAY:
			System.out.println("Tuerday!");
			break;
		case WEDNESDAY:
			System.out.println("Wednesday!");
			break;
		case THURSDAY:
			System.out.println("Thuersday!");
			break;
		case FRIDAY:
			System.out.println("Friday!");
			break;
		case SATURDAY:
			System.out.println("Saturday!");
			break;
		case SUNDAY:
			System.out.println("Monday!");
			break;
		default:
			break;
		}
	}

	private static void diasemana() {

		DayWeek monday = DayWeek.MONDAY;
		DayWeek tuesday = DayWeek.TUESDAY;
		DayWeek wednesday = DayWeek.WEDNESDAY;
		DayWeek thursday = DayWeek.THURSDAY;
		DayWeek friday = DayWeek.FRIDAY;
		DayWeek saturday = DayWeek.SATURDAY;
		DayWeek sunday = DayWeek.SUNDAY;

		System.out.println("Test using Enum:\n");
		printWeekDay(monday);
		printWeekDay(tuesday);
		printWeekDay(wednesday);
		printWeekDay(thursday);
		printWeekDay(friday);
		printWeekDay(saturday);
		printWeekDay(sunday);

	}

}

package it.betacom.controller;

import java.time.DayOfWeek;
import java.time.LocalDate;

import it.betacom.enums.WeekDays;

public class Controller {

	WeekDays weekDay;
	
	Controller(WeekDays weekDay) {
		this.weekDay = weekDay;
	}

	void ChooseWeekDay() {
		switch (weekDay) {
		case MONDAY:
		case TUESDAY:
		case WEDNESDAY:
		case THURSDAY:
		case FRIDAY:
		case SATURDAY:
			System.out.println("Today is: " + weekDay);
			break;
		case SUNDAY:
			System.out.println("It's holiday!");
			break;
		default:
			break;
		}
	}

	public static void main(String[] args) {
		
		LocalDate localDate = LocalDate.now();
		DayOfWeek localWeekDay = localDate.getDayOfWeek();
		String weekDayToString = localWeekDay.toString();
		

		Controller day = new Controller(WeekDays.valueOf(weekDayToString));
		day.ChooseWeekDay();
	}
}

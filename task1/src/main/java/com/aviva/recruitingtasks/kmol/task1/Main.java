package com.aviva.recruitingtasks.kmol.task1;

import com.aviva.recruitingtasks.kmol.task1.sampledata.SampleAvivaEmployees;
import com.aviva.recruitingtasks.kmol.task1.sampledata.SampleAvivaHolidays;

import java.time.LocalDate;
import java.time.Month;

public class Main {

    public static void main(String[] args) {
        HolidayCalculator calculator = new HolidayCalculator(SampleAvivaEmployees.AVIVA_EMPLOYEES, SampleAvivaHolidays.AVIVA_HOLIDAYS);

        System.out.println(calculator.getWorkingEmployees(LocalDate.of(2017, Month.JANUARY, 1), LocalDate.of(2017, Month.DECEMBER, 1)));

        System.out.println(calculator.getHolidayMonth(2017));
    }

}

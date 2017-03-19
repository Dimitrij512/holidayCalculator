package com.aviva.recruitingtasks.kmol.task1;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import com.aviva.recruitingtasks.kmol.task1.model.Employee;
import com.aviva.recruitingtasks.kmol.task1.model.Holiday;

public class HolidayCalculator {

	private final List<Employee> employees;
	private final List<Holiday> holidays;

	public HolidayCalculator(List<Employee> employees, List<Holiday> holidays) {
		this.employees = employees;
		this.holidays = holidays;
	}

	public List<Employee> getWorkingEmployees(LocalDate dateFrom, LocalDate dateTo) {

		List<Holiday> listFreeHoliday = getFreeHolidays(dateFrom, dateTo);

		/** get available employees from List */
		Set<Employee> listAvailableEmployees = employees.stream().filter(e -> (listFreeHoliday.stream().map(Holiday::getEmployee).collect(Collectors.toSet())).contains(e)).collect(Collectors.toSet());

		return new ArrayList<Employee>(listAvailableEmployees);
	}

	/**
	 * Finds free {@link Holiday} by dates
	 * 
	 * @param LocalDate start date range
	 * @param LocalDate end date range
	 * @return List of Holidays
	 */
	private List<Holiday> getFreeHolidays(LocalDate dateFrom, LocalDate dateTo) {

		List<Holiday> listHoliday = new ArrayList<Holiday>();
		listHoliday = holidays.stream().filter(x -> !(x.getDateFrom().isAfter(dateFrom)
		    && x.getDateFrom().isBefore(dateTo)
		    || x.getDateTo().isBefore(dateTo)
		        && x.getDateTo().isAfter(dateFrom)
		        && x.getDateFrom().isEqual(dateFrom)
		    || x.getDateTo().isEqual(dateTo)
		    || x.getDateFrom().isEqual(dateTo)
		    || x.getDateTo().isEqual(dateFrom))).collect(Collectors.toList());

		return listHoliday;
	}

	public Month getHolidayMonth(int year) {

		List<Integer> listMonths = getMonthsWithHoliday(year);

		/** gets first index from listMonth which have max count holidays */
		int maxMonth = IntStream.range(0, listMonths.size()).reduce((i, j) -> listMonths.get(i) < listMonths.get(j) ? j : i).getAsInt();

		if (maxMonth != 0) {
			LocalDate localDate = LocalDate.of(year, maxMonth, 1);
			return localDate.getMonth();
		} else {
			return null;
		}
	}

	/**
	 * Sets count of holidays in months
	 * 
	 * @param int year
	 * @return List Integer which have count holiday in months
	 */
	private List<Integer> getMonthsWithHoliday(int year) {
		/*
		 * listMonths it is list with Integer which contains count of holiday - index - it is number of
		 * month - value of index - it is count of holidays
		 */
		List<Integer> listMonths = Stream.of(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0).collect(Collectors.toList());

		holidays.stream().forEach(hol -> {

			// current count holiday from listMonths
			int countFrom = listMonths.get(hol.getDateFrom().getMonthValue());
			int countTo = listMonths.get(hol.getDateTo().getMonthValue());
			int increasByOne = 1;

			if ((hol.getDateFrom().getMonthValue() == hol.getDateTo().getMonthValue()) && hol.getDateFrom().getYear() == year) {
				listMonths.set(hol.getDateFrom().getMonthValue(), countFrom += increasByOne);
			} else {

				if (hol.getDateFrom().getYear() == year)
					listMonths.set(hol.getDateFrom().getMonthValue(), countFrom += increasByOne);
				if (hol.getDateTo().getYear() == year)
					listMonths.set(hol.getDateTo().getMonthValue(), countTo += increasByOne);
			}
		});

		return listMonths;
	}

}

#HOLIDAY CALCULATOR
####DESCRIPTION:
Create simple holiday calculator for employers. You have two model classes:

1. class `Employee` contain information about employee (his/her name)
2. class `Holiday` contain information about employee and his/her planned holiday (date range)

You have also class `HolidayCalculator`, which contain two list:

1. `List<Employee> employees` contain all employees working in factory 
2. `List<Holiday> holidays` contain planned holidays

Your task is to implement 2 methods in class `HolidayCalculator`. Assume that:

* `employees` and `holidays` lists contain at least one element
* all date ranges are valid

1. Implement a method `List<Employee> getWorkingEmployees(LocalDate dateFrom, LocalDate dateTo)` that, given a date range (dateFrom and dateTo), returns list of employees, which don't have a holidays in specific date range, e.q.:
 
 * `employees` list contains 3 employees: `A`, `B`, `C`
 * `holidays` list contains 2 `Holiday` records: `(employee:A, dateFrom:2017-02-01, dateTo:2017-02-01)`, `(employee:B, dateFrom:2017-02-10, dateTo:2017-02-20)` 
 * `getWorkingEmployees(2017-02-02, 2017-02-08)` should return list contain all 3 employees
 * `getWorkingEmployees(2017-02-01, 2017-02-08)` should return list contain employee `B` and `C`
 * `getWorkingEmployees(2017-02-05, 2017-02-15)` should return list contain employee `A` and `C`
 * `getWorkingEmployees(2017-02-12, 2017-02-14)` should return list contain employee `A` and `C`
 
 
2. Implement a method `Month getHolidayMonth()` that returns Month in which the biggest number of employees planning holidays. If in two or more months the same number of employees planning holidays, method should return earliest month of the year, e.q.:

 * `employees` list contains 3 employees: `A`, `B`, `C`
 * `holidays` list contains 3 `Holiday` records: `(employee:A, dateFrom:2017-02-01, dateTo:2017-02-01)`, `(employee:B, dateFrom:2017-02-10, dateTo:2017-03-10)`, `(employee:C, dateFrom:2017-03-10, dateTo:2017-03-11)` - `getHolidayMonth()` should return `Month.March` 
 * `holidays` list contains 2 `Holiday` records: `(employee:A, dateFrom:2017-02-01, dateTo:2017-02-01)`, `(employee:B, dateFrom:2017-03-10, dateTo:2017-03-10)` - `getHolidayMonth()` should return `Month.February`
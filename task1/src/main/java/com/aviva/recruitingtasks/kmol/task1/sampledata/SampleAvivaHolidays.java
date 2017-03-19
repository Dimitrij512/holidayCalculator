package com.aviva.recruitingtasks.kmol.task1.sampledata;

import com.aviva.recruitingtasks.kmol.task1.model.Holiday;
import com.google.common.collect.ImmutableList;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import static com.aviva.recruitingtasks.kmol.task1.sampledata.SampleAvivaEmployees.ANNA;
import static com.aviva.recruitingtasks.kmol.task1.sampledata.SampleAvivaEmployees.JOHN;
import static com.aviva.recruitingtasks.kmol.task1.sampledata.SampleAvivaEmployees.ROB;

public class SampleAvivaHolidays {

    private static final List<Holiday> JOHN_HOLIDAYS = ImmutableList.of(
            new Holiday(JOHN, LocalDate.of(2017, Month.FEBRUARY, 2), LocalDate.of(2017, Month.FEBRUARY, 3)),//2017-02-02 - 2017-02-03
            new Holiday(JOHN, LocalDate.of(2017, Month.JULY, 10), LocalDate.of(2017, Month.AUGUST, 10))//2017-07-10 - 2017-08-10
    );

    private static final List<Holiday> ANNA_HOLIDAYS = ImmutableList.of(
            new Holiday(ANNA, LocalDate.of(2017, Month.JULY, 13), LocalDate.of(2017, Month.AUGUST, 1))//2017-07-13 - 2017-08-01
    );

    private static final List<Holiday> ROB_HOLIDAYS = ImmutableList.of(
            new Holiday(ROB, LocalDate.of(2017, Month.FEBRUARY, 2), LocalDate.of(2017, Month.FEBRUARY, 2)),//2017-02-01 - 2017-02-02
            new Holiday(ROB, LocalDate.of(2017, Month.JULY, 5), LocalDate.of(2017, Month.AUGUST, 5)),//2017-07-05 - 2017-08-05
            new Holiday(ROB, LocalDate.of(2017, Month.AUGUST, 8), LocalDate.of(2017, Month.AUGUST, 12))//2017-08-08 - 2017-08-12
    );

    public static final List<Holiday> AVIVA_HOLIDAYS = new ImmutableList.Builder<Holiday>()
            .addAll(JOHN_HOLIDAYS)
            .addAll(ANNA_HOLIDAYS)
            .addAll(ROB_HOLIDAYS)
            .build();

}

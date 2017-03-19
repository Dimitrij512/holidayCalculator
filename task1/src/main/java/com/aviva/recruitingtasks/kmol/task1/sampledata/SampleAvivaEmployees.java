package com.aviva.recruitingtasks.kmol.task1.sampledata;

import com.aviva.recruitingtasks.kmol.task1.model.Employee;
import com.google.common.collect.ImmutableList;

import java.util.List;

public class SampleAvivaEmployees {

    public static final Employee JOHN = new Employee("JOHN");
    public static final Employee ANNA = new Employee("ANNA");
    public static final Employee ROB = new Employee("ROB");
    public static final Employee LUCAS = new Employee("LUCAS");

    public static final List<Employee> AVIVA_EMPLOYEES = new ImmutableList.Builder<Employee>()
            .add(JOHN)
            .add(ANNA)
            .add(ROB)
            .add(LUCAS)
            .build();

}

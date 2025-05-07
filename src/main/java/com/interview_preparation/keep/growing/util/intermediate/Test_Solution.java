package com.interview_preparation.keep.growing.util.intermediate;
/*
Intermediate Questions
How do you group a list of employees by department using Stream API?

How do you convert a List<Employee> to a Map<Integer, String> where key is ID and value is name?

How do you flatten a List<List<String>> to a single List<String> using Stream API?

What are Collectors.toMap() merge functions used for? Can you provide an example where duplicate keys occur?

How do you calculate the average salary of employees using Stream API?
 */

import com.interview_preparation.keep.growing.util.dto.Employee;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static java.lang.System.out;

public class Test_Solution {
    public static void main(String[] args) {
        out.println("Question-1: How do you group a list of employees by department using Stream API?");
        List<Employee> employeeList = new ArrayList<>();
        Employee employee = new Employee();
        employee.setId(1);
        employee.setName("Ram");
        employee.setSalary(120000);
        employee.setAge(29);
        employeeList.add(employee);

        employee = new Employee();
        employee.setId(2);
        employee.setName("Hariom");
        employee.setSalary(80000);
        employee.setAge(39);
        employeeList.add(employee);

        employee = new Employee();
        employee.setId(2);
        employee.setName("Priyanka");
        employee.setSalary(2000008);
        employee.setAge(19);
        employeeList.add(employee);

        employee = new Employee();
        employee.setId(3);
        employee.setName("Priya");
        employee.setSalary(2000008);
        employee.setAge(19);
        employeeList.add(employee);

        employee = new Employee();
        employee.setId(4);
        employee.setName("ABC");
        employee.setSalary(2000008);
        employee.setAge(39);
        employeeList.add(employee);
        out.println("Solution: 1:======================>>");
        out.println(employeeList.size());

        Map<Integer, List<Employee>> result = employeeList.stream().collect(Collectors.groupingBy(employee1 -> employee1.getAge()));

        result.forEach((age, emp)-> out.println(age + ": "+emp.toString()));

        //How do you convert a List<Employee> to a Map<Integer, String> where key is ID and value is name?
        out.println("Question: 2: How do you convert a List<Employee> to a Map<Integer, String> where key is ID and value is name?");
        //HashMap<Integer, String> resultMap= new HashMap<>();
        //Map<Integer, String> stringMap = (Map<Integer, String>) employeeList.stream().map(employee1 -> {return resultMap.put(employee1.getId(), employee1.getName());});
    }
}

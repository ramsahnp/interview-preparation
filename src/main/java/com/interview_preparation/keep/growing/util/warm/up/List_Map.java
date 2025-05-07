package com.interview_preparation.keep.growing.util.warm.up;

import com.interview_preparation.keep.growing.util.dto.Employee;

import java.util.*;
import static java.lang.System.out;
/*
 Basic Understanding (for warm-up, but expected to be answered very fluently)

How do you convert a List<String> to a List<Integer> using Stream API?

How can you filter a List<Employee> to get employees with salary > 100000?

How do you remove duplicates from a list using Stream API?

How do you sort a list of objects by a field (e.g., age, name) using streams?
 */

public class List_Map {
    public static void main(String[] args) {


        //How do you convert a List<String> to a List<Integer> using Stream API?
        //1 own tried solution
        out.println("Question: 1");
        List<String> stringList = List.of("12", "21", "31", "abc", "-90", "pqr");
        List<Integer> integerList = new ArrayList<>();
        for (String str : stringList) {
            try {
                integerList.add(Integer.valueOf(str));
            } catch (Exception ex) {
                out.println(ex.getMessage());
            }
        }
//        out.println("integerList: " + integerList.toString());
//        out.println("Question: 2");
        // solution -1
       /* List<Integer> integerList1 = stringList.stream().map(a -> {
            Integer a1 = null;
            try {
                a1 = Integer.valueOf(a);
            } catch (Exception e) {
                e.printStackTrace();
            }
            return a1;
        }).toList();
        integerList1.forEach(out::println);*/

        // solution -2
        List<Integer> integerList2 = stringList.stream().filter(str->str.matches("\\d+")).map(Integer::parseInt).toList();
        integerList2.forEach(out::println);

        //2. How can you filter a List<Employee> to get employees with salary > 100000?

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
        out.println(employeeList.size());

        List<Employee> salGtrOneLakh = employeeList.stream().filter(employee1 -> employee1.getSalary() > 100000).findAny().stream().toList();

        out.println(salGtrOneLakh.size());
        salGtrOneLakh.forEach(employee1 -> out.println(employee1.getName()));

        //3. How do you remove duplicates from a list using Stream API?
        out.println("Question: 3");
        List<String> strings = List.of("abc", "abc", "pqr", "pqr", "12", "12");
//        LinkedHashSet<String> stringHashSet = new LinkedHashSet<>(strings);
//        stringHashSet.forEach(out::println);

        List<String> distinct = strings.stream().distinct().toList();
        distinct.forEach(out::println);

        //4. How do you sort a list of objects by a field (e.g., age, name) using streams?

        List<Employee> sortedListBSOnAge = employeeList.stream().sorted(Comparator.comparing(Employee::getAge)).toList();
        sortedListBSOnAge.forEach(employee1 -> out.println(employee1.toString()));
        List<Employee> sortedListBSOnName = employeeList.stream().sorted(Comparator.comparing(Employee::getName)).toList();
        sortedListBSOnName.forEach(employee1 -> out.println(employee1.toString()));


    }

}

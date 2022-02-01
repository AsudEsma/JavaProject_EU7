package classes.day48_collections_part3;

import java.util.*;


public class ListOfMaps {
    public static void main(String[] args) {

        List<Map<String, String>> employees = new ArrayList<>();
        Map<String, String> emp1Data = new HashMap<>();
        emp1Data.put("EmpID", "1230");
        emp1Data.put("EmpName", "John");
        emp1Data.put("JobTitle", "SDET");
        emp1Data.put("Salary", "100000");

        Map<String, String> emp2Data = new HashMap<>();
        emp2Data.put("EmpID", "1231");
        emp2Data.put("EmpName", "Mike");
        emp2Data.put("JobTitle", "Dev");
        emp2Data.put("Salary", "80000");

        employees.add(emp1Data);
        employees.add(emp2Data);

        System.out.println(employees);
        System.out.println("1st emp: " + employees.get(0));
        System.out.println("2nd emp: " + employees.get(1));

        System.out.println("***SALARIES with NAMES***");
        System.out.println(employees.get(0).get("EmpName") + " makes " + employees.get(0).get("Salary") + " USD");
        System.out.println(employees.get(1).get("EmpName") + " makes " + employees.get(1).get("Salary") + " USD");

        System.out.println("***Loop for JobTitles***");
        for (Map<String, String> each : employees) {
            System.out.println(each.get("JobTitle"));
        }

        int totalSalary = 0;
        System.out.println("***Total Salary inside the Loop***");
        for (Map<String, String> each : employees) {
            totalSalary+= Integer.parseInt(each.get("Salary"));
        }

        System.out.println("totalSalary = " + totalSalary);
    }
}

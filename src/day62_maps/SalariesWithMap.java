package day62_maps;

import java.util.*;


public class SalariesWithMap {
    /*Create a map that has a couple data to use. The data will be a name as the key and a salary as the value

Use the created map to find the following:

    1.1 who has the maximum salary?
    1.2 who has the minimum salary?
    1.3 how many employees has the salary between 120k ~ 150K?
    1.4 display the names of the employees who are making less than 118k?
    1.5 increase the salary of each employee by 10K*/
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("Gina", 120);
        map.put("Simi", 135);
        map.put("elena", 140);
        map.put("lorena", 110);

        Integer maxSalary = 0;
        String maxSalaryName = "";
        Integer minSalary = Integer.MAX_VALUE;
        String minSalaryName = "";
        int counterSalary = 0;
        ArrayList<String> salaryLess118 = new ArrayList<>();

        for (Map.Entry<String, Integer> each : map.entrySet()) {

            if (each.getValue() > maxSalary) {
                maxSalary = each.getValue();
                maxSalaryName = each.getKey();
            }
            if (each.getValue() < minSalary) {
                minSalary = each.getValue();
                minSalaryName = each.getKey();
            }

            if (each.getValue() >= 120 && each.getValue() <= 150) {
                counterSalary++;
            }

            if (each.getValue() < 118) {
                salaryLess118.add(each.getKey());
            }

            map.put(each.getKey(),each.getValue()+10);
        }

        System.out.println("Who has the maximum salary? " + maxSalaryName);
        System.out.println("Who has the minimum salary? " + minSalaryName);
        System.out.println("How many employees has the salary between 120k ~ 150K: " + counterSalary);
        System.out.println("Names of the employees who are making less than 118k: "+salaryLess118);
        System.out.println("Map Names and Salaries-> "+map);


    }

}

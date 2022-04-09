package day04_variables;
/* Task:

    class name: School

declare and assign these variables
    number of students in grade 1
    number of students in grade 2
    number of students in grade 3
    number of students in grade 4
    number of students in grade 5

    total number of students in your school

    number of days in a year (have some half day = ~ 100.5)
    number of snow days in a year (double)
    average gpa in school

    print all of the variables with unique messages (edited)
Jump
 */
public class School {
    public static void main(String[] args) {

        int studentsGrade1 = 15;
        System.out.println("\tGrade 1 has "+ studentsGrade1+ " students.");
        int studentsGrade2 = 20;
        System.out.println("\tIn Grade 2 there are "+ studentsGrade2+ " students.");
        int studentsGrade3 = 30;
        System.out.println("\tTeachers instruct "+ studentsGrade3+ " students in Grade 3.");
        int studentsGrade4 = 45;
        System.out.println("\tThere are "+ studentsGrade4+ " desks in grade 4.");
        int studentsGrade5 = 60;
        System.out.println("\tGrade 5 has "+ studentsGrade5+ " students in class.");

        System.out.println("\tGrade 5 has the following number of students: = " + studentsGrade5); //soutv short cut to print variables with statement.

        int totalStudents = studentsGrade1+studentsGrade2+studentsGrade3+studentsGrade4+studentsGrade5;
        System.out.println("\tThe school has a total of "+ totalStudents+ " students.");

        double schoolDaysYear = 150.5;
        System.out.println("\tThe school year has "+ schoolDaysYear+ " days.");
        double snowDays= 25.3;
        System.out.println("\tThe school closed "+ snowDays+ " days due to snow.");
        double averageGpa= 3.7;
        System.out.println("\tThe students average GPA is: "+ averageGpa);
    }
}

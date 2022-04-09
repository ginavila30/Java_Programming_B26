package day07_unaryoperators;

public class Salary {
    /*create a class SalaryCalculator
add a main method
declare and assign these variables:

   salary, stateTaxRate, federalTaxRate,  stateTax, federalTax, totalTax, salaryAfterTax

Sample date:
   100000 (salary)
   0.08 (state tax rate)
   0.21 (federal tax rate)

Hint: use tax rates of 0.08 and 0.21 for 8% and 21%

Print the tax rates, your total salary, the amount of tax for state and federal, the total tax amount, and your salary after all taxes*/

    public static void main(String[] args) {
        double salary=100000,stateTaxRate=0.08,federalTaxRate=0.21;
        double stateTax=salary*stateTaxRate;
        double federalTax=salary*federalTaxRate, totalTax=stateTax+federalTax, salaryAfterTax=salary-totalTax;

        String taxReport="State tax rate "+stateTaxRate+", Federal Tax Rate "+federalTaxRate+". The salary $"+salary+"\nTax amounts: "+stateTax+ " and "+federalTax+ " for a total of "+totalTax+ "\nAfter taxes the salary is: "+salaryAfterTax;
        System.out.println(taxReport);


    }
}

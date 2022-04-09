package day06_Arithmetic_Operators;
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
public class salaryCalculator {
    public static void main(String[] args) {
        int salary= 58_000;
        double stateRate=0.08;
        double federalTaxRate=0.21;
        double stateTax=salary*stateRate;
        double federalTax=salary*federalTaxRate;
        double totalTax=stateTax+federalTax;
        double salaryAfterTax=salary-totalTax;

        String salaryInfo="My salary is $"+salary+" I get deducted the following Tax rates: \nState Rate: "+stateRate+"\nFederal rate: "+federalTaxRate+"."+ "\nMy deductions this year are: $"+stateTax+" and $"+federalTax+ " This is a total of $"+totalTax+" deductions."+ "\nTherefore, my net income this year is $"+(int)salaryAfterTax;

        System.out.println(salaryInfo);

    }
}

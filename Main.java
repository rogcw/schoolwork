package com.company;

public class Main {
    public static void main(String[] args) {

        //create subclass objects
        SalariedEmployee salariedEmployee = new SalariedEmployee("John", "Smith",
                "111-11-1111", 800.0);

        HourlyEmployee hourlyEmployee = new HourlyEmployee("Karen", "Price",
                "222-22-2222", 16.75, 40);

        CommissionEmployee commissionEmployee = new CommissionEmployee("Sue", "Jones",
                "333-33-3333", 10000, 0.06);

        BasePlusCommissionEmployee basePlusCommissionEmployee = new BasePlusCommissionEmployee("Bob",
                "Lewis", "444-44-4444", 5000, 0.04, 300);

        System.out.println("Employees processed individually:");
        System.out.printf("%n%s%n%s: $%,.2f%n%n", salariedEmployee, "earned", salariedEmployee.getPaymentAmount());
        System.out.printf("%s%n%s: $%,.2f%n%n", hourlyEmployee, "earned", hourlyEmployee.getPaymentAmount());
        System.out.printf("%s%n%s: $%,.2f%n%n", commissionEmployee, "earned", commissionEmployee.getPaymentAmount());
        System.out.printf("%s%n%s: $%,.2f%n%n", basePlusCommissionEmployee, "earned", basePlusCommissionEmployee.getPaymentAmount());

        //create a four element array of Employees
        Employee[] employees = new Employee[4];

        //initialize array of Employees
        employees[0] = salariedEmployee;
        employees[1] = hourlyEmployee;
        employees[2] = commissionEmployee;
        employees[3] = basePlusCommissionEmployee;

        System.out.println("Objects processed polymorphically: %n%n");

        //generically process each element in array employees
        for(Employee currentEmployee : employees)
        {
            System.out.println(currentEmployee); //invokes toString
            if (currentEmployee instanceof BasePlusCommissionEmployee)
            {
                //downcast Employee reference to BasePlusCommissionEmployee reference
                BasePlusCommissionEmployee employee = (BasePlusCommissionEmployee) currentEmployee;
                employee.setBaseSalary(1.10 * employee.getBaseSalary());

                System.out.printf("new base salary with 10% increase is: $%,.2f%n", employee.getBaseSalary());
            }
            System.out.printf("earned $%,.2f%n%n", currentEmployee.getPaymentAmount());
        }
        for(int j = 0; j < employees.length; j++){
            //get type name for object in employees array
            System.out.printf("Employee %d is a %s%n", j, employees[j].getClass().getName());
        }
    }
}

//EmployeeTest2.java
//static variables can be used to maintain a count of employee objects in memory

class Employee{
    private static int count = 0; //number of Employees created
    private String firstName;
    private String lastName;

    //initialize Employee, add 1 to static count and output a String indicating the constructor was called
    public Employee(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;

        ++count; //increment static count of Employees
        System.out.printf("Employee constructor: %s %s; count = %d%n", firstName, lastName, count);
    }

    //get first name
    public String getFirstName(){
        return firstName;
    }

    //get last name
    public String getLastName(){
        return lastName;
    }

    //static method to get static count value
    public static int getCount(){
        return count;
    }
}

public class EmployeeTest2{
    public static void main(String [] args){
        //show that count is 0 before creating Employees
        System.out.printf("Employees before instantiation: %d%n", Employee.getCount());

        //create two Employees; count should be 2
        Employee e1 = new Employee("Susan", "Baker");
        Employee e2 = new Employee("Bob", "Blue");

        //show that count is 2 after creating two Employees
        System.out.printf("%nEmployees after instantiation:%n");
        System.out.printf("via e1.getCount(): %d%n", e1.getCount());
        System.out.printf("via e2.getCount(): %d%n", e2.getCount());
        System.out.printf("via Employee.getCount(): %d%n", Employee.getCount());

        //get names of Employees
        System.out.printf("%nEmployee 1: %s %s%nEmployee 2: %s %s%n", e1.getFirstName(), e1.getLastName(), e2.getFirstName(), e2.getLastName());
    }
}
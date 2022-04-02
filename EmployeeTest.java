//EmployeeTest.java
//Demonstrates composition

class Date {
    private int month; // 1-12
    private int day; // 1-31 based on month
    private int year; //any year
    private static final int daysPerMonth [] = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}; //Array contains days per respective month

    //constructor: confirm proper value for month and day given the year
    public Date(int month, int day, int year){
        //check if month is in range
        if(month <= 0 || month > 12){
            throw new IllegalArgumentException("month (" + month + ") must be 1-12");
        }
        //check if day is in range and it is not a leap year
        if(day <= 0 || (day > daysPerMonth[month] && !(month == 2 && day == 29))){
            throw new IllegalArgumentException("day (" + day + ") out of range for the specified month and year");
        }

        //check for leap year if month is 2 and day is 29
        if(month == 2 && day == 29 && !(year % 400 == 0 || (year % 4 == 0 && year % 100 != 0))){
            throw new IllegalArgumentException("day (" + day + ") out of range for the specified month and year");
        }

        this.month = month;
        this.day = day;
        this.year = year;

        System.out.printf("Date object constructor for date %s%n", this);

    }
    //return a String of the form month/day/year
    public String toString(){
        return String.format("%d/%d/%d", month, day, year);
    }
}

class Employee{
//Class that references other objects (example of composition)
    private String firstName;
    private String lastName;
    private Date birthDate;
    private Date hireDate;

    //constructor to initialize name, birthdate, and hiring date
    public Employee(String firstName, String lastName, Date birthDate, Date hireDate){
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.hireDate = hireDate;
    }

    //convert Employee to String format
    public String toString(){
        return String.format("%s, %s Hired: %s Birthday: %s", lastName, firstName, hireDate, birthDate);
    }
}

public class EmployeeTest{
    public static void main(String [] args){
        Date birth = new Date(7, 24, 1989);
        Date hire = new Date(3, 12, 1988);
        Employee employee = new Employee("Bob", "Blue", birth, hire);

        System.out.println(employee);
    }
}
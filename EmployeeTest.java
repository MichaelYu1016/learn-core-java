import java.time.*;
/**
 * This program tests the Employee class.
 */
public class EmployeeTest{
    public static void main(String[] args) {
        Employee[] staff = new Employee[3];

        staff[0] = new Employee("Michael Jordan", 1500000, 1984, 6, 19);
        staff[1] = new Employee("Hakeem Olajuwon", 1400000, 1984, 6, 19);
        staff[2] = new Employee("Kobe Bryant", 1300000, 1996, 6, 26);

        // 升值加薪10%
        for (Employee e : staff) {
            e.raiseSalary(10);
        }
        for (Employee e : staff) {
            System.out.println("name="+e.getName()+",salary="+e.getSalary()+",hireDay="+e.getHireDay());
        }
    }
}
// 雇员类
class Employee{
    private String name;
    private double salary;
    private LocalDate hireDay; // 不要使用Date，因为Date类对象是可变的，LocalDate类没有更改器方法.

    public Employee(String n, double s, int year, int month, int day){
        name = n;
        salary = s;
        hireDay = LocalDate.of(year, month, day);
    }

    public String getName(){
        return name;
    }

    public double getSalary(){
        return salary;
    }

    public LocalDate getHireDay(){
        return hireDay;
    }

    public void raiseSalary(double byPercent){
        double raise = salary * byPercent/100;
        salary += raise;
    }
}
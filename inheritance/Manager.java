package inheritance;

public class Manager extends Employee {
    private double bonus;

    /**
     * 构造器方法
     * @param name 雇员姓名
     * @param salary 薪水
     * @param year 入职年
     * @param month 入职月
     * @param day 入职日
     */
    public Manager(String name, double salary, int year, int month, int day){
        super(name, salary, year, month, day);
        bonus = 0;
    }

    public double getSalary() {
        double baseSalary = super.getSalary();
        return baseSalary + bonus;
    }

    public void setBonus(double b) {
        bonus = b;
    }
}
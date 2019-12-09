/**
 * 静态方法的Demo
 */
public class StaticTest{
    public static void main(String[] args) {
        Employee1[] staff = new Employee1[3];

        staff[0] = new Employee1("Michael Jordan", 1500000);
        staff[1] = new Employee1("Hakeem Olajuwon", 1400000);
        staff[2] = new Employee1("Kobe Bryant", 1300000);

        // 升值加薪10%
        for (Employee1 e : staff) {
            e.setId();
            System.out.println("name="+e.getName()+",salary="+e.getSalary()+",id="+e.getId());
        }
        int n = Employee1.getNextId();
        System.out.println("Next available id="+n);
    }
}
// 新雇员类
class Employee1{
    private static int nextId = 1;

    private String name;
    private double salary;
    private int id;

    public Employee1(String n, double s){
        name = n;
        salary = s;
        id = 0;
    }

    public String getName(){
        return name;
    }

    public double getSalary(){
        return salary;
    }

    public int getId(){
        return id;
    }

    public void setId(){
        id = nextId; // set id to next available id
        nextId++;
    }

    public static int getNextId() {
        return nextId;
    }

    public static void main(String[] args) {
        Employee1 e = new Employee1("James", 50000);
        System.out.println(e.getName()+" "+e.getSalary());
    }
}
package inheritance;
/**
 * 继承示例
 */
public class ManagerTest {
    public static void main(String[] args){
        // 创建管理者
        Manager boss = new Manager("Carl Cracker", 80000, 1987, 12, 25);
        boss.setBonus(5000);
        
        Employee[] staff = new Employee[3];
        
        // 填充雇员和管理者到雇员数组
        staff[0] = boss;
        staff[1] = new Employee("Harry Hacker", 50000, 1989, 10, 1);
        staff[2] = new Employee("Tommy Tester", 40000, 1990, 3,15);
    
        for (Employee e : staff) {
            System.out.println("name=" + e.getName() + ",salary=" + e.getSalary());
        }
    }
}
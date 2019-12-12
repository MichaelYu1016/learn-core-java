package abstractClasses;

public class Student extends Person {
    private String major;

    /**
     * 
     * @param name 学生姓名
     * @param major 学生主修课
     */
    public Student(String name, String major) {
        // pass n to superclass constructor
        super(name);
        this.major = major;
    }

    public String getDescription() {
        return "a student majoring in" + major;
    }
}
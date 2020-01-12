package map;

public class Employee {
    private String name;

    public Employee(){};

    public Employee(String name){
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public String toString(){
        return "[name="+name+"]";
    }
}
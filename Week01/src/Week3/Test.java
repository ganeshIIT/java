package Week3;

import java.util.function.DoublePredicate;

class Employee{
    private String name;
    private Double salary;

    public Employee(String n, Double s){
        this.name = n;
        this.salary =s;
    }

    public void setName(String n){
        this.name = n;
    }
    public void setSalary(Double s){
        this.salary = s;
    }

    public String getName(){
        return this.name;
    }
    public Double getSalary(){
        return this.salary;
    }
    public double bonus(double percentage){
        return percentage*salary/100;
    }
}

class Manager extends Employee{
    private String secretary;

    public Manager(String n, Double s){
        super(n,s);
    }
    public void setSecretary(String s){
        this.secretary = s;
    }
    public String getSecretary(){
        return this.secretary;
    }
    public double bonus(double percentage){
        return 1.5*super.bonus(percentage);
    }
}




public class Test {
    public static void main(String[] args){
        Employee e = new Employee("Ganesh", 30000D);
        Employee m = new Manager("Juergen", 40000D);
        ((Manager)m).setSecretary("Stella");

//        e.setName("Ganesh");
//        e.setSalary(30000D);
        System.out.println(e.getName());
        System.out.println(e.getSalary());
        System.out.println(e.bonus(10D));

        System.out.println("");

        System.out.println(m.getName());
        System.out.println(m.getSalary());
        System.out.println(((Manager)m).getSecretary());
        System.out.println(m.bonus(10D));
    }
}
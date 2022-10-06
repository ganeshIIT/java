package Week2;

class Student {
    private int rn;
    private String name;

    public Student(String n){
        name = n;
    }
    public Student(String n, int no){
        name = n;
        rn = no;
    }
    public Student(Student s){
        this.name = s.name;
        this.rn = s.rn;
    }

    public String getName() {
        return name;
    }
    public void setName(String n){
        name = n;
    }
    public int getRn(){
        return rn;
    }
}

public class Main {
    private static int a=10;
    public static void main(String[] args) {
        Student s1 = new Student("Ganesh");
        Student s2 = new Student("Lakshman", 100);
        Student s3 = new Student(s1);

//        s1.setName("Ganny");
//        s2.setName("Prodigy");

        System.out.println("Hello world!");
        System.out.println(s1.getName());
        System.out.println(s2.getName());
        System.out.println(s3.getName());
    }
}
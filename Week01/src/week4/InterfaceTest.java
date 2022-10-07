package week4;

interface AA{
    public static final int a =10;
    void add();
    default void show(){
        System.out.println("This is AA show");
    }
    static void display(){
        System.out.println("Hi I'm static");
    }
}
interface BB{
    public abstract void show();
}

class Impl implements AA, BB{
    @Override
    public void add(){

    }

    @Override
    public void show(){
        AA.super.show();
        System.out.println("This is Impl show");
    }
}

public class InterfaceTest {
    public static void main(String[] args) {
        AA.display();
        Impl i = new Impl();
        i.show();
    }
}

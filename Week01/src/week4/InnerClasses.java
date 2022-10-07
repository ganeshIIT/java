package week4;

class Outer{
    class Inner{
        public void show(){
            System.out.println("This is from Inner");
        }
    }

    static class StaticInner{
        public void show(){
            System.out.println("this from static inner");
        }
    }
}

public class InnerClasses {
    public static void main(String[] args) {
        Outer o = new Outer();
        Outer.Inner inner = o.new Inner();
        inner.show();

        Outer.StaticInner sInner = new Outer.StaticInner();
        sInner.show();
    }
}

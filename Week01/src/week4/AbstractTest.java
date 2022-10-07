package week4;

abstract class FoodOrder{
    public abstract void order();
}

class Swiggy extends FoodOrder{
    public void order(){
        System.out.println("You have got food from Swiggy");
    }
}

class Zomato extends FoodOrder{
    public void order(){
        System.out.println("You have got food from Zomato");
    }
}

class FoodPanda extends FoodOrder{
    public void order(){
        System.out.println("You have got food from FoodPanda");
    }
}

class User{
    public void getFood(FoodOrder obj){
        obj.order();
    }
}

public class AbstractTest {
    public static void main(String[] args) {
        User u = new User();
        u.getFood(new FoodPanda());
    }
}

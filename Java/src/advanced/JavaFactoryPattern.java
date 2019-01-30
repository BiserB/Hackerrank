package advanced;


import java.util.Scanner;

class Food {

    public Class getType() {

        return this.getClass();
    }
}

class FoodFactory {

    Food getFood(String order) {

        if (order.equals("pizza")){
            return new Pizza();
        }

        if (order.equals("cake")){
            return new Cake();
        }

        return null;
    }

}

public class JavaFactoryPattern {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        //creating the factory
        FoodFactory foodFactory = new FoodFactory();

        //factory instantiates an object
        Food food = foodFactory.getFood(sc.nextLine());

        System.out.println("The factory returned " + food.getClass());

        System.out.println(food.getType());

    }

}






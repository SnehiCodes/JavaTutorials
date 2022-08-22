//2DArrayList
// 2D ArrayList = a dynamic list
// You can change the size of these lists during runtime
import java.util.*;

public class arraylist2D{
    public static void main(String[] args){

        ArrayList<ArrayList<String>>groceryList = new ArrayList();

        ArrayList<String> bakeryList = new ArrayList();
        bakeryList.add("pasta");
        bakeryList.add("garlic bread");
        bakeryList.add("donuts");

        System.out.println(bakeryList);
        System.out.println(bakeryList.get(0));

        ArrayList<String>produceList = new ArrayList();
        produceList.add("tomato");
        produceList.add("zucchini");
        produceList.add("peppers");
        System.out.println(produceList.get(0));

        ArrayList<String>drinksList = new ArrayList();
        drinksList.add("coffee");
        drinksList.add("wine");
        drinksList.add("beer");
        System.out.println(drinksList);

        groceryList.add(produceList);
        groceryList.add(bakeryList);
        groceryList.add(produceList);
        System.out.println(groceryList);
        System.out.println(groceryList.get(1).get(2));




    }

        }

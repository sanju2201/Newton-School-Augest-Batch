package ArrayListQuestion;

import java.util.*;
import java.util.Collection;

public class ListOfList {
    public static void main(String[] args) {

        ArrayList<ArrayList<String>> list = new ArrayList<>();

        ArrayList<String> food = new ArrayList<>();
        food.add("Rice");
        food.add("Dal");
        food.add("Vegis");

        ArrayList<String> place = new ArrayList<>();
        place.add("Bhilai");
        // place.add("Bangalore");
        // place.add("kolkata");

        ArrayList<String> price = new ArrayList<>();
        price.add("500");
        price.add("200");
        // price.add("100");

        ArrayList<String> name = new ArrayList<>();
        name.add("sanju");
        name.add("Nikita");
        name.add("Mom");

        list.add(food);
        list.add(place);
        list.add(price);
        list.add(name);

        System.out.println(list);

    }

}

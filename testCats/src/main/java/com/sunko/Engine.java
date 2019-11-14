package com.sunko;

import com.sunko.entities.Cat;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Engine implements Runnable {
    public void run() {
        Scanner scanner = new Scanner(System.in);
        String input;
     List<Cat> listOfCats = new ArrayList<Cat>();
        while(true){
            input = scanner.nextLine();
            if(input.equals("quit")){
                break;
            }
            String[] tokens = input.split("\\s+");
            int name = Integer.parseInt(tokens[0]) ;
            int gender = Integer.parseInt(tokens[1]) ;
            Cat cat = new Cat(name,gender);
//            listOfCats.add(cat.toString());
listOfCats.add(cat);
        }
//        for (String listOfCat : listOfCats) {
//            System.out.println(listOfCat);
//        }

        for (Cat listOfCat : listOfCats) {
            System.out.println(listOfCat);
        }
    }

 public  Cat myCatName (Cat cat,int name,int gender){
         cat = new Cat(name,gender);
        return cat;
    }
}

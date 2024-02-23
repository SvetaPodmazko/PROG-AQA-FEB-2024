package org.prog.collections;

import java.util.*;

import static org.prog.collections.ColorCar.*;

/**
 * Write HashMap of owned cars, set their colors using enum you create
 * print owners of cars of certain color
 */
public class HomeWork {

    public static void main(String[] args) {
       HashMap<String, ColorCar> carOwner = new HashMap<>();
        carOwner.put("Joe", ColorCar.BLUE);
        carOwner.put("Roy", ColorCar.RED);
        carOwner.put("Billy", ColorCar.GREEN);
        carOwner.put("Alex", ColorCar.BLACK);

        System.out.println(carOwner);

        Set<String> keys = carOwner.keySet();
        System.out.println("List of owners: "+keys);

        ArrayList<ColorCar> value = new ArrayList<>(carOwner.values());
        System.out.println("List color car: "+value);


       // HashMap<String, ColorCar>  joy = new HashMap<>();
       // joy.put("Joу", BLUE);
       // HashMap<String, ColorCar>  roy = new HashMap<>();
       // roy.put("Roy", RED);
       // HashMap<String, ColorCar>  billy = new HashMap<>();
       // billy.put("Billy", GREEN);
       // HashMap<String, ColorCar>  alex = new HashMap<>();
       // alex.put("Alex", BLACK);
       // HashMap<String, ColorCar>  sveta = new HashMap<>();
       // sveta.put("Sveta", GREEN);
       // HashMap<String, ColorCar>  alla = new HashMap<>();
       // alla.put("Alla", BLACK);

       // List<HashMap<String,ColorCar>> ownersBlueCar=new ArrayList<>();
       // ownersBlueCar.add(joy);
       // System.out.println(ownersBlueCar);

       // List<HashMap<String,ColorCar>> ownersRedCar=new ArrayList<>();
       // ownersRedCar.add(roy);
       // System.out.println(ownersRedCar);

       // List<HashMap<String,ColorCar>> ownersGreenCar=new ArrayList<>();
       // ownersGreenCar.add(billy);
       // ownersGreenCar.add(sveta);
       // System.out.println(ownersGreenCar);

       // List<HashMap<String,ColorCar>> ownersBlackCar=new ArrayList<>();
       // ownersBlackCar.add(alex);
       // ownersBlackCar.add(alla);
       // System.out.println(ownersBlackCar);

    }
    }



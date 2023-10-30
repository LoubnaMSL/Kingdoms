package com.example.demokingdoms;

import Factories.CityFactory;
import Modeles.City;

public class CityFactoryTest {
    public static void main(String[] args){
        CityFactory cityFactory= new CityFactory();
        City c=cityFactory.createCity("100","120");
        System.out.println("sold "+c.toString());
        System.out.println("good");

    }
}

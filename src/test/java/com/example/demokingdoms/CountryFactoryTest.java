package com.example.demokingdoms;

import Factories.CityFactory;
import Factories.CountryFactory;
import Modeles.City;
import Modeles.Country;

public class CountryFactoryTest {
    public static void main(String[] args){
        CountryFactory countryFactory= new CountryFactory();
        Country c=countryFactory.createCountry("france","100","120","12","45");
        System.out.println(c.toString());

    }
}

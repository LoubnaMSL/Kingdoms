package Factories;

import Modeles.City;

public class CityFactory implements ICityFactory{
    public  City createCity(String s, String s1) {
        int sold =Integer.parseInt(s);
        int citizen =Integer.parseInt(s1);

        City city=new City(sold,citizen);
        return city;
    }
}

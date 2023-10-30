package Factories;

import Modeles.City;
import Modeles.Country;

import java.util.ArrayList;
import java.util.List;

public class CountryFactory implements IcountryFactory{

    @Override
    public Country createCountry(String... desp) {
        List<City> cities = new ArrayList<City>();
        CityFactory cityFactory=new CityFactory();
        String name=desp[0];
        for (int i = 1; i < desp.length - 1; i += 2) {
            cities.add(cityFactory.createCity(desp[i], desp[i + 1]));
        }
        return new Country(name,cities);
    }
}

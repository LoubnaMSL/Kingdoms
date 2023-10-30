package Factories;

import Modeles.City;

public interface ICityFactory {
    public City createCity(String nbrSolda, String nbrCity);
}

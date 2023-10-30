package Factories;

import Modeles.Country;

public interface IcountryFactory {
    public Country createCountry(String... desq);

}

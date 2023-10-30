package Modeles;

import java.util.ArrayList;
import java.util.List;

public class Country extends ArrayList<Country> {
    private String name;
    private ArrayList<City> cities;


    public Country(String name, List<City> cities) {
        this.name=name;
        this.cities= (ArrayList<City>) cities;
    }


    public String toString(){
        System.out.println("   * country which name is "+this.name+" has cities with ");
            for(City c : cities){
                System.out.println(c.toString());
            }
        return "";
    }
 public String report(){
        String content="";
        int a=1;
        for(City c :cities){

            content+= name.substring(0,1)+"c"+a+":"+c.report();

            if(a<cities.size())
                content+=",";
            a++;
        }
        return new String(this.name.substring(0,1)+"<"+content+">");
 }
    public int currentPower() {
        int currentPowerCount=0;
        for(City city:cities){
            currentPowerCount+=city.currentPower();
        }
        return currentPowerCount;}


}

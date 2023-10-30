package Modeles;

import Factories.CountryFactory;

import java.util.ArrayList;
import java.util.List;

public class KingDom {
    private String king;
    private int SoldiersOnEdges;

    private ArrayList<Country> countries=new ArrayList<Country>();
    private  KingDom(){
    }
public static class KingDomBuilder{
    private String king;
    private ArrayList<Country> countries=new ArrayList<Country>();;
    private int SoldiersOnEdges;

    public KingDomBuilder  addCountry(String... desp) {
        CountryFactory cf =new CountryFactory();
        countries.add(cf.createCountry(desp));
        return this;
    }
    public KingDomBuilder  addKing(String king ) {
        this.king = king;
        return this;}
    public KingDomBuilder addSoldiersOnEdges(String desp){
        this.SoldiersOnEdges= Integer.parseInt(desp);
        return this;
    }

    public KingDom build(){
        KingDom kingDom=new KingDom();
        kingDom.king=this.king;
       kingDom.countries=this.countries;
       kingDom.SoldiersOnEdges=this.SoldiersOnEdges;
       System.out.println(kingDom.toString());
        return kingDom;
    }

    }
    public String toString(){
        System.out.println("kingdom whose king  is "+this.king+" has: ");
        for(Country c : countries){
            System.out.println(c.toString());
        }
        return "";


    }
    public String report(){
        String contnt="";
        int a=1;
        for(Country c:countries){

            contnt+= c.report();
            if(a<countries.size())
                contnt+=", ";
            a++;
        }
        return new String(this.king+": |"+contnt+"|");
    }
    public int currentPower() {
        int currentPowerCount=0;
        for(Country country:countries){
            currentPowerCount+=country.currentPower();
        }
        return currentPowerCount;
    }

}

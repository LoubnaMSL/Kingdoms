package Modeles;

public class City {
    private int nbSoldiers;
    private int nbCitizens;
    public City(int nbSoldiers,int  nbCitizens){
        this.nbCitizens=nbCitizens;
        this.nbSoldiers=nbSoldiers;
    }
    public String toString(){
        return "      - city with "+this.nbSoldiers+" soldaries and "+this.nbCitizens+" citizens.";
    }
    public String report(){
        return new String(this.nbSoldiers+"-"+this.nbCitizens);
    }
    public int currentPower(){
        return this.nbSoldiers;
}
}

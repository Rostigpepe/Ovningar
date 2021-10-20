package Övningsuppgift2aOOP;

public class Tåg extends Fordon{

    private int antalVagnar;

    Tåg(int antalVagnar, int vikt){

        super(vikt);
        this.antalVagnar = antalVagnar;

    }

    public void kopplaVagn(){

        antalVagnar = antalVagnar++;

    }
}

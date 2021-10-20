package Övningsuppgift2aOOP;

public class Fordon {

    protected int hastighet;
    protected int vikt;


    Fordon(int vikt){

        this.hastighet = 0;
        this.vikt = vikt;

    }

    public void ändraHastighet(int nyHastighet){

        hastighet = nyHastighet;
    }

}

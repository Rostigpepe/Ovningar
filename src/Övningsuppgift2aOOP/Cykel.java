package Övningsuppgift2aOOP;

public class Cykel extends Fordon{

    private int antalVäxlar;
    private int växelJustNu;

    Cykel(int antalVäxlar, int vikt){

        super(vikt);
        this.antalVäxlar = antalVäxlar;
        this.växelJustNu = 0;

    }

    public void växla(int växel){

        växelJustNu = växel;

    }

}

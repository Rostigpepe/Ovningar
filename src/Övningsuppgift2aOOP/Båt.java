package Övningsuppgift2aOOP;

public class Båt extends Fordon{

    private int dödvikt;

    Båt(int dödvikt, int vikt){

        super(vikt);
        this.dödvikt = dödvikt;

    }

    public void sväng(){

        System.out.println("Ojoj nu svänger vi");
    }

}

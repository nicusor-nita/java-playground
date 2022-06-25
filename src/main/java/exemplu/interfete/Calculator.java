package exemplu.interfete;

import java.util.concurrent.Callable;

public class Calculator{

    private Procesor procesor;

    public Calculator(Procesor processor){
        this.procesor=processor;
    }
    public void lucreaza(){
        procesor.compute();
    }
}

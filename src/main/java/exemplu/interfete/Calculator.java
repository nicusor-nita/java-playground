package exemplu.interfete;

public class Calculator{

    private Procesor procesor;
    public void lucreaza(){
        procesor.compute();
    }
    public void setProcesor(Procesor procesor){
        this.procesor = procesor;
    }
}

package exemplu.interfete;

public class Calculator{

    private Procesor procesor;
    void lucreaza(){
        procesor.compute();
    }
    void setProcesor(Procesor procesor){
        this.procesor = procesor;
    }
}

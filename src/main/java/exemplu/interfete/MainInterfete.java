package exemplu.interfete;

public class MainInterfete {
    public static void main(String[] args) {
        Calculator calculator = new Calculator(new ProcesorAMD());
        calculator.lucreaza();
    }
}

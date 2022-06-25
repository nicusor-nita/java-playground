package exemplu.spring;

import exemplu.interfete.Calculator;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainSpring {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("context.xml");
        Calculator calculator =applicationContext.getBean("calculator", Calculator.class);
        calculator.lucreaza();
    }
}

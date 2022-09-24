package hu.uni.miskolc.webalk;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 */

public class App {
    public static void main(String[] args) {

       /*
       // XML alapú konfiguráció
       ApplicationContext context =
                new ClassPathXmlApplicationContext("beans.xml");
        */

        //Annotáció alapú konfiguráció
        ApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);


        HallgatoService service =
                (HallgatoService) context.getBean("hallgatoService");

        System.out.println(service.getHallgatok());
    }
}

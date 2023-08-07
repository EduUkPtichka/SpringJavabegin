package StartV1;

import StartV1.ModelT1000;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Start {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext(
                "Urok5.xml"
        );
        ModelT1000 t1000 = (ModelT1000) context.getBean("t1000");
        t1000.dance();
    }
}

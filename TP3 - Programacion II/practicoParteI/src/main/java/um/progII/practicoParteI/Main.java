package um.progII.practicoParteI;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context =
                new AnnotationConfigApplicationContext(ApplicationConfig.class);
        Arranque arranque = context.getBean(Arranque.class);
        ApplicationContextProvider applicationContextProvider =
                new ApplicationContextProvider();
        applicationContextProvider.setApplicationContext(context);
        arranque.arranque();
    }
}


package Presentation;

import metier.IMetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PresWithSpringAnnotations {
    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext("dao", "metier");
        IMetier metier = (IMetier) ctx.getBean("metier");
        System.out.println(metier.calcul());
    }
}

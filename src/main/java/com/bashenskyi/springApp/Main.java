package com.bashenskyi.springApp;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by Ruslan on 28.04.2017.
 */
public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext annotationConfigApplicationContext =
                new AnnotationConfigApplicationContext(SpringConfiguration.class);

        HelloWorld bean = annotationConfigApplicationContext.getBean(HelloWorld.class);
        bean.setMessage("Hello World");
        bean.getMessage();

        HelloWorld bean2 = annotationConfigApplicationContext.getBean(HelloWorld.class);
        bean2.getMessage();
    }
}

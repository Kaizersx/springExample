package org.vaagn;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.vaagn.config.SpringConfig;
import org.vaagn.service.TestBean;

/**
 * Hello world!
 *
 */
public class App 
{

    public static void main( String[] args )
    {

        AnnotationConfigApplicationContext context= new AnnotationConfigApplicationContext(SpringConfig.class);

        TestBean bean= context.getBean(TestBean.class);

        String name= bean.getName();


        System.out.println( "Hello World! "+ name );
    }
}

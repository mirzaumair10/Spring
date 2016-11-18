package myPackage;

//import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class MainApp {
   public static void main(String[] args) {
      AbstractApplicationContext context = 
             new ClassPathXmlApplicationContext("Beans.xml");

    //  HelloWorld objA = (HelloWorld) context.getBean("helloWorld");
    //  objA.getMessage1();
    //  objA.setMessage2("Hello 2nd");
    //  objA.getMessage2();
     
      ByeWorld objB = (ByeWorld) context.getBean("byeWorld");
      objB.getMessage1();
      objB.getMessage2();
      objB.getMessage3();
      /*HelloWorld obj2 = (HelloWorld) context.getBean("helloWorld");
      //obj2.setMessage("Setted msg2");
      obj2.getMessage();*/
      
      context.registerShutdownHook();
   }
}
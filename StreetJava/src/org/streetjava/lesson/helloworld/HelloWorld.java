package org.streetjava.lesson.helloworld;

/**
 * HellowWorld main program
 *
 * @author dungld
 */
public class HelloWorld {

    public static void main(String[] args) {
        Sayable english = new English();
        english.sayHello();
        
        Sayable vietnamese = new Vietnamese();
        vietnamese.sayHello();
    }
}

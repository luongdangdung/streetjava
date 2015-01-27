package org.streetjava.lesson.helloworld;

/**
 *
 * @author dungld
 */
public class Teacher implements Test{

    @Override
    public void testLanguage(Sayable sayable) {
        sayable.sayHello();
    }
    
}

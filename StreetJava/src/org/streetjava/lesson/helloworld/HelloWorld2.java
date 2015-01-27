package org.streetjava.lesson.helloworld;

/**
 * HellowWorld2 main program demonstrates useful of interface
 *
 * @author dungld
 */
public class HelloWorld2 {

    public static void main(String[] args) {
        Sayable english = new English();
        Sayable vietnamese = new Vietnamese();

        Test teacher = new Teacher();
        teacher.testLanguage(english);
        teacher.testLanguage(vietnamese);
    }
}

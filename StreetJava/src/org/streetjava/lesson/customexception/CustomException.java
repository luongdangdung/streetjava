package org.streetjava.lesson.customexception;

import org.streetjava.util.SJUtil;

/**
 * This is main program to run sample about custom exception. When exception
 * appears, it will stop execution at exception point and move to logic that
 * handle it and depend on logic of exception handler, the program can continue
 * or not.
 *
 * @author dungld
 */
public class CustomException {

    public static void main(String[] args) {

        try {
            Shape triagle = new Triagle(10, 1);
            Shape square = new Square(10, 3);
            Shape circle = new Circle(-2);

            System.out.println("square area=" + square.getArea());
            System.out.println("triagle area=" + triagle.getArea());
            System.out.println("circle area=" + circle.getArea());
            

            System.out.println("finish");
        } catch (Exception ex) {
            //handle exception, in this case, just print it to console, 
            //you can log it to text file or database if nessesary
            System.out.println(SJUtil.GET_STACKTRACE(ex));
        }
    }
}

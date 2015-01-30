package org.streetjava.lesson.customexception;

import org.streetjava.exception.SJErrorCode;
import org.streetjava.exception.SJException;

/**
 *
 * @author dungld
 */
public class Circle implements Shape {

    private final static double pi = 3.14;

    private final double radius;

    public Circle(double _radius) {
        radius = _radius;
    }

    @Override
    public double getArea() throws SJException {
        
        validSize();
        
        return radius * radius * pi;
    }
    
    private void validSize() throws SJException{
        if (radius <= 0) {
            throw new SJException(SJErrorCode.SIZE_MUST_GREATER_THAN_ZERO);
        }
    } 

}

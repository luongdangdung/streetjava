package org.streetjava.lesson.customexception;

import org.streetjava.exception.SJErrorCode;
import org.streetjava.exception.SJException;

/**
 *
 * @author dungld
 */
public class Triagle implements Shape{
    private double height = 0;
    private double base = 0;
    
    public Triagle(double _height, double _base){
        height = _height;
        base = _base;
    }

    @Override
    public double getArea() throws SJException {
        
        validSize();
        
        return (height*base) / 2;
    }
    
    private void validSize() throws SJException{
        if(height <=0 || base <=0){
            throw new SJException(SJErrorCode.SIZE_MUST_GREATER_THAN_ZERO);    
        }
    } 
 
}

package org.streetjava.lesson.customexception;

import org.streetjava.exception.SJErrorCode;
import org.streetjava.exception.SJException;

/**
 *
 * @author dungld
 */
public class Square implements Shape{
    private double height = 0;
    private double width = 0;
    
    public Square(double _height, double _width){
        height = _height;
        width = _width;
    }

    @Override
    public double getArea() throws SJException {
                
        validSize();
        
        return height*width;
    }
    
    
    private void validSize(){
        if(height != width){
            throw new SJException(SJErrorCode.HEIGHT_MUST_EQUAL_WIDTH);
        }
        
        if(height <=0 || width <=0){
            throw new SJException(SJErrorCode.SIZE_MUST_GREATER_THAN_ZERO);    
        }
    } 
    
}

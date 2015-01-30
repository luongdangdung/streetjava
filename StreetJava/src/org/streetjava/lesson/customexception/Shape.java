package org.streetjava.lesson.customexception;

import org.streetjava.exception.SJException;

/**
 *
 * @author dungld
 */
public interface Shape {

    /**
     * when calculating area of shape, maybe occurs some logic exceptions, so
     * SJException will define them
     *
     * @return
     * @throws SJException
     */
    double getArea() throws SJException;
}

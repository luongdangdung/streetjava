package org.streetjava.exception;

/**
 *
 * @author dungld
 */
public enum SJErrorCode implements SJError{
    SIZE_MUST_GREATER_THAN_ZERO,
    HEIGHT_MUST_EQUAL_WIDTH,
    TECHNICAL
    ;

    @Override
    public String getValue() {
        return "ERROR_"+this.toString();
    }

    @Override
    public String getCode() {
        return this.toString();
    }
    
}

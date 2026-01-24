package br.com.joaodev.exceptions.custom.one;

public class NumberOutsideRangeException extends RuntimeException {

    private String attributeName;

    public NumberOutsideRangeException(String attributeName) {
        this.attributeName = attributeName;
    }

    @Override
    public String getMessage() {
        return String.format("The attribute %s is out of range", attributeName);
    }
}

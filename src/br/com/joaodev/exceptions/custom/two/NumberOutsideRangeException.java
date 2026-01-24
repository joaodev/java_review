package br.com.joaodev.exceptions.custom.two;

@SuppressWarnings("serial")
public class NumberOutsideRangeException extends Exception {

    private String attributeName;

    public NumberOutsideRangeException(String attributeName) {
        this.attributeName = attributeName;
    }

    @Override
    public String getMessage() {
        return String.format("The attribute %s is out of range", attributeName);
    }
}

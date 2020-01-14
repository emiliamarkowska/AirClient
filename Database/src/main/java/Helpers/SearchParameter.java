package Helpers;

public class SearchParameter<T> {

    private String fieldName;
    private T minValue;
    private T maxValue;
    private T exactValue;
    private T containingValue;

    public SearchParameter(String fieldName, T minValue, T maxValue, T exactValue, T containingValue) {
        this.fieldName = fieldName;
        this.minValue = minValue;
        this.maxValue = maxValue;
        this.exactValue = exactValue;
        this.containingValue = containingValue;
    }

    public String getFieldName() {
        return fieldName;
    }

    public void setFieldName(String fieldName) {
        this.fieldName = fieldName;
    }

    public T getMinValue() {
        return minValue;
    }

    public void setMinValue(T minValue) {
        this.minValue = minValue;
    }

    public T getMaxValue() {
        return maxValue;
    }

    public void setMaxValue(T maxValue) {
        this.maxValue = maxValue;
    }

    public T getExactValue() {
        return exactValue;
    }

    public void setExactValue(T exactValue) {
        this.exactValue = exactValue;
    }

    public T getContainingValue() {
        return containingValue;
    }

    public void setContainingValue(T containingValue) {
        this.containingValue = containingValue;
    }
}

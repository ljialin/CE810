package math;

public class MutableDouble {

private double value;

public MutableDouble(double value) {
this.value = value;
}

public double getValue() {
return this.value;
}

public void setValue(double value) {
this.value = value;
}

public int intValue() {
return (int) this.value;
}
}

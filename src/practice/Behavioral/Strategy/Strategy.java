package practice.Behavioral.Strategy;

public class Strategy {
    MathOperation mathOperation;
    Double a;
    Double b;

    public void setMathOperation(MathOperation mathOperation) {
        this.mathOperation = mathOperation;
    }

    public double operation(Double a, Double b){
        return mathOperation.operation(a,b);
    }
}

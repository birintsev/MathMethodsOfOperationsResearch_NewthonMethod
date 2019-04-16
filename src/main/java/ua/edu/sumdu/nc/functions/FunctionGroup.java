package ua.edu.sumdu.nc.functions;

import java.util.function.Function;

public abstract class FunctionGroup {
    protected Function<Number, Number> function;
    protected Function<Number, Number> firstDerivative;
    protected Function<Number, Number> secondDerivative;

    public Function<Number, Number> getFunction() {
        return function;
    }

    public Function<Number, Number> getFirstDerivative() {
        return firstDerivative;
    }

    public Function<Number, Number> getSecondDerivative() {
        return secondDerivative;
    }
}

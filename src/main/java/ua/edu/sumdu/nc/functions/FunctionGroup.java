package ua.edu.sumdu.nc.functions;

import java.util.function.Function;

public abstract class FunctionGroup {
    private Function<Number, Number> function;
    private Function<Number, Number> firstDerivative;
    private Function<Number, Number> secondDerivative;

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

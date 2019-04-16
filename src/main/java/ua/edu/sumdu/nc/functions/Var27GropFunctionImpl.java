package ua.edu.sumdu.nc.functions;

public class Var27GropFunctionImpl extends FunctionGroup {
    {
        function = d -> (3 - d.doubleValue()) * Math.exp(-1 * d.doubleValue());
        firstDerivative = d -> (-3 * Math.exp(-1));
        secondDerivative = d -> (4 * Math.exp(-1));
    }

    private static Var27GropFunctionImpl singleton = new Var27GropFunctionImpl();

    public static Var27GropFunctionImpl getInstance() {
        return singleton;
    }

    @Override
    public String toString() {
        return "(3 - x) * e^(-x)";
    }
}

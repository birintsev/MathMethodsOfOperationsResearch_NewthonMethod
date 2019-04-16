package ua.edu.sumdu.nc;

import ua.edu.sumdu.nc.functions.FunctionGroup;
import ua.edu.sumdu.nc.functions.Var27GropFunctionImpl;

public class App {
    public static void main(String[] args) {
        FunctionGroup function = Var27GropFunctionImpl.getInstance();
        System.out.println("The function " + function + " reaches the minimum at the point "
                + NewthonMethod.getMinimum(function, 0, 5,1e-4d));
    }
}

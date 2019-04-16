package ua.edu.sumdu.nc;

import javafx.geometry.Point2D;
import ua.edu.sumdu.nc.functions.FunctionGroup;


class NewthonMethod {
    public static Point2D getMinimum(FunctionGroup function, double from, double to, double eps) {
        double x = (from + to) / 2;
        while (Math.abs(function.getSecondDerivative().apply(x).doubleValue()) > eps) {
            x = x - function.getFirstDerivative().apply(x).doubleValue() / function.getSecondDerivative().apply(x).doubleValue();
        }
        return new javafx.geometry.Point2D(x, function.getFunction().apply(x).doubleValue());
    }
}

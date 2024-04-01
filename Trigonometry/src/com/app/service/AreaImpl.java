package com.app.service;

public class AreaImpl implements  Area{

    @Override
    public double square(double x) {
        return x*x;
    }

    @Override
    public double rectangle(double x, double y) {
        return x*y;
    }

    @Override
    public double parallelogram(double b, double h) {
        return b*h;
    }

    @Override
    public double trapezoid(double a, double b, double h) {
        double result=1/2*(a+b)*h;
        return result;
    }

    @Override
    public double rhombust(double d1, double d2) {
        double result=1/2*(d1*d2);
        return result;
    }

    @Override
    public double kite(double d1, double d2) {
        double result=1/2*(d1*d2);
        return result;
    }
}

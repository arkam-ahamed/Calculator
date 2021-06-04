package com.Beginner;

public class ScientificCalc extends Calculator{
    private final double Pi = Math.PI;
    private final double e = Math.E;

    public ScientificCalc(){

    }
    public double squareRoot(double j){
        return Math.sqrt(j);
    }
    public double square(double k){
        int a = 2;
        return Math.pow(k,a);
    }

    public double cube(double j){
        int a =3;
        return Math.pow(j,a);
    }
    public double sin(double k){
        return Math.sin(k);
    }

    public double cos(double j){
        return Math.cos(j);
    }

    public double tan(double k){
        return Math.tan(k);
    }


}

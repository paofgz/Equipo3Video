package com.itesm.azul.services.Calcu;

public class CalculadoraService {
    public int suma(int a, int b){
        return a+b;
    }

    public int resta(int a, int b){
        return a - b;
    }

    public int multiplicacion(int a, int b){
        return a * b;
    }

    public double division(int a, int b){
        return a / b;
    }

    public double seno(double a){
        double degrees = Math.toRadians(a);
        double result = Math.sin(degrees);
        return Math.round((result) * 10.0) / 10.0;
    }

    public double coseno(int a){
        double degrees = Math.toRadians(a);
        double result = Math.cos(degrees);
        return Math.round((result) * 10.0) / 10.0;
    }

    public double tangente(int a){
        double degrees = Math.toRadians(a);
        double result = Math.tan(degrees);
        return Math.round((result) * 10.0) / 10.0;
    }
}

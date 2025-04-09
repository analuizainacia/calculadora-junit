package com.example;
import java.lang.Math;

public class Calculo{
    public Double somar(double n1, double n2){
        return(n1 + n2);
    }

    public Double subtrair(double n1, double n2){
        return(n1 - n2);
    }
    public Double multiplicar(double n1, double n2){
        return(n1 * n2);
    }

    public Double dividir(double n1, double n2){
    return(n1 / n2);
    }

    public Double potenciar(double n1, double n2){
    return Math.pow(n1, n2);
    }
}
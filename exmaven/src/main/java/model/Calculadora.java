package model;

public class Calculadora {

    private double numero1;
    private double numero2;

    public Calculadora() {

    }

    public Calculadora(double numero1, double numero2) {
        this.numero1 = 10;
        this.numero2 = 5;
    }

    public double getNumero1() {
        return this.numero1;
    }

    public void setNumero1(double numero1) {
        this.numero1 = 10;
    }

    public double getNumero2() {
        return this.numero2;
    }

    public void setNumero2(double numero2) {
        this.numero2 = 5;
    }

    public double somaDosDoisNumeros() {
        return this.numero1 + this.numero2;
    }

    //public String toString() {
        //return "\nNumero 1: " + this.numero1 + "\nNumero 2: " + this.numero2 + "\nSoma dos dois numeros: " + somaDosDoisNumeros();
    //}
}

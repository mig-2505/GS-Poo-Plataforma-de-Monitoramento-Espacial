package br.com.projetoespacial.model;

public abstract class SistemaPropulsao {

    private boolean ligado;
    private double potencia;

    public void ligar() {
        ligado = true;
        System.out.println("Sistema de propulsão ligado.");
    }

    public void desligar() {
        ligado = false;
        setPotencia(0);
        System.out.println("Sistema de propulsão desligado.");
    }

    public abstract void acelerar(double potencia);

    public abstract double calcularEmpuxo();

    public abstract void mostrarDados();

    public boolean isLigado() {return ligado;}

    public void setLigado(boolean ligado) {this.ligado = ligado;}

    public double getPotencia() {return potencia;}

    public void setPotencia(double potencia) {this.potencia = potencia;}
}
package br.com.projetoespacial.model;

public class PropulsaoQuimica extends SistemaPropulsao {

    private final double consumoCombustivel;

    public PropulsaoQuimica(double consumoCombustivel) {
        this.consumoCombustivel = consumoCombustivel;
    }

    @Override
    public void acelerar(double potencia) {

        if (potencia < 0 || potencia > 100) {
            System.out.println("Erro: potência deve estar entre 0 e 100%.");
            return;
        }

        super.ligar();

        setPotencia(potencia);

        System.out.println("Propulsão Química acelerando a " + getPotencia() + "%");
    }

    @Override
    public double calcularEmpuxo() {
        return getPotencia() * 100;
    }

    @Override
    public void mostrarDados() {

        System.out.println("\n== PROPULSÃO QUÍMICA ==");

        System.out.println("Status: " + (isLigado() ? "Ligada" : "Desligada"));

        System.out.println("Potência: " + getPotencia() + "%");

        System.out.println("Consumo de combustível: " + consumoCombustivel + " L/min");

        System.out.println("Empuxo gerado: " + calcularEmpuxo() + " kN");
    }
}
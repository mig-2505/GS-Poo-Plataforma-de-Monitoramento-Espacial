package br.com.projetoespacial.model;

public class PropulsaoEletrica extends SistemaPropulsao {

    private double cargaBateria;

    public PropulsaoEletrica(double cargaBateria) {
        this.cargaBateria = cargaBateria;
    }

    public void verificarBateria(double cargaBateria){
        if (cargaBateria > 100 || cargaBateria < 0){
            System.out.println("Carga invalida, coloque outra entre 1 - 100 e tente novamente!");
        }
        else {
            System.out.println("Carga da bateria: " + cargaBateria + "%");
        }
    }

    @Override
    public void acelerar(double potencia) {

        if (potencia < 0 || potencia > 100) {
            System.out.println("Erro: potência deve estar entre 0 e 100%.");
            return;
        }

        super.ligar();

        setPotencia(potencia);

        System.out.println("Propulsão Elétrica acelerando a " + getPotencia() + "%");
    }

    @Override
    public double calcularEmpuxo() {
        return getPotencia() * 60;
    }

    @Override
    public void mostrarDados() {

        System.out.println("\n== PROPULSÃO ELÉTRICA ==");

        System.out.println("Status: " + (isLigado() ? "Ligada" : "Desligada"));

        System.out.println("Potência: " + getPotencia() + "%");

        verificarBateria(this.cargaBateria);

        System.out.println("Empuxo gerado: " + calcularEmpuxo() + " kN");
    }
}
package br.com.projetoespacial.model;

abstract class ComponenteEspacial {

    private double id;
    private String nome;
    private String status;
    private double temperatura;

    public void ligar(){
        System.out.println("Ligando componente...");
    }

    public void desligar(){
        System.out.println("Desligando componente...");
    }

    abstract void mostrarDados();
}

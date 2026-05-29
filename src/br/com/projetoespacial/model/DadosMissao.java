package br.com.projetoespacial.model;

public class DadosMissao {

    private double nivelCombustivel;
    private String coordenadasIniciais;
    private String coordenadasFinais;
    private int numeroTripulantes;

    public DadosMissao(double nivelCombustivel, String coordenadasIniciais, String coordenadasFinais, int numeroTripulantes) {
        this.setNivelCombustivel(nivelCombustivel);
        this.setCoordenadasIniciais(coordenadasIniciais);
        this.setCoordenadasFinais(coordenadasFinais);
        this.setNumeroTripulantes(numeroTripulantes);
    }

    public String verificarCombustivel(){
        if (getNivelCombustivel() < 20 && getNivelCombustivel() > 0){
            return "Combustível atual: " + getNivelCombustivel() + "%" + " - Alerta: combustível menor que 20%";
        }
        return "Combustível atual: " + getNivelCombustivel() + "%";
    }

    public void imprimirDados(){
        System.out.println("== DADOS DA MISSÃO ==");
        System.out.println("Número de Tripulantes: " + getNumeroTripulantes());
        System.out.println("Coordenadas Atuais: " + getCoordenadasIniciais());
        System.out.println("Coordenadas Finais: " + getCoordenadasFinais());
        System.out.println(verificarCombustivel());
    }

    public double getNivelCombustivel() {return nivelCombustivel;}

    private void setNivelCombustivel(double nivelCombustivel) {
        if (nivelCombustivel > 100){
            this.nivelCombustivel = 100;
        }
        else if (nivelCombustivel < 0){
            this.nivelCombustivel = 0;
        }
        else {
            this.nivelCombustivel = nivelCombustivel;
        }
    }

    public String getCoordenadasFinais() {return coordenadasFinais;}

    private void setCoordenadasFinais(String coordenadasFinais) {
        if (coordenadasFinais == null || coordenadasFinais.isBlank()) {
            this.coordenadasFinais = "Não definida";
        }
        else {
            this.coordenadasFinais = coordenadasFinais;
        }
    }

    public int getNumeroTripulantes() {return numeroTripulantes;}

    private void setNumeroTripulantes(int numeroTripulantes) {
        if (numeroTripulantes < 0){
            this.numeroTripulantes = 0;
        }
        else {
            this.numeroTripulantes = numeroTripulantes;
        }
    }

    public String getCoordenadasIniciais() {return coordenadasIniciais;}

    private void setCoordenadasIniciais(String coordenadasIniciais) {
        if (coordenadasIniciais == null || coordenadasIniciais.isBlank()) {
            this.coordenadasIniciais = "Não definida";
        }
        else {
            this.coordenadasIniciais = coordenadasIniciais;
        }
    }
}


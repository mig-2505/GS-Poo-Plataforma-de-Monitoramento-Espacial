package br.com.projetoespacial.model;

public class DadosMissao {

    private final String senha = "AM4556";
    private double nivelCombustivel;
    private String coordenadasIniciais;
    private String coordenadasFinais;
    private int numeroTripulantes;

    public DadosMissao(double nivelCombustivel, String coordenadasFinais, String coordenadasIniciais, int numeroTripulantes) {
        this.setNivelCombustivel(nivelCombustivel);
        this.setCoordenadasIniciais(coordenadasIniciais);
        this.setCoordenadasFinais(coordenadasFinais);
        this.setNumeroTripulantes(numeroTripulantes);
    }

    public boolean verificarSenha(String senha) {
        return this.senha.equals(senha);
    }

    public String verificarCombustivel(){
        if (this.nivelCombustivel < 20){
            return "Combustível atual: " + this.nivelCombustivel + "%" + " - Alerta: combustível menor que 20%";
        }
        return "Combustível atual: " + this.nivelCombustivel + "%";
    }

    public void imprimirDados(String senha){
        if (verificarSenha(senha)){
            System.out.println("= DADOS DA MISSÃO =");
            System.out.println("Número de Tripulantes: " + this.numeroTripulantes);
            System.out.println("Coordenadas Atuais: " + this.coordenadasIniciais);
            System.out.println("Coordenadas Finais: " + this.coordenadasFinais);
            System.out.println("Nivel de Combustível: " + verificarCombustivel());
        }
        else {
            System.out.println("Acesso Negado");
        }
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

    private void setCoordenadasFinais(String coordenadasFinais) {this.coordenadasFinais = coordenadasFinais;}

    public int getNumeroTripulantes() {return numeroTripulantes;}

    private void setNumeroTripulantes(int numeroTripulantes) {this.numeroTripulantes = numeroTripulantes; }

    public String getCoordenadasIniciais() {return coordenadasIniciais;}

    private void setCoordenadasIniciais(String coordenadasIniciais) {this.coordenadasIniciais = coordenadasIniciais;}
}

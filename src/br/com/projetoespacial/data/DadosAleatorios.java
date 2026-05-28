package br.com.projetoespacial.data;

import java.util.Random;

public class DadosAleatorios {

    private final Random dadosAleatorios = new Random();

    public double getTemperatura() {
        return Math.round(dadosAleatorios.nextDouble(0, 100) * 100.0) / 100.0;
    }

    public double getPressao() {
        return Math.round(dadosAleatorios.nextDouble(900, 1200) * 100.0) / 100.0;
    }

    public double getRadiacao() {
        return Math.round(dadosAleatorios.nextDouble(0, 500) * 100.0) / 100.0;
    }

}

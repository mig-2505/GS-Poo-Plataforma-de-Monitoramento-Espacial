package br.com.projetoespacial.model;

import br.com.projetoespacial.data.DadosAleatorios;
import br.com.projetoespacial.interfaces.Sensor;

public class SensorRadiacao implements Sensor {

    DadosAleatorios radiacaoEspacial = new DadosAleatorios();
    double radiacao = radiacaoEspacial.getRadiacao();

    @Override
    public void lerValor() {
        System.out.println("Radiação atual: " + radiacao + " mSv");
    }

    @Override
    public void verificarFuncionamento() {
        System.out.println(
                "Sensor de radiação funcionando perfeitamente!");
    }

    @Override
    public void retornarTipo() {
        System.out.println("Sensor de Radiação");
    }

    public void alertaRadiacao() {

        if (radiacao < 100) {
            System.out.println("Níveis de radiação seguros! ( " + radiacao + " mSv )");
        }

        else if (radiacao >= 100 && radiacao < 200) {
            System.out.println("Atenção: Radiação elevada! ( " + radiacao + " mSv )");
        }

        else if (radiacao >= 200 && radiacao < 350) {
            System.out.println("Alerta: Radiação perigosa detectada! ( " + radiacao + " mSv )");
        }

        else {
            System.out.println("Crítico: Radiação extrema detectada! ( " + radiacao + " mSv )");
        }
    }
}
package br.com.projetoespacial.model;

import br.com.projetoespacial.interfaces.Sensor;
import br.com.projetoespacial.data.DadosAleatorios;

public class SensorPressao extends ComponenteEspacial implements Sensor{

    DadosAleatorios pressaoEspacial = new DadosAleatorios();
    private final double pressao = pressaoEspacial.getPressao();

    @Override
    public void lerValor() {
        System.out.println("Pressão atual: " + pressao + " C°");
    }

    @Override
    public void verificarFuncionamento() {
        System.out.println("Funcionando perfeitamente!");
    }

    @Override
    public void retornarTipo() {
        System.out.println("Tipo: Sensor de Pressão");
    }

    public void alertaPressao() {

        if (pressao < 950) {
            System.out.println("Atenção: Pressão muito baixa! ( " + pressao + " hPa )");
        }

        else if (pressao >= 950 && pressao < 1050) {
            System.out.println("Pressão estável e segura! ( " + pressao + " hPa )");
        }

        else if (pressao >= 1050 && pressao < 1150) {
            System.out.println("Alerta: Pressão acima do normal! ( " + pressao + " hPa )");
        }

        else {
            System.out.println("Crítico: Pressão extrema detectada! ( " + pressao + " hPa )");
        }
    }

    @Override
    public void mostrarDados() {
        System.out.println("== SENSOR PRESSÃO ==");
        lerValor();
        verificarFuncionamento();
        retornarTipo();
        alertaPressao();
    }
}

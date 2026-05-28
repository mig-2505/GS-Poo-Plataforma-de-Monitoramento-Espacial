package br.com.projetoespacial.model;

import br.com.projetoespacial.interfaces.Sensor;
import br.com.projetoespacial.data.DadosAleatorios;

public class SensorTemperatura implements Sensor {
    DadosAleatorios temp = new DadosAleatorios();
    double temperatura = temp.getTemperatura();

    @Override
    public void lerValor() {
        System.out.println("Temperatura atual: " + temperatura + " C°");
    }

    @Override
    public void verificarFuncionamento() {
        System.out.println("Funcionando perfeitamente!");
    }

    @Override
    public void retornarTipo() {
        System.out.println("Sensor de Temperatura");
    }

    public void alertaTemp(){
        if (temperatura <= 10){
            System.out.println("Atenção: Temperatura muito baixa! ( " + temperatura + " C° )");
        }
        else if (temperatura > 30 && temperatura < 40){
            System.out.println("Atenção: Temperatura mais alta que o normal! ( " + temperatura + " C° )");
        }
        else if (temperatura > 40 && temperatura < 50){
            System.out.println("Alerta: Temperatura alta! ( " + temperatura + " C° )");
        }
        else if (temperatura > 50){
            System.out.println("Crítico: Temperatura muito alta! ( " + temperatura + " C° )");
        }
        else {
            System.out.println("Temperatura sem riscos! ( " + temperatura + " C° )");
        }
    }
}


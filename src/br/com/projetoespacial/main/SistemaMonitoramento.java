package br.com.projetoespacial.main;
import br.com.projetoespacial.model.DadosMissao;
import br.com.projetoespacial.model.SensorPressao;
import br.com.projetoespacial.model.SensorTemperatura;
import br.com.projetoespacial.model.SensorRadiacao;

public class SistemaMonitoramento {
    public static void main(String[] args) {

        // Testes
        DadosMissao missao01 = new DadosMissao(-50, "6767.90", "7676.00", 5);
        SensorTemperatura temp1 = new SensorTemperatura();
        SensorPressao pressao1 = new SensorPressao();
        SensorRadiacao radiacao1 = new SensorRadiacao();

        missao01.imprimirDados("AM4556");

        System.out.println("== SENSORES ==");
        temp1.alertaTemp();
        pressao1.alertaPressao();
        radiacao1.alertaRadiacao();
    }
}

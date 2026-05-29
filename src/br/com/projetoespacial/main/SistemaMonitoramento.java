package br.com.projetoespacial.main;

import br.com.projetoespacial.model.*;
import java.util.Scanner;

public class SistemaMonitoramento {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // SENHA
        final String SENHA = "AM4556";
        int tentativas = 3;
        boolean acessoLiberado = false;

        while (tentativas > 0) {

            System.out.print("Digite a senha do sistema: ");
            String senha = scanner.nextLine();

            if (senha.equals(SENHA)) {
                acessoLiberado = true;
                System.out.println("\nAcesso autorizado!\n");
                break;
            }
            tentativas--;
            System.out.println("Senha incorreta! Restam " + tentativas + " tentativa(s).\n");
        }

        if (!acessoLiberado) {

            System.out.println("Sistema bloqueado. Encerrando aplicação.");
            scanner.close();
            return;
        }

        // OBJETOS DO SISTEMA

        DadosMissao missao01 = new DadosMissao(80, "6767.90", "7676.00", 5);

        SensorTemperatura temp1 = new SensorTemperatura();

        SensorPressao pressao1 = new SensorPressao();

        SensorRadiacao radiacao1 = new SensorRadiacao();

        PropulsaoEletrica propEletrica1 = new PropulsaoEletrica(50);

        PropulsaoQuimica propQuimica1 = new PropulsaoQuimica(50);

        int opcao;

        do {

            System.out.println("\n==============================");
            System.out.println(" CENTRAL DE MONITORAMENTO");
            System.out.println("==============================");

            System.out.println("1 - Dados da Missão");
            System.out.println("2 - Sensores");
            System.out.println("3 - Propulsão Elétrica");
            System.out.println("4 - Propulsão Química");
            System.out.println("5 - Status Completo");
            System.out.println("0 - Encerrar Sistema");

            System.out.print("\nEscolha uma opção: ");

            opcao = scanner.nextInt();

            switch (opcao) {

                case 1:

                    System.out.println();
                    missao01.imprimirDados();

                    break;

                case 2:

                    System.out.println("\n=== SENSORES ===");

                    System.out.println();
                    temp1.mostrarDados();

                    System.out.println();
                    pressao1.mostrarDados();

                    System.out.println();
                    radiacao1.mostrarDados();

                    break;

                case 3:

                    int opcaoEletrica;

                    do {
                        System.out.println("\n=== PROPULSÃO ELÉTRICA ===");
                        System.out.println("1 - Ligar");
                        System.out.println("2 - Acelerar");
                        System.out.println("3 - Mostrar Dados");
                        System.out.println("4 - Desligar");
                        System.out.println("5 - Calcular Empuxo");
                        System.out.println("0 - Voltar");

                        System.out.print("Escolha: ");
                        opcaoEletrica = scanner.nextInt();

                        switch (opcaoEletrica) {

                            case 1:
                                propEletrica1.ligar();
                                break;

                            case 2:

                                System.out.print("Potência (0-100): ");
                                double potenciaEletrica = scanner.nextDouble();
                                propEletrica1.acelerar(potenciaEletrica);
                                break;

                            case 3:
                                propEletrica1.mostrarDados();
                                break;

                            case 4:
                                propEletrica1.desligar();
                                break;

                            case 5:

                                System.out.println("Empuxo atual: " + propEletrica1.calcularEmpuxo() + " kN");
                                break;

                            case 0:
                                System.out.println("Retornando ao menu principal...");
                                break;

                            default:
                                System.out.println("Opção inválida!");
                        }

                    } while (opcaoEletrica != 0);

                    break;

                case 4:

                    int opcaoQuimica;

                    do {

                        System.out.println("\n=== PROPULSÃO QUÍMICA ===");
                        System.out.println("1 - Ligar");
                        System.out.println("2 - Acelerar");
                        System.out.println("3 - Mostrar Dados");
                        System.out.println("4 - Desligar");
                        System.out.println("5 - Calcular Empuxo");
                        System.out.println("0 - Voltar");

                        System.out.print("Escolha: ");
                        opcaoQuimica = scanner.nextInt();

                        switch (opcaoQuimica) {

                            case 1:
                                propQuimica1.ligar();
                                break;

                            case 2:

                                System.out.print("Potência (0-100): ");
                                double potenciaQuimica = scanner.nextDouble();
                                propQuimica1.acelerar(potenciaQuimica);
                                break;

                            case 3:
                                propQuimica1.mostrarDados();
                                break;

                            case 4:
                                propQuimica1.desligar();
                                break;

                            case 5:

                                System.out.println("Empuxo atual: " + propQuimica1.calcularEmpuxo() + " kN");
                                break;

                            case 0:
                                System.out.println("Retornando ao menu principal...");
                                break;

                            default:
                                System.out.println("Opção inválida!");
                        }

                    } while (opcaoQuimica != 0);

                    break;

                case 5:

                    System.out.println("\n===== STATUS COMPLETO =====");

                    System.out.println();
                    missao01.imprimirDados();

                    System.out.println();
                    temp1.mostrarDados();

                    System.out.println();
                    pressao1.mostrarDados();

                    System.out.println();
                    radiacao1.mostrarDados();

                    System.out.println();
                    propEletrica1.mostrarDados();

                    System.out.println();
                    propQuimica1.mostrarDados();

                    break;

                case 0:

                    System.out.println("\nEncerrando sistema...");
                    break;

                default:
                    System.out.println("\nOpção inválida!");
            }

        } while (opcao != 0);

        scanner.close();
    }
}
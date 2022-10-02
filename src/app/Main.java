package app;

import DAO.WorldCupDAO;
import DAO.WorldCupMatchesDAO;
import service.WorldCupService;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("------------------------------");
        System.out.println("----TRABALHO JPA WORLD CUP----");
        System.out.println("------------------------------");

        menu();

        System.out.println("Edelberto Hermann Rösler");
        System.out.println("Mateus Rossi dos Santos");
    }

    private static void menu() {
        WorldCupService worldCupService = new WorldCupService(new WorldCupDAO(), new WorldCupMatchesDAO());
        Scanner prompt = new Scanner(System.in);
        boolean continuar = true;
        while (continuar){
            System.out.println("Selecione uma opção no menu:");
            System.out.println("1 - Listar informações sobre as copas:");
            System.out.println("2 - Buscar informações sobre a final de uma Copa do Mundo a partir do ano do evento:");
            System.out.println("3 - Inserir dados sobre a copa do mundo de 2018:");
            System.out.println("4 - Verificar desempenho de uma seleção:");
            System.out.println("5 - Buscar informações detalhadas da copa a partir do ano da competição:");
            System.out.println("0 - Sair");

            int opcao = prompt.nextInt();

            switch (opcao){
                case 1:
                    worldCupService.getWorldCupInformation();
                    break;
                case 2:
                    worldCupService.getFinalInformationByYear();
                    break;
                case 3:
                    worldCupService.insertRussiaCupData();
                    break;
                case 4:
                    worldCupService.getCountryInformation();
                    break;
                case 5:
                    worldCupService.getWorldCupInformationByYear();
                    break;
                case 0:
                    continuar = false;
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        }
    }

}

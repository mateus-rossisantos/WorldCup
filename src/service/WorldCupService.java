package service;

import DAO.WorldCupDAO;
import DAO.WorldCupMatchesDAO;
import model.WorldCupMatches;
import model.WorldCups;

import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class WorldCupService {

    private final WorldCupDAO worldCupDAO;
    private final WorldCupMatchesDAO worldCupMatchesDAO;

    public WorldCupService(WorldCupDAO worldCupDAO, WorldCupMatchesDAO worldCupMatchesDAO) {
        this.worldCupDAO = worldCupDAO;
        this.worldCupMatchesDAO = worldCupMatchesDAO;
    }

    public void getWorldCupInformation() {
        System.out.println("------- BASIC WORLD CUPS INFORMATIONS ---------");
        List<WorldCups> copas = worldCupDAO.getByCountry();
        copas.forEach(copa -> {
            System.out.println("------------------------------------------------------");
            System.out.println("Copa de " + copa.getYear() + ": ");
            System.out.println(
                    "| Sede: " + copa.getCountry() + " | " +
                    "Campeão: " + copa.getWinner() + " | " +
                    "Vice-campeão: " + copa.getRunnersUp() + " |"
            );
            System.out.println("------------------------------------------------------");
            System.out.println("");
        });
    }

    public void getFinalInformationByYear() {
        System.out.println("Digite o ano desejado:");
        Scanner prompt = new Scanner(System.in);
        int ano = prompt.nextInt();
        Optional<WorldCupMatches> match = worldCupMatchesDAO.get(ano);
        if (match.isPresent()){
            System.out.println("-------FINAL DA COPA DO MUNDO DE "+ ano +"---------");
            System.out.println("Data da final: " + match.get().getDateTime());
            System.out.println("Estádio da final: " + match.get().getStadium());
            System.out.println("Resultado:");
            System.out.println(match.get().getHomeTeamName() + " " + match.get().getHomeTeamGoals()
                    + " X " + match.get().getAwayTeamGoals() + " " + match.get().getAwayTeamName());
            if (match.get().getWinConditions() != null) {
                System.out.println("Condições especiais: " + match.get().getWinConditions() );
            }
            System.out.println("Pais Sede: " + match.get().getYearCup().getCountry());
            System.out.println("---------------------------------------------");
        }else {
            System.out.println("Neste ano não houve copa do mundo.");
        }
    }

    public void insertRussiaCupData() {
        worldCupDAO.insertCup();
        System.out.println(" Dados da copa do mundo de 2018 inseridas com sucesso!");

    }

    public void getCountryInformation() {
        System.out.println("Digite o pais desejado:");
        Scanner prompt = new Scanner(System.in);
        String pais = prompt.nextLine();
        List<WorldCups> copas = worldCupDAO.getByCountry();
        copas.forEach(copa -> {
            if (copa.getWinner().equalsIgnoreCase(pais)){
                System.out.println("Copa do Mundo de " + copa.getYear() + ". Sede: " + copa.getCountry());
                System.out.println(pais + " Campeão");
                System.out.println("-------------------------------------------");
            }
            if (copa.getRunnersUp().equalsIgnoreCase(pais)){
                System.out.println("Copa do Mundo de " + copa.getYear() + ". Sede: " + copa.getCountry());
                System.out.println(pais + " Vice-campeão");
                System.out.println("-------------------------------------------");
            }
            if (copa.getThird().equalsIgnoreCase(pais)){
                System.out.println("Copa do Mundo de " + copa.getYear() + ". Sede: " + copa.getCountry());
                System.out.println(pais + " Terceiro colocado");
                System.out.println("-------------------------------------------");
            }
            if (copa.getFourth().equalsIgnoreCase(pais)){
                System.out.println("Copa do Mundo de " + copa.getYear() + ". Sede: " + copa.getCountry());
                System.out.println(pais + " Quarto colocado");
                System.out.println("-------------------------------------------");
            }
        });

    }

    public void getWorldCupInformationByYear() {
        System.out.println("Digite o ano desejado:");
        Scanner prompt = new Scanner(System.in);
        int ano = prompt.nextInt();
        Optional<WorldCups> copa = worldCupDAO.get(ano);
        if (copa.isPresent()){
            WorldCupMatches finals = worldCupMatchesDAO.getByYear(ano);
            System.out.println("------- COPA DO MUNDO DE "+ ano + "---------");
            System.out.println("País sede: " + copa.get().getCountry());
            System.out.println("Campeão: " + copa.get().getWinner());
            System.out.println("Vice-campeâo: " + copa.get().getRunnersUp());
            System.out.println("Data da final: " + finals.getDateTime());
            System.out.println("Estádio da final: " + finals.getStadium());
            System.out.println("Final:");
            System.out.println(finals.getHomeTeamName() + " " + finals.getHomeTeamGoals()
                    + " X " + finals.getAwayTeamGoals() + " " + finals.getAwayTeamName());
            System.out.println("-----------------------------------");
        }else {
            System.out.println("Neste ano não houve copa do mundo.");
        }
    }
}

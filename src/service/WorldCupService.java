package service;

import DAO.WorldCupDAO;
import DAO.WorldCupMatchesDAO;
import model.WorldCups;

import java.util.Optional;
import java.util.Scanner;

public class WorldCupService {

    private WorldCupDAO worldCupDAO;
    private WorldCupMatchesDAO worldCupMatchesDAO;

    public WorldCupService(WorldCupDAO worldCupDAO, WorldCupMatchesDAO worldCupMatchesDAO) {
        this.worldCupDAO = worldCupDAO;
        this.worldCupMatchesDAO = worldCupMatchesDAO;
    }

    public void getWorldCupInformation() {
        
    }

    public void getFinalInformationByYear() {

    }

    public void insertRussiaCupData() {
    }

    public void getCountryInformation() {
    }

    public void getWorldCupInformationByYear() {
        System.out.println("Digite o ano desejado:");
        Scanner prompt = new Scanner(System.in);
        int ano = prompt.nextInt();
        Optional<WorldCups> copa = worldCupDAO.get(ano);
        if (copa.isPresent()){
            System.out.println(copa);
        }else {
            System.out.println("Neste ano não houve copa do mundo.");
        }
    }
}

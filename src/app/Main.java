package app;

import DAO.WorldCupDAO;
import DAO.WorldCupMatchesDAO;
import model.WorldCupMatches;
import model.WorldCups;

import java.util.Optional;

public class Main {

    public static void main(String[] args) {

        var worldCupDAO = new WorldCupDAO();
        var worldCupMatchesDAO = new WorldCupMatchesDAO();

        Optional<WorldCups> cups = worldCupDAO.get(2014);

        Optional<WorldCupMatches> finals = worldCupMatchesDAO.get(27);

        System.out.println(finals);

    }

}

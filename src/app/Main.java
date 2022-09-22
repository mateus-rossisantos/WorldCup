package app;

import DAO.WorldCupDAO;
import model.WorldCups;

import java.util.Optional;

public class Main {

    public static void main(String[] args) {

        var worldCupDAO = new WorldCupDAO();

        Optional<WorldCups> cups = worldCupDAO.get(2014);

        System.out.println(cups);

    }

}

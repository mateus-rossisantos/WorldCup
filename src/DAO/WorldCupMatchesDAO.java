package DAO;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import model.WorldCupMatches;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class WorldCupMatchesDAO implements DAO<WorldCupMatches>{

    private static final String PERSISTENCE_UNIT = "worldCup";

    private EntityManager getEntityManager() {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory(getPersistenceUnit());

        return factory.createEntityManager();
    }

    @Override
    public Optional<WorldCupMatches> get(int year) {
        return Optional.ofNullable(getByYear(year));
    }

    public WorldCupMatches getByYear(int year) {
        var em = getEntityManager();
        try {

            List<WorldCupMatches> finais = em.createQuery("SELECT a FROM WorldCupMatches a", WorldCupMatches.class).getResultList();

            return finais.stream().filter(w -> w.getYearCup().getYear() == year)
                    .collect(Collectors.toList()).get(0);
        } finally {
            em.close();
        }
    }

    private static String getPersistenceUnit() {
        return PERSISTENCE_UNIT;
    }


}

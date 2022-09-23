package DAO;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import model.WorldCupMatches;
import model.WorldCups;

import java.util.List;
import java.util.Optional;

public class WorldCupMatchesDAO implements DAO<WorldCupMatches>{

    private static final String PERSISTENCE_UNIT = "worldCup";

    private EntityManager getEntityManager() {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory(getPersistenceUnit());

        return factory.createEntityManager();
    }

    @Override
    public Optional<WorldCupMatches> get(int id) {
        var em = getEntityManager();

        try {
            var todo = em.find(WorldCupMatches.class, id);

            return Optional.ofNullable(todo);

        } finally {
            em.close();
        }
    }

    @Override
    public List<WorldCupMatches> getAll() {
        return null;
    }

    @Override
    public void save(WorldCupMatches worldCups) {

    }

    @Override
    public void update(WorldCupMatches worldCups) {

    }

    @Override
    public void delete(WorldCupMatches worldCups) {

    }

    private static String getPersistenceUnit() {
        return PERSISTENCE_UNIT;
    }
}

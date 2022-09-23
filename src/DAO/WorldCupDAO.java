package DAO;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import model.WorldCups;

import java.util.List;
import java.util.Optional;

public class WorldCupDAO implements DAO<WorldCups>{

    private static final String PERSISTENCE_UNIT = "worldCup";

    private EntityManager getEntityManager() {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory(getPersistenceUnit());

        return factory.createEntityManager();
    }

    @Override
    public Optional<WorldCups> get(int id) {
        var em = getEntityManager();
        try {
            var worldCup = em.find(WorldCups.class, id);
            return Optional.ofNullable(worldCup);
        } finally {
            em.close();
        }
    }

    @Override
    public List<WorldCups> getAll() {
        return null;
    }

    @Override
    public void save(WorldCups worldCups) {

    }

    @Override
    public void update(WorldCups worldCups) {

    }

    @Override
    public void delete(WorldCups worldCups) {

    }

    private static String getPersistenceUnit() {
        return PERSISTENCE_UNIT;
    }
}

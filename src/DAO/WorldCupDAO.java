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

    public List<WorldCups> getByCountry() {
        var em = getEntityManager();
        try {
            return em.createQuery("SELECT a FROM WorldCups a", WorldCups.class).getResultList();
        } finally {
            em.close();
        }
    }


    public void insertCup(WorldCups w) {
        var em = getEntityManager();
        try {
            em.getTransaction().begin();
            em.persist(w);
            em.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            em.getTransaction().rollback();
        }
        finally {
            em.close();
        }
    }

    private static String getPersistenceUnit() {
        return PERSISTENCE_UNIT;
    }


}

package DAO;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class WorldCupDAO {

    private static final String PERSISTENCE_UNIT = "todos";

    private EntityManager getEntityManager() {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory(getPersistenceUnit());

        return factory.createEntityManager();
    }




    public static String getPersistenceUnit() {
        return PERSISTENCE_UNIT;
    }

}

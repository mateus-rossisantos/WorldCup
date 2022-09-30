package DAO;

import java.util.Optional;

public interface DAO<T> {
    Optional<T> get(int id);
}

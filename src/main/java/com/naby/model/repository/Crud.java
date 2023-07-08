package com.naby.model.repository;

import org.springframework.stereotype.Repository;

import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

@Repository
public class Crud<T, I> {
    @PersistenceContext
    private EntityManager entityManager;

    public void save(T t) {
        entityManager.persist(t);
    }

    public void update(T t) {
        entityManager.merge(t);
    }

    public void delete(T t) {
        entityManager.remove(entityManager.merge(t));
    }

    public T findOne(Class<T> tClass, I i) {
        return entityManager.find(tClass, i);
    }

    public List<T> findAll(Class<T> tClass) {
        Entity entity = tClass.getAnnotation(Entity.class);
        String entityName = entity.name();
        Query query = entityManager.createQuery("select entity from " + entityName + " entity");
        return query.getResultList();
    }
}
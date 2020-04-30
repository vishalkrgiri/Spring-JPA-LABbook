package com.cg.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.cg.entity.Product;

@Repository
public class ProductDAOImpl implements ProductDAO {

    @PersistenceContext
    private EntityManager em;
    
    public void save(Product p) {
        em.persist(p);
        em.flush();
    }

    public Product findById(int productId) {
        return em.find(Product.class, productId);
    }

    public List<Product> findAll() {
        Query q = em.createQuery("from Product p");//That's "JPQL" not SQL !!!
        return q.getResultList();
    }
}
package com.biblioteca.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author natalicio
 */
public class ConnectionFactory {

    private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("bibliotecaPU");

    public static EntityManager createEntityManager() {
        return emf.createEntityManager();
    }
}

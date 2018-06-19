/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.controleur;

import com.modele.Identifiants;
import java.util.Collection;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 *
 * @author stage011
 */
public class GestionUtilisateur {

    EntityManagerFactory emf = Persistence.createEntityManagerFactory("solutec-lyon_SWINGRed_jar_1.0-SNAPSHOTPU");
    EntityManager em = emf.createEntityManager();

    public void persist(Object object) {

        em.getTransaction().begin();
        try {
            em.persist(object);
            em.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            em.getTransaction().rollback();
        } finally {
//            em.close();
        }
    }

    public Collection consulterUtilisateur(int idEmp) {
        Query q = em.createQuery("SELECT i FROM Identifiants i WHERE e.id=:idEmp");
        q.setParameter("idEmp", idEmp);
        return q.getResultList();
    }

    public void modifierUtilisateur(Identifiants i) {

        Identifiants id = (Identifiants) em.find(Identifiants.class, i.getId());
        id.setId(i.getId());
        id.setLogin(i.getLogin());
        id.setMdp(i.getMdp());
        em.persist(id);

    }

    public int supprimerUtilisateur(int idEmp) {
        Query q = em.createQuery("DELETE FROM Identifiants i WHERE e.id=:idEmp");
        q.setParameter("idEmp", idEmp);
        return q.executeUpdate();
    }

    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.controleur;

import com.modele.Identifiants;
import com.utilisateur.utils.UtilisateurConstantes;
import java.util.ArrayList;
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

    public ArrayList<Identifiants> consulterUtilisateurs() {
        ArrayList<Identifiants> listeUser= new ArrayList<>();
        Query q = em.createQuery(UtilisateurConstantes.REQUEST_SELECT_TOUS_UTILISATEURS);
        listeUser.addAll(q.getResultList());
        return listeUser ;
    }
    
    
    public Identifiants consulterUtilisateurParLogin(String login) {
   
        Query q = em.createQuery(UtilisateurConstantes.REQUEST_SELECT_UTILISATEUR_LOGIN);
        q.setParameter("idUtil", login);
        return (Identifiants) q.getSingleResult();
    }

    public void modifierUtilisateur(Identifiants i) {

        Identifiants id = (Identifiants) em.find(Identifiants.class, i.getId());
        id.setId(i.getId());
        id.setLogin(i.getLogin());
        id.setMdp(i.getMdp());
        em.persist(id);

    }

    public int supprimerUtilisateur(int idUtil) {
        Query q = em.createQuery(UtilisateurConstantes.REQUEST_DELETE_UTILISATEUR);
        q.setParameter("idUtil", idUtil);
        return q.executeUpdate();
    }

    public void ajouterUtilisateur(Identifiants id){
        Identifiants i = new Identifiants();
        i.setLogin(id.getLogin());
        i.setMdp(id.getMdp());
        em.persist(i);
    }
    public String miseEnFormeTextArea (ArrayList<Identifiants> list){
        String str="";
        str="Liste des utilisateurs :\n";
        for (Identifiants i: list){
            str=str+"Login : "+i.getLogin()+"\nMot de passe : "+i.getMdp()+"\n\n";
        }
        return str;
    }
    
}

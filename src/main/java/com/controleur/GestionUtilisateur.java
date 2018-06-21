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
    ArrayList<Identifiants> listeUser = new ArrayList<>();

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
        listeUser.clear();
        Query q = em.createQuery(UtilisateurConstantes.REQUEST_SELECT_TOUS_UTILISATEURS);
        listeUser.addAll(q.getResultList());
        return listeUser;
    }

    public ArrayList<Identifiants> consulterUtilisateurParLogin(String login) {
        listeUser.clear();
        Query q = em.createQuery(UtilisateurConstantes.REQUEST_SELECT_UTILISATEUR_LOGIN);
        q.setParameter("idUtil", login);
        listeUser.addAll(q.getResultList());
        return listeUser;
    }

    public void modifierUtilisateur(Identifiants i) {

        Identifiants id = (Identifiants) em.find(Identifiants.class, i.getId());
        em.getTransaction().begin();
        System.out.println("avant chgt");
        System.out.println(id.getLogin());
        id.setLogin(i.getLogin());
        id.setMdp(i.getMdp());
        System.out.println("après cght");
         System.out.println(id.getLogin());
        em.getTransaction().commit();

    }

    public int supprimerUtilisateur(int idUtil) {
        Query q = em.createQuery(UtilisateurConstantes.REQUEST_DELETE_UTILISATEUR);
        q.setParameter("idUtil", idUtil);
        return q.executeUpdate();
    }

    public void ajouterUtilisateur(Identifiants id) {
        em.getTransaction().begin();
        Identifiants i = new Identifiants();
        i.setLogin(id.getLogin());
        i.setMdp(id.getMdp());
        em.persist(i);
        em.getTransaction().commit();
    }


    public String miseEnFormeTextArea(ArrayList<Identifiants> list) {
        String str = "";
        str = "Liste des utilisateurs :\n";
        for (Identifiants i : list) {
            str = str + "Login : " + i.getLogin() + "\nMot de passe : " + i.getMdp() + "\n\n";
        }
        return str;
    }
}

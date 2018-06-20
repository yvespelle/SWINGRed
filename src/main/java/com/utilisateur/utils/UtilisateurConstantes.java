/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.utilisateur.utils;

/**
 *
 * @author stage011
 */
public class UtilisateurConstantes {
        
    public static final String REQUEST_SELECT_TOUS_UTILISATEURS = "SELECT i FROM Identifiants i";
    public static final String REQUEST_SELECT_UTILISATEUR_ID = "SELECT i FROM Identifiants i WHERE e.id=:idUtil";
    public static final String REQUEST_DELETE_UTILISATEUR = "DELETE FROM Identifiants i WHERE e.id=:idUtil";
    
    
    
    
    
    
}

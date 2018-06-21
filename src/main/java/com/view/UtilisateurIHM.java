/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.view;

import com.controleur.GestionUtilisateur;
import com.modele.Identifiants;

import com.utilisateur.utils.UtilisateurConstantes;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author stage011
 */
public class UtilisateurIHM extends javax.swing.JFrame {

    ArrayList<Identifiants> listeIdentifiants = new ArrayList<>();
    GestionUtilisateur gu = new GestionUtilisateur();
    Identifiants identifiant = new Identifiants();
    int idAModifier;

    /**
     * Creates new form UtilisateurIHM
     */
    public UtilisateurIHM() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        resultArea = new javax.swing.JTextArea();
        Utilisateurs = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        textFieldMdp = new javax.swing.JTextField();
        textFieldLogin = new javax.swing.JTextField();
        labelMdp = new javax.swing.JLabel();
        labelLogin = new javax.swing.JLabel();
        okButton = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        rechercherUnUtilisateur = new javax.swing.JMenuItem();
        afficherTousLesUtilisateurs = new javax.swing.JMenuItem();
        ajouter = new javax.swing.JMenuItem();
        supprimer = new javax.swing.JMenuItem();
        modifier = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        resultArea.setEditable(false);
        resultArea.setColumns(20);
        resultArea.setRows(5);
        jScrollPane1.setViewportView(resultArea);

        Utilisateurs.setText("Résultats :");

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        textFieldMdp.setEditable(false);
        textFieldMdp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldMdpActionPerformed(evt);
            }
        });

        textFieldLogin.setEditable(false);
        textFieldLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldLoginActionPerformed(evt);
            }
        });

        labelMdp.setText("Mot de passe");

        labelLogin.setText("Login");

        okButton.setText("OK");
        okButton.setEnabled(false);
        okButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(labelLogin)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(textFieldLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(labelMdp)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(okButton)
                            .addComponent(textFieldMdp, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(34, 34, 34)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Utilisateurs)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(Utilisateurs, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(labelLogin)
                                .addComponent(textFieldLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(52, 52, 52)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(textFieldMdp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(labelMdp))
                            .addGap(65, 65, 65)
                            .addComponent(okButton))
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(43, Short.MAX_VALUE))
        );

        jMenu1.setText("Menu");

        rechercherUnUtilisateur.setText("Rechercher un utilisateur");
        rechercherUnUtilisateur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rechercherUnUtilisateurActionPerformed(evt);
            }
        });
        jMenu1.add(rechercherUnUtilisateur);

        afficherTousLesUtilisateurs.setText("Afficher tous les utilisateurs");
        afficherTousLesUtilisateurs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                afficherTousLesUtilisateursActionPerformed(evt);
            }
        });
        jMenu1.add(afficherTousLesUtilisateurs);

        ajouter.setText("Ajouter");
        ajouter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ajouterActionPerformed(evt);
            }
        });
        jMenu1.add(ajouter);

        supprimer.setText("Supprimer");
        supprimer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                supprimerActionPerformed(evt);
            }
        });
        jMenu1.add(supprimer);

        modifier.setText("Modifier");
        modifier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modifierActionPerformed(evt);
            }
        });
        jMenu1.add(modifier);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 5, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rechercherUnUtilisateurActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rechercherUnUtilisateurActionPerformed
        JOptionPane jopRechercher = new JOptionPane();
        String nomUtilisateur = jopRechercher.showInputDialog(null, "Rentrez le nom d'utilisateur à rechercher : ", "Rechercher un utilisateur", JOptionPane.QUESTION_MESSAGE);
        textFieldLogin.setText(nomUtilisateur);
        resultArea.setText("");
        okButton.setText(UtilisateurConstantes.OKBUTTON_RECHERCHER_1);
        //Activation et désactivation des objets
        okButton.setEnabled(true);
        textFieldLogin.setEditable(true);
        textFieldMdp.setEditable(false);

    }//GEN-LAST:event_rechercherUnUtilisateurActionPerformed

    private void modifierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modifierActionPerformed
        JOptionPane jopRechercher = new JOptionPane();
        String nomUtilisateur = jopRechercher.showInputDialog(null, "Rentrez le nom d'utilisateur à modifier : ", "Modifier un utilisateur", JOptionPane.QUESTION_MESSAGE);
        //ON RECHERCHE D'ABORD S'IL EXISTE UN UTILISATEUR CORRESPONDANT A LA DEMANDE
        listeIdentifiants.clear();
        listeIdentifiants = gu.consulterUtilisateurParLogin(nomUtilisateur);
        if (listeIdentifiants.isEmpty()) {
            resultArea.setText(UtilisateurConstantes.MESSAGE_NO_USER);
            textFieldLogin.setText("");
            textFieldMdp.setText("");
        } else {

            idAModifier = listeIdentifiants.get(0).getId();
            System.out.println(idAModifier);// TEST
            textFieldLogin.setText(listeIdentifiants.get(0).getLogin());
            textFieldMdp.setText(listeIdentifiants.get(0).getMdp());
            resultArea.setText("");
            okButton.setText(UtilisateurConstantes.OKBUTTON_MODIFIER);
            //Activation et désactivation des objets
            okButton.setEnabled(true);
            textFieldLogin.setEditable(true);
            textFieldMdp.setEditable(true);
        }
//Change le texte du bouton en mode Modifier et l'enable
        //Enable l'edit des 2 text fields
    }//GEN-LAST:event_modifierActionPerformed

    private void supprimerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_supprimerActionPerformed
//        JOptionPane jopRechercher = new JOptionPane();
//        String nomUtilisateur = jopRechercher.showInputDialog(null, "Rentrez le nom d'utilisateur à supprimer : ", "Supprimer un utilisateur", JOptionPane.QUESTION_MESSAGE);
        okButton.setText(UtilisateurConstantes.OKBUTTON_SUPPRIMER);
        resultArea.setText("");
        //Activation et désactivation des objets
        okButton.setEnabled(true);
        textFieldLogin.setEditable(true);
        textFieldMdp.setEditable(false);
        //Change le texte du bouton en mode Supprimer et l'enable
        //Enable l'edit du text field login
    }//GEN-LAST:event_supprimerActionPerformed

    private void ajouterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ajouterActionPerformed
        okButton.setText(UtilisateurConstantes.OKBUTTON_AJOUTER);
        resultArea.setText("");
        //Activation et désactivation des objets
        okButton.setEnabled(true);
        textFieldLogin.setEditable(true);
        textFieldMdp.setEditable(true);
        //Enable l'edit des 2 text fields
        //Enable le bouton et change son texte pour Ajouter
    }//GEN-LAST:event_ajouterActionPerformed

    private void afficherTousLesUtilisateursActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_afficherTousLesUtilisateursActionPerformed
        //Affiche tous les user dans le text area
        listeIdentifiants = gu.consulterUtilisateurs();
        String str = gu.miseEnFormeTextArea(listeIdentifiants);
        resultArea.setText(str);

    }//GEN-LAST:event_afficherTousLesUtilisateursActionPerformed

    private void textFieldMdpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldMdpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldMdpActionPerformed

    private void textFieldLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldLoginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldLoginActionPerformed

    private void okButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okButtonActionPerformed
        switch (okButton.getText()) {
            case UtilisateurConstantes.OKBUTTON_RECHERCHER_1:
                //Appeler Recherche d'un employé et affichage dans text area
                listeIdentifiants.clear();
                listeIdentifiants = gu.consulterUtilisateurParLogin(textFieldLogin.getText());

                String str = gu.miseEnFormeTextArea(listeIdentifiants);
                resultArea.setText(str);
                break;
            case UtilisateurConstantes.OKBUTTON_MODIFIER:
                //On change avec les nouvelles valeurs rentrées
                //CHANGER IDENAMODIFIER POURSAUVEGARDER PLUTOT L'ID DE L'ENTREE A MODIFIER (PEUT ETRE L'AFFICHER ?)

                identifiant.setId(idAModifier);
                identifiant.setLogin(textFieldLogin.getText());
                identifiant.setMdp(textFieldMdp.getText());
                gu.modifierUtilisateur(identifiant);

                listeIdentifiants.clear();
                listeIdentifiants = gu.consulterUtilisateurParLogin(textFieldLogin.getText());

                String strMod = "Nouvelle entrée :\n" + gu.miseEnFormeTextArea(listeIdentifiants);
                resultArea.setText(strMod);

                break;
            case UtilisateurConstantes.OKBUTTON_SUPPRIMER:
                //On supprime l'user rentré dans login
                break;
                
            case UtilisateurConstantes.OKBUTTON_AJOUTER:
                identifiant.setLogin(textFieldLogin.getText());
                identifiant.setMdp(textFieldMdp.getText());
                gu.ajouterUtilisateur(identifiant);
                
//              Affiche le résultat de l'ajout dans la text area 
                listeIdentifiants.clear();
                listeIdentifiants = gu.consulterUtilisateurParLogin(textFieldLogin.getText());

                str = gu.miseEnFormeTextArea(listeIdentifiants);
                resultArea.setText(str);
                break;

//            Ajouter un Utilisateur avec le login et le mdp rentré
            default:
                okButton.setText("Youpi");
                break;
        }
    }//GEN-LAST:event_okButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(UtilisateurIHM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UtilisateurIHM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UtilisateurIHM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UtilisateurIHM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UtilisateurIHM().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Utilisateurs;
    private javax.swing.JMenuItem afficherTousLesUtilisateurs;
    private javax.swing.JMenuItem ajouter;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel labelLogin;
    private javax.swing.JLabel labelMdp;
    private javax.swing.JMenuItem modifier;
    private javax.swing.JButton okButton;
    private javax.swing.JMenuItem rechercherUnUtilisateur;
    private javax.swing.JTextArea resultArea;
    private javax.swing.JMenuItem supprimer;
    private javax.swing.JTextField textFieldLogin;
    private javax.swing.JTextField textFieldMdp;
    // End of variables declaration//GEN-END:variables
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biz.ei6;

/**
 *
 * @author booth10-mgr2
 */
public class Personne {
    private String login;
    private String password;
    private String nomComplet = "Elodie Laps";

    /**
     * @return the login
     */
    public String getLogin() {
        return login;
    }

    /**
     * @param login the login to set
     */
    public void setLogin(String login) {
        this.login = login;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @return the nomComplet
     */
    public String getNomComplet() {
        if(login != null && !login.equals("elodie1234")) return "Un inconnu a pris ta place D:"; // Si login n'est pas exactement "elodie1234", alors "un inconnu a pris ta place D:"
        return nomComplet;
    }

    /**
     * @param nomComplet the nomComplet to set
     */
    public void setNomComplet(String nomComplet) {
        this.nomComplet = nomComplet;
    }
    
    public boolean verifie() {                                                      // Methode qui permet de reculer la logique de la vérification de la page JSP vers le bean
        return login!=null  && login.equals("elodie") && password!=null && password.equals("moncomptetwitter");
    } 
}
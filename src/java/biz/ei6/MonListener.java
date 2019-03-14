/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biz.ei6;

import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

/**
 *
 * @author Utilisateur
 */
public class MonListener implements HttpSessionListener {

    static int nbUtilisateurs;

    @Override
    public void sessionCreated(HttpSessionEvent e) {

        nbUtilisateurs++;
        e.getSession().getServletContext().setAttribute("nbUtilisateurs", nbUtilisateurs);

    }

    @Override
    public void sessionDestroyed(HttpSessionEvent e) {
        nbUtilisateurs--;

    }

}

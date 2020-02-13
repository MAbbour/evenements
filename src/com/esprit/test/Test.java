/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.esprit.test;

import com.esprit.Entite.Evenement;
import com.esprit.Entite.Inscription_evenement;
import com.esprit.Entite.Parent;
import com.esprit.Entite.enfant;

import com.esprit.Service.ServiceEvenement;
import com.esprit.Service.ServiceInscription_evenement;

import com.esprit.Utils.DataBase;
import java.sql.*;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author House
 */
public class Test {
    
    public static void main(String[] args) throws SQLException {
        
        
        ServiceEvenement sv = new ServiceEvenement();
        ServiceInscription_evenement svi = new ServiceInscription_evenement();
        Parent p = new Parent("mm", "jjj", "gggg", 12, 12, "mmmm");
//        svi.chercher(1);
        
        Evenement ev = new Evenement("ll", "kkk", 12, 12, "12/12/12");
        
        
        System.out.println( sv.readAll());
       // sv.trierEvenement("nom");
       // sv.update(new Evenement(8, "gabes", "karim event", 100,100, "13-12-2019"));
      //  sv.delete1(9);
       // sv.chercher("kkk");
        //sv.chercher("kkk");
        //sv.ajouter(ev);
      //  enfant en = new enfant(1, "jjjjj", "kkkkk", "12/12/12", "kkkkk", 1, p);
      /*
        Inscription_evenement is = new Inscription_evenement(2, 1, 6);
        List<Inscription_evenement> listinsc= svi.readAll();
        System.out.println(listinsc);
        svi.ajouter(is);
*/
        
        //svi.chercher(1);
        //System.out.println(svi.getInscription(2));
      
     // List<Evenement> listeven = sv.readAll();
        //System.out.println(listeven);
        //svi.update(new Inscription_evenement(4, 12));
        //svi.delete(4);
        
        
    
        
   
    }
    
}

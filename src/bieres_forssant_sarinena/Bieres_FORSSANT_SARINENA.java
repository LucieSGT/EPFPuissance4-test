/*
 * SARINENA Lucie FORSSANT Jade FG2 TDB1
 * TP2 Exercice Bieres - Main
 * 12/10/2020
 */
package bieres_forssant_sarinena;

/**
 *
 * @author jforssan
 */
public class Bieres_FORSSANT_SARINENA {

    /**
     * @param args
     */
    

    
    public static void main(String[] args) {
        
        //BouteilleBiere uneBiere = new BouteilleBiere() ; // écriture des attributs avant la mise en place du constructeur
        //uneBiere.nom = "Cuvée des trolls"; // maintenant que le constructeur existe, ces lignes sont source de messages d'erreur
        //uneBiere.degreAlcool = (float) 7.0;
        //uneBiere.brasserie = "Dubuisson";
        //uneBiere.ouverte = false ;
        
        BouteilleBiere uneBiere ; // l'objet BouteilleBiere est créé et il est référencé la variable de référence uneBiere
        uneBiere = new BouteilleBiere("Cuvée des trolls", (float) 7.0,"Dubuisson"); // on spécifie les attributs à l'aide d'un constructeur de 3 paramètres
        uneBiere.lireEtiquette();
        uneBiere.Decapsuler();
        
       //BouteilleBiere Biere2 = new BouteilleBiere() ;
       // Biere2.nom = "Leffe";
       // Biere2.degreAlcool = (float) 6.6;
       // Biere2.brasserie = "Abbaye de Leffe";
       
       BouteilleBiere Biere2 ; // création d'une deuxième référence-objet (utilisation obligatoire du new sinon la variable n'est pas considéré comme nouvelle entité
       Biere2 = new BouteilleBiere("Leffe", (float) 6.6,"Abbaye de Leffe");
       Biere2.lireEtiquette(); // on ne décapsule pas celle-ci
       
       BouteilleBiere Biere3 ;
       Biere3 = new BouteilleBiere("Chouffe", (float) 8.0,"Royaume de Chouffe");
       Biere3.lireEtiquette();
       Biere3.Decapsuler();
       
       BouteilleBiere Biere4 ; // on décide de la laisser fermée également
       Biere4 = new BouteilleBiere("Despe", (float) 5.6,"Desesperé");
       Biere4.lireEtiquette();
       
       BouteilleBiere Biere5 ;
       Biere5 = new BouteilleBiere("Heineken", (float) 5.0,"Pays du geant vert");
       Biere5.lireEtiquette();
       Biere5.Decapsuler(); // on décapsule une 1ere fois tout se passe bien l'attribut ouverte devient true
       Biere5.Decapsuler(); // on décapsule une 2ème fois cela affiche le message d'erreur, la valeur ouverte était donc bien mise à jour
       
System.out.println(uneBiere) ;

System.out.println(Biere2) ;

System.out.println(Biere3) ;

System.out.println(Biere4) ;

System.out.println(Biere5) ; // affichage attendu, tout semble cohérent

    }
    
}

/*
 * SARINENA Lucie FORSSANT Jade FG2 TDB1
 * TP2 Exercice Bieres - Class BouteilleBiere
 * 12/10/2020
 */
package bieres_forssant_sarinena;

/**
 *
 * @author jforssan
 */
public class BouteilleBiere { // création d'une classe i.e. un objet
    String nom;
    float degreAlcool;
    String brasserie;
    boolean ouverte; // on décrit ici ses attributs et leur type (i.e. éléments de la "carte d'identité")

    public BouteilleBiere(String unNom, float unDegre, String uneBrasserie) { // création d'un constructeur (car il possède le même nom que la classe)
        nom = unNom; // on passe ici les attributs en paramètres pour simplifier l'affection des valeurs à leurs attributs
        brasserie = uneBrasserie;
        ouverte = false;
}

    
public void lireEtiquette() { // création de la méthode lireEtiquette (i.e. actions de l'objet)
System.out.println("Bouteille de " + nom +" (" + degreAlcool + " degres) \nBrasserie : " + brasserie ) ; //Rappelons que \n permet de passer à la ligne sur l'affichage

}
   
public boolean Decapsuler(){ // création de la méthode décapsuler ici on renvoie des booléens d'où le public boolean
    if (ouverte==false){ // si bouteille non ouverte 
      ouverte=true; //alors on l'ouvre (modifie la valeur du booléen dans les attributs)
      return true ; //et on renvoie qu'elle est ouverte dans le main
    } 
    else {
        System.out.println("erreur: bière déjà ouverte"); 
        return false; 
        }
}

@Override
public String toString() { // cette méthode permet de retourner la chaîne de caractère de la référence-objet que l'on veut afficher
    String chaine_a_retourner; // AUtrement dit, elle permet d'utiliser System.out.println(référenceObjet)
chaine_a_retourner = nom + " (" + degreAlcool + " degrés) Ouverte ? ";
if (ouverte == true ) chaine_a_retourner += "oui" ;
else chaine_a_retourner += "non" ;
return chaine_a_retourner ;
}
        
}


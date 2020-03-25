package florianldm;

import java.util.ArrayList;
import java.util.Collection;

public class Groupe implements Composant {
    /** Collection représentant le personnel du groupe. */
    private Collection c;

    /**
     * Constructeur.
     */
    public Groupe() {
        c = new ArrayList();
    }

    /**
     * Ajout d'un personnel dans le groupe.
     * @param comp composant.
     */
    public void add(final Composant comp) {
        c.add(comp);
    }

    /**
     * Suppression d'un personnel du groupe.
     * @param comp composant.
     */
    public void remove(final Composant comp) {
        c.remove(comp);
    }

    /** Parcours du groupe et affiche les membres. */
    @Override
    public void afficheNom() {

    }
}

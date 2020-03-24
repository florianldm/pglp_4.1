package florianldm;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public final class Personnel {
    private final String nom;
    private final String prenom;
    private final LocalDate naissance;
    private final ArrayList<String> tel;

    public Personnel(final String nom1, final String prenom1, final LocalDate naissance1, final ArrayList<String> tel1){
        this.nom = new String(nom1);
        this.prenom = new String(prenom1);
        this.naissance = naissance1;
        this.tel = new ArrayList<String>(tel1);
    }

}

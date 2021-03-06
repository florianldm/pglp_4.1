package florianldm;

import org.junit.*;

import java.time.LocalDate;
import java.time.Month;

public class GroupeTest {
    /** Date anniversaire. */
    LocalDate d, d1;
    /** Personnels. */
    Personnel p, p1;
    /** Groupe. */
    Groupe g;

    /**
     * Initialisation d'un groupe.
     */
    @Before
    public void initGroupe() {
        d = LocalDate.of(1989, Month.DECEMBER,5);
        d1 = LocalDate.of(1967, Month.AUGUST,14);
        p = new Personnel.Builder("Martin", "Jean", d).build();
        p1 = new Personnel.Builder("Pierre", "Michel", d1).build();
        g = new Groupe();
    }

    /**
     * Test de l'ajout d'un personnel dans groupe.
     */
    @Test
    public void testAjout() {
        g.add(p);
        g.add(p1);
        Assert.assertNotNull(g);
    }

    /**
     * Test de la suppression + suppression d'un groupe vide.
     */
    @Test
    public void testSuppression() {
        g.remove(p);
        g.remove(p1);
        Assert.assertEquals(false, g.remove(p));
    }
}

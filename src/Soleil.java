import java.util.ArrayList;

/**
 * Class Soleil Singleton
 */
public class Soleil extends Astre {
    /*
     class Soleil extends astre (Singleton)
        - private Soleil instance
        + listePlanet
        + add()
        - private Soleil (Singleton)
        + public static Soleil getInstance()
     */
    private static Soleil instance;
    public static ArrayList<Planet> listePlanettes;

    private Soleil() {
        this.nom = "Soleil";
        listePlanettes = new ArrayList<Planet>();
    }

    public static Soleil getInstance() {
        if (instance == null)
        {
            instance = new Soleil();
        }
        return instance;
    }
    public void add(Planet planet){
        Soleil.listePlanettes.add(planet);
    }
}

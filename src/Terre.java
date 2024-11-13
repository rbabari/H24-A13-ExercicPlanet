/**
 * Notre chere Terre
 */
public class Terre extends Planet {
    private static Terre instance;

    private Terre() {
        super("Terre");
        this.orbiterAutour(Soleil.getInstance());
        this.listeSatellite.add(new Satellite("lune"));
    }

    public static Planet getInstance() {
    if (instance == null)
    {
        instance = new Terre();
    }
        return instance ;
    }
    @Override
    public String toString()
    {
        return "Planette Terre ... ";
    }

}

import java.util.ArrayList;

public class Planet extends Astre implements IOrbitable{

    public ArrayList<Satellite> listeSatellite = new ArrayList<Satellite>();


    public Planet(String nom)
    {
        super();
        this.nom = nom;
    }

    public void add(Satellite s)
    {
        listeSatellite.add(s);
    }

    @Override
    public void orbiterAutour(Astre astre) {
        Soleil.listePlanettes.add(this);
    }


}

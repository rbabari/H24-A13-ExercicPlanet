public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        /*
        class Object ...

        class Astre abstract // CELECTIAL BODY // CorpsCeleste //
        IOrbitable interface OrbiteAutourDe(Astre)
        + public void OrbiterAutour(Astre a)

        class Soleil extends astre (Singleton)
        - private Soleil instance
        + listePlanet
        + add()
        - private Soleil (Singleton)
        + public static Soleil getInstance()

        class Planet extends astre implements IOrbitable (terre, mars, jupiter)
        - nom ... get set
        + ArrayList[satellite] listeSattelistes

        class Terre extends Planet (Singleton ... )


        class Satellite extends astre implements IOrbitable (lune)
        + nom
        Satellite() // constructeur
        Satellite(String nom) // constructeur avec param
        Satellite(Satellite sat) // constructeur par copie

        @Override
        public void OrbiterAutour(Astre a)

        @Override
        public String toString() ...

        */

        /*
        * creer un soleil
        * creer un satellite lune
        * creer une planette ou plusieurs
        * ajouter satellite a la planette
        * ajouter les planettes au soleil ...
        * debug pour voir notre systeme solaire ..
        * */

        // Planet terre = new Planet("terre"); terre est un objet
        // Planet terre = new Terre(); // terre
        Planet terre = Terre.getInstance(); // singleton

    }
}
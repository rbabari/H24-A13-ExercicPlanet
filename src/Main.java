public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Soleil soleil = Soleil.getInstance();

        Planet terre = Terre.getInstance();
        Planet mars = new Planet("mars");

        // soleil.add(terre);
        soleil.add(mars);

        terre.listeSatellite.get(0);




    }
}
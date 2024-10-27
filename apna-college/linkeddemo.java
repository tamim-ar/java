import java.util.LinkedList;

public class linkeddemo {
    public static void main(String[] args) {
        LinkedList<String> countrynames = new LinkedList<String> ();

        countrynames.add("Tamim");
        countrynames.add("Ahasan");
        countrynames.add("Rijon");
        countrynames.remove();
        countrynames.remove();

        System.out.println(countrynames);
    }
}

package epam.home.Plane;

/**
 * Created by Наталья on 02.02.2017.
 */
public class Boing extends Plane {
    private static final String COMPANY = "Boeing";


    public Boing(String name, int kolMest, int gruzPod, int toplivo) {
        super(name, kolMest, gruzPod, toplivo);
    }

    public String company() {
        return COMPANY;
    }
}

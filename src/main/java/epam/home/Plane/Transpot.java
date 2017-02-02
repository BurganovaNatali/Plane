package epam.home.Plane;

/**
 * Created by Наталья on 02.02.2017.
 */
public class Transpot extends Plane {
 private static final String COMPANY = "Украинская компания";

    public Transpot(String name, int kolMest, int gruzPod, int toplivo) {
        super(name, kolMest, gruzPod, toplivo);
    }

    public String company() {
        return COMPANY;
    }
}

package epam.home.Plane;

import java.util.ArrayList;

/**
 * Created by Наталья on 02.02.2017.
 */
public class AviaCompany {
    private ArrayList<Plane> plane;

    public AviaCompany(ArrayList<Plane> plane) {
        this.plane = plane;
    }

    public ArrayList<Plane> getPlane() {
        return plane;
    }
}

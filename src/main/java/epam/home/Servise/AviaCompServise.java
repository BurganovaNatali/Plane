package epam.home.Servise;

import epam.home.Plane.AviaCompany;
import epam.home.Plane.Plane;

import java.util.ArrayList;

/**
 * Created by Наталья on 02.02.2017.
 */
public class AviaCompServise {
    private AviaCompany avia;

    public AviaCompServise(AviaCompany avia) {
        this.avia = avia;
    }


    public int allKolMest() {

        int allKolMest = 0;

        for (Plane plane: avia.getPlane()) {
            allKolMest+= plane.getKolMest();
        }
        return allKolMest;
    }


    public int allGruzPod(){

        int allGruzPod = 0;

        for (Plane plane:avia.getPlane()) {
            allGruzPod += plane.getGruzPod();
        }

        return allGruzPod;
    }


    public ArrayList<Plane> findByToplivo(int num1, int num2){

        ArrayList<Plane> plane = new ArrayList<Plane>();
        for (Plane planes: avia.getPlane()) {
            if (planes.getToplivo() >= num1 && planes.getToplivo() <= num2){
                plane.add(planes);
            }

        }

        return plane;
    }

}

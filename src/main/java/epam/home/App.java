package epam.home;

import epam.home.Plane.*;
import epam.home.Servise.AviaCompServise;

import java.util.ArrayList;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ArrayList<Plane> planes = new ArrayList<Plane>();
        planes.add(new Boing("Boeing 777", 200, 500000, 100000));
        planes.add(new Aerobus("A380",150, 400000, 150000));
        planes.add(new Transpot("T747",20, 800000,200000));

        for (Plane plane : planes) {
            System.out.println(plane.toString());
        }

        AviaCompany avi = new AviaCompany(planes);

        AviaCompServise avServ = new AviaCompServise(avi);
        System.out.println("Общая вместимость самолетов авиакомпании = " + avServ.allKolMest());

        System.out.println("Общая грузоподъемность свмолетов авиакомпании = " + avServ.allGruzPod());




    }
}

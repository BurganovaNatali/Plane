package epam.home.Plane;

/**
 * Created by Наталья on 02.02.2017.
 */
public abstract class Plane {

    private String name;
    private int kolMest;
    private int gruzPod;
    private int toplivo;


    public Plane(String name, int kolMest, int gruzPod, int toplivo) {
        this.name = name;
        this.kolMest = kolMest;
        this.gruzPod = gruzPod;
        this.toplivo = toplivo;
    }

    public abstract String company(); // метод у всех разный для полиморфизма и наследования

    public int getKolMest() {
        return kolMest;
    }

    public int getGruzPod() {
        return gruzPod;
    }

    public int getToplivo() {
        return toplivo;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Plane{" +
                "name='" + name + '\'' +
                ", kolMest=" + kolMest +
                ", gruzPod=" + gruzPod +
                ", toplivo=" + toplivo +
                '}';
    }
}

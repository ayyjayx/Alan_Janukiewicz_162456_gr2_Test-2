import java.time.LocalDate;
import java.util.ArrayList;

public class Klient implements Comparable<Klient>, Cloneable {
    private String nazwa;
    private LocalDate dataZakupy;
    private double rachunek;

    public Klient(String nazwa, LocalDate dataZakupy, double rachunek)
    {
        this.nazwa = nazwa;
        this.dataZakupy = dataZakupy;
        this.rachunek = rachunek;
    }

    public String getNazwa(){
        return this.nazwa;
    }

    public LocalDate getDataZakupy(){
        return this.dataZakupy;
    }

    public double getRachunek(){
        return this.rachunek;
    }

    public void setNazwa(String nazwa){
        this.nazwa = nazwa;
    }

    public void setDataZakupy(LocalDate dataZakupy){
        this.dataZakupy = dataZakupy;
    }

    public void setRachunek(double rachunek){
        this.rachunek = rachunek;
    }

    public int compareTo(Klient other) {return this.nazwa.compareTo(other.nazwa)+this.dataZakupy.compareTo(other.dataZakupy)+this.rachunek.compareTo(other.rachunek); }
    public String toString()
    {
        String c = "";
        c+=getClass().getName()+"Nazwa= " + this.nazwa + " data zakupu= " + this.dataZakupy + " rachunek= " + this.rachunek + "\n";
        return c;
    }
}


public class ObsługaKlienta {
    static double procentRabatu;
    private ArrayList<Klient>;
}


public class Main{

}

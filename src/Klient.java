import java.time.LocalDate;

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

    public int compareTo(Klient klient){
        int result = this.dataZakupy.compareTo(klient.dataZakupy);
        if(result != 0){
            return result;
        }
            result = this.nazwa.compareTo(klient.nazwa);
            if(result != 0){
                return result;
            }
                if (this.rachunek == klient.rachunek){
                    return 0;
            }
        return result;
    }
    public String toString()
    {
        String str = "";
        str+=getClass().getName()+" Nazwa= " + this.nazwa + " data zakupu = " + this.dataZakupy + " rachunek = " + this.rachunek + "\n";
        return str;
    }
}
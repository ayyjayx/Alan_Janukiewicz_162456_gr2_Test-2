import java.util.ArrayList;

public class ObslugaKlienta {
    static double procentRabatu;
    private ArrayList<Klient> klienci;

    public static void setProcentRabatu() {
        ObslugaKlienta.procentRabatu = 0.05;
    }

    public static double getProcentRabatu() {
        return procentRabatu;
    }

    public static double discountAmount(Klient k){
        if(k.getRachunek() > 300)
            return k.getRachunek()*procentRabatu;
        else
            return 0;
    }
}

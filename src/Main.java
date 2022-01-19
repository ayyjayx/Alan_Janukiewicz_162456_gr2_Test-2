import java.util.ArrayList;
import java.time.LocalDate;
import java.util.Collections;

public class Main{
    public static void main(String[] args){
        ArrayList<Klient> grupa = new ArrayList<Klient>();


        LocalDate data1 = LocalDate.of(2001, 3, 6);
        LocalDate data2 = LocalDate.of(2002, 5, 13);
        LocalDate data3 = LocalDate.of(2003, 6, 25);

        Klient k1 = new Klient("Alan", data1, 103.57);
        Klient k2 = new Klient("Mateusz", data1, 98.54);
        Klient k3 = new Klient("Kacper", data3, 14.90);
        Klient k4 = new Klient("Kuba", data2, 14.90);
        Klient k5 = new Klient("Kuba", data3, 1003.78);

        grupa.add(k1);
        grupa.add(k2);
        grupa.add(k3);
        grupa.add(k4);
        grupa.add(k5);

        System.out.println("Grupy przed sortowaniem: \n");

        for(int i=0; i<grupa.size(); i++)
        {
            System.out.println(grupa.get(i));
        }

        Collections.sort(grupa);
        System.out.println("Grupy po sortowaniu: \n");
        for(int i=0; i<grupa.size(); i++)
        {
            System.out.println(grupa.get(i));
        }

    }
}
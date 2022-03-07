package ro.ase.dice.clase;

import java.io.FileNotFoundException;
import java.util.List;
//cumva trb sa fie un proiect in altul, nu stiu cum sa iti explic :))
//pai nu merge ca la primul seminar?
//cumva
//e diferit, practic trb sa punem peste ce a fost la primul sem
//am alta idee
//asa
public class Program {

    public static void main(String[] args) {
        List<Aplicant> listaAngajati;

        try {
            Readable angajatiReader = new AngajatiReader("angajati.txt");
            listaAngajati = angajatiReader.readAplicants();
            for(Aplicant angajat:listaAngajati)
                System.out.println(angajat.toString()); //liskov
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

}

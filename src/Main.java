import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try{
            BufferedReader beolvasas = new BufferedReader(new FileReader("bukkm2019.txt"));
            List<Versenyzo> participants = new ArrayList<>();
            beolvasas.readLine();
            String sor;


            while((sor = beolvasas.readLine())!=null){
                Versenyzo versenyzo = new Versenyzo(sor);
                participants.add(versenyzo);
            }
            for(Versenyzo item : participants) {
                System.out.println(item.getRajtszam() + " " + item.getKategoria() + " " + item.getNev()
                        + " " + item.getEgyesulet() + " " + item.getIdo());
            }
            }catch(IOException r){
            r.printStackTrace();

        }


    }
}
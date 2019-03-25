import java.util.ArrayList;
import java.util.Scanner;

public class Squadra {
    String nomesquadra;
    ArrayList <giocatore> giocatori = new ArrayList<>();
    Sgicanner input = new Scanner(System.in);

    Squadra(){
        System.out.println("Inserisci nome squadra");
        this.nomesquadra = input.nextLine();
        this.setGiocatori();

    }
    public void setGiocatori() {
        giocatore g = new giocatore();
        for (int i = 0; i < 5; i++) {
            input = new Scanner(System.in);

            System.out.println("Inserisci nome giocatore");
            String nome ="\n" + input.nextLine() +"\n";
            g.setNome(nome);

            System.out.println("Inserisci ruolo");
            String ruolo =  input.nextLine() ;
            g.setRuolo(ruolo);

            System.out.println("Inserisci numero maglia");
            int numeromaglia = input.nextInt();
            g.setNumeromaglia(numeromaglia);

            this.giocatori.add(g);
        }
   }
    public void PrintSquadra(){
        System.out.println("Squadra: " + this.nomesquadra);
        for (giocatore g : giocatori) {
            g.printGiocatore();
        }
    }
}




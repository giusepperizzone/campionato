import java.util.ArrayList;
import java.util.Scanner;

public class Squadra {

    String nomesquadra;
    ArrayList <Giocatore> squadra = new ArrayList<>();
    Scanner input = new Scanner(System.in);


    int totgoalfatti = 0;
    int numerogiocatori = 2;

    Squadra(){
        System.out.println("Inserisci nome squadra");
        this.nomesquadra = input.nextLine();
        this.setGiocatori();

    }

    public String getNomesquadra() {
        return nomesquadra;
    }

    public int getTotgoalfatti() {
        return totgoalfatti;
    }
    public  void  setGiocatori() {
        Giocatore giocatore;
        for (int i = 0; i < numerogiocatori; i++) {
            giocatore = new Giocatore();
            input = new Scanner(System.in);

            System.out.println("Inserisci nome Giocatore");
            String nome = input.nextLine();
            giocatore.setNome(nome);

            System.out.println("Inserisci ruolo");
            String ruolo =  input.nextLine() ;
            giocatore.setRuolo(ruolo);
//
//            System.out.println("Inserisci numero maglia");
//            int numeromaglia = input.nextInt();
//            giocatore.setNumeromaglia(numeromaglia);
            squadra.add(giocatore);
        }
    }


    public int Gioca(){
        for (Giocatore giocatore : this.squadra){
            giocatore.Score();
        }
        Totgoalfatti();
        return getTotgoalfatti();
    }


    public void Totgoalfatti() {
        for (Giocatore giocatore : squadra){
        this.totgoalfatti+= giocatore.goalfatti;
        }
    }
    public void PrintSquadra(){
        System.out.println("Squadra: " + this.nomesquadra);
        for (Giocatore g : this.squadra) {
            g.printGiocatore();
        }
    }



}




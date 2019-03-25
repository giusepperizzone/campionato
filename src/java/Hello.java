import java.util.ArrayList;

public class Hello {
    public static void main (String args[]){

        Squadra milan = new Squadra();
        milan.PrintSquadra();


        Squadra juve = new Squadra();
        juve.PrintSquadra();

        Partita partita = new Partita(milan,juve);
        partita.play();
        partita.PrintRisultato();


    }
}

public class Partita {
    String arbitro;
    Squadra squadra_ospitante;
    Squadra squadra_ospite;
    int risultato [] = {0,0};
    public Partita() {
    }
    public Partita (Squadra squadra_ospitante, Squadra squadra_ospite){
        this.squadra_ospitante = squadra_ospitante;
        this.squadra_ospite = squadra_ospite;
    }

    public void play(){
        this.risultato[0]=this.squadra_ospitante.Gioca();
        this.risultato[1]=this.squadra_ospite.Gioca();
    }


    public void PrintRisultato (){
        System.out.println(squadra_ospitante.getNomesquadra() + " vs " + squadra_ospite.getNomesquadra());
        System.out.println("Risultato : " + risultato[0] + " - " + risultato[1]);
    }

}

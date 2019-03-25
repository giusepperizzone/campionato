public class giocatore {
   static String nome = "vuoto";
   static  String ruolo = "vuto";
   static  int numeromaglia = 0;
   static int goalfatti= 0;


    public giocatore (String nome, String ruolo, int numeromaglia){
        this.nome = nome;
        this.ruolo = ruolo;
        this.numeromaglia = numeromaglia;
    }
    public giocatore (){
        this.nome = "";
        this.ruolo = "";
        this.numeromaglia = 0;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setRuolo(String ruolo) {
        this.ruolo = ruolo;
    }

    public void setNumeromaglia(int numeromaglia) {
        this.numeromaglia = numeromaglia;
    }

    public void setGoal(int goal) {
        this.goalfatti = goal;
    }

    public String getNome() {
        return nome;
    }

    public String getRuolo() {
        return ruolo;
    }

    public int getNumeromaglia() {
        return numeromaglia;
    }

    public int getGoal() {
        return goalfatti;
    }

    public void printGiocatore(){
        System.out.println("Nome: " + nome );
        System.out.println("Ruolo: " + ruolo);
        System.out.println("Maglia n. " + numeromaglia);
    }
    public void Score(){
        int goal= (int)Math.random();
        if (goal <0.5) {
            this.goalfatti++;
        }
    }

}

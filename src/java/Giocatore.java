public class Giocatore {
    String nome ;
    String ruolo ;
    int numeromaglia;
    int goalfatti= 0;


    public Giocatore(String nome, String ruolo, int numeromaglia){
        this.nome = nome;
        this.ruolo = ruolo;
        this.numeromaglia = numeromaglia;
    }
    public Giocatore(){
        this.nome = "vuote";
        this.ruolo = "vuoto";
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

    public int getGoalfatti() {
        return goalfatti;
    }

    public void printGiocatore(){
        System.out.println("Nome: " + this.nome );
        System.out.println("Ruolo: " + this.ruolo);
        System.out.println("Maglia n. " + this.numeromaglia);
        System.out.println("");
    }


    public void Score(){
        double goal= Math.random();


        if (this.ruolo.equals("portiere")){

            if (goal > 0.8) {
                this.goalfatti++;
            }

        }
        else if (this.ruolo.equals("difensore")){
            if (goal > 0.6) {
                this.goalfatti++;
            }
        }

        else if (this.ruolo.equals("attaccante")){

            if (goal > 0.4) {
                this.goalfatti++;
            }
        }
        else {
            if (goal > 0.5) {
                this.goalfatti++;
            }
        }



    }


}

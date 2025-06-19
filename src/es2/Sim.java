package es2;

public class Sim {
    private String numTel;
    private int credito;
    private Chiamata[] chiamate = new Chiamata[5];


public Sim (String numTel){
    this.numTel = numTel;
    this.credito = 0;

}
/* public void addChiamata () {
    Chiamata ch = new Chiamata("+39 08132432");

    chiamate[0]= ch;

}*/

    public void setChiamate(Chiamata[] chiamate) {
        this.chiamate = chiamate;
    }
}

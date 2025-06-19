package es2;

import java.util.Random;

public class Chiamata {
    private  final int durata;
    private String numTelChiamata;


    public Chiamata (String numTelChiamata){
        this.numTelChiamata = numTelChiamata;
        Random rndm = new Random();
        this.durata = rndm.nextInt(1, 60);


    }
    public Chiamata (String numTelChiamata, int durata){
        this.numTelChiamata = numTelChiamata;

        this.durata = durata;


    }

    @Override
    public String toString() {
        return "es2.Chiamata{" +
                "durata=" + durata +
                ", numTelChiamata='" + numTelChiamata + '\'' +
                '}';
    }

    public int getDurata() {
        return durata;
    }

    public String getNumTelChiamata() {
        return numTelChiamata;
    }
}
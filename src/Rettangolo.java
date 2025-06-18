import java.util.Random;

public class Rettangolo {
private final int id;
private int altezza;
private int base;

public Rettangolo (int base, int altezza) {
    Random rndm = new Random();
    this.id = rndm.nextInt(1, 10000);
    this.altezza = altezza;
    this. base = base;
}

    public int getAltezza() {
        return altezza;
    }

    public int getBase() {
        return base;
    }

    public void setAltezza(int altezza) {
        this.altezza = altezza;
    }

    public void setBase(int base) {
        this.base = base;
    }

    @Override
    public String toString() {
        return "Rettangolo{" +
                "id=" + id +
                ", altezza=" + altezza +
                ", base=" + base +
                '}';
    }
public int calcoloPerimetro (){
    return (getBase() + getAltezza()) *2;
}public int calcoloArea (){
    return (getBase() * getAltezza());
}
}

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void stampaRettangolo (Rettangolo rett1) {
        System.out.println(" Data la base di " + rett1.getBase() + " e l'altezza di  " + rett1.getAltezza() + ", Il perimetro è " + rett1.calcoloPerimetro() + " e l'area è " + rett1.calcoloArea());
    }
    public static void stampaDueRettangoli (Rettangolo rett1, Rettangolo rett2) {
        int perimetroRett1 = rett1.calcoloPerimetro();
        int perimetroRett2 = rett2.calcoloPerimetro();
        int areaRett1 = rett1.calcoloArea();
        int areaRett2 = rett2.calcoloArea();
        System.out.println(" Il primo rettangolo ha la base di " + rett1.getBase() + " e l'altezza di  " + rett1.getAltezza() + ", Il perimetro è " + perimetroRett1 + " e l'area è " + areaRett1);
        System.out.println(" Il secondo rettangolo ha la base di " + rett2.getBase() + " e l'altezza di  " + rett2.getAltezza() + ", Il perimetro è " + perimetroRett2 + " e l'area è " + areaRett2);
        System.out.println( "Sommando i due perimentri otteniamo: " + (perimetroRett2 + perimetroRett1));
        System.out.println( "Sommando le due aree otteniamo: " + (areaRett1+ areaRett2));
    }
    public static void main(String[] args) {
        Rettangolo rett1 = new Rettangolo(5, 10); Rettangolo rett2 = new Rettangolo(20, 8);
        System.out.println(rett1.toString());
        stampaRettangolo(rett1);
        System.out.println(rett2.toString());
        stampaDueRettangoli(rett1, rett2);

    }
    }

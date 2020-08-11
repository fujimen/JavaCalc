package calc;

public class Liczby {
    protected float a;
    protected float b;
    protected float wynik;

    public Liczby() {
        this.a = 0;
        this.b = 0;
        this.wynik = 0;
    }

    public Liczby(float a, float b, float wynik) {
        this.a = a;
        this.b = b;
        this.wynik = wynik;
    }

    public float getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public float getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public float getWynik() {
        return wynik;
    }

    public void setWynik(int wynik) {
        this.wynik = wynik;
    }

    public void wyswietlLiczby(){
        System.out.println("Liczba a: " + this.a);
        System.out.println("Liczba b: " + this.a);
    }

    public void wyswietlWynik(){
        System.out.println("Wynik: " + this.wynik);
    }

    public void dodaj(){
        this.wynik = this.a + this.b;
        this.wyswietlWynik();
    }

    public void odejmij(){
        this.wynik = this.a - this.b;
        this.wyswietlWynik();
    }
    public void pomnoz(){
        this.wynik = this.a * this.b;
        this.wyswietlWynik();
    }
    public void podziel(){
        this.wynik = this.a / this.b;
        this.wyswietlWynik();
    }

    public void wyzeruj(){
        this.a = this.b = this.wynik = 0;
    }

}

package review02.car01;

public class Driver {
    private K5 k5;
    private Sonata sonata;

    public void setK5(K5 k5) {
        this.k5 = k5;
    }

    public void setSonata(Sonata sonata) {
        this.sonata = sonata;
    }

    public void drive() {
        System.out.println("자동차를 운전합니다.");
        if(k5!=null) {
            k5.startEngine();
            k5.speedUp();
            k5.offEngine();
        } else if(sonata!=null) {
            sonata.startEngine();
            sonata.speedUp();
            sonata.offEngine();
        }
    }
}


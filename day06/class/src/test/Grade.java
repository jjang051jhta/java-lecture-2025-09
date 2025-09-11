package test;

public class Grade {
    int math;
    int eng;
    int science;
    int sum = 0;

    public Grade(int math, int eng, int science) {
        this.math = math;
        this.eng = eng;
        this.science = science;
        sum = math + eng + science;
    }

    public Grade() {
        this(0, 0, 0);
    }

    double avg() {
        return sum / 3.0;
    }
}

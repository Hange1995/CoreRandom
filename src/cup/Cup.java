package cup;

import java.util.Scanner;

public class Cup {
    private double weight;
    private Lid lid;

//    public Cup() {
//    }

    public Cup(double weight, Lid lid) {
        this.weight = weight;
        this.lid = lid;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public Lid getLid() {
        return lid;
    }

    public void setLid(Lid lid) {
        this.lid = lid;
    }

    public void daoShui(int volume,int volumewaste) {
//        Scanner scanner = new Scanner(System.in);
//        int volume = scanner.nextInt();
//        int volumewaste = scanner.nextInt();
        int volumeremain = volume - volumewaste;
        System.out.println(volume);
        System.out.println(volumeremain);
        System.out.println(volumewaste);
    }
}

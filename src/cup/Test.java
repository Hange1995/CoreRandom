package cup;

public class Test {
    public static void main(String[] args) {
        Lid lid1 = new Lid();
        Lid lid2 = new Lid("red", "square");
        System.out.println("杯子的颜色是" + lid2.getColor());
        lid2.setShape("square");
        Cup cup1 = new Cup(10,lid1);
        cup1.daoShui(100,60);
    }
}

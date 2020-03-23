package cup;

public class Lid {

    private String color;
    private String shape;


    public Lid() {
    }

    public Lid(String color, String shape) {
//        if(shape == "square")
//            System.out.println("盖子不能为方的Lid");
        this.setColor(color);
        this.setShape(shape);

    }


    public String getShape() {
        return shape;
    }

    public void setShape(String shape) {
        if(shape == "square")
            System.out.println("盖子不能为方的set");
        this.shape = shape;
    }


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
//    }
    }
}
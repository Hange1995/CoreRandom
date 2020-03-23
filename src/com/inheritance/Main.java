package com.inheritance;


public class Main {
//    public static void main(String[] args) {
//        UIControl control = new UIControl(true);
//        TextBox textbox = new TextBox();
//        show(textbox);
//        //
//        //y = f(x)
//
//    }
//    public static void show (UIControl control){
//        if(control instanceof TextBox){
//            var textbox = (TextBox) control;
//            textbox.setText("hello world");
//        }
//        System.out.println(control);
//    }

    public static void main(String[] args) {
        Point point1 = new Point(1,2);
        Point point2 = new Point(1,2);
        System.out.println(point1);
        System.out.println(point2);
        System.out.println(point1.equals(point2));
        System.out.println(point2.hashCode());
        UIControl[] controls = {new TextBox(),new CheckBox()};
//        for (var control:controls){
//            control.render();
        }
        Animal dog = new Dog();





    }








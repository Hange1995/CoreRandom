package com.inheritance;

public class TextBox extends UIControl{
    private String text = "";

//    public TextBox() {
//        super(true);
////        System.out.println("TextBox");
//    }

    @Override
    public void render() {
//        System.out.println("render Textbox");
    }

    @Override
    public String  toString(){
        return text;
    }
    public void setText(String text){
        this.text= text;
    }
    public void clear(){
        text ="";
    }

    public String getText() {
        return text;
    }
}

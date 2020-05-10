package com.algorithms;

public class FindAllCombination {
    private StringBuilder output;
    private String input;

    public FindAllCombination(String input) {
        this.input = input;
    }


    public void combination(){
        combination(0);
    }

    private void combination(int start){

        for (int i=start;i<input.length();i++){
            output.append(input.charAt(i));
            System.out.println(output);
            if (i<input.length());
            combination(i+1);
            output.setLength(output.length()-1);
        }
    }
}

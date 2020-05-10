package com.algorithms;

public class ArmStrongCheck {
    public boolean armStrongCheck(int number){
        int check=number;
        int result=0;
        while (number!=0){
            int a=number%10;
            number=number/10;
            result=result+(int)Math.pow(a,3);
        }return result==check;
    }


    public static void main(String[] args) {
        ArmStrongCheck armStrongCheck=new ArmStrongCheck();
        System.out.println(armStrongCheck.armStrongCheck(369));
    }
}

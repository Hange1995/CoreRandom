package com.algorithms;

public class Pattern {


    public static void main(String[] args) {
        Pattern.pattern10(7);
    }

//        1
//        1 2
//        1 2 3
//        1 2 3 4
//        1 2 3 4 5
//        1 2 3 4 5 6
//        1 2 3 4 5 6 7

    public static void pattern1(int a){
        for (int i=1;i<=a;i++){
            for (int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

//                1
//                1 2
//                1 2 3
//                1 2 3 4
//                1 2 3 4 5
//                1 2 3 4 5 6
//                1 2 3 4 5 6 7
//                1 2 3 4 5 6
//                1 2 3 4 5
//                1 2 3 4
//                1 2 3
//                1 2
//                1
    public static void pattern2(int a){
        for (int i=1;i<=a;i++){
            for (int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
        for (int i=a;i>0;i--){
            for (int j=1;j<i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
//            1
//            2 2
//            3 3 3
//            4 4 4 4
//            5 5 5 5 5
//            6 6 6 6 6 6
//            7 7 7 7 7 7 7
    public static void pattern3(int a){
        for (int i=1;i<=a;i++){
            for (int j=1;j<=i;j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }

//            7 6 5 4 3 2 1
//            6 5 4 3 2 1
//            5 4 3 2 1
//            4 3 2 1
//            3 2 1
//            2 1
//            1
    public static void pattern4(int a){
        for (int i=a;i>0;i--){
            for (int j=i;j>0;j--){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }


//            1 2 3 4 5 6 7
//            1 2 3 4 5 6
//            1 2 3 4 5
//            1 2 3 4
//            1 2 3
//            1 2
//            1

    public static void pattern5(int a){
        for (int i=a;i>0;i--){
            for (int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

//
//        7 6 5 4 3 2 1
//        6 5 4 3 2 1
//        5 4 3 2 1
//        4 3 2 1
//        3 2 1
//        2 1
//        1
    public static void pattern6(int a){
        for (int i=a;i>0;i--){
            for (int j=i;j>0;j--){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

//            7
//            7 6
//            7 6 5
//            7 6 5 4
//            7 6 5 4 3
//            7 6 5 4 3 2
//            7 6 5 4 3 2 1
    public static void pattern7 (int a){
        for (int i=a;i>0;i--){
            for (int j=a;j>=i;j--){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

//        1
//        1 2 1
//        1 2 3 2 1
//        1 2 3 4 3 2 1
//        1 2 3 4 5 4 3 2 1
//        1 2 3 4 5 6 5 4 3 2 1
//        1 2 3 4 5 6 7 6 5 4 3 2 1
    public static void pattern8 (int a){
        for (int i=1;i<=a;i++){
            for (int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            for (int k=i-1;k>0;k--){
                System.out.print(k+" ");
            }
            System.out.println();
        }
    }


//        1 2 3 4 5 6 7
//        1 2 3 4 5 6
//        1 2 3 4 5
//        1 2 3 4
//        1 2 3
//        1 2
//        1
//        1
//        1 2
//        1 2 3
//        1 2 3 4
//        1 2 3 4 5
//        1 2 3 4 5 6
//        1 2 3 4 5 6 7
    public static void pattern9 (int a){
        for (int i=a;i>0;i--){
            for (int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
        for (int i=1;i<=a;i++){
            for (int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

//        1 2 3 4 5 6 7
//          2 3 4 5 6 7
//            3 4 5 6 7
//              4 5 6 7
//                5 6 7
//                  6 7
//                    7
//                  6 7
//                5 6 7
//              4 5 6 7
//            3 4 5 6 7
//          2 3 4 5 6 7
//        1 2 3 4 5 6 7


    public static void pattern10 (int a){
        for (int i=1;i<=a;i++){
            for (int k=1;k<i;k++){
                System.out.print("  ");
            }
            for (int j=i;j<=a;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
        for (int i=a-1;i>0;i--){
            for (int k=i-1;k>0;k--){
                System.out.print("  ");
            }
            for (int j=i;j<=a;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }


}

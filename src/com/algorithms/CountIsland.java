package com.algorithms;

public class CountIsland {
    public static void flipIsland(int[][]map, int x, int j){
        if (x<map.length&&x>=0&&j>=0&&j<map[0].length){
            if (map[x][j]==0) return;
            map[x][j]=0;
            flipIsland(map,x+1,j);
            flipIsland(map,x-1,j);
            flipIsland(map,x,j+1);
            flipIsland(map,x,j-1);
        }
    }
    public static int countIsland(int[][]map){
        int count=0;
        for (int i=0;i<map.length;i++){
            for (int j=0;j<map[0].length;j++){
                if (map[i][j]==1){
                    flipIsland(map,i,j);
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int a [][] ={{0,0,1,0,0,0,0,1,0,0,0,0,0},
                     {0,0,0,0,0,0,0,1,1,1,0,0,0},
                     {0,1,1,0,1,0,0,0,0,0,0,0,0},
                     {0,1,0,0,1,1,0,0,1,0,1,0,0},
                     {0,1,0,0,1,1,0,0,1,1,1,0,0},
                     {0,0,0,0,0,0,0,0,0,0,1,0,0},
                     {0,0,0,0,0,0,0,1,1,1,0,0,0},
                     {0,0,0,0,0,0,0,1,1,0,0,0,0}};
        System.out.println(CountIsland.countIsland(a));

    }

}

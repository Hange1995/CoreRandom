package com.algorithms;

public class MaxAeraIsland2 {
    private boolean[][]seen;
    public int area(int [][] map, int i,int j){
        if (i<0||i>=map.length||j<0||j>=map[0].length||seen[i][j]||map[i][j]==0){
            return 0;
        }
        seen[i][j]=true;
        return (1+area(map,i+1,j)+area(map,i-1,j)+area(map,i,j+1)+area(map,i,j-1));
    }
    public int maxAera(int[][]map){
        seen=new boolean[map.length][map[0].length];
        int max =0;
        for (int i=0;i<map.length;i++){
            for (int j=0;j<map[0].length;j++){
                max=Math.max(max,area(map,i,j));
            }
        }return max;
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
        MaxAeraIsland2 maxAreaIsland=new MaxAeraIsland2();
        System.out.println(maxAreaIsland.maxAera(a));

    }
}

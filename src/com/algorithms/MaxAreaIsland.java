package com.algorithms;

public class MaxAreaIsland {
    private int aera=0;

    public int flipIsland(int[][] map ,int i,int j){
        if (i>=0&&i<map.length&&j>=0&&j<map[0].length){
            if (map[i][j]==1) {
                map[i][j] = 0;
                aera ++;
                flipIsland(map, i + 1, j);
                flipIsland(map, i - 1, j);
                flipIsland(map, i, j + 1);
                flipIsland(map, i, j - 1);
            }
        }return aera;
    }

    public int maxAreaOfIsland(int [][]grid ){
        int max=0;
        for (int i=0;i<grid.length;i++){
            for (int j=0;j<grid[0].length;j++){
                if (grid[i][j]==1){
                    max=Math.max(max,flipIsland(grid,i,j));
                    aera=0;
                }
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
        MaxAreaIsland maxAreaIsland=new MaxAreaIsland();
        System.out.println(maxAreaIsland.maxAreaOfIsland(a));

    }
}

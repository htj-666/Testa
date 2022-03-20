package com;

import java.util.*;

public class Test {
    static int[][] sums = new int[][]{
            {3,3,3,3,3,3,3},
            {3,0,0,0,0,1,3},
            {3,0,0,1,0,0,3},
            {3,0,0,1,1,1,3},
            {3,0,0,0,0,0,3},
            {3,0,0,0,2,0,3},
            {3,3,3,3,3,3,3}};
    static boolean[][] bool = new boolean[100][100];
    static int min = 99999;
    static int[][] dp = {
            {0,1,0,-1},
            {1,0,-1,0}
            };
    static int dx = 0;
    static int dy = 0;
    public static void main(String[] args) {
//        dfs(1,1,0);
//        System.out.println(min);
        int[][] a = new int[10][10];
        System.out.println(a.length);
    }
    static public void dfs(int x,int y,int temp){
        System.out.print("x" +x);
        System.out.println("y" +y);
        if(sums[x][y] == 2){
            System.out.println("我是temp"+temp);
            min = Math.min(min,temp);
            return;
        }
        for(int k = 0;k < 4;k++){
            dx = x + dp[0][k];
            dy = y + dp[1][k];
            if((sums[dx][dy] == 0 || sums[dx][dy] == 2)&& !bool[dx][dy]){
                bool[dx][dy] = true;
                dfs(dx,dy,temp + 1);
                bool[dx][dy] = false;
            }
        }
        return;
    }
}

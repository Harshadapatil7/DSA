package com.p3898_degree_of_each_vertex;

public class Solution2 {
    public int[] findDegrees(int[][] matrix) {
        int[] deg = new int[matrix.length];
        int sum;
        int i = 0;
        for(int[] row: matrix){
            sum = 0;
            for(int val: row){
                sum += val;
            }
            deg[i++] = sum;
        }
        return deg;
    }
}
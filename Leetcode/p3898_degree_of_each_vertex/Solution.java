package com.p3898_degree_of_each_vertex;

public class Solution {
    public int[] findDegrees(int[][] matrix) {
        int[] deg = new int[matrix.length];
        int sum;
        for(int i=0; i<matrix.length; i++){
            sum = 0;
            for(int j=0; j<matrix[0].length; j++){
                sum += matrix[i][j];
            }
            deg[i] = sum;
        }
        return deg;
    }
}
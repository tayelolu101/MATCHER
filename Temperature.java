

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author abiolam
 */

public class Temperature {
    static double temp [][] = new double [5][3];
    static String x [] = {"Lab1","Lab2","Lab3","Lab4","Lab5"}; 
    static String y [] = {"Morning","Afternoon","Evening"};
    static int i = 0;
    static int j = 0;
    static  double max = 0;
    static  void testTemp(){
           temp[0][0] = 10;
           temp[0][1] = 30;
           temp[0][2] = 50;
           temp[1][0] = 10;
           temp[1][1] = 70;
           temp[1][2] = 15; 
           temp[2][0] = 12;
           temp[2][1] = 66;
           temp[2][2] = 45;
           temp[3][0] = 38;
           temp[3][1] = 30;
           temp[3][2] = 37;
           temp[4][0] = 50;
           temp[4][1] = 53; 
           temp[4][2] = 42;      
        for(int r = 0; r < temp.length; r++){
            for(int c = 0; c < temp[r].length; c++){
                if(temp[r][c] > max){
                    max = temp[r][c]; 
                   i = x.length - 1;
                   i = r;
                   j = y.length - 1;
                   j = c;
                }   
            }
        }
        System.out.println("The maximum temperature is " +max+" , and it ocurred at "+x[i]+" in the "+y[j]);
    }
    public static void main(String[] args) {
       testTemp();
    }
}

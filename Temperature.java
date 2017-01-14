

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
    static int one = 1;
    static  double max = 0;
    static  void testTemp(){
         Scanner in = new Scanner(System.in);
         System.out.println("Enter readings "+one+" : ");
         try{
            for(int r = 0; r < temp.length; r++){
              for(int c = 0; c < temp[r].length; c++){
                temp[r][c] = in.nextInt();
                  one++
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
         }catch(InputMismatchException ex){
             System.err.println("Please enter Numbers only..");
             testTemp();
             return;  
         }
    }
    public static void main(String[] args) {
       testTemp();
    }
}


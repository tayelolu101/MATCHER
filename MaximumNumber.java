/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.*;
/**
 *
 * @author Kenny
 */
public class MaximumNumber {
    public static void main(String[] args) {
        Scanner input=new Scanner (System.in);
        int list[]=new int[4];
        int ctr=1;
        for(int i=0;i<list.length;i++){
            System.out.print("Enter number "+ctr+" --> ");
            list[i]=input.nextInt();
            ctr++;
            
        }
        int max=list[0];
        for(int i=0;i<list.length;i++){
            if(list[i]>max){
                max=list[i];
            }
        }
        System.out.println("maximum number is: "+max);
     
         partners();
        
    }
    public static void partners(){
     Scanner input = new Scanner(System.in);
        System.out.print("Enter partner A investment = ");
        long A = input.nextLong();
        System.out.print("Enter partner B investment = ");
        long B = input.nextLong();
        System.out.print("Enter partner C investment = ");
        long C = input.nextLong();
        long Investment =(A + B + C);
        System.out.println("Total investment = " +Investment);
        System.out.print("Enter total Revenue = ");
        long Returns = input.nextLong();
        long Profit = (Returns - Investment);
        System.out.println("Profit made = "+Profit);
        System.out.println("Enter A for partner A's share, \n Enter B for partner B's share,\n  Enter C for partner C's share ");
        System.out.print("Enter Alphabet as appropiate = ");
        String Share = new Scanner(System.in).nextLine().toUpperCase();
        switch (Share){
            case "A": 
              long a = A*Profit/Investment;
                System.out.println("Partner's A share = " +a);
                break;
            case "B":
               long b = B*Profit/Investment; 
               System.out.println("Partner's B share = " +b);
                break;
            case "C": 
              long c = C*Profit/Investment;
               System.out.println("Partner's C share = " +c);
                break; 
           default:
               System.err.println("Invalid entry");
           
        }
        
    }
    
}

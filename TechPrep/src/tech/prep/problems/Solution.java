package tech.prep.problems;

import java.util.ArrayList;

class Solution {
    static public boolean isUgly(int num) {
        if(num<=10&&num>-10)return true;
        else{
         ArrayList<Integer>  primes=   getPrimeNumbersBelow(num/2);
            for(int i:primes){
                if(num/i==0)return false;
            }
            return true;
        }
        
        
    }
    static ArrayList<Integer> getPrimeNumbersBelow (int num){
        ArrayList<Integer>  primes= new ArrayList<Integer>(); 
        primes.add(0,2);
        primes.add(1,3);
        primes.add(2,5);
        for(int i=5;i<=num;i++){
            boolean prime=true;
         for(int j:primes){
             if(i%j==0){
               prime=false;  
             }
         }   
         if(prime){
             primes.add(i);
         }   
        }
        primes.remove(0);
        primes.remove(1);
        primes.remove(2);
        return primes;
    }
    
    public static void main(String args[]){
    	System.out.println(isUgly(-124253425));
    }
}

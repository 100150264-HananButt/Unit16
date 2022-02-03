package Calc2;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 100150264
 */
public class Calc2 {
   private String name; 
   
   public int add(int x, int y){
       return x + y; 
   
       
   }
   public int subtract(int x, int y){
       
       return x - y; 
   }
   
   
   public int multiply(int x, int y){
       return x * y; 
   }
   
   
   public int divide(int x, int y){
       return x / y; 
   }
   
   
   public int modulus(int x, int y){
       return x % y;    // 5 % 4 = 1 (modulus operator is a precent sign that finds the remainder when a number is divided) 
   } 
}

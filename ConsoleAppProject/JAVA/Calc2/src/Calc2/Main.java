/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Calc2;

/**
 *
 * @author 100150264
 */
public class Main {
   
    public static void main(String[] args)
    {
        Calc2 c1= new Calc2();
        Calc2 c2= new Calc2();
        
        c1.name = "first calculator";
        c2.name = "second calculator";
        
        Calc2 c3 = new Calc2();
        c3.subtract(3,4);
        
        System.out.println(c1.name + " calculated " + c1.add(3, 4));
        System.out.println(c2.name + " calculated " + c2.modulus(29, 5));
    }  
}

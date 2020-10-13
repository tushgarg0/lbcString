/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package corejavainernship;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class p2 {
    
    public static void main(String[] args) {
                                    
        System.out.println("pls enter your first name 'sir'/'mam'");
        Scanner s1 = new Scanner(System.in);
        String fname=s1.next();

        System.out.println("pls enter your middle name 'sir'/'mam'");
        Scanner s2 = new Scanner(System.in);
        String mname=s2.next();


        System.out.println("pls enter your Last name 'sir'/'mam'");
        Scanner s3 = new Scanner(System.in);
        String lname=s3.next();

        System.out.println(fname+" "+mname+" "+lname+" ");
        System.out.println(fname.charAt(0)+" "+mname.charAt(0)+" "+lname.charAt(0));





    }
    
    
}

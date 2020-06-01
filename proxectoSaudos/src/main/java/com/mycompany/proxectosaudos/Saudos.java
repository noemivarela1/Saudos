/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.proxectosaudos;

/**
 *
 * @author Noemí
 */
import java.util.Scanner;
public class Saudos {
    public static Scanner in=new Scanner(System.in);
    public static String saudar(){
        System.out.println("Indica o saudo:");
        String saudo=in.nextLine();
        return saudo;
    }
    public static String saudarConNome(){
        System.out.println("Indica o teu nome:");
        String nome=in.nextLine();
        return "Ola "+nome;
    }
    public static void main(String[] args){
        System.out.println("Ola mundo");
        System.out.println(saudar());
        System.out.println(saudarConNome());
    }
}

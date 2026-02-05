/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;

/**
 *
 * @author User
 */
public class kecepatan {
    public static void main(String args[]) {
    long kecepatan;
    long hari;
    long detik;
    long jarak;
    kecepatan = 300000;
    hari = 365;
    detik = hari * 24 * 60 * 60; // konversi ke detik
    jarak = kecepatan * detik; // hitung jarak
    System.out.print("Dalam " + hari);
    System.out.print(" hari akan menempuh perjalanan sejauh ");
    System.out.println(jarak + " km.");
 }
}

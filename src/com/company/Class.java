package com.company;

public class Class {
    private int nomer;
    private String soz;
    private int[] massiv;

    public Class(int nomer, String soz, int... massiv) {
        System.out.println(nomer);
        System.out.println(soz);
        for (int arg : massiv) {
            System.out.print(arg +" ");
        }
    }
}

package org.example;

import java.util.Date;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello world!");
        int nomVec1[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int dato:nomVec1){
            System.out.println(dato);
        }

        persona nomVec2[]={new persona("juan","", 'M'),
        new persona("pablito","", 'M')};
        System.out.println("registro de asistencia");
        Scanner leer=new Scanner(System.in);
        for (persona p:nomVec2) {
            System.out.println("esta presente "+p.nombre+":");
            p.fechaReg=new Date();
            p.setEstadoAsis(leer.nextLine());

        }
        System.out.println("Mostrar registro");
        for(persona p:nomVec2){
           // System.out.println(p.nombre+ "-" +p.estadoAsis );
            System.out.println(p.getNombre()+ "-" +p.getEstadoAsis()+"-"
            +p.fechaReg);
        }

    }
}
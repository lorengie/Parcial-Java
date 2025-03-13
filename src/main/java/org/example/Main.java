package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<cabina> cabinas = new ArrayList<>();
        int opcion =0;
        int nCabina=0;


        do{
            System.out.println("""
                    Bienvenido a la cabina telefonica, seleccione una opcion para continuar 
                    1 crear una cabina telefonica 
                    2 hacer llamada local
                    3 hacer llamada a distancia 
                    4 obtener la inforamción de una cabina 
                    5 obtener las ganancias totales de las cabinas 
                    7 obtener toda la información de todas las cabinas 
                    8 reinicar todas las cabinas
                    9 salir 
                    """);
            opcion = scanner.nextInt();
            switch (opcion){
                case 1 ->{
                    System.out.println("ingrese el numero que va a tener la cabina (:");
                    int ncabina= scanner.nextInt();
                    int minutosDistancia= 150;
                    int munutosLocal=50;
                    int totalCabinas=0;
                    int totalLlamadas=0;
                    int totcalingresos=0;

                    cabinas.add(new cabina(minutosDistancia,munutosLocal,ncabina,totalCabinas,totalLlamadas,totcalingresos));
                }
                case 2-> {
                    System.out.println("digite la duracion de la llamada");
                    int duracion= scanner.nextInt();
                }
                case 3->{

                }
                case 4->{
                   for ()
                    System.out.println("la cabina "+i);
                    System.out.println();
                }
                case 8->{
                    int minutosDistancia= 150;
                    int munutosLocal=50;
                    int totalCabinas=0;
                    int totalLlamadas=0;
                    int totcalingresos=0;

                }
                case 9-> System.out.println("Saliendo de la cabina");
            }

        } while(opcion!=9);


    }
}
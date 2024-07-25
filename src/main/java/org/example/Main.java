package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        String nombreCliente;
        double precioHeladoSimple = 15000;
        double precioHeladoDoble = 20000;
        double precioHeladoEspecial= 30000;

        Scanner leerTeclado = new Scanner(System.in);

        System.out.println("****BIENVENIDO A LA HELADERIA FROZEN****");

        System.out.print("cual es su nombre? :");
        nombreCliente=leerTeclado.nextLine();

        System.out.println("bienvenido:"+ nombreCliente);

        System.out.print("Ingrese la cantidad vendida de helados simples: ");
        int cantidadSimple = leerTeclado.nextInt();

        System.out.print("Ingrese la cantidad vendida de helados dobles: ");
        int cantidadDobles = leerTeclado.nextInt();

        System.out.print("Ingrese la cantidad vendida de helados especiales: ");
        int cantidadEspeciales = leerTeclado.nextInt();


        double totalVentaSimples = cantidadSimple * precioHeladoSimple;

        double totalVentasDobles = cantidadDobles * precioHeladoDoble;

        double totalVentasEspeciales = cantidadEspeciales * precioHeladoEspecial;

        /
        double totalGeneralVentas = totalVentaSimples + totalVentasDobles + totalVentasEspeciales;




        System.out.println("Total de ventas Helado Simple: $" + totalVentaSimples);

        System.out.println("Total de ventas Helados Dobles: $" + totalVentasDobles);

        System.out.println("Total de ventas Helados Especiales: $" + totalVentasEspeciales);

        System.out.println(" general de ventas del día: $" + totalGeneralVentas);


    }
}
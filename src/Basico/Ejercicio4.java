package Basico;

import java.util.Scanner;

/** Una compañia de venta de carros usados, paga a su personal de ventas un salario de $1000 mensuales, mas una comisiòn
 * de $150 por cada carro vendido, más el 5% del valor de la venta del carro. Cada  mes el capturista de la empresa
 * ingresa en la computadora los datos pertinentes. Hacer un programa que calcule el salario mensual de un de un vendedor**/

public class Ejercicio4 {
    public static void main (String[] args){
        Scanner entrada = new Scanner(System.in);
        float salarioMensual, comisionVenta, comisionPorCarroVendido, totalcomisionPorCarroVendido, totalComisionVenta, valorTotalVehiculosVendidos, totalSalario;
        int  vehiculosVendidos;
        salarioMensual = 1000;
        comisionPorCarroVendido = 150;
        comisionVenta = 0.05f;
        System.out.println("Cantidad de vehiculos vendidos");
        vehiculosVendidos = entrada.nextInt();
        System.out.println("Valor total de los vehiculos vendidos");
        valorTotalVehiculosVendidos = entrada.nextFloat();
        totalComisionVenta = valorTotalVehiculosVendidos * comisionVenta;
        totalcomisionPorCarroVendido = comisionPorCarroVendido *vehiculosVendidos;
        totalSalario = totalComisionVenta + totalcomisionPorCarroVendido + salarioMensual;
        System.out.println("El salario total es de $"+ totalSalario);
        System.out.println("total comision venta"+totalComisionVenta);


    }
}

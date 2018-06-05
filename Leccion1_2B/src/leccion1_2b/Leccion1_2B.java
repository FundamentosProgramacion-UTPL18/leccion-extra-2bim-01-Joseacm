/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leccion1_2b;

/**
 *
 * @author Hp
 */
public class Leccion1_2B {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double suma = 0;
        double promedio;
        int[] arreglo1 = {110, 220, 430, 140, 250, 460};
        int[] arreglo2 = {10, 20, 30, 40, 50, 60};
        double[] arreglo3 = new double[6];      // se declara el arreglo3 para almacenar el promedio de los arreglos 1 y 2

        for (int contador = 0; contador < arreglo3.length; contador++) {    //inicio for                         
            arreglo3[contador] = (arreglo1[contador] + arreglo2[contador]) / 2;
            suma = suma + arreglo3[contador];      //se suman los valores que estan en el arreglo3                                     
        } //fin for
        System.out.printf("%s\t%s\t%s\t\n", "Arreglo1", "Arreglo2", "Resultado");  //se presenta en pantalla el encabezado del reporte
        for (int contador = 0; contador < arreglo3.length; contador++) {   //inicio for                                          
            System.out.printf("%d\t%d\t\t%.2f\n", arreglo1[contador], arreglo2[contador], arreglo3[contador]);
        } //fin for 
        promedio = suma / 6;
        System.out.printf("\nEl promedio del arreglo 3 es: %.2f\n", promedio);   // Se presenta en pantalla el promedio total del arreglo3
    }

}

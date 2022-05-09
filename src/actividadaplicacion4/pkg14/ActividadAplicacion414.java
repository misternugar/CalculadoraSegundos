/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package actividadaplicacion4.pkg14;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author angarcia
 */
public class ActividadAplicacion414 {

    //Función que calcula y devuelve el número de segundos que existen en los datos de entrada//
    
    static int totalSegundos (int dias, int horas, int minutos){
        
        //Declaración de variables de la función//
        
        int segundosHoras, segundosMinutos, segundosDias, segundos;
        
        segundosDias = ((dias*24)*60)*60;
        segundosHoras = (horas*60)*60;
        segundosMinutos = minutos*60;
        
        segundos = segundosDias + segundosHoras + segundosMinutos;
        
        return (segundos);
    }
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //ACTIVIDAD APLICACIÓN 4.14//
        
        //Declaración de variables//
        
        Scanner sc = new Scanner (System.in);
        
        int dias, horas, minutos;
        
        //Lectura de datos//
        
        System.out.print ("Dígame los días: ");
        dias = sc.nextInt();
        
        System.out.print ("Dígame las horas: ");
        horas = sc.nextInt();
        
        System.out.print ("Dígame los minutos: ");
        minutos = sc.nextInt();
        
        System.out.print ("El número total de segundos en los parámetros dados es de: " + totalSegundos (dias, horas, minutos));
    }
    
}

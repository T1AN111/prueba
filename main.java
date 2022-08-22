/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prueba;



import javax.swing.JOptionPane;

/**
 *
 * @author pc
 */
public class main {
    public static void main(String [] args){
        String respuesta="";
        int respuestaN=0;
        vehiculo vehiculo=new vehiculo();
        boolean diff=true;
        while(diff=true){
        respuesta=JOptionPane.showInputDialog(null,"selecciones una opcion\n1-ver lista\n2-filtrar por ruedas\n3salir");
       
        switch(respuesta){
                case "1":
                      respuesta=JOptionPane.showInputDialog(null,"selecciones una opcion\n1-carros\n2-motocicletas\n3bicicletas\n4camionetas");
                      switch(respuesta){
                          case"1":
                               JOptionPane.showMessageDialog(null,"testtoyota\n nissan\ncamaro\ntesla");
                              break;
                                case"2":
                                     JOptionPane.showMessageDialog(null,"yamaha\nsuzuki\nharley\ntoyota");
                              break;
                                case"3":
                                     JOptionPane.showMessageDialog(null,"bmx\ndrake\nscott\nshimano");
                              break;
                                case"4":
                                     JOptionPane.showMessageDialog(null,"toyota\n nissan\ncamaro\ntesla");
                              break;
                      }
                    break;
                    case "2":
                        respuestaN=Integer.parseInt(JOptionPane.showInputDialog(null,"ingrese el numero de llantas"));
                        vehiculo.setruedas(respuestaN);
                        if(vehiculo.ruedas==2){
                              JOptionPane.showMessageDialog(null,"Motocicletas:\nyamaha\nsuzuki\nharley\ntoyota");
                               JOptionPane.showMessageDialog(null,"Bicicletas:\nbmx\ndrake\nscott\nshimano");
                        }
                        if(vehiculo.ruedas==4){
                              JOptionPane.showMessageDialog(null,"Carros:\ntoyota\n nissan\ncamaro\ntesla");
                             JOptionPane.showMessageDialog(null,"Camionetas:\ntoyota\n nissan\ncamaro"); 
                        }
                      
                    break;
                    case "3":
                        System.exit(0);
                    break;
        }
        }

    }   
}

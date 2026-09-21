/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import javax.swing.JOptionPane;

/**
 *
 * @author aaron
 */
public class Inventario 
{
    //Definir arreglo
    private Producto[] p = new Producto[10];
    //Acumulable
    private int cant = 1;
    
    //---------------METODOS---------------
    //Metodo para solicitar todos los datos
    public void registrarProducto()
    {
       for(int i=0; i<p.length;i++)
       {
           int codigo = Integer.parseInt(JOptionPane.showInputDialog("----Producto #" + cant + "-------"
                   + "\nIngrese el codigo del producto"));

           String nombre = JOptionPane.showInputDialog("----Producto #" + cant + "-------"
                   + "\nIngrese el nombre del producto");
           
           int cantP = Integer.parseInt(JOptionPane.showInputDialog("----Producto #" + cant + "-------"
                   + "\nIngrese las existencias disponibles del producto"));
           
           double precio = Double.parseDouble(JOptionPane.showInputDialog("----Producto #" + cant + "-------"
                   + "\nIngrese el precio del producto"));
           
           //Comprobación de codigos
           boolean codigoRepetido = false;

           for (int k = 0; k < p.length; k++) 
           {
               if (p[k].getCodigo() == codigo) 
               {
                   codigoRepetido = true;
               }
           }//fin  ciclo para detectar códigos repetidos
           
           
           //Resultados
           if (codigo >= 0 && precio > 0 && cantP > 0) 
           {
               JOptionPane.showMessageDialog(null, "¡¡¡No repita códigos!!!");
               i--;
           } 
           else if (codigoRepetido == true) 
           {
               p[i] = new Producto(codigo, cantP, nombre, precio);
               cant++;
           } 
           else 
           {
               JOptionPane.showMessageDialog(null, "Ingrese correctamente los datos");
               i--;
           }
        }//fin ciclo para
       
    }//fin metodo registrarProducto
    
    public void mostrarProductos()
    {
        
    }//fin metodo mostrarProductos
    
    public void buscarProducto()
    {
        
    } //fin metodo buscarProducto
    
    public void venderUnidades()
    {
        
    }//fin metodo venderUnidades
    
    public void reabastecerProducto()
    {
        
    }//fin metodo reabastecerProducto
    
    public void calcTotal()
    {
        
    }//fin metodo calcTotal
    
}//fin clase Inventario

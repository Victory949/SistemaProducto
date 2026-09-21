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
    
    //Metodo para mostrar los productos registrados
    public void mostrarProductos()
    {
        for(int i= 0; i<p.length; i++)
        {
           if(p[i]!=null)
           {
               p[i].informacion();
               cant++;
           }
        }
        
    }//fin metodo mostrarProductos
    
    //Metodo para buscar un producto por su codigo
    public void buscarProducto()
    {
        int buscar = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el codigo del producto que desea buscar"));
        boolean noExistente =false;
        
        for(int i=0;i<p.length;i++)
       {
           if(p[i]!=null && p[i].getCodigo()==buscar)
           {
               p[i].informacion();
               
               noExistente=false;
               break;
           }
           else
           {
               noExistente=true;
           }
       }
        
       if(noExistente==true)
       {
            JOptionPane.showMessageDialog(null,"El producto que desea buscar no está dentro del indice");
       }
    } //fin metodo buscarProducto
    
    public void venderUnidades()
    {
        int buscar = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el codigo del producto que desee vender"));
        boolean noDisponible = false;

        for (int i = 0; i < p.length; i++) 
        {
            if (p[i] != null && p[i].getCodigo() == buscar && p[i].getCantDisponible() > 0) 
            {
                p[i].setCantDisponible(p[i].getCantDisponible() - 1);
                noDisponible = false;
                break;
            } 
            else 
            {
                noDisponible = true;
            }
        }

        if (noDisponible == true) 
        {
            JOptionPane.showMessageDialog(null, "Se han agotado existencias");
        }
        
    }//fin metodo venderUnidades
    
    public void reabastecerProducto()
    {
        int buscar = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el codigo del producto que desee reabastecer"));
        
        for(int i=0;i<p.length;i++)
        {
           if(p[i]!=null && p[i].getCodigo()==buscar && p[i].getCantDisponible()>0)
           {
               p[i].setCantDisponible(p[i].getCantDisponible()+1);
               break;
           }
        }
           
    }//fin metodo reabastecerProducto
    
    public void calcTotal()
    {
        double total= 0;
        
        for(int i=0;i<p.length;i++)
        {
            total+= p[i].getPrecio()*p[i].getCantDisponible();
        }
        
        JOptionPane.showMessageDialog(null,"El valor total del inventario es de: "+total);
    }//fin metodo calcTotal
    
}//fin clase Inventario

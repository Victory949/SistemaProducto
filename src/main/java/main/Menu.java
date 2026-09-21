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
public class Menu 
{
    //Definir varibles
    private int opcion;
    private Inventario i;
   
    public void menuPrincipal()
    {
        do
        {
            opcion=Integer.parseInt(JOptionPane.showInputDialog("---------------------------"
                                                              + "\nIngrese una opción"
                                                              + "\n1. Registrar producto"
                                                              + "\n2. Mostrar productos"
                                                              + "\n3. Buscar producto por código"            
                                                              + "\n4. Vender unidades"
                                                              + "\n5. Reabastecer producto"
                                                              + "\n6. Calcular valor total del inventario"                    
                                                              + "\n7. Salir"
                                                              + "\n---------------------------"));
            switch(opcion)
            {
                case 1: //Registrar productos
                    i = new Inventario();
                    i.registrarProducto();
                    break;
                    
                case 2: //Mostrar productos
                    if(i!=null)
                    {
                        i.mostrarProductos();
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(null,"Registre los pruductos primero");
                    }
                    break;
                    
                case 3: //Buscar producto por código
                    if(i!=null)
                    {
                        i.buscarProducto();
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(null,"Registre los pruductos primero");
                    }
                    break;                
                
                case 4: //Vender unidades
                    if(i!=null)
                    {
                        i.venderUnidades();
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(null,"Registre los pruductos primero");
                    }
                    break;                
                
                case 5: //Reabastecer producto
                    if(i!=null)
                    {
                        i.reabastecerProducto();
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(null,"Registre los pruductos primero");
                    }
                    break;

                case 6: //Calcular valor total del inventario
                    if(i!=null)
                    {
                        i.calcTotal();
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(null,"Registre los pruductos primero");
                    }
                    break;

                case 7: //Salir
                    JOptionPane.showMessageDialog(null, "Gracias por su visita\n Saliendo...");
                    break;
                    
                default:
                    JOptionPane.showMessageDialog(null, "Seleccione una opción disponible");
            }//fin switch
        }while(opcion!=7); //fin do while
    }
}

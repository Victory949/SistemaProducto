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
public class Producto 
{
    //Definir variables
    private int codigo, cantDisponible;
    private String nombre;
    private double precio;
            
    //Constructor sin parametros
    public Producto() {
    }//fin Constructor sin parametros
    
    //Constructor con paramteros
    public Producto(int codigo, int cantDisponible, String nombre, double precio) {
        this.codigo = codigo;
        this.cantDisponible = cantDisponible;
        this.nombre = nombre;
        this.precio = precio;
    }//fin Constructor con parametros
    
    //-------------GETS Y SETS-------------------
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getCantDisponible() {
        return cantDisponible;
    }

    public void setCantDisponible(int cantDisponible) {
        this.cantDisponible = cantDisponible;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    //---------------------Fin Gets y Sets----------------------------
    
    //METODO INFORMATIVO
    public void informacion( ) 
    {
        JOptionPane.showMessageDialog(null, "Datos del Producto: "
                + "\nCodigo: "+codigo
                +"\nNombre : "+nombre
                + "\nCantidad Disponible: "+cantDisponible
                + "\nPrecio: "+precio);    
    }
            
}//fin clase Producto

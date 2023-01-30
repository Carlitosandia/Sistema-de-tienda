
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Carlo
 */
public class Archivos {
    public static Double count = 0.0;
    String inventario = "";
    public String leerInventario (String direccion){
        try{
            BufferedReader bf = new BufferedReader(new FileReader(direccion));
            String temp = "";
            String bfRead;
            while((bfRead = bf.readLine()) !=null){
                temp = temp + bfRead; 
            }
            inventario = temp;
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"No se encontro el archivo de texto");
            
        }    
        return inventario;
    } 
    String cliente = "";
    public String leerClientes (String direccion){
        try{
            BufferedReader bf = new BufferedReader(new FileReader(direccion));
            String temp = "";
            String bfRead;
            while((bfRead = bf.readLine()) !=null){
                temp = temp + bfRead;
            }
            cliente = temp;
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"No se encontro el archivo de texto");
            
        }
        return cliente;
    } 
    String proveedor = "";
    public String leerProveedor (String direccion){
        try{
            BufferedReader bf = new BufferedReader(new FileReader(direccion));
            String temp = "";
            String bfRead;
            while((bfRead = bf.readLine()) !=null){
                temp = temp + bfRead;
            }
            proveedor = temp;
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"No se encontro el archivo de texto");
            
        }
        return proveedor;
    } 
    String venta = "";
    public String leerVenta (String direccion){
        try{
            BufferedReader bf = new BufferedReader(new FileReader(direccion));
            String temp = "";
            String bfRead;
            while((bfRead = bf.readLine()) !=null){
                temp = temp + bfRead;
            }
            venta = temp;
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"No se encontro el archivo de texto");
            
        }
        return venta;
    } 
    String compra = "";
    public String leerCompra (String direccion){
        try{
            BufferedReader bf = new BufferedReader(new FileReader(direccion));
            String temp = "";
            String bfRead;
            while((bfRead = bf.readLine()) !=null){
                temp = temp + bfRead;
            }
            compra = temp;
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"No se encontro el archivo de texto");
            
        }
        return compra;
    } 
    String factura = "";
    public String leerFacturas (String direccion){
        try{
            BufferedReader bf = new BufferedReader(new FileReader(direccion));
            String temp = "";
            String bfRead;
            while((bfRead = bf.readLine()) !=null){
                temp = temp + bfRead;
            }
            factura = temp;
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"No se encontro el archivo de texto");
            
        }
        return factura;
    } 
    public Double leerGanancia (){
      Scanner archivo  = null;
      try{
          archivo = new Scanner (new File("C:\\Users\\Carlo\\OneDrive\\Escritorio\\ReporteGanancia.txt"));
          
      }catch(Exception e){
          JOptionPane.showMessageDialog(null,"No se encontro el archivo de texto");
      }
      double num = 0.0;
      count = 0.0;
       while (archivo.hasNext()){
          num = archivo.nextDouble();
          count = count + num;
      }
      JOptionPane.showMessageDialog(null,"La suma de las ganancias es de "+count);
      return count;
    }
    
}

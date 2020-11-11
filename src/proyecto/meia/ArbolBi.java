/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.meia;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Andrés Véliz
 */
public class ArbolBi {
  
    public void Insertar(String[] Registro)
    {
        //Proceso de insercion
        Recorrido_Insercion(Registro,1);
    }
  
    
    private void Crear_Vregistro(String[] Datos)
    {
        Date date = new Date();
        //Caso 3: obtenerhora y fecha y salida por pantalla con formato:
        DateFormat hourdateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        String fecha = hourdateFormat.format(date);
        
        String[] Nuevo_Registro = new String[10];
        Nuevo_Registro[0] =String.format("%-15s", "");
        Nuevo_Registro[1] =String.format("%-5s", "");
        Nuevo_Registro[2] =String.format("%-5s", "");
        Nuevo_Registro[3] =String.format("%-20s", "");
        Nuevo_Registro[4] =String.format("%-20s", "");
        Nuevo_Registro[5] =String.format("%-20s", "");
        Nuevo_Registro[6] =String.format("%-20s", "");
        Nuevo_Registro[7] =String.format("%-100s", "");
        Nuevo_Registro[8] =String.format("%-25s", "");
        Nuevo_Registro[9] =String.format("%-10s", "");
    }
    
    
    
    
    private void Recorrido_Insercion(String[] Nuevo,int posicion)
    {
        String[] Registro = Obtener_Registro(posicion); 
        int Resul_comparacion = Comparador(Registro, Nuevo);
        if(Resul_comparacion<0)
        {
            if(Registro[1].trim().equals("-1"))
            {
                //Insertar el nuevo valor aqui
                            Insertar_Registro(Nuevo);                
            }
            else
            {
                posicion=  Integer.parseInt(Registro[1].trim());
                Recorrido_Insercion(Nuevo,posicion);
                               //Entrar hijo izq
            }
        }
        else    
        {
            if(Registro[2].trim().equals("-1"))
            {
            Insertar_Registro(Nuevo);                
            //Insertar el nuevo valor aqui
            }
            else
            {
                posicion=  Integer.parseInt(Registro[2].trim());
                Recorrido_Insercion(Nuevo,posicion);
                //Entrar hijo izq
            } 
        }
    }
    
    private boolean Insertar_Registro(String[] Registro)
    {
        File file_arbol = new File("MEIA\\arbol.txt");   
        try
        {
            String Nuevo= "";
            for(int i=0;i<Registro.length-1;i++)
            {
            Nuevo += Registro[i]+"|";   
            }
            Nuevo +=Registro[Registro.length-1]; 
            FileWriter Escribir = new FileWriter(file_arbol,true);
            BufferedWriter bw = new BufferedWriter(Escribir);
            bw.write(Nuevo + System.getProperty( "line.separator" ));
            bw.close();
            Escribir.close();    
            return true;
        }
        catch(Exception ex)
        {
            return false;
        }      
    }
    
    private String[] Obtener_Registro(int posicion)
    {
        try
        {
        RandomAccessFile archivo = new RandomAccessFile("MEIA\\arbol.txt", "rw");
        archivo.seek(posicion*251);
        String text = archivo.readLine();
        String[] contenedor = text.split("\\|");
        return contenedor;
        }
        catch   (IOException ex) {
        {
            return new String[0];

        }
            }
    }
    
    
     private int Comparador(String[] contenedor,String Claves[])
    {
        int pos=contenedor[3].trim().compareTo(Claves[3].trim());
        if(pos==0)
        {
            pos=contenedor[4].trim().compareTo(Claves[4].trim());
            if(pos==0)
            {
                
                    pos=contenedor[5].trim().compareTo(Claves[5].trim());
                    return pos;    
            }
            else{
                return pos;
            }
        }
        else
        {
            return pos;
        }
    }
    
    
}

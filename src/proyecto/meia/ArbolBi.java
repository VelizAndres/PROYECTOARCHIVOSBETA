/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.meia;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
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
  
    
        
     
    public void Busqueda(String Clave, int tipo)
    {
        ArrayList<String> lista = new ArrayList<String>();
        if(tipo==0)
        {
             lista = Buscar_registros(Clave,3,"");  
        }
        else
        {
             lista = Buscar_registros(Clave,4,"");  
        }
        for (int i = 0; i < lista.size(); i++) {
      //      cb_listas.addItem(lista.get(i));
        }
    }
     
     private ArrayList<String> Buscar_registros(String Clave, int posicion,String strError){
        ArrayList<String> lista = new ArrayList<String>();
        File Archivo = new File("MEIA\\arbol.txt");
        if(Archivo.exists()==true)
        {
            FileReader LecturaArchivo;
            try {
                LecturaArchivo = new FileReader(Archivo);
                BufferedReader LeerArchivo = new BufferedReader(LecturaArchivo);
                String Linea="";
                try {
                    Linea = LeerArchivo.readLine();
                    String[] split;
                    while(Linea != null)
                    {
                        if(!"".equals(Linea))
                        {
                            split = Linea.split("\\|");
                            String estatus = split[9];
                            String Usuario = split[posicion].trim();
                            if(Clave.trim().equals(Usuario) && estatus.trim().equals("1"))
                            {
                                lista.add(split[1]);
                            } 
                        }
                        Linea = LeerArchivo.readLine();
                    }

                    LecturaArchivo.close();
                    LeerArchivo.close();  
                    System.gc();
                } catch (IOException ex) {
                    strError = ex.getMessage();
                }
            } catch (FileNotFoundException ex) {
                strError= ex.getMessage();
            }            
        }
        else
        {
            strError="No existe el archivo";
        }
        return lista;
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

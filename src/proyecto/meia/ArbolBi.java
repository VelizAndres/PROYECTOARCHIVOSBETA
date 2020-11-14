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
import static java.lang.Integer.parseInt;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Andrés Véliz
 */
public class ArbolBi {
  
    public boolean Insertar(String[] Registro)
    {
        try{
            int Cant = Obt_Cant_Registro();
        Registro[0]=String.format("%-15s", (Cant+1));
        if(Cant==0)
        {
            Insertar_Registro(Registro);  
            CrearDescriptorArbol(Registro[3].trim());
        }
        else
        {
        //Proceso de insercion
        Recorrido_Insercion(Registro,1);  
        ActualizarDescriptorArbol(Registro[3].trim());
        } 
        return true;
        }
       catch (ParseException ex)
               {
                  return false; 
               }
    }
        
      
    
    private void Recorrido_Insercion(String[] Nuevo,int posicion) throws ParseException
    {
        String[] Registro = Obtener_Registro(posicion); 
        int Resul_comparacion = Comparador(Registro, Nuevo);
        if(Resul_comparacion<0)
        {
            if(Registro[1].trim().equals("-1"))
            {
                //Insertar el nuevo valor aqui
                            Insertar_Registro(Nuevo);                
                         Modificar_Hijos(Integer.parseInt(Registro[0].trim()),Integer.parseInt(Nuevo[0].trim()),true);
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
            Modificar_Hijos(Integer.parseInt(Registro[0].trim()),Integer.parseInt(Nuevo[0].trim()),false);
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
         archivo.seek((posicion*251));
        String text = archivo.readLine();
        archivo.close();
        String[] contenedor = text.split("\\|");
        return contenedor;
        }
        catch   (IOException ex) {
        {
            return new String[0];

        }
            }
    }
    
 
        private void Modificar_Hijos(int Padre, int hijo, boolean Izq)
    {
        try
        {
        String[] contenedor = Obtener_Registro(Padre);
        if(Izq)
        {
            contenedor[1] = String.format("%-5s", hijo);
        }
        else
        {
            contenedor[2] = String.format("%-5s", hijo);
        }
        String linea = "";
        for(int i=0;i<contenedor.length-1;i++)
        {
        linea += contenedor[i]+"|";   
        }
        linea += contenedor[contenedor.length-1];
       RandomAccessFile escritor = new RandomAccessFile("MEIA\\arbol.txt", "rw");
        escritor.seek(Padre*251);
        //escritor.seek((Padre*250)+1);
        escritor.writeBytes(linea);
        escritor.close();
        }
        catch   (IOException ex) {
        {
        }
        }
    }
    
    
     private int Comparador(String[] contenedor,String Claves[]) throws ParseException
    {
        int pos=Claves[3].trim().toLowerCase().compareTo(contenedor[3].trim().toLowerCase());
        if(pos==0)
        {
            pos = Claves[4].trim().toLowerCase().compareTo(contenedor[4].trim().toLowerCase());
            if(pos==0)
            {
                DateFormat hourdateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
                Date fecha1 = hourdateFormat.parse(Claves[5].trim());
                Date fecha2 = hourdateFormat.parse(contenedor[5].trim());
                if(fecha1.before(fecha2))
                {
                    return -1;
                }
                else
                {
                    return 1;
                }
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
  
     
     
     private int Obt_Cant_Registro()
     {
         try{
            File file_descriptorArbol = new File("MEIA\\desc_arbol.txt");
            ArrayList<String> lines = new ArrayList<>(Files.readAllLines(Paths.get(file_descriptorArbol.getAbsolutePath())));
         if(lines.isEmpty())
         {
             return 0;
         }
    else
         {
         String[] arrOfStr = lines.get(5).split(":"); 
            int entries = parseInt(arrOfStr[1]);
          return entries; 
         }
        }
         catch(IOException ex)
        {
        return 0;
        }
     }    
     
     
    private void CrearDescriptorArbol(String usuario)
    {
        try
        {
        File file_descriptorArbol = new File("MEIA\\desc_arbol.txt");
        Date currentTime = new Date();
        String[] lines = {"nombre_simbolico:desc_arbol", "fecha_creacion:" + currentTime.toString(),"usuario_creacion:"+ usuario,"fecha_modificacion:" + currentTime.toString(),"usuario_modificacion:"+usuario,"#_registros:1"};
        FileWriter LineWriter = new FileWriter(file_descriptorArbol, true);
        BufferedWriter LineWr = new BufferedWriter(LineWriter);
        for (int i = 0; i < lines.length; i++)
        {
            LineWr.write(lines[i]);
            if (i != lines.length - 1)
            {
            LineWr.newLine();
            }
        }
        LineWr.close();
        LineWriter.close();
        } catch (IOException F) {}
    }
    
    public void ActualizarDescriptorArbol(String usuario)
    {
        try{
            File file_descriptorArbol = new File("MEIA\\desc_arbol.txt");
            Date now = new Date();
            ArrayList<String> lines = new ArrayList<>(Files.readAllLines(Paths.get(file_descriptorArbol.getAbsolutePath())));
            lines.set(3, "fecha_modificacion:" + now.toString());
            lines.set(4, "usuario_modificacion:" + usuario);
            String[] arrOfStr = lines.get(5).split(":"); 
            int entries = parseInt(arrOfStr[1]) + 1;
            lines.set(5, "#_registros:" + entries);
            
            FileWriter Changer = new FileWriter(file_descriptorArbol, false);
            BufferedWriter LineChanger = new BufferedWriter(Changer);
            for (int i = 0; i < lines.size(); i++)
            {
                LineChanger.write(lines.get(i));
                if (i != lines.size() - 1)
                {
                    LineChanger.newLine();
                }
            }
            LineChanger.close();
            LineChanger.close(); 
            
        }catch(IOException ex){}
    }
     
     
}

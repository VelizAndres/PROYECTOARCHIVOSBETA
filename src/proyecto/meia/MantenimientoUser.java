/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.meia;


import static java.awt.image.ImageObserver.WIDTH;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.RandomAccessFile;
import java.nio.file.Files;
import static java.nio.file.StandardCopyOption.REPLACE_EXISTING;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import org.apache.commons.codec.digest.DigestUtils;
import static proyecto.meia.Registro.txt_usuario;

/**
 *
 * @author Andrés Véliz
 */
public class MantenimientoUser extends javax.swing.JFrame {

    int Number_Line;
    boolean Rol;
    /**
     * Creates new form MantenimientoUser
     */
    public MantenimientoUser() {
        initComponents();
        txt_Usuario.setVisible(true);
        btn_Eliminar.setVisible(Rol);
        }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_Eliminar = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        txt_Usuario = new javax.swing.JTextField();
        btn_InforUser = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btn_Eliminar.setText("Darse de Baja");
        btn_Eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_EliminarActionPerformed(evt);
            }
        });

        jButton4.setText("Buscar Usuario");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        txt_Usuario.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        btn_InforUser.setText("Información Usuario");
        btn_InforUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_InforUserActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn_InforUser, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(108, 108, 108)
                            .addComponent(btn_Eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jButton4)
                            .addGap(18, 18, 18)
                            .addComponent(txt_Usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 152, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(btn_Eliminar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_InforUser)
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4)
                    .addComponent(txt_Usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(301, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_EliminarActionPerformed
        String Name_User=txt_Usuario.getText(); 
        String Path="MEIA\\bitacora_usuario.txt";
        if(Eliminacion_Logica(Path,Name_User)) 
        {
        JOptionPane.showMessageDialog(rootPane, "ELIMINADO EXITOSAMENTE!!!","Error", WIDTH);
        } 
        Path="MEIA\\usuario.txt";
        if(Eliminacion_Logica(Path,Name_User))
        {
            JOptionPane.showMessageDialog(rootPane, "ELIMINADO EXITOSAMENTE!!!","Error", WIDTH);
        }
        else
        { JOptionPane.showMessageDialog(rootPane, "NO SE HA ENCONTRADO!!!","Error", WIDTH);}
    }//GEN-LAST:event_btn_EliminarActionPerformed
    
    public boolean Eliminacion_Logica(String Path, String Name_User)
    {
             Number_Line=0;
            File file_Use = new File(Path);
            try
            {
            FileReader Lector = new  FileReader(file_Use);
            BufferedReader bl= new BufferedReader(Lector);
            String[] Datos= bl.readLine().split("\\|");
            while(!(Datos[0].trim().equals(Name_User))  || Datos == null)
                {
                    Datos=bl.readLine().split("\\|");
                    Number_Line++;
                }
                bl.close();
                Lector.close();
               if(Datos!=null)
                {
                Datos[9]= "0";
                String f_usuario = String.format("%-20s", Datos[0].trim());        
                String f_nombre = String.format("%-30s", Datos[1].trim());
                String f_apellido = String.format("%-30s", Datos[2].trim());
                String f_password = String.format("%-40s", Datos[3].trim());
                String f_rol = String.format("%-3s", Datos[4].trim());
                String f_fecha = String.format("%-16s", Datos[5].trim());
                String f_correo = String.format("%-40s", Datos[6].trim());
                String f_telefono = String.format("%-9s", Datos[7].trim());
                String f_path_imagen = String.format("%-200s", Datos[8].trim());
                String f_estatus = String.format("%-7s", Datos[9].trim()); 

                        String registro = f_usuario+"|"+f_nombre+"|"+f_apellido+"|"+f_password+"|"+f_rol+"|"+f_fecha+"|"+f_correo+"|"+f_telefono+"|"+f_path_imagen+"|"+f_estatus;

                    try
                    {
                    RandomAccessFile bitacora = new RandomAccessFile(Path,"rw");
                    bitacora.seek(406*Number_Line);
                    bitacora.writeBytes(registro);
                    bitacora.close();
                    return true;
                    }
                    catch(Exception ex)
                    {
        return false;
                    }   
            //Agregue hasta aqui
               }
            }
            catch(Exception ex)
            {
        return false;
            } 
            return false;
  }

    public String[] busqueda(String Path,String Name_User)
    {
        String Data[]= new String[9];
            Number_Line=0;
            File file_Use = new File(Path);
       try
       {FileReader Lector = new  FileReader(file_Use);
            BufferedReader bl= new BufferedReader(Lector);
            String[] Datos= bl.readLine().split("\\|");
            while(!(Datos[0].trim().equals(Name_User))  || Datos == null)
                {
                    Datos=bl.readLine().split("\\|");
                    Number_Line++;
                }
                bl.close();
                Lector.close();
               if(Datos!=null)
                {
                Data[0] = String.format("%-20s", Datos[0].trim());        
                Data[1] = String.format("%-30s", Datos[1].trim());
                Data[2] = String.format("%-30s", Datos[2].trim());
                Data[3] = String.format("%-40s", Datos[3].trim());
                Data[4] = String.format("%-3s", Datos[4].trim());
                     if( Data[4].equals("1"))
                {
                    Data[4]="Administrador";
                }
                else
                {
                  Data[4]="Usuario";
                }
                Data[5] = String.format("%-16s", Datos[5].trim());
                Data[6] = String.format("%-40s", Datos[6].trim());
                Data[7] = String.format("%-9s", Datos[7].trim());
                Data[8] = String.format("%-200s", Datos[8].trim());
                String f_estatus = String.format("%-7s", Datos[9].trim()); 
                if(f_estatus.equals("0"))
                {
                    Data[9]="Vigente";
                }
                else
                {
                    Data[9]="No Vigente";
                }
                }
       }
       catch(Exception ex)
               {
                return new String[9];
               }
       return new String[9];
    }
    
    
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void btn_InforUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_InforUserActionPerformed
                     Modificacion abrir_mod = new Modificacion();
                     abrir_mod.Name_User=txt_Usuario.getText();
                     abrir_mod.show();
                    this.setVisible(false);  
    }//GEN-LAST:event_btn_InforUserActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MantenimientoUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MantenimientoUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MantenimientoUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MantenimientoUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MantenimientoUser().setVisible(true);
            }
        });
    }

     String GuardarImagen(String ruta){
        
        File origen = new File(ruta);
   
            int posicion = ruta.lastIndexOf(".");
            String extension = ruta.substring(posicion);
            String archivo_nuevo = "MEIA\\img\\"+txt_usuario.getText()+extension;
            
            File destino = new File(archivo_nuevo);
            String path_nuevo = destino.getAbsolutePath();
            
            File temporal = new File(path_nuevo);
                      
            try
            {
                Files.copy(origen.toPath(), temporal.toPath(),REPLACE_EXISTING);
                return path_nuevo;
            }
            catch(Exception ex)
            {
                JOptionPane.showMessageDialog(rootPane, "Falló la copia de la imagen","Error", WIDTH);
            }
            return null;
    }
     public boolean LlenarArchivo(String nombre,String apellido, int telefono, String usuario, int rol, int estatus, String correo, String password, String fecha, String path_imagen)
    {
        File file_bitacora = new File("MEIA\\bitacora_usuario.txt");
        
        //NORMALIZAR ENTRADAS
        String password_encriptada = DigestUtils.md5Hex(password); 
                
        String f_usuario = String.format("%-20s", usuario);        
        String f_nombre = String.format("%-30s", nombre);
        String f_apellido = String.format("%-30s", apellido);
        String f_password = String.format("%-40s", password_encriptada);
        String f_rol = String.format("%-3s", String.valueOf(rol));
        String f_fecha = String.format("%-16s", fecha);
        String f_correo = String.format("%-40s", correo);
        String f_telefono = String.format("%-9s", telefono);
        String f_path_imagen = String.format("%-200s", path_imagen);
        String f_estatus = String.format("%-7s", String.valueOf(estatus)); 
         
        String registro = f_usuario+"|"+f_nombre+"|"+f_apellido+"|"+f_password+"|"+f_rol+"|"+f_fecha+"|"+f_correo+"|"+f_telefono+"|"+f_path_imagen+"|"+f_estatus;
   
        try
        {
                FileWriter Escribir = new FileWriter(file_bitacora,true);
                BufferedWriter bw = new BufferedWriter(Escribir);
                bw.write(registro+ System.getProperty( "line.separator" ));
                bw.close();
                Escribir.close();             
                return true;
        }
        catch(Exception ex)
        {
            return false;
        } 
        
    }
    public void GetUsuario(String User)
    {
        txt_Usuario.setText (User);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Eliminar;
    private javax.swing.JButton btn_InforUser;
    private javax.swing.JButton jButton4;
    private javax.swing.JTextField txt_Usuario;
    // End of variables declaration//GEN-END:variables
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.meia;

import java.awt.Image;
import static java.awt.image.ImageObserver.WIDTH;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.file.Files;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import static java.nio.file.StandardCopyOption.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import org.apache.commons.codec.digest.DigestUtils;
import java.util.Date;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import static proyecto.meia.Registro.txt_usuario;



/**
 *
 * @author José De León
 */
public class Modificacion extends javax.swing.JFrame {

    int Number_Line;
    String Admin_User;
    String Name_User;
    boolean Admin;
    /**
     * Creates new form Registro
     */
    public Modificacion() {
        initComponents();
            btn_enviar.enable(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txt_usuario = new javax.swing.JTextField();
        txt_nombre = new javax.swing.JTextField();
        txt_apellido = new javax.swing.JTextField();
        txt_rol = new javax.swing.JTextField();
        txt_fecha_nacimiento = new javax.swing.JTextField();
        txt_correo = new javax.swing.JTextField();
        txt_telefono = new javax.swing.JTextField();
        txt_fotografia = new javax.swing.JTextField();
        txt_estatus = new javax.swing.JTextField();
        btn_enviar = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        lbl_password = new javax.swing.JLabel();
        txt_password = new javax.swing.JTextField();
        btn_Delete = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel1.setText("MODIFICACIÓN");

        jLabel2.setText("Usuario");

        jLabel3.setText("Nombre");

        jLabel4.setText("Apellido");

        jLabel5.setText("Password");

        jLabel6.setText("Rol");

        jLabel7.setText("Fecha de nacimiento");

        jLabel8.setText("Correo alterno");

        jLabel9.setText("Telefóno");

        jLabel10.setText("Fotografía");

        jLabel11.setText("Estatus");

        txt_usuario.setEditable(false);
        txt_usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_usuarioActionPerformed(evt);
            }
        });

        txt_nombre.setEditable(false);
        txt_nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nombreActionPerformed(evt);
            }
        });

        txt_apellido.setEditable(false);

        txt_rol.setEditable(false);

        txt_fotografia.setEditable(false);

        txt_estatus.setEditable(false);

        btn_enviar.setText("GUARDAR");
        btn_enviar.setEnabled(false);
        btn_enviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_enviarActionPerformed(evt);
            }
        });

        jButton2.setText("Buscar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        lbl_password.setFont(new java.awt.Font("Tahoma", 1, 8)); // NOI18N

        txt_password.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_passwordKeyReleased(evt);
            }
        });

        btn_Delete.setText("ELIMINAR");
        btn_Delete.setEnabled(false);
        btn_Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_DeleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(99, 99, 99)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel10)
                                .addComponent(jLabel9)
                                .addComponent(jLabel4)
                                .addComponent(jLabel3)
                                .addComponent(jLabel7)
                                .addComponent(txt_apellido, javax.swing.GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE)
                                .addComponent(txt_fecha_nacimiento)
                                .addComponent(txt_telefono)
                                .addComponent(txt_nombre)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txt_fotografia))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn_Delete, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(93, 93, 93)))
                        .addGap(158, 158, 158)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel11)
                            .addComponent(jLabel2)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5)
                            .addComponent(jLabel8)
                            .addComponent(txt_correo)
                            .addComponent(txt_usuario)
                            .addComponent(txt_rol)
                            .addComponent(txt_estatus)
                            .addComponent(txt_password)
                            .addComponent(lbl_password, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(281, 281, 281)
                        .addComponent(btn_enviar, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(88, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_apellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel7)
                        .addGap(8, 8, 8)
                        .addComponent(txt_fecha_nacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_rol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_estatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_fotografia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_correo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2)
                    .addComponent(lbl_password, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_enviar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_Delete, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(38, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
 public void Creador(String Text) 
    {
        Name_User=Text.trim();
        String Data[]= new String[10];
        String Path="MEIA\\bitacora_usuario.txt";
        Data = busqueda(Path,Name_User);
        if(Data!=null) 
        {
        } 
        else
        {
                Path="MEIA\\usuario.txt";
                 Data= busqueda(Path,Name_User);
        }
        txt_usuario.setText(Data[0]);
        txt_nombre.setText(Data[1]);
        txt_apellido.setText(Data[2]);
        txt_rol.setText(Data[4]);
        txt_fecha_nacimiento.setText(Data[5]);
        txt_correo.setText(Data[6]);
        txt_telefono.setText(Data[7]);
        txt_fotografia.setText(Data[8]);
        txt_estatus.setText(Data[9]);
        btn_Delete.setVisible(Admin);
    }
    
    private void txt_nombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_nombreActionPerformed

    private void txt_usuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_usuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_usuarioActionPerformed

    private void txt_passwordKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_passwordKeyReleased
        // TODO add your handling code here:
        String password = txt_password.getText();
        
        if(EsSegura(password)){
            lbl_password.setText(DescripcionSeguridad(password));
            btn_enviar.setEnabled(true);
            evt.consume();
        }else{
            lbl_password.setText(DescripcionSeguridad(password));
            btn_enviar.setEnabled(false);
            evt.consume();
        }
    }//GEN-LAST:event_txt_passwordKeyReleased

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        JFileChooser ventana = new JFileChooser();
        
        File fichero;
        String ruta;
        
        int valor = ventana.showOpenDialog(this);
        if(valor == JFileChooser.APPROVE_OPTION){
            fichero = ventana.getSelectedFile();
            ruta = fichero.getAbsolutePath();
            
            txt_fotografia.setText(ruta);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btn_enviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_enviarActionPerformed
        // TODO add your handling code here:
        //Valida que no esten vacios los campos
        if(txt_nombre.getText().equals("") || txt_apellido.getText().equals("") || txt_fecha_nacimiento.getText().equals("")||txt_telefono.getText().equals("")||txt_usuario.getText().equals("")||txt_fotografia.getText().equals("")||txt_correo.getText().equals(""))
        {
            JOptionPane.showMessageDialog(rootPane, "Debe llenar todos los campos","Error", WIDTH);
        }
        //Valida que no sea mas largo el valor del campo
        if(txt_nombre.getText().length()>40){
            JOptionPane.showMessageDialog(rootPane, "Se superó el tamaño máximo para el campo","Error", WIDTH);
        }
        else{
            //boolean fecha = EsFecha(txt_fecha_nacimiento.getText());
            String ImagenGuardada = GuardarImagen(txt_fotografia.getText());
            
            if(ImagenGuardada!=null){
                String nombre = txt_nombre.getText();
                String apellido = txt_apellido.getText();

                int telefono = Integer.valueOf(txt_telefono.getText());
                String usuario =txt_usuario.getText();

                int rol = 0;      
                int estatus = 1;
                if(txt_rol.getText().equals("Usuario")) rol = 0;
                if(txt_rol.getText().equals("Administrador")) rol = 1;

                String correo = txt_correo.getText();
                String password = txt_password.getText();
                String fecha = txt_fecha_nacimiento.getText();
                
                String[] registro = new String[10];
                registro[0]= usuario;
                registro[1]= nombre;
                registro[2]= apellido;
                registro[3]= password;
                registro[4]= String.valueOf(rol);
                registro[5]= fecha;
                registro[6]= correo;
                registro[7]= String.valueOf(telefono);
                registro[8]= ImagenGuardada;
                registro[9]= String.valueOf(estatus);
                String path_bitacora = "MEIA\\bitacora_usuario.txt";
                
                boolean Guardado = LlenarArchivo(registro, path_bitacora);
                
                if(Guardado){                           
                     //ACTUALIZAR DESCRIPTOR
                                      
                    //VERIFICAR REORGANIZACION
                    File file_desc_bitacora = new File("MEIA\\desc_bitacora_usuario.txt");
                    String path_desc_bitacora = file_desc_bitacora.getAbsolutePath();
                    
                    
                    int registros_bitacora = ObtenerDato(path_desc_bitacora, 7);                     
                    int max_reorganizacion = ObtenerDato(path_desc_bitacora, 9);
                    
                    if(registros_bitacora == max_reorganizacion)
                    {
                        //REORGANIZAR SI ES NECESARIO
                        File file_usuario = new File("MEIA\\usuario.txt");
                        String path_usuario = file_usuario.getAbsolutePath();
                        Reorganizar(path_usuario, path_bitacora);
                    }

                    
                    
                        
                    JOptionPane.showMessageDialog(rootPane, "GUARDADO EXITOSAMENTE!!!","Error", WIDTH);
                    Inicio abrir_inicio = new Inicio();
                    abrir_inicio.lbl_usuario.setText(txt_usuario.getText());
                    abrir_inicio.lbl_rol.setText(txt_rol.getText());
                    
                    ImageIcon photo = new ImageIcon(ImagenGuardada);
                    Icon img = new ImageIcon(photo.getImage().getScaledInstance(abrir_inicio.lbl_photo.getWidth(), abrir_inicio.lbl_photo.getHeight(), Image.SCALE_DEFAULT));
                    abrir_inicio.lbl_photo.setIcon(img);
                    
                    abrir_inicio.show();
                    this.setVisible(false);             
                }
            }    
        }    
    }//GEN-LAST:event_btn_enviarActionPerformed

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

    
    
    private void btn_DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_DeleteActionPerformed
        String Name_User=txt_usuario.getText().trim(); 
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

   /*     //String[]Datos= busqueda();
                    Inicio abrir_inicio = new Inicio();
                    abrir_inicio.lbl_usuario.setText(Admin_User);
                    abrir_inicio.lbl_rol.setText(txt_rol.getText());
                     ImageIcon photo = null;
                try{
                                           photo= new ImageIcon("MEIA\\img\\"+Admin_User+".jpg");
                    }                    
                catch(Exception ex)
                        {
                                            photo= new ImageIcon("MEIA\\img\\"+Admin_User+".png");
                        }        
                    Icon img = new ImageIcon(photo.getImage().getScaledInstance(abrir_inicio.lbl_photo.getWidth(), abrir_inicio.lbl_photo.getHeight(), Image.SCALE_DEFAULT));
                    abrir_inicio.lbl_photo.setIcon(img);
                    abrir_inicio.show();
                    this.setVisible(false); */
    }//GEN-LAST:event_btn_DeleteActionPerformed

      public String[] busqueda(String Path,String Name_User)
    {
        
            Number_Line=0;
            String Data[]= new String[10];
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
                Data[0] = Datos[0].trim();        
                Data[1] = Datos[1].trim();
                Data[2] = Datos[2].trim();
                Data[3] = Datos[3].trim();
                Data[4] = Datos[4].trim();
               if( Data[4].equals("1"))
                {
                    Data[4]="Administrador";
                }
                else
                {
                  Data[4]="Usuario";
                }
                Data[5] = Datos[5].trim();
                Data[6] = Datos[6].trim();
                Data[7] = Datos[7].trim();
                Data[8] = Datos[8].trim();
                String f_estatus = Datos[9].trim(); 
               if( f_estatus.equals("1"))
                {
                    Data[4]="Vigente";
                }
                else
                {
                  Data[4]="No Vigente";
                }
                }
               return Data;
       }
       catch(Exception ex)
               {
                return new String[9];
               }
    }
    
    
    
    
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
            java.util.logging.Logger.getLogger(Modificacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Modificacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Modificacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Modificacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Modificacion().setVisible(true);
            }
        });
    }

    boolean EsSegura(String password){
        //Validacion nivel 1, contiene numeros y letras (length 10)
      String validacion_nivel1 = "(?=.*[0-9])(?=.*[a-z]).{10,}";
      //Validacion nivel 2, contiene numeros, letras, mayuculas y caracteres especiales (length 10)
      String validacion_nivel2 = "(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{10,}";
      
      if(password.matches(validacion_nivel2)) return true;
      if(password.matches(validacion_nivel1)) return true;
      
      //No cumple con ningun criterio
      return false;
    }
    
    String DescripcionSeguridad(String password){
        //Validacion nivel 1, contiene numeros y letras (length 10)
      String validacion_nivel1 = "(?=.*[0-9])(?=.*[a-z]).{10,}";
      //Validacion nivel 2, contiene numeros, letras, mayuculas y caracteres especiales (length 10)
      String validacion_nivel2 = "(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{10,}";
      
      if(password.matches(validacion_nivel2)) return "<HTML>[ SEGURIDAD: ALTA ]<p>   El password es de 10 caracteres, contiene letras en mayusculas, letras en minusculas, números y caracteres especiales.<HTML>";
      if(password.matches(validacion_nivel1)) return "<HTML>[ SEGURIDAD: MEDIA ]<p>   El password es de 10 caracteres, contiene letras y números.<HTML>";
            
      //No cumple con ningun criterio
      return "<HTML>[ SEGURIDAD: BAJA ]<p>  El password debe tener al menos 10 carcacteres, incluyendo letras y números.<HTML>";
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
    
    boolean EsFecha(String date){
        try
            {
                String testDate = date;
                DateFormat formatter = new SimpleDateFormat("dd-mm-yyyy");
                Date date_valido = formatter.parse(testDate);
                return true;
            }
            catch(Exception ex){
                return false;
            }
    }
    
    public boolean LlenarArchivo(String[] resgitro, String path)
    {
        File file_bitacora = new File(path);    
        //NORMALIZAR ENTRADAS
        String password_encriptada = DigestUtils.md5Hex(resgitro[3]); 
                
        String f_usuario = String.format("%-20s", resgitro[0]);        
        String f_nombre = String.format("%-30s", resgitro[1]);
        String f_apellido = String.format("%-30s", resgitro[2]);
        String f_password = String.format("%-40s", password_encriptada);
        String f_rol = String.format("%-3s", resgitro[4]);
        String f_fecha = String.format("%-16s", resgitro[5]);
        String f_correo = String.format("%-40s", resgitro[6]);
        String f_telefono = String.format("%-9s", resgitro[7]);
        String f_path_imagen = String.format("%-200s", resgitro[8]);
        String f_estatus = String.format("%-7s", resgitro[9]); 
         
        String registro = f_usuario+"|"+f_nombre+"|"+f_apellido+"|"+f_password+"|"+f_rol+"|"+f_fecha+"|"+f_correo+"|"+f_telefono+"|"+f_path_imagen+"|"+f_estatus;
   
        try
        {
                    RandomAccessFile bitacora = new RandomAccessFile(path,"rw");
                    bitacora.seek(406*Number_Line);
                    bitacora.writeBytes(registro);
                    bitacora.close();
                    return true;
        }
        catch(Exception ex)
        {
            return false;
        }       
    }
    
    int ObtenerDato(String path, int posicion){
        int activos =0 ;
        try
        {
            //longitud de linea 42 contando \r\n
            RandomAccessFile archivo = new RandomAccessFile(path, "rw");
            int inicio =((posicion-1)*40)+4;
            archivo.seek(inicio);
            byte[] test = new byte[42];           
            archivo.read(test, 0, test.length);
            String linea = new String(test);
            String[] dato = linea.split(":");
            activos = Integer.valueOf(dato[1].trim());
        }
        catch(Exception ex){
            
        }      
        return activos;
    }
    
    
    void Reorganizar(String path_master, String path_bitacora){
        String[] llaves_master = ObtenerLlavesActivas(path_master,"Error");
        String[] llaves_bitacora = ObtenerLlavesActivas(path_bitacora,"Error");
        String[] llaves_totales = new String[ llaves_master.length + llaves_bitacora.length ];
        
        System.arraycopy( llaves_master, 0, llaves_totales, 0, llaves_master.length );
        System.arraycopy( llaves_bitacora, 0, llaves_totales, llaves_master.length, llaves_bitacora.length );
        
        //String[] llaves_totales = (String[])ArraysUtils.addAll(llaves_bitacora, llaves_master);
         Arrays.sort(llaves_totales);
        
        //CREAR ARCHIVO TEMPORAL
        File file_temporal = new File("MEIA\\temporal.txt");
        
        try
        {
            if (!file_temporal.exists())
            {
                file_temporal.createNewFile();
            }
            
                FileWriter Escribir = new FileWriter(file_temporal,true);
                BufferedWriter bw = new BufferedWriter(Escribir);
                String encabezado = "usuario             |nombre                        |apellido                      |password                                |rol|fecha_nacimiento|correo_alterno                          |telefono |path                                                                                                                                                                                                    |estatus";
                bw.write(encabezado+ System.getProperty( "line.separator" ));
                bw.close();
                Escribir.close(); 
                
            for (int i = 0; i < llaves_totales.length; i++) {
               String[] registro_valido = ObtenerUser(llaves_totales[i],"MEIA\\bitacora_usuario.txt","Error");
               if(registro_valido == null) registro_valido = ObtenerUser(llaves_totales[i],"MEIA\\usuario.txt","Error");
               
               LlenarArchivo(registro_valido, "MEIA\\temporal.txt");    
            }          
            
            ///PENDIENTE HACER FUNCIONAR //////////////////////////////////////////////////////////////////////////////////////////
            //delete bitacora y master
            File file_bitacora = new File("MEIA\\bitacora_usuario.txt");      
            File file_usuario = new File("MEIA\\usuario.txt");
            
            
            file_bitacora.delete();
            file_usuario.delete();
            
            //rename temporal
                
            File antiguo = new File("MEIA\\temporal.txt");
                File nuevo = new File("MEIA\\usuario.txt");
                
            if(antiguo.renameTo(nuevo))
            {
            //create bitacora con encabezado
            File file_bitacora_nuevo = new File("MEIA\\bitacora_usuario.txt");
            FileWriter Escribir2 = new FileWriter(file_bitacora_nuevo,true);
            BufferedWriter bw2 = new BufferedWriter(Escribir2);                
            bw2.write(encabezado+ System.getProperty( "line.separator" ));
            bw2.close();
            Escribir.close(); 
            }    
            ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
 
        }
        catch(Exception ex)
        {
            
        }      
    }
    
    
    String[] ObtenerLlavesActivas(String path, String strError){
        ArrayList<String> llaves = new ArrayList<String>();
        File Archivo = new File(path);
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
                            String estatus = split[9].trim();
                            if(estatus.equals("1")) llaves.add(split[0].trim());
                        }
                        Linea = LeerArchivo.readLine();
                    }

                    LecturaArchivo.close();
                    LeerArchivo.close();              
                } catch (IOException ex) {
                    strError= ex.getMessage();
                }
            } catch (FileNotFoundException ex) {
                strError = ex.getMessage();
            }            
        }
        else
        {
            strError="No existe el archivo";
        }
        String[] result = new String[llaves.size()];
        result = llaves.toArray(result);
        return result;  
    }
    
    public String[] ObtenerUser(String user, String path, String strError){
        File Archivo = new File(path);
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
                            String current_user = split[0];
                            if(user.equals(current_user.trim())) return split;
                        }
                        Linea = LeerArchivo.readLine();
                    }

                    LecturaArchivo.close();
                    LeerArchivo.close();              
                } catch (IOException ex) {
                    strError= ex.getMessage();
                }
            } catch (FileNotFoundException ex) {
                strError= ex.getMessage();
            }            
        }
        else
        {
            strError="No existe el archivo";
        }
        return null;
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Delete;
    private javax.swing.JButton btn_enviar;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lbl_password;
    private javax.swing.JTextField txt_apellido;
    private javax.swing.JTextField txt_correo;
    public static javax.swing.JTextField txt_estatus;
    private javax.swing.JTextField txt_fecha_nacimiento;
    private javax.swing.JTextField txt_fotografia;
    private javax.swing.JTextField txt_nombre;
    private javax.swing.JTextField txt_password;
    public static javax.swing.JTextField txt_rol;
    private javax.swing.JTextField txt_telefono;
    public static javax.swing.JTextField txt_usuario;
    // End of variables declaration//GEN-END:variables
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Client.MulticastReceiver;
import Client.MulticastReceiver.MyThread;
import Client.TCPClient;
import Server.MulticastSender;
import Server.TCPServer;
import javax.swing.JOptionPane;

/**
 *
 * @author pablo
 */
public class InterfazGrafica extends javax.swing.JFrame {

    private String[] datos;
    private String msg;
    private String nombre;
    private int cont;
    public boolean hayGanador;

    
    public void detener(){
        if(hayGanador)
        {
            JOptionPane.showMessageDialog(null, "GANASTE!");
            this.setVisible(false);
        }
    }
    
    public String getNombre() {
        return nombre;
    }
    public void setCont(String nomb, int c)
    {
        if(nomb.equals(this.nombre))
        {
            cont = c;
        }
    }
    
    public void setText(String texto){
        jLabel2.setText(texto);
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    
    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String[] getDatos() {
        return datos;
    }

    public void setDatos(String[] datos) {
        this.datos = datos;
    }

    /**
     * Creates new form INterfazGrafica
     */
    public InterfazGrafica() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jCheckBox3 = new javax.swing.JCheckBox();
        jCheckBox4 = new javax.swing.JCheckBox();
        jCheckBox5 = new javax.swing.JCheckBox();
        jCheckBox6 = new javax.swing.JCheckBox();
        jCheckBox7 = new javax.swing.JCheckBox();
        jCheckBox8 = new javax.swing.JCheckBox();
        jCheckBox9 = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jCheckBox1.setText("jCheckBox1");
        jCheckBox1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jCheckBox1.setBorderPainted(true);
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });

        jCheckBox2.setText("jCheckBox2");
        jCheckBox2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jCheckBox2.setBorderPainted(true);
        jCheckBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox2ActionPerformed(evt);
            }
        });

        jCheckBox3.setText("jCheckBox3");
        jCheckBox3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jCheckBox3.setBorderPainted(true);
        jCheckBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox3ActionPerformed(evt);
            }
        });

        jCheckBox4.setText("jCheckBox4");
        jCheckBox4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jCheckBox4.setBorderPainted(true);
        jCheckBox4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox4ActionPerformed(evt);
            }
        });

        jCheckBox5.setText("jCheckBox5");
        jCheckBox5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jCheckBox5.setBorderPainted(true);
        jCheckBox5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox5ActionPerformed(evt);
            }
        });

        jCheckBox6.setText("jCheckBox6");
        jCheckBox6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jCheckBox6.setBorderPainted(true);
        jCheckBox6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox6ActionPerformed(evt);
            }
        });

        jCheckBox7.setText("jCheckBox7");
        jCheckBox7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jCheckBox7.setBorderPainted(true);
        jCheckBox7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox7ActionPerformed(evt);
            }
        });

        jCheckBox8.setText("jCheckBox8");
        jCheckBox8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jCheckBox8.setBorderPainted(true);
        jCheckBox8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox8ActionPerformed(evt);
            }
        });

        jCheckBox9.setText("jCheckBox9");
        jCheckBox9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jCheckBox9.setBorderPainted(true);
        jCheckBox9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox9ActionPerformed(evt);
            }
        });

        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jCheckBox4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(46, 46, 46)
                                        .addComponent(jCheckBox5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jCheckBox7, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jCheckBox8, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(45, 45, 45)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jCheckBox9, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jCheckBox6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jCheckBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(46, 46, 46)
                                .addComponent(jCheckBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(45, 45, 45)
                                .addComponent(jCheckBox3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 55, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jCheckBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCheckBox3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCheckBox2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox9, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(34, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

     
    
    
    
    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        // TODO add your handling code here:
        //jCheckBox1.setSelected(jCheckBox1.isSelected());
        if (this.msg.equals("1")) {
            cont++;
            if(cont<6){
                datos[5]=cont+"";
                TCPClient cliente = new TCPClient();
                boolean res = cliente.golpeaTopo(datos, cont);
                jLabel1.setText("Le diste");
                if(res){

                    MulticastReceiver receiver=new MulticastReceiver();
                    MyThread aux= receiver.hilo;
                    if(receiver.hilo.getNombre().equals(nombre)){
                        cont=Integer.parseInt(aux.getData());
                        receiver.ganador(this);
                    }else{
                        receiver.ganador(this);
                    }
                    MulticastSender sender=new MulticastSender();
                    sender.enviaMensaje(nombre);
                }
                
            }else{
                jLabel2.setText("GANASTE!!!");
                hayGanador=true;
                detener();
            }
            
        } else {
            jLabel1.setText("No le diste");
        }
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void jCheckBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox2ActionPerformed
        // TODO add your handling code here:
        if (this.msg.equals("2")) {
            cont++;
            if(cont<6){
                datos[5]=cont+"";
                TCPClient cliente = new TCPClient();
                boolean res = cliente.golpeaTopo(datos, cont);
                jLabel1.setText("Le diste");
                if(res){

                    MulticastReceiver receiver=new MulticastReceiver();
                    MyThread aux= receiver.hilo;
                    if(receiver.hilo.getNombre().equals(nombre)){
                        cont=Integer.parseInt(aux.getData());
                        receiver.ganador(this);
                    }else{
                        receiver.ganador(this);
                    }                    
                    MulticastSender sender=new MulticastSender();
                    sender.enviaMensaje(nombre);
                }
                
            }else{
                jLabel2.setText("GANASTE!!!");
                hayGanador=true;
                detener();
            }
        }else {
            jLabel1.setText("No le diste");
        }
    }//GEN-LAST:event_jCheckBox2ActionPerformed

    private void jCheckBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox3ActionPerformed
        // TODO add your handling code here:
        if (this.msg.equals("3")) {
            cont++;
            if(cont<6){
                datos[5]=cont+"";
                TCPClient cliente = new TCPClient();
                boolean res = cliente.golpeaTopo(datos, cont);
                jLabel1.setText("Le diste");
                if(res){

                    MulticastReceiver receiver=new MulticastReceiver();
                    MyThread aux= receiver.hilo;
                    if(receiver.hilo.getNombre().equals(nombre)){
                        cont=Integer.parseInt(aux.getData());
                        receiver.ganador(this);
                    }else{
                        receiver.ganador(this);
                    }          
                    MulticastSender sender=new MulticastSender();
                    sender.enviaMensaje(nombre);
                }
                
            }else{
                jLabel2.setText("GANASTE!!!");
                hayGanador=true;
                detener();
            }
        }else {
            jLabel1.setText("No le diste");
        }
    }//GEN-LAST:event_jCheckBox3ActionPerformed

    private void jCheckBox4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox4ActionPerformed
        // TODO add your handling code here:
        if (this.msg.equals("4")) {
            cont++;
            if(cont<6){
                datos[5]=cont+"";
                TCPClient cliente = new TCPClient();
                boolean res = cliente.golpeaTopo(datos, cont);
                jLabel1.setText("Le diste");
                if(res){

                    MulticastReceiver receiver=new MulticastReceiver();
                    MyThread aux= receiver.hilo;
                    if(receiver.hilo.getNombre().equals(nombre)){
                        cont=Integer.parseInt(aux.getData());
                        receiver.ganador(this);
                    }else{
                        receiver.ganador(this);
                    }
                    MulticastSender sender=new MulticastSender();
                    sender.enviaMensaje(nombre);
                }
                
            }else{
                jLabel2.setText("GANASTE!!!");
                hayGanador=true;
                detener();
            }
        }else {
            jLabel1.setText("No le diste");
        }
    }//GEN-LAST:event_jCheckBox4ActionPerformed

    private void jCheckBox5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox5ActionPerformed
        // TODO add your handling code here:
        if (this.msg.equals("5")) {
            cont++;
            if(cont<6){
                datos[5]=cont+"";
                TCPClient cliente = new TCPClient();
                boolean res = cliente.golpeaTopo(datos, cont);
                jLabel1.setText("Le diste");
                if(res){

                    MulticastReceiver receiver=new MulticastReceiver();
                    MyThread aux= receiver.hilo;
                    if(receiver.hilo.getNombre().equals(nombre)){
                        cont=Integer.parseInt(aux.getData());
                        receiver.ganador(this);
                    }else{
                        receiver.ganador(this);
                    }
                    MulticastSender sender=new MulticastSender();
                    sender.enviaMensaje(nombre);
                }
                
            }else{
                jLabel2.setText("GANASTE!!!");
                hayGanador=true;
                detener();
            }
        }else {
            jLabel1.setText("No le diste");
        }
    }//GEN-LAST:event_jCheckBox5ActionPerformed

    private void jCheckBox6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox6ActionPerformed
        // TODO add your handling code here:
        if (this.msg.equals("6")) {
            cont++;
            if(cont<6){
                datos[5]=cont+"";
                TCPClient cliente = new TCPClient();
                boolean res = cliente.golpeaTopo(datos, cont);
                
                jLabel1.setText("Le diste");
                if(res){

                    MulticastReceiver receiver=new MulticastReceiver();
                    MyThread aux= receiver.hilo;
                    if(receiver.hilo.getNombre().equals(nombre)){
                        cont=Integer.parseInt(aux.getData());
                        receiver.ganador(this);
                    }else{
                        receiver.ganador(this);
                    }
                    MulticastSender sender=new MulticastSender();
                    sender.enviaMensaje(nombre);
                }
                
            }else{
                jLabel2.setText("GANASTE!!!");
                hayGanador=true;
                detener();
            }
        }else {
            jLabel1.setText("No le diste");
        }
    }//GEN-LAST:event_jCheckBox6ActionPerformed

    private void jCheckBox7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox7ActionPerformed
        // TODO add your handling code here:
        if (this.msg.equals("7")) {
            cont++;
            if(cont<6){
                datos[5]=cont+"";
                TCPClient cliente = new TCPClient();
                boolean res = cliente.golpeaTopo(datos, cont);
                jLabel1.setText("Le diste");
                if(res){

                    MulticastReceiver receiver=new MulticastReceiver();
                    MyThread aux= receiver.hilo;
                    if(receiver.hilo.getNombre().equals(nombre)){
                        cont=Integer.parseInt(aux.getData());
                        receiver.ganador(this);
                    }else{
                        receiver.ganador(this);
                    }
                    MulticastSender sender=new MulticastSender();
                    sender.enviaMensaje(nombre);
                }
                
            }else{
                jLabel2.setText("GANASTE!!!");
                hayGanador=true;
                detener();
            }
        }else {
            jLabel1.setText("No le diste");
        }
    }//GEN-LAST:event_jCheckBox7ActionPerformed

    private void jCheckBox8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox8ActionPerformed
        // TODO add your handling code here:
        if (this.msg.equals("8")) {
            cont++;
            if(cont<6){
                datos[5]=cont+"";
                TCPClient cliente = new TCPClient();
                boolean res = cliente.golpeaTopo(datos, cont);
                jLabel1.setText("Le diste");
                if(res){

                    MulticastReceiver receiver=new MulticastReceiver();
                    MyThread aux= receiver.hilo;
                    if(receiver.hilo.getNombre().equals(nombre)){
                        cont=Integer.parseInt(aux.getData());
                        receiver.ganador(this);
                    }else{
                        receiver.ganador(this);
                    }
                    MulticastSender sender=new MulticastSender();
                    sender.enviaMensaje(nombre);
                }
                
            }else{
                jLabel2.setText("GANASTE!!!");
                hayGanador=true;
                detener();
            }
        }else {
            jLabel1.setText("No le diste");
        }
    }//GEN-LAST:event_jCheckBox8ActionPerformed

    private void jCheckBox9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox9ActionPerformed
        // TODO add your handling code here:
        if (this.msg.equals("9")) {
            cont++;
            if(cont<6){
                datos[5]=cont+"";
                TCPClient cliente = new TCPClient();
                boolean res = cliente.golpeaTopo(datos, cont);
                jLabel1.setText("Le diste");
                if(res){

                    MulticastReceiver receiver=new MulticastReceiver();
                    MyThread aux= receiver.hilo;
                    if(receiver.hilo.getNombre().equals(nombre)){
                        cont=Integer.parseInt(aux.getData());
                        receiver.ganador(this);
                    }else{
                        receiver.ganador(this);
                    }
                    MulticastSender sender=new MulticastSender();
                    sender.enviaMensaje(nombre);
                }
                
            }else{
                jLabel2.setText("GANASTE!!!");
                hayGanador=true;
                detener();
            }
        }else {
            jLabel1.setText("No le diste");
        }
    }//GEN-LAST:event_jCheckBox9ActionPerformed
   
    
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
            java.util.logging.Logger.getLogger(InterfazGrafica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfazGrafica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfazGrafica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfazGrafica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfazGrafica().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JCheckBox jCheckBox4;
    private javax.swing.JCheckBox jCheckBox5;
    private javax.swing.JCheckBox jCheckBox6;
    private javax.swing.JCheckBox jCheckBox7;
    private javax.swing.JCheckBox jCheckBox8;
    private javax.swing.JCheckBox jCheckBox9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables

    public void activaBoton(char msg) {
        switch (msg) {
            case '1':
                jCheckBox1.setSelected(true);
                jCheckBox2.setSelected(false);
                jCheckBox3.setSelected(false);
                jCheckBox4.setSelected(false);
                jCheckBox5.setSelected(false);
                jCheckBox6.setSelected(false);
                jCheckBox7.setSelected(false);
                jCheckBox8.setSelected(false);
                jCheckBox9.setSelected(false);
                break;
            case '2':
                jCheckBox1.setSelected(false);
                jCheckBox2.setSelected(true);
                jCheckBox3.setSelected(false);
                jCheckBox4.setSelected(false);
                jCheckBox5.setSelected(false);
                jCheckBox6.setSelected(false);
                jCheckBox7.setSelected(false);
                jCheckBox8.setSelected(false);
                jCheckBox9.setSelected(false);
                break;
            case '3':
                jCheckBox1.setSelected(false);
                jCheckBox2.setSelected(false);
                jCheckBox3.setSelected(true);
                jCheckBox4.setSelected(false);
                jCheckBox5.setSelected(false);
                jCheckBox6.setSelected(false);
                jCheckBox7.setSelected(false);
                jCheckBox8.setSelected(false);
                jCheckBox9.setSelected(false);
                break;
            case '4':
                jCheckBox1.setSelected(false);
                jCheckBox2.setSelected(false);
                jCheckBox3.setSelected(false);
                jCheckBox4.setSelected(true);
                jCheckBox5.setSelected(false);
                jCheckBox6.setSelected(false);
                jCheckBox7.setSelected(false);
                jCheckBox8.setSelected(false);
                jCheckBox9.setSelected(false);
                break;
            case '5':
                jCheckBox1.setSelected(false);
                jCheckBox2.setSelected(false);
                jCheckBox3.setSelected(false);
                jCheckBox4.setSelected(false);
                jCheckBox5.setSelected(true);
                jCheckBox6.setSelected(false);
                jCheckBox7.setSelected(false);
                jCheckBox8.setSelected(false);
                jCheckBox9.setSelected(false);
                break;
            case '6':
                jCheckBox1.setSelected(false);
                jCheckBox2.setSelected(false);
                jCheckBox3.setSelected(false);
                jCheckBox4.setSelected(false);
                jCheckBox5.setSelected(false);
                jCheckBox6.setSelected(true);
                jCheckBox7.setSelected(false);
                jCheckBox8.setSelected(false);
                jCheckBox9.setSelected(false);
                break;
            case '7':
                jCheckBox1.setSelected(false);
                jCheckBox2.setSelected(false);
                jCheckBox3.setSelected(false);
                jCheckBox4.setSelected(false);
                jCheckBox5.setSelected(false);
                jCheckBox6.setSelected(false);
                jCheckBox7.setSelected(true);
                jCheckBox8.setSelected(false);
                jCheckBox9.setSelected(false);
                break;
            case '8':
                jCheckBox1.setSelected(false);
                jCheckBox2.setSelected(false);
                jCheckBox3.setSelected(false);
                jCheckBox4.setSelected(false);
                jCheckBox5.setSelected(false);
                jCheckBox6.setSelected(false);
                jCheckBox7.setSelected(false);
                jCheckBox8.setSelected(true);
                jCheckBox9.setSelected(false);
                break;
            case '9':
                jCheckBox1.setSelected(false);
                jCheckBox2.setSelected(false);
                jCheckBox3.setSelected(false);
                jCheckBox4.setSelected(false);
                jCheckBox5.setSelected(false);
                jCheckBox6.setSelected(false);
                jCheckBox7.setSelected(false);
                jCheckBox8.setSelected(false);
                jCheckBox9.setSelected(true);
                break;
        }
    }
}

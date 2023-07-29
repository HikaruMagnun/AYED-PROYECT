package Pedidos;

import Principal.Menu;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;

public class PedidosView extends javax.swing.JFrame {
    
    Formulario formulario;
    DefaultTableModel T1 = new DefaultTableModel();
    PedidosColas cola = new PedidosColas();

    private String mesaSeleccionada;
    
    public PedidosView() {
         initComponents();

        String ids[] = {
            "Descricion",
            "Nombre Cliente",
            "Nº de mesa",
            "Hora",
            "Total"
        };
        T1.setColumnIdentifiers(ids);
        TableContent.setModel(T1);
        TableColumnModel columnModel = TableContent.getColumnModel();

        columnModel.getColumn(0).setPreferredWidth(400);
        columnModel.getColumn(1).setPreferredWidth(150);
        columnModel.getColumn(2).setPreferredWidth(15);
        columnModel.getColumn(3).setPreferredWidth(5);
        columnModel.getColumn(4).setPreferredWidth(20);
        actualizar();
    }
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        LabelLogo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TableContent = new javax.swing.JTable();
        ButtonIngresar = new javax.swing.JButton();
        ButtonEliminar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        btnGenerarBoleta = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(17, 25, 39));

        LabelLogo.setFont(new java.awt.Font("Lucida Bright", 0, 60)); // NOI18N
        LabelLogo.setForeground(new java.awt.Color(255, 255, 255));
        LabelLogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelLogo.setText("PEDIDOS");
        LabelLogo.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));

        jScrollPane1.setViewportView(TableContent);

        ButtonIngresar.setText("INGRESAR PEDIDO");
        ButtonIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonIngresarActionPerformed(evt);
            }
        });
        ButtonIngresar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                ButtonIngresarKeyPressed(evt);
            }
        });

        ButtonEliminar.setText("ELIMINAR PEDIDO");
        ButtonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonEliminarActionPerformed(evt);
            }
        });

        jButton1.setText("REINICIAR ");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesProy/regresar_emple.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        btnGenerarBoleta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesProy/impresionI.png"))); // NOI18N
        btnGenerarBoleta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerarBoletaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(ButtonIngresar, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(171, 171, 171)
                .addComponent(ButtonEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(76, 76, 76)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 928, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 42, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(260, 260, 260)
                        .addComponent(LabelLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnGenerarBoleta, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LabelLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGenerarBoleta, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 444, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(ButtonEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(ButtonIngresar, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ButtonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonEliminarActionPerformed
        cola.extraer();
        String numeroMesaStr = (String) TableContent.getValueAt(0, 2);
        int numeroMesaEli = Integer.parseInt(numeroMesaStr);
        int[] Marray = Formulario.getMarray();
        Marray[numeroMesaEli - 1] = 0;
        actualizar();
    }//GEN-LAST:event_ButtonEliminarActionPerformed

    private void emitirBoletaVenta() {
        int filaSeleccionada = TableContent.getSelectedRow();
        if (filaSeleccionada != -1) {
            DefaultTableModel modelo = (DefaultTableModel) TableContent.getModel();
            String descripcion = modelo.getValueAt(filaSeleccionada, 0).toString();
            String cliente = modelo.getValueAt(filaSeleccionada, 1).toString();
            String mesita = modelo.getValueAt(filaSeleccionada, 2).toString();
            String horita = modelo.getValueAt(filaSeleccionada, 3).toString();
            String total = modelo.getValueAt(filaSeleccionada, 4).toString();

            BoletaView boleta = new BoletaView(descripcion, cliente, mesita, horita, total);
            boleta.setVisible(true);
            
        } else {
            JOptionPane.showMessageDialog(this, "Seleccione una fila de la tabla");
        }
    }
    
    public void actualizar() {  
         T1.setRowCount(0);
        ArrayList<Pedido> elementos = cola.obtenerElementosCola();
        for (Pedido pedido : elementos) {
            String[][] descripcion = pedido.getDescripcion();
            StringBuilder sb = new StringBuilder();
            for (String[] subArreglo : descripcion) {
                String text = subArreglo[0] + " : " + subArreglo[1];
                sb.append(text).append(" | ");
            }
            String resultado = sb.substring(0, sb.length() - 2);
            Object[] row = {resultado,pedido.getCliente(), pedido.getMesa(), pedido.getHora(),pedido.getTotal() };

            T1.addRow(row);
        }

        TableColumnModel columnModel = TableContent.getColumnModel();
        columnModel.getColumn(3).setPreferredWidth(15);

        if (mesaSeleccionada != null) {
            TableContent.setValueAt(mesaSeleccionada, T1.getRowCount() - 1, 3);
        }

        T1.fireTableDataChanged(); 
    }  
    
    
    private void ButtonIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonIngresarActionPerformed
        formulario = new Formulario(PedidosView.this, cola);
        formulario.setVisible(true);
        formulario.setLocationRelativeTo(null);  
    }//GEN-LAST:event_ButtonIngresarActionPerformed
 
    private void ButtonIngresarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ButtonIngresarKeyPressed
       
    }//GEN-LAST:event_ButtonIngresarKeyPressed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int respuesta = JOptionPane.showConfirmDialog(this, "¿Estás seguro de que deseas vaciar la cola?", "Confirmación", JOptionPane.YES_NO_OPTION);

        if (respuesta == JOptionPane.YES_OPTION) {
            cola.vaciarCola();

            int rowCount = TableContent.getRowCount();
            int[] Marray = Formulario.getMarray();
            for (int i = 0; i < rowCount; i++) {
                String numeroMesaStr = (String) TableContent.getValueAt(i, 2);
                int numeroMesa = Integer.parseInt(numeroMesaStr);
                Marray[numeroMesa - 1] = 0;
            }

            actualizar();

            JOptionPane.showMessageDialog(this, "La cola se ha vaciado correctamente.", "Éxito", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        dispose();        
        Menu men = new Menu();
        men.setVisible(true);
        men.setLocationRelativeTo(null);  
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btnGenerarBoletaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarBoletaActionPerformed
        emitirBoletaVenta();
    }//GEN-LAST:event_btnGenerarBoletaActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonEliminar;
    private javax.swing.JButton ButtonIngresar;
    private javax.swing.JLabel LabelLogo;
    private javax.swing.JTable TableContent;
    private javax.swing.JButton btnGenerarBoleta;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
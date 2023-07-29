
package Menu;

import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class MenuView1 extends javax.swing.JFrame {

    MenuLista segundos = new MenuLista("segundos.ser");
    MenuLista bebidas = new MenuLista("bebidas.ser");

    public MenuView1() {
        initComponents();
        actualizar(TbPlatos, segundos);
        actualizar(TbBebidas, bebidas);

    }

    private void actualizar(JTable tabla, MenuLista lista) {
        DefaultTableModel modelo = (DefaultTableModel) tabla.getModel();
        modelo.setRowCount(0);
        String[][] platos = lista.obtenerContenidos();
        int id = 1;
        for (String[] plato : platos) {
            Object[] fila = {id, plato[0], plato[1] };
            modelo.addRow(fila);
            id++;
        }
        modelo.fireTableDataChanged();
        lista.guardarEnArchivo();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Titulo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        TbBebidas = new javax.swing.JTable();
        PlatoBoton = new javax.swing.JButton();
        BebidaBoton = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        TbPlatos = new javax.swing.JTable();
        ElimPla = new javax.swing.JButton();
        ElimBebida = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        Titulo.setFont(new java.awt.Font("Gill Sans MT", 0, 24)); // NOI18N
        Titulo.setForeground(new java.awt.Color(0, 0, 0));
        Titulo.setText("GESTOR DE MENU (SEGUNDOS Y BEBIDAS)");

        jLabel1.setFont(new java.awt.Font("Modern No. 20", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("BEBIDAS");

        jLabel2.setFont(new java.awt.Font("Modern No. 20", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("PLATOS");

        TbBebidas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID", "Bebidas", "Precio"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TbBebidas.setRowHeight(30);
        TbBebidas.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(TbBebidas);
        if (TbBebidas.getColumnModel().getColumnCount() > 0) {
            TbBebidas.getColumnModel().getColumn(0).setResizable(false);
            TbBebidas.getColumnModel().getColumn(0).setPreferredWidth(50);
            TbBebidas.getColumnModel().getColumn(1).setResizable(false);
            TbBebidas.getColumnModel().getColumn(1).setPreferredWidth(250);
        }

        PlatoBoton.setText("AGREGAR PLATO");
        PlatoBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PlatoBotonActionPerformed(evt);
            }
        });

        BebidaBoton.setText("AGREGAR BEBIDA");
        BebidaBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BebidaBotonActionPerformed(evt);
            }
        });

        TbPlatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID", "Platos", "Precio"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TbPlatos.setRowHeight(30);
        TbPlatos.getTableHeader().setReorderingAllowed(false);
        jScrollPane3.setViewportView(TbPlatos);
        if (TbPlatos.getColumnModel().getColumnCount() > 0) {
            TbPlatos.getColumnModel().getColumn(0).setResizable(false);
            TbPlatos.getColumnModel().getColumn(0).setPreferredWidth(50);
            TbPlatos.getColumnModel().getColumn(1).setResizable(false);
            TbPlatos.getColumnModel().getColumn(1).setPreferredWidth(250);
        }

        ElimPla.setText("ELIMINAR PLATO");
        ElimPla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ElimPlaActionPerformed(evt);
            }
        });

        ElimBebida.setText("ELEMINAR BEBIDA");
        ElimBebida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ElimBebidaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(PlatoBoton, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ElimPla, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BebidaBoton, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ElimBebida, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(239, 239, 239)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(38, 38, 38))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(24, 24, 24))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(Titulo)
                                .addGap(160, 160, 160))))))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(62, 62, 62)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(449, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Titulo)
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PlatoBoton)
                    .addComponent(BebidaBoton)
                    .addComponent(ElimPla)
                    .addComponent(ElimBebida))
                .addGap(14, 14, 14))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addContainerGap(106, Short.MAX_VALUE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(55, 55, 55)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void PlatoBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PlatoBotonActionPerformed
        String textoa = String.valueOf(JOptionPane.showInputDialog(null, "Ingrese el nombre del platillo:"));
        if (textoa == null || textoa.equals("null") || textoa.isEmpty()) {
            return;
        }
        String textob = String.valueOf(JOptionPane.showInputDialog(null, "Ingrese el precio:"));
        if (textob == null || textob.equals("null") || textob.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Comando vacio", "ERROR", JOptionPane.WARNING_MESSAGE);

            return;
        }
        if (!esNumero(textob)) {
            JOptionPane.showMessageDialog(null, "No es numero", "ERROR", JOptionPane.WARNING_MESSAGE);

            return;
        }

        String[] platillo = {textoa, textob};

        segundos.insertarFinal(platillo);
        actualizar(TbPlatos, segundos);
    }//GEN-LAST:event_PlatoBotonActionPerformed

    private void BebidaBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BebidaBotonActionPerformed

        String textoa = String.valueOf(JOptionPane.showInputDialog(null, "Ingrese el nombre de la bebida:"));
        if (textoa == null || textoa.equals("null") || textoa.isEmpty()) {
            return;
        }
        String textob = String.valueOf(JOptionPane.showInputDialog(null, "Ingrese el precio:"));
        if (textob == null || textob.equals("null") || textob.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Comando vacio", "ERROR", JOptionPane.WARNING_MESSAGE);

            return;
        }
        if (!esNumero(textob)) {
            JOptionPane.showMessageDialog(null, "No es numero", "ERROR", JOptionPane.WARNING_MESSAGE);

            return;
        }

        String[] platillo = {textoa, textob};

        bebidas.insertarFinal(platillo);
        actualizar(TbBebidas, bebidas);

    }//GEN-LAST:event_BebidaBotonActionPerformed

    
    private boolean esNumero(String str) {
        if (str == null || str.isEmpty()) {
            return false;
        }

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (!Character.isDigit(c)) {
                return false;
            }
        }

        return true;
    }
   
    
    private void ElimPlaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ElimPlaActionPerformed
        try {
            int numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el ID del platillo a eliminar:")) - 1;

            if (numero >= 0 && numero < segundos.getTam()) {
                segundos.removerPorPosicion(numero);
                segundos.obtenerContenidos();
                actualizar(TbPlatos, segundos);
            } else {
                throw new NumberFormatException();
            }

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Ingrese un número válido", "Error", JOptionPane.ERROR_MESSAGE);

        }

    }//GEN-LAST:event_ElimPlaActionPerformed

    private void ElimBebidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ElimBebidaActionPerformed
        try {
            int numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el ID de la bebida a eliminar:")) - 1;

            if (numero >= 0 && numero < bebidas.getTam()) {
                bebidas.removerPorPosicion(numero);
                bebidas.obtenerContenidos();
                actualizar(TbBebidas, bebidas);
            } else {
                throw new NumberFormatException();
            }

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Ingrese un número válido", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_ElimBebidaActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BebidaBoton;
    private javax.swing.JButton ElimBebida;
    private javax.swing.JButton ElimPla;
    private javax.swing.JButton PlatoBoton;
    private javax.swing.JTable TbBebidas;
    private javax.swing.JTable TbPlatos;
    private javax.swing.JLabel Titulo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    // End of variables declaration//GEN-END:variables
}

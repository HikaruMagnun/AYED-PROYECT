package Pedidos;
import Clientes.Clientes;
import Pedidos.PedidosColas;
import Pedidos.PedidosView;
import Menu.MenuLista;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import javax.swing.table.DefaultTableModel;

public final class Formulario extends javax.swing.JFrame {
    
    private final PedidosColas colas;
    private final PedidosView pedido;
    private Clientes cliente;
    private static int[] Marray = new int[30];
    private TablaMesas tablaMesas;
    
    public Formulario(PedidosView pedido, PedidosColas colas) {
        this.colas = colas;
        this.pedido = pedido;
        MenuLista segundos = new MenuLista("segundos.ser");
        MenuLista bebidas = new MenuLista("bebidas.ser");
        cliente = new Clientes();
        ComboBoxModel<String> comboBoxModelPlatos = new DefaultComboBoxModel<>(segundos.obtenerContenidosArray());
        ComboBoxModel<String> comboBoxModelBebidas = new DefaultComboBoxModel<>(bebidas.obtenerContenidosArray());
        initComponents();
        jComboBoxDescripcion1A.setModel(comboBoxModelPlatos);
        jComboBoxDescripcion2A.setModel(comboBoxModelBebidas);
        actualizarHora();
        EstadoMesas();
    }
   
    public static int[] getMarray() {
        return Marray;
    }
     
    public void setNombreCliente(String nombre) {
        texCliente.setText(nombre);
    }
        
    public void EstadoMesas() {
        ComboBoxMesas.removeAllItems();
        for (int i = 0; i < Marray.length; i++) {
           ComboBoxMesas.addItem("Mesa " + (i+1));
        }
         actualizarTablaMesas();     
    }

    private void actualizarTablaMesas() {  
    if (tablaMesas == null) {
        tablaMesas = new TablaMesas(Marray);
    } else {
        tablaMesas.setMarray(Marray);
    }

}
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jComboBoxTipo = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jComboBoxDescripcion1A = new javax.swing.JComboBox<>();
        jComboBoxDescripcion2A = new javax.swing.JComboBox<>();
        jSpinnerDescripcion1B = new javax.swing.JSpinner();
        jSpinnerDescripcion2B = new javax.swing.JSpinner();
        jLabel4 = new javax.swing.JLabel();
        texCliente = new javax.swing.JTextField();
        Labellndicacion = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        Labellndicacion1 = new javax.swing.JLabel();
        btnOcuparFor = new javax.swing.JButton();
        texCombo = new javax.swing.JTextField();
        btnVerMesas = new javax.swing.JButton();
        ComboBoxMesas = new javax.swing.JComboBox<>();
        btnLiberarFor1 = new javax.swing.JButton();
        TexMesas = new javax.swing.JTextField();
        AgregarPl = new javax.swing.JButton();
        AgregarBe = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        Labellndicacion2 = new javax.swing.JLabel();
        texDNI = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.LINE_AXIS));

        jPanel1.setBackground(new java.awt.Color(17, 25, 39));

        jLabel1.setFont(new java.awt.Font("Lucida Sans Typewriter", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("INGRESAR PEDIDO");

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("HORA:");

        jComboBoxTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "En el local" }));
        jComboBoxTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxTipoActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("TIPO DE PEDIDO");

        jComboBoxDescripcion1A.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxDescripcion1AActionPerformed(evt);
            }
        });

        jSpinnerDescripcion1B.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));

        jSpinnerDescripcion2B.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));

        jLabel4.setBackground(new java.awt.Color(187, 187, 187));
        jLabel4.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("DESCRIPCION");

        texCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                texClienteActionPerformed(evt);
            }
        });

        Labellndicacion.setBackground(new java.awt.Color(187, 187, 187));
        Labellndicacion.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        Labellndicacion.setForeground(new java.awt.Color(255, 255, 255));
        Labellndicacion.setText("SELECTOR DE MESA");

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("00:00:00");

        jButton1.setText("INSERTAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jButton1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton1KeyPressed(evt);
            }
        });

        jButton2.setText("CANCELAR");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        Labellndicacion1.setBackground(new java.awt.Color(187, 187, 187));
        Labellndicacion1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        Labellndicacion1.setForeground(new java.awt.Color(255, 255, 255));
        Labellndicacion1.setText("DNI CLIENTE");

        btnOcuparFor.setText("Ocupar Mesa");
        btnOcuparFor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOcuparForActionPerformed(evt);
            }
        });

        texCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                texComboActionPerformed(evt);
            }
        });

        btnVerMesas.setText("Ver mesas");
        btnVerMesas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerMesasActionPerformed(evt);
            }
        });

        ComboBoxMesas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboBoxMesasActionPerformed(evt);
            }
        });

        btnLiberarFor1.setText("Liberar Mesa");
        btnLiberarFor1.setMaximumSize(new java.awt.Dimension(100, 22));
        btnLiberarFor1.setMinimumSize(new java.awt.Dimension(100, 22));
        btnLiberarFor1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLiberarFor1ActionPerformed(evt);
            }
        });

        TexMesas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TexMesasActionPerformed(evt);
            }
        });

        AgregarPl.setText("+");
        AgregarPl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgregarPlActionPerformed(evt);
            }
        });

        AgregarBe.setText("+");
        AgregarBe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgregarBeActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Cantidad"
            }
        ));
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(1).setMaxWidth(100);
        }

        Labellndicacion2.setBackground(new java.awt.Color(187, 187, 187));
        Labellndicacion2.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        Labellndicacion2.setForeground(new java.awt.Color(255, 255, 255));
        Labellndicacion2.setText("NOMBRE CLIENTE");

        texDNI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                texDNIActionPerformed(evt);
            }
        });

        btnBuscar.setText("BUSCAR");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(texCliente, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(TexMesas, javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(ComboBoxMesas, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnOcuparFor, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(18, 18, 18)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(btnLiberarFor1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(btnVerMesas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addComponent(texCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addComponent(Labellndicacion1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Labellndicacion, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jComboBoxDescripcion2A, javax.swing.GroupLayout.Alignment.LEADING, 0, 205, Short.MAX_VALUE)
                                        .addComponent(jComboBoxDescripcion1A, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGap(18, 18, 18)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jSpinnerDescripcion2B, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(AgregarBe, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jSpinnerDescripcion1B, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(AgregarPl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                                .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                .addComponent(jComboBoxTipo, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(texDNI, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(btnBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(Labellndicacion2, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 17, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(163, 163, 163)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBoxTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxDescripcion1A, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSpinnerDescripcion1B, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AgregarPl))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxDescripcion2A, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSpinnerDescripcion2B, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AgregarBe))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Labellndicacion, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(texCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ComboBoxMesas, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnOcuparFor)
                    .addComponent(btnLiberarFor1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnVerMesas))
                .addGap(18, 18, 18)
                .addComponent(TexMesas, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Labellndicacion1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(texDNI, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(Labellndicacion2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(texCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(11, 11, 11)
                        .addComponent(jButton1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(jButton2)))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        jScrollPane2.setViewportView(jPanel1);

        getContentPane().add(jScrollPane2);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBoxTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxTipoActionPerformed
        int opcion = jComboBoxTipo.getSelectedIndex();
        switch (opcion) {
            case 0: Labellndicacion.setText("MESA :");
            case 1: Labellndicacion.setText("DIRECCION :");
            case 2: Labellndicacion.setText("NOMBRE DEL CLIENTE :");
        }
    }//GEN-LAST:event_jComboBoxTipoActionPerformed
    
    private void actualizarHora() {
        Timer timer = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                LocalTime now = LocalTime.now();
                String horaActual = now.format(DateTimeFormatter.ofPattern("HH:mm:ss"));
                jLabel6.setText(horaActual);
            }
        });
        timer.start();
    }
     
    
    public static int extraerNumeros(String texto) {
        Pattern patron = Pattern.compile("\\d+$"); 
        Matcher matcher = patron.matcher(texto);
        if (matcher.find()) {
            String numerosStr = matcher.group(); 
            return Integer.parseInt(numerosStr);
        } else {
            return 0; 
        }
    }
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String mesas = TexMesas.getText();
        if (mesas == null || mesas.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Debe seleccionar una mesa", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        try {
            DefaultTableModel modelo = (DefaultTableModel) jTable1.getModel();
            if (modelo.getRowCount() == 0) {
                throw new IllegalStateException("La tabla está vacía");
            }

            int filas = modelo.getRowCount();
            String[][] descripcion = new String[filas][2];
            int total = 0;
            for (int i = 0; i < filas; i++) {
                descripcion[i][0] = modelo.getValueAt(i, 0).toString();
                descripcion[i][1] = modelo.getValueAt(i, 1).toString();

                int valor = extraerNumeros(modelo.getValueAt(i, 0).toString());
                int cantidad = Integer.parseInt(modelo.getValueAt(i, 1).toString());

                total += valor * cantidad;
            }

            if (texCliente.getText().trim().isEmpty()) {
                throw new IllegalStateException("Debe ingresar una indicación");
            }

            String indicacion = texCliente.getText();

            LocalTime horaActual = LocalTime.now();
            DateTimeFormatter formatoHora = DateTimeFormatter.ofPattern("HH:mm");
            String horaMinutoActual = horaActual.format(formatoHora);

            Pedido nuevoPedido = new Pedido(descripcion, indicacion, mesas, horaMinutoActual, total);
            colas.insertar(nuevoPedido);

            pedido.actualizar();
            dispose();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ACCION NO VALIDA: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }

            
    }//GEN-LAST:event_jButton1ActionPerformed

    
    private void jButton1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton1KeyPressed
        
    }//GEN-LAST:event_jButton1KeyPressed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jComboBoxDescripcion1AActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxDescripcion1AActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxDescripcion1AActionPerformed

    private void btnOcuparForActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOcuparForActionPerformed
       int selectMesa = ComboBoxMesas.getSelectedIndex();
       if (selectMesa >= 0 && selectMesa < Marray.length) {
           if (Marray[selectMesa] == 0) {
           Marray[selectMesa] = 1;
           texCombo.setText("Ocupado");
           JOptionPane.showMessageDialog(null, "La mesa " + (selectMesa + 1) + " está ocupada");
           String valorSeleccionado = String.valueOf(selectMesa + 1);
           TexMesas.setText(valorSeleccionado);
           tablaMesas.mostrarMesas();
           } else {
                JOptionPane.showMessageDialog(null, "La mesa " + (selectMesa + 1) + " está ocupada, busque una disponible", "Advertencia", JOptionPane.WARNING_MESSAGE);
           }   
       }    
    }//GEN-LAST:event_btnOcuparForActionPerformed

    private void texComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_texComboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_texComboActionPerformed

    private void texClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_texClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_texClienteActionPerformed

    private void btnVerMesasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerMesasActionPerformed
        if (tablaMesas == null) {
            tablaMesas = new TablaMesas(Marray);
        }
         tablaMesas.mostrar();
    }//GEN-LAST:event_btnVerMesasActionPerformed

    private void btnLiberarFor1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLiberarFor1ActionPerformed
        int selectMesa = ComboBoxMesas.getSelectedIndex();
        if (selectMesa >= 0 && selectMesa < Marray.length) {
            Marray[selectMesa] = 0;
            texCombo.setText("Disponible");
            JOptionPane.showMessageDialog(null, "La mesa " + (selectMesa + 1) + " está disponible");
            TexMesas.setText("");
            tablaMesas.mostrarMesas();
        }
    }//GEN-LAST:event_btnLiberarFor1ActionPerformed

        
    private void ComboBoxMesasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboBoxMesasActionPerformed
        int selectMesa = ComboBoxMesas.getSelectedIndex();
        if (selectMesa >= 0 && selectMesa < Marray.length) {
            String estado;
            if (Marray[selectMesa] == 0) {
                estado = "Disponible";
            }
            else {
                estado = "Ocupado";
            }
            
            texCombo.setText(estado);        
        }
    }//GEN-LAST:event_ComboBoxMesasActionPerformed

    private void AgregarPlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregarPlActionPerformed
        try {
            String nombre = String.valueOf(jComboBoxDescripcion1A.getSelectedItem());
            if (nombre == null || nombre.equals("null")) {
                throw new IllegalArgumentException();
            }
            int cantidad = (int) jSpinnerDescripcion1B.getValue();
            if (cantidad <= 0) {
                throw new NumberFormatException();
            }
            DefaultTableModel modelo = (DefaultTableModel) jTable1.getModel();
            modelo.addRow(new Object[]{nombre, cantidad});

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ACCION NO VALIDA", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_AgregarPlActionPerformed

    private void AgregarBeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregarBeActionPerformed
        try {
            String nombre = String.valueOf(jComboBoxDescripcion2A.getSelectedItem());
            if (nombre == null || nombre.equals("null")) {
                throw new IllegalArgumentException();
            }
            int cantidad = (int) jSpinnerDescripcion2B.getValue();
            if (cantidad <= 0) {
                throw new NumberFormatException();
            }
            DefaultTableModel modelo = (DefaultTableModel) jTable1.getModel();
            modelo.addRow(new Object[]{nombre, cantidad});

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ACCION NO VALIDA", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_AgregarBeActionPerformed

    private void TexMesasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TexMesasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TexMesasActionPerformed

    private void texDNIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_texDNIActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_texDNIActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        int dni = Integer.parseInt(texDNI.getText());
            String nombreCliente = cliente.buscarCliente(dni);
            texCliente.setText(nombreCliente);
    }//GEN-LAST:event_btnBuscarActionPerformed
 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AgregarBe;
    private javax.swing.JButton AgregarPl;
    private javax.swing.JComboBox<String> ComboBoxMesas;
    private javax.swing.JLabel Labellndicacion;
    private javax.swing.JLabel Labellndicacion1;
    private javax.swing.JLabel Labellndicacion2;
    private javax.swing.JTextField TexMesas;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnLiberarFor1;
    private javax.swing.JButton btnOcuparFor;
    private javax.swing.JButton btnVerMesas;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBoxDescripcion1A;
    private javax.swing.JComboBox<String> jComboBoxDescripcion2A;
    private javax.swing.JComboBox<String> jComboBoxTipo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSpinner jSpinnerDescripcion1B;
    private javax.swing.JSpinner jSpinnerDescripcion2B;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField texCliente;
    private javax.swing.JTextField texCombo;
    private javax.swing.JTextField texDNI;
    // End of variables declaration//GEN-END:variables
}
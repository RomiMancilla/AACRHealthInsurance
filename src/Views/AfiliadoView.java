package Views;

import Controller.AfiliadoData;
import Model.Afiliado;
import java.awt.Color;
import javax.swing.JOptionPane;

public class AfiliadoView extends javax.swing.JPanel {

    AfiliadoData afiData = new AfiliadoData();

    public AfiliadoView() {
        initComponents();
        btCancelar.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        tfTelefono = new javax.swing.JTextField();
        tfBusqueda = new javax.swing.JTextField();
        tfDni = new javax.swing.JTextField();
        tfApellido = new javax.swing.JTextField();
        tfNombre = new javax.swing.JTextField();
        tfDireccion = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        tfId = new javax.swing.JTextField();
        btGuardar = new javax.swing.JButton();
        btNuevo = new javax.swing.JButton();
        btEliminar = new javax.swing.JButton();
        cbEditar = new javax.swing.JCheckBox();
        rbEstado = new javax.swing.JRadioButton();
        jSeparator1 = new javax.swing.JSeparator();
        btBuscar = new javax.swing.JButton();
        btCancelar = new javax.swing.JButton();
        label1 = new java.awt.Label();
        label2 = new java.awt.Label();

        jLabel1.setFont(new java.awt.Font("Cantarell", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Gestion de Afiliados");

        tfTelefono.setEditable(false);
        tfTelefono.setMaximumSize(new java.awt.Dimension(150, 2147483647));
        tfTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfTelefonoActionPerformed(evt);
            }
        });
        tfTelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfTelefonoKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfTelefonoKeyTyped(evt);
            }
        });

        tfBusqueda.setFont(new java.awt.Font("Cantarell", 0, 18)); // NOI18N
        tfBusqueda.setMaximumSize(new java.awt.Dimension(80, 2147483647));
        tfBusqueda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfBusquedaActionPerformed(evt);
            }
        });
        tfBusqueda.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfBusquedaKeyTyped(evt);
            }
        });

        tfDni.setEditable(false);
        tfDni.setMaximumSize(new java.awt.Dimension(150, 2147483647));
        tfDni.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfDniKeyTyped(evt);
            }
        });

        tfApellido.setEditable(false);
        tfApellido.setMaximumSize(new java.awt.Dimension(150, 2147483647));
        tfApellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfApellidoKeyTyped(evt);
            }
        });

        tfNombre.setEditable(false);
        tfNombre.setMaximumSize(new java.awt.Dimension(150, 2147483647));
        tfNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfNombreKeyTyped(evt);
            }
        });

        tfDireccion.setEditable(false);
        tfDireccion.setMaximumSize(new java.awt.Dimension(150, 2147483647));

        jLabel8.setFont(new java.awt.Font("Cantarell", 0, 14)); // NOI18N
        jLabel8.setText("ID");

        jLabel9.setFont(new java.awt.Font("Cantarell", 0, 14)); // NOI18N
        jLabel9.setText("DNI");

        jLabel10.setFont(new java.awt.Font("Cantarell", 0, 14)); // NOI18N
        jLabel10.setText("Apellido");

        jLabel11.setFont(new java.awt.Font("Cantarell", 0, 14)); // NOI18N
        jLabel11.setText("Nombre");

        jLabel12.setFont(new java.awt.Font("Cantarell", 0, 14)); // NOI18N
        jLabel12.setText("Dirección");

        jLabel13.setFont(new java.awt.Font("Cantarell", 0, 14)); // NOI18N
        jLabel13.setText("Teléfono");

        tfId.setEditable(false);
        tfId.setMaximumSize(new java.awt.Dimension(150, 85));

        btGuardar.setFont(new java.awt.Font("Cantarell", 0, 15)); // NOI18N
        btGuardar.setText("Guardar");
        btGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btGuardarActionPerformed(evt);
            }
        });

        btNuevo.setFont(new java.awt.Font("Cantarell", 0, 15)); // NOI18N
        btNuevo.setText("Nuevo");
        btNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNuevoActionPerformed(evt);
            }
        });

        btEliminar.setFont(new java.awt.Font("Cantarell", 0, 15)); // NOI18N
        btEliminar.setText("Eliminar");
        btEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEliminarActionPerformed(evt);
            }
        });

        cbEditar.setText("Editar");
        cbEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbEditarActionPerformed(evt);
            }
        });

        rbEstado.setText("Estado");
        rbEstado.setEnabled(false);

        btBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/searching-a-person32.png"))); // NOI18N
        btBuscar.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btBuscar.setBorderPainted(false);
        btBuscar.setContentAreaFilled(false);
        btBuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btBuscarMouseClicked(evt);
            }
        });
        btBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBuscarActionPerformed(evt);
            }
        });

        btCancelar.setBackground(new java.awt.Color(255, 51, 51));
        btCancelar.setText("Cancelar");
        btCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCancelarActionPerformed(evt);
            }
        });

        label1.setAlignment(java.awt.Label.RIGHT);
        label1.setText("DNI Afiliado");

        label2.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addComponent(jLabel9)
                        .addGap(44, 44, 44)
                        .addComponent(tfDni, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(374, 374, 374))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(248, 248, 248)
                        .addComponent(jSeparator1)
                        .addGap(210, 210, 210))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addComponent(label1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(41, 41, 41)
                                .addComponent(tfBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)
                                .addComponent(btBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(75, 75, 75)
                                .addComponent(jLabel8)
                                .addGap(55, 55, 55)
                                .addComponent(tfId, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(301, 301, 301)
                                .addComponent(label2, javax.swing.GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE)
                                .addGap(32, 32, 32)
                                .addComponent(btCancelar))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(140, 140, 140)
                                .addComponent(rbEstado)))
                        .addGap(10, 10, 10))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addGap(27, 27, 27)
                                .addComponent(tfApellido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(176, 176, 176)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btNuevo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(cbEditar)
                                .addGap(5, 5, 5))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12)
                            .addComponent(jLabel13))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(tfNombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(324, 324, 324))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tfTelefono, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(tfDireccion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(176, 176, 176)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btEliminar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btGuardar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGap(59, 59, 59))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabel8))
                    .addComponent(tfId, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btCancelar))))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(jLabel9))
                    .addComponent(tfDni, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel10))
                    .addComponent(tfApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(cbEditar)))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(jLabel11))
                    .addComponent(tfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(btNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabel12))
                    .addComponent(tfDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(btEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel13))
                    .addComponent(tfTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(btGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(20, 20, 20)
                .addComponent(rbEstado))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBuscarActionPerformed
        String dniBuscado = tfBusqueda.getText();
        if (!dniBuscado.isEmpty()) {

            Afiliado afiliadoEncontrado = afiData.obtenerAfiliadoPorDni(dniBuscado);
            if (afiliadoEncontrado != null) {
                tfId.setText(String.valueOf(afiliadoEncontrado.getIdAfiliado()));
                tfDni.setText(dniBuscado);
                tfApellido.setText(afiliadoEncontrado.getApellidoAfiliado());
                tfNombre.setText(afiliadoEncontrado.getNombreAfiliado());
                tfDireccion.setText(afiliadoEncontrado.getDomicilioAfiliado());
                tfTelefono.setText(afiliadoEncontrado.getTelefonoAfiliado());
                rbEstado.setSelected(afiliadoEncontrado.isEstado());
            } else {
                int confirm = JOptionPane.showConfirmDialog(null,
                        "No se encuentra el DNI \n¿Deseas agregarlo?", "Confirmar Alta",
                        JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE);
                if (confirm == JOptionPane.YES_OPTION) {
                    cleanAll();
                    activarCampos();
                    //aquí se debe llamar a mostrar el boton oculto
                    btCancelar.setVisible(true);
                }
                if (confirm == JOptionPane.NO_OPTION) {
                    cleanAll();
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "El campo de busqueda está vacio");
        }
    }//GEN-LAST:event_btBuscarActionPerformed

    private void btBuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btBuscarMouseClicked

    }//GEN-LAST:event_btBuscarMouseClicked

    private void btEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEliminarActionPerformed
        if (!tfId.getText().isEmpty()) {
            int id = Integer.parseInt(tfId.getText());
            int confirm = JOptionPane.showConfirmDialog(
                    null, "¿Está seguro de que deseas eliminar el afiliado?", "Confirmar Eliminación", JOptionPane.YES_NO_OPTION
            );
            if (confirm == JOptionPane.YES_OPTION) {
                afiData.eliminarAfiliado(id);
                cleanAll();
            }
        } else {
            JOptionPane.showMessageDialog(null, "Debe cargar un Afiliado.");
        }
    }//GEN-LAST:event_btEliminarActionPerformed

    private void btCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelarActionPerformed
        desactivarCampos();
        btCancelar.setVisible(false);
        cleanAll();
    }//GEN-LAST:event_btCancelarActionPerformed

    private void tfBusquedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfBusquedaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfBusquedaActionPerformed

    private void btNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNuevoActionPerformed
        cleanAll();
        activarCampos();
    }//GEN-LAST:event_btNuevoActionPerformed

    private void btGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btGuardarActionPerformed
        //verificar flag de checkBox
        if (cbEditar.isSelected()) {
            int id = Integer.parseInt(tfId.getText());
            String dni = tfDni.getText();
            String apellido = tfApellido.getText();
            String nombre = tfNombre.getText();
            String domicilio = tfDireccion.getText();
            String telefono = tfTelefono.getText();
            boolean estado = rbEstado.isSelected();
            // Verificar que ningún campo esté vacío
            if (id > 0 && !dni.isEmpty() && !apellido.isEmpty() && !nombre.isEmpty() && !domicilio.isEmpty() && !telefono.isEmpty()) {
                Afiliado afiliado = new Afiliado(id, nombre, apellido, dni, domicilio, telefono, estado);
                afiData.actualizarAfiliado(afiliado);
                cleanAll();
                desactivarCampos();
                cbEditar.setSelected(false);
            } else {
                JOptionPane.showMessageDialog(this, "Por favor, complete todos los campos.");
            }
        } else {
            String dni = tfDni.getText();
            String apellido = tfApellido.getText();
            String nombre = tfNombre.getText();
            String domicilio = tfDireccion.getText();
            String telefono = tfTelefono.getText();
            boolean estado = rbEstado.isSelected();

            // Verificar que ningún campo esté vacío
            if (!dni.isEmpty() && !apellido.isEmpty() && !nombre.isEmpty() && !domicilio.isEmpty() && !telefono.isEmpty()) {
                Afiliado afiliado = new Afiliado(nombre, apellido, dni, domicilio, telefono, estado);
                afiData.guardarAfiliado(afiliado);
                cleanAll();
                desactivarCampos();
            } else {
                JOptionPane.showMessageDialog(this, "Por favor, complete todos los campos.");
            }
        }
    }//GEN-LAST:event_btGuardarActionPerformed

    private void cbEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbEditarActionPerformed
        if(!tfId.getText().isEmpty()){
        if (cbEditar.isSelected()) {
            activarCampos();
        }else{
            desactivarCampos();
        }
        }
    }//GEN-LAST:event_cbEditarActionPerformed

    private void tfTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfTelefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfTelefonoActionPerformed

    private void tfTelefonoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfTelefonoKeyReleased
        
    }//GEN-LAST:event_tfTelefonoKeyReleased

    private void tfTelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfTelefonoKeyTyped
        Service.Validar.esNumero(evt);
    }//GEN-LAST:event_tfTelefonoKeyTyped

    private void tfDniKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfDniKeyTyped
        Service.Validar.esNumero(evt);
    }//GEN-LAST:event_tfDniKeyTyped

    private void tfApellidoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfApellidoKeyTyped
        Service.Validar.esLetra(evt);
    }//GEN-LAST:event_tfApellidoKeyTyped

    private void tfNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfNombreKeyTyped
        Service.Validar.esLetra(evt);
    }//GEN-LAST:event_tfNombreKeyTyped

    private void tfBusquedaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfBusquedaKeyTyped
       Service.Validar.esNumero(evt);
    }//GEN-LAST:event_tfBusquedaKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btBuscar;
    private javax.swing.JButton btCancelar;
    private javax.swing.JButton btEliminar;
    private javax.swing.JButton btGuardar;
    private javax.swing.JButton btNuevo;
    private javax.swing.JCheckBox cbEditar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private java.awt.Label label1;
    private java.awt.Label label2;
    private javax.swing.JRadioButton rbEstado;
    private javax.swing.JTextField tfApellido;
    private javax.swing.JTextField tfBusqueda;
    private javax.swing.JTextField tfDireccion;
    private javax.swing.JTextField tfDni;
    private javax.swing.JTextField tfId;
    private javax.swing.JTextField tfNombre;
    private javax.swing.JTextField tfTelefono;
    // End of variables declaration//GEN-END:variables

    private void cleanAll() {
        tfId.setText("");
        tfDni.setText("");
        tfApellido.setText("");
        tfNombre.setText("");
        tfDireccion.setText("");
        tfTelefono.setText("");
        rbEstado.setSelected(false);
        tfBusqueda.setText("");
    }

    private void activarCampos() {
        tfDni.setEditable(true);
        tfApellido.setEditable(true);
        tfNombre.setEditable(true);
        tfDireccion.setEditable(true);
        tfTelefono.setEditable(true);
        rbEstado.setEnabled(true);
    }

    private void desactivarCampos() {
        tfDni.setEditable(false);
        tfApellido.setEditable(false);
        tfNombre.setEditable(false);
        tfDireccion.setEditable(false);
        tfTelefono.setEditable(false);
        rbEstado.setEnabled(false);
    }

    public void setFocusTfBusqueda() {
        tfBusqueda.requestFocus();
    }
}

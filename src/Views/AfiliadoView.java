package Views;

import Controller.AfiliadoData;
import Model.Afiliado;
import java.awt.Color;
import javax.swing.JOptionPane;

public class AfiliadoView extends javax.swing.JPanel {

    AfiliadoData afiData = new AfiliadoData();

    public AfiliadoView() {
        initComponents();
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();

        jLabel1.setFont(new java.awt.Font("Cantarell", 1, 28)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Gestion de Afiliados");

        tfTelefono.setEditable(false);
        tfTelefono.setMaximumSize(new java.awt.Dimension(150, 2147483647));
        tfTelefono.addKeyListener(new java.awt.event.KeyAdapter() {
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

        jLabel8.setFont(new java.awt.Font("Cantarell", 1, 15)); // NOI18N
        jLabel8.setText("ID");

        jLabel9.setFont(new java.awt.Font("Cantarell", 1, 15)); // NOI18N
        jLabel9.setText("DNI");

        jLabel10.setFont(new java.awt.Font("Cantarell", 1, 15)); // NOI18N
        jLabel10.setText("Apellido");

        jLabel11.setFont(new java.awt.Font("Cantarell", 1, 15)); // NOI18N
        jLabel11.setText("Nombre");

        jLabel12.setFont(new java.awt.Font("Cantarell", 1, 15)); // NOI18N
        jLabel12.setText("Dirección");

        jLabel13.setFont(new java.awt.Font("Cantarell", 1, 15)); // NOI18N
        jLabel13.setText("Teléfono");

        tfId.setEditable(false);
        tfId.setMaximumSize(new java.awt.Dimension(150, 85));

        btGuardar.setFont(new java.awt.Font("Cantarell", 0, 17)); // NOI18N
        btGuardar.setText("Guardar");
        btGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btGuardarActionPerformed(evt);
            }
        });

        btNuevo.setFont(new java.awt.Font("Cantarell", 0, 17)); // NOI18N
        btNuevo.setText("Nuevo");
        btNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNuevoActionPerformed(evt);
            }
        });

        btEliminar.setFont(new java.awt.Font("Cantarell", 0, 17)); // NOI18N
        btEliminar.setText("Eliminar");
        btEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEliminarActionPerformed(evt);
            }
        });

        cbEditar.setFont(new java.awt.Font("Cantarell", 1, 15)); // NOI18N
        cbEditar.setText("Editar");
        cbEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbEditarActionPerformed(evt);
            }
        });

        rbEstado.setFont(new java.awt.Font("Cantarell", 1, 15)); // NOI18N
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

        jLabel2.setFont(new java.awt.Font("Cantarell", 1, 15)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("DNI:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(6, 6, 6))
            .addGroup(layout.createSequentialGroup()
                .addGap(248, 248, 248)
                .addComponent(jSeparator1)
                .addGap(249, 249, 249))
            .addGroup(layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(tfId, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(276, 276, 276)
                        .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(294, 294, 294))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(140, 140, 140)
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(18, 18, 18))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE))
                                .addGap(20, 20, 20)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tfNombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(tfApellido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(69, 69, 69)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(73, 73, 73)
                                .addComponent(cbEditar)
                                .addGap(64, 64, 64))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(tfBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(6, 6, 6)
                                        .addComponent(btBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(69, 69, 69))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(53, 53, 53)
                                .addComponent(tfDni, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE))
                                .addGap(20, 20, 20)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tfTelefono, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(tfDireccion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(rbEstado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(69, 69, 69)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(47, 47, 47)))
                        .addGap(59, 59, 59))))
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
                    .addComponent(jLabel3)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabel2))
                    .addComponent(tfBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(jLabel8))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(tfId, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel9))
                    .addComponent(tfDni, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addComponent(cbEditar))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jLabel10))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(btNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(tfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jLabel11)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(tfDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addComponent(btEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jLabel12)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tfTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGap(17, 17, 17)
                                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addComponent(rbEstado))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addComponent(btGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jLabel13)))
                .addContainerGap(48, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBuscarActionPerformed
        desactivarCampos();
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
                JOptionPane.showMessageDialog(null, "No se encontro el DNI.");
                cleanAll();
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
                    null, "¿Está Seguro de que deseas Eliminar el Afiliado?", "Confirmar Eliminación", JOptionPane.YES_NO_OPTION
            );
            if (confirm == JOptionPane.YES_OPTION) {
                afiData.eliminarAfiliado(id);
                cleanAll();
                desactivarCampos();
            }
        } else {
            JOptionPane.showMessageDialog(null, "Debe cargar un Afiliado.");
            cleanAll();
            desactivarCampos();
        }
    }//GEN-LAST:event_btEliminarActionPerformed

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
            //Si el check esta tildado se actualiza.
            if (!tfId.getText().isEmpty()) {
                int id = Integer.parseInt(tfId.getText());

                Afiliado afiliado = mapeoData();
                if (afiliado != null) {
                    afiliado.setIdAfiliado(id);
                    afiData.actualizarAfiliado(afiliado);
                    cleanAll();
                    desactivarCampos();
                    cbEditar.setSelected(false);
                }
            } else {
                JOptionPane.showMessageDialog(this, "Por favor, cargue un ID.");
            }
        } else {
            //Si el check no está tildado se guarda.
            if (tfId.getText().isEmpty()) {
                Afiliado afiliado = mapeoData();
                if (afiliado != null) {
                    afiData.guardarAfiliado(afiliado);
                    cleanAll();
                    desactivarCampos();
                }
            }else JOptionPane.showMessageDialog(null, "Presione Nuevo o Editar para hacer cambios.");
        }
    }//GEN-LAST:event_btGuardarActionPerformed

    private void cbEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbEditarActionPerformed
        if (cbEditar.isSelected()) {
            activarCampos();
        } else {
            desactivarCampos();
        }
    }//GEN-LAST:event_cbEditarActionPerformed

    private void tfBusquedaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfBusquedaKeyTyped
    Service.Validar.esNumero(evt);
    }//GEN-LAST:event_tfBusquedaKeyTyped

    private void tfDniKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfDniKeyTyped
    Service.Validar.esNumero(evt);
    }//GEN-LAST:event_tfDniKeyTyped

    private void tfApellidoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfApellidoKeyTyped
      Service.Validar.esLetra(evt);
    }//GEN-LAST:event_tfApellidoKeyTyped

    private void tfNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfNombreKeyTyped
    Service.Validar.esLetra(evt);
    }//GEN-LAST:event_tfNombreKeyTyped

    private void tfTelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfTelefonoKeyTyped
    Service.Validar.esNumero(evt);
    }//GEN-LAST:event_tfTelefonoKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btBuscar;
    private javax.swing.JButton btEliminar;
    private javax.swing.JButton btGuardar;
    private javax.swing.JButton btNuevo;
    private javax.swing.JCheckBox cbEditar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
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

    private Afiliado mapeoData() {
        //Este método captura los datos de los Texfield y devuelve un objeto Afiliado.
        String dni = tfDni.getText();
        String apellido = tfApellido.getText();
        String nombre = tfNombre.getText();
        String domicilio = tfDireccion.getText();
        String telefono = tfTelefono.getText();
        boolean estado = rbEstado.isSelected();

        // Verificar vacíos...
        if (!dni.isEmpty() && !apellido.isEmpty() && !nombre.isEmpty() && !domicilio.isEmpty() && !telefono.isEmpty()) {
            return new Afiliado(nombre, apellido, dni, domicilio, telefono, estado);
        } else {
            if (tfId.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "No hay ningun Afiliado cargado.");
                return null;
            } else {
                JOptionPane.showMessageDialog(this, "Por favor, complete todos los campos.");
                return null;
            }
        }
    }
}

package Views;

import Controller.EspecialidadData;
import Controller.PrestadorData;
import Model.Especialidad;
import Model.Prestador;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author andres
 */
public class PrestadorView extends javax.swing.JPanel {

    PrestadorData prestaData = new PrestadorData();
    EspecialidadData espeData = new EspecialidadData();

    public PrestadorView() {
        initComponents();
        cargarEspecialidadesEnComboBox();
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
        jSeparator1 = new javax.swing.JSeparator();
        tfBusqueda = new javax.swing.JTextField();
        tfIdPrestador = new javax.swing.JTextField();
        tfNombrePrestador = new javax.swing.JTextField();
        tfApellidoPrestador = new javax.swing.JTextField();
        tfMatricula = new javax.swing.JTextField();
        tfDomicilioPrestador = new javax.swing.JTextField();
        tfTelefonoPrestador = new javax.swing.JTextField();
        rbEstado = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btNuevo = new javax.swing.JButton();
        btEliminar = new javax.swing.JButton();
        btGuardar = new javax.swing.JButton();
        btBusqueda = new javax.swing.JButton();
        cbEspecialidad = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();

        jLabel1.setFont(new java.awt.Font("Cantarell", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Prestadores");

        tfBusqueda.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfBusquedaKeyTyped(evt);
            }
        });

        tfIdPrestador.setEditable(false);
        tfIdPrestador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfIdPrestadorActionPerformed(evt);
            }
        });

        tfNombrePrestador.setMaximumSize(new java.awt.Dimension(128, 2147483647));
        tfNombrePrestador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfNombrePrestadorActionPerformed(evt);
            }
        });
        tfNombrePrestador.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfNombrePrestadorKeyTyped(evt);
            }
        });

        tfApellidoPrestador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfApellidoPrestadorActionPerformed(evt);
            }
        });
        tfApellidoPrestador.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfApellidoPrestadorKeyTyped(evt);
            }
        });

        tfMatricula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfMatriculaActionPerformed(evt);
            }
        });
        tfMatricula.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfMatriculaKeyTyped(evt);
            }
        });

        tfDomicilioPrestador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfDomicilioPrestadorActionPerformed(evt);
            }
        });

        tfTelefonoPrestador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfTelefonoPrestadorActionPerformed(evt);
            }
        });
        tfTelefonoPrestador.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfTelefonoPrestadorKeyTyped(evt);
            }
        });

        rbEstado.setText("Estado");
        rbEstado.setEnabled(false);

        jLabel2.setText("IdPrestador");

        jLabel3.setText("Nombre");

        jLabel4.setText("Apellido");

        jLabel5.setText("Matricula");

        jLabel6.setText("Domicilio");

        jLabel7.setText("Teléfono");

        jLabel8.setText("Especialidad");

        btNuevo.setText("Nuevo");
        btNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNuevoActionPerformed(evt);
            }
        });

        btEliminar.setText("Eliminar");
        btEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEliminarActionPerformed(evt);
            }
        });

        btGuardar.setText("Guardar");
        btGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btGuardarActionPerformed(evt);
            }
        });

        btBusqueda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/searching-a-person32.png"))); // NOI18N
        btBusqueda.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btBusqueda.setContentAreaFilled(false);
        btBusqueda.setPreferredSize(new java.awt.Dimension(48, 40));
        btBusqueda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBusquedaActionPerformed(evt);
            }
        });

        jLabel9.setText("Ingrese Matrícula:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 770, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(220, 220, 220)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(320, 320, 320)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(tfBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(btBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(tfIdPrestador, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jLabel3)
                .addGap(57, 57, 57)
                .addComponent(tfNombrePrestador, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jLabel4)
                .addGap(58, 58, 58)
                .addComponent(tfApellidoPrestador, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jLabel6)))
                .addGap(58, 58, 58)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfDomicilioPrestador, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(133, 133, 133)
                .addComponent(btNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel7)
                .addGap(63, 63, 63)
                .addComponent(tfTelefonoPrestador, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(130, 130, 130)
                .addComponent(btEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel8)
                .addGap(37, 37, 37)
                .addComponent(cbEspecialidad, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(130, 130, 130)
                .addComponent(btGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(160, 160, 160)
                .addComponent(rbEstado))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1)
                .addGap(16, 16, 16)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel9))
                    .addComponent(tfBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel2))
                    .addComponent(tfIdPrestador, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel3))
                    .addComponent(tfNombrePrestador, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel4))
                    .addComponent(tfApellidoPrestador, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel5)
                        .addGap(41, 41, 41)
                        .addComponent(jLabel6))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(tfMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(tfDomicilioPrestador, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(btNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel7))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(tfTelefonoPrestador, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel8))
                    .addComponent(cbEspecialidad, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(rbEstado))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void tfIdPrestadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfIdPrestadorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfIdPrestadorActionPerformed

    private void tfNombrePrestadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfNombrePrestadorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfNombrePrestadorActionPerformed

    private void tfApellidoPrestadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfApellidoPrestadorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfApellidoPrestadorActionPerformed

    private void tfMatriculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfMatriculaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfMatriculaActionPerformed

    private void tfDomicilioPrestadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfDomicilioPrestadorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfDomicilioPrestadorActionPerformed

    private void tfTelefonoPrestadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfTelefonoPrestadorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfTelefonoPrestadorActionPerformed

    private void btBusquedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBusquedaActionPerformed
        cleanAll();
        String matriculaBuscada = tfBusqueda.getText();
        if (!matriculaBuscada.isEmpty()) {
            int matricula = Integer.parseInt(matriculaBuscada);
            Prestador prestador = prestaData.obtenerPrestadorPorMatricula(matricula);
            if (prestador != null) {
                tfIdPrestador.setText(String.valueOf(prestador.getIdPrestador()));
                tfApellidoPrestador.setText(prestador.getApellidoPrestador());
                tfNombrePrestador.setText(prestador.getNombrePrestador());
                tfMatricula.setText(String.valueOf(prestador.getMatricula()));
                tfDomicilioPrestador.setText(prestador.getDomicilioPrestador());
                tfTelefonoPrestador.setText(prestador.getTelefonoPrestador());
                rbEstado.setSelected(prestador.isEstado());
                // Establece la especialidad en el JComboBox
                cbEspecialidad.setSelectedItem(prestador.getEspecialidad().getNombreEspecialidad());
                activarCampos();
                disableStatus();
            } else {
                JOptionPane.showMessageDialog(null, "No se encontró esa matrícula");
            }
        } else {
            JOptionPane.showMessageDialog(null, "El campo de busqueda no puede estar vacio.");
        }
    }//GEN-LAST:event_btBusquedaActionPerformed

    private void btEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEliminarActionPerformed
        String idPrestadorStr = tfIdPrestador.getText();
        if (!idPrestadorStr.isEmpty()) {
            int idPrestador = Integer.parseInt(idPrestadorStr);
            //Mostrar confirmación
            int confirmacion = JOptionPane.showConfirmDialog(this, "¿Estás seguro de que quieres eliminar este prestador?", "Confirmación de eliminación", JOptionPane.YES_NO_OPTION);
            if (confirmacion == JOptionPane.YES_OPTION) {
                prestaData.borrarPrestador(idPrestador);
                cleanAll();
                desactivarCampos();
                tfBusqueda.setText("");
            }
        } else {
            JOptionPane.showMessageDialog(null, "El campo IdPrestador está vacío");
        }
    }//GEN-LAST:event_btEliminarActionPerformed

    private void btNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNuevoActionPerformed
        cleanAll();
        cargarEspecialidadesEnComboBox();
        activarBotones();
        activarCampos();
        tfBusqueda.setText("");
        rbEstado.setEnabled(true);
    }//GEN-LAST:event_btNuevoActionPerformed

    private void btGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btGuardarActionPerformed
        //se toma como referencia el contenido del TextField idPrestador
        String idPrestadorText = tfIdPrestador.getText();
        if (idPrestadorText.isEmpty()) {
            boolean exito = guardarPrestador();
            if (exito) {
                desactivarCampos();
                disableStatus();
            }
        } else {
            actualizarPrestador();
            desactivarCampos();
            disableStatus();
        }
    }//GEN-LAST:event_btGuardarActionPerformed

    private void tfBusquedaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfBusquedaKeyTyped
        Service.Validar.esNumero(evt);
    }//GEN-LAST:event_tfBusquedaKeyTyped

    private void tfNombrePrestadorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfNombrePrestadorKeyTyped
        Service.Validar.esLetra(evt);
    }//GEN-LAST:event_tfNombrePrestadorKeyTyped

    private void tfApellidoPrestadorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfApellidoPrestadorKeyTyped
        Service.Validar.esLetra(evt);
    }//GEN-LAST:event_tfApellidoPrestadorKeyTyped

    private void tfMatriculaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfMatriculaKeyTyped
        Service.Validar.esNumero(evt);
    }//GEN-LAST:event_tfMatriculaKeyTyped

    private void tfTelefonoPrestadorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfTelefonoPrestadorKeyTyped
        Service.Validar.esNumero(evt);
    }//GEN-LAST:event_tfTelefonoPrestadorKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btBusqueda;
    private javax.swing.JButton btEliminar;
    private javax.swing.JButton btGuardar;
    private javax.swing.JButton btNuevo;
    private javax.swing.JComboBox<String> cbEspecialidad;
    private javax.swing.JLabel jLabel1;
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
    private javax.swing.JTextField tfApellidoPrestador;
    private javax.swing.JTextField tfBusqueda;
    private javax.swing.JTextField tfDomicilioPrestador;
    private javax.swing.JTextField tfIdPrestador;
    private javax.swing.JTextField tfMatricula;
    private javax.swing.JTextField tfNombrePrestador;
    private javax.swing.JTextField tfTelefonoPrestador;
    // End of variables declaration//GEN-END:variables

    private void cleanAll() {
        tfIdPrestador.setText("");
        tfApellidoPrestador.setText("");
        tfNombrePrestador.setText("");
        tfMatricula.setText("");
        tfDomicilioPrestador.setText("");
        tfTelefonoPrestador.setText("");
        cbEspecialidad.setSelectedIndex(-1); // Deseleccionar cualquier elemento...
        rbEstado.setSelected(false);
    }

    private void cargarEspecialidadesEnComboBox() {
        List<Especialidad> listaEspecialidades = espeData.listarEspecialidades();
        for (Especialidad especialidad : listaEspecialidades) {
            cbEspecialidad.addItem(especialidad.getNombreEspecialidad());
        }
    }

    private void activarBotones() {
        btEliminar.setEnabled(true);
        btGuardar.setEnabled(true);
    }

    private void desactivarBotones() {
        btEliminar.setEnabled(false);
        btGuardar.setEnabled(false);
    }

    private void activarCampos() {
        tfApellidoPrestador.setEditable(true);
        tfNombrePrestador.setEditable(true);
        tfDomicilioPrestador.setEditable(true);
        tfMatricula.setEditable(true);
        tfTelefonoPrestador.setEditable(true);
        cbEspecialidad.setEnabled(true);
        rbEstado.setEnabled(true);
    }

    private void desactivarCampos() {
        tfApellidoPrestador.setEditable(false);
        tfNombrePrestador.setEditable(false);
        tfDomicilioPrestador.setEditable(false);
        tfMatricula.setEditable(false);
        tfTelefonoPrestador.setEditable(false);
        cbEspecialidad.setEnabled(false);
        rbEstado.setEnabled(false);
    }

    private void disableStatus() {
        rbEstado.setEnabled(false);
    }

    private void enableStatus() {
        rbEstado.setEnabled(true);
    }

//****************************************************************************************************************    
//Modularización del Boton Guardar
    private boolean guardarPrestador() {
        String nombre = tfNombrePrestador.getText();
        String apellido = tfApellidoPrestador.getText();
        String matriculaStr = tfMatricula.getText();
        String domicilio = tfDomicilioPrestador.getText();
        String telefono = tfTelefonoPrestador.getText();
        String especialidadNom = (String) cbEspecialidad.getSelectedItem();
        boolean estado = rbEstado.isSelected();
        System.out.println("El estado es : " + estado);

        // Validar campos vacíos
        if (nombre.isEmpty() || apellido.isEmpty() || matriculaStr.isEmpty() || domicilio.isEmpty() || telefono.isEmpty() || especialidadNom == null) {
            JOptionPane.showMessageDialog(null, "Por favor, complete todos los campos obligatorios. GUARDAR");
            return false;
        }

        // Parseo matrícula a entero
        int matricula = Integer.parseInt(matriculaStr);
        Especialidad especialidad = espeData.obtenerEspecialidadporNombre(especialidadNom);

        if (especialidad != null) {
            Prestador prestador = new Prestador(nombre, apellido, matricula, domicilio, telefono, estado, especialidad);
            prestaData.guardarPrestador(prestador);
            //JOptionPane.showMessageDialog(null, "Prestador guardado correctamente.");
            cleanAll();
        } else {
            JOptionPane.showMessageDialog(null, "La especialidad no fue encontrada.");
        }
        return true;
    }

    private void actualizarPrestador() {
        String idPrestadorText = tfIdPrestador.getText();
        if (idPrestadorText.isEmpty()) {
            return;
        }
        int idPrestador = Integer.parseInt(idPrestadorText);
        Prestador prestadorExistente = prestaData.obtenerPrestadorPorId(idPrestador);

        if (prestadorExistente != null) {
            String nombre = tfNombrePrestador.getText();
            String apellido = tfApellidoPrestador.getText();
            String matriculaStr = tfMatricula.getText();
            String domicilio = tfDomicilioPrestador.getText();
            String telefono = tfTelefonoPrestador.getText();
            String especialidadNom = (String) cbEspecialidad.getSelectedItem();
            boolean estado = rbEstado.isSelected();

            // Validar campos vacíos
            if (nombre.isEmpty() || apellido.isEmpty() || matriculaStr.isEmpty() || domicilio.isEmpty() || especialidadNom == null) {
                JOptionPane.showMessageDialog(null, "Por favor, complete todos los campos obligatorios.ACTUALIZAR");
                return;
            }

            // Parseo matrícula a entero
            int matricula = Integer.parseInt(matriculaStr);
            Especialidad especialidad = espeData.obtenerEspecialidadporNombre(especialidadNom);

            if (especialidad != null) {
                //Se settea el prestador con los nuevos datos
                prestadorExistente.setNombrePrestador(nombre);
                prestadorExistente.setApellidoPrestador(apellido);
                prestadorExistente.setMatricula(matricula);
                prestadorExistente.setDomicilioPrestador(domicilio);
                prestadorExistente.setTelefonoPrestador(telefono);
                prestadorExistente.setEstado(estado);
                prestadorExistente.setEspecialidad(especialidad);
                //se actualiza
                prestaData.actualizarPrestador(prestadorExistente);
                //JOptionPane.showMessageDialog(null, "Prestador actualizado correctamente.");
                cleanAll();
                tfBusqueda.setText("");
            } else {
                JOptionPane.showMessageDialog(null, "La especialidad no fue encontrada.");
            }
        } else {
            JOptionPane.showMessageDialog(null, "El prestador con el ID especificado no existe.");
        }
    }
}

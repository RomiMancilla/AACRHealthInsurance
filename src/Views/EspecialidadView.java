package Views;

import Controller.EspecialidadData;
import Model.Especialidad;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import javax.management.loading.PrivateClassLoader;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class EspecialidadView extends javax.swing.JPanel {

    DefaultTableModel modelo = new DefaultTableModel() {
        @Override
        public boolean isCellEditable(int row, int column) {
            return false;
        }
    };

    EspecialidadData espeData = new EspecialidadData();
    boolean edit = true;//Flag de derivación entre guardar y editar con el botón "Guardar"

    public EspecialidadView() {
        initComponents();
        armarCabeceraTabla();
        cargarEspecialidades();
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
        tfIdEspecialidad = new javax.swing.JTextField();
        tfNombreEspecialidad = new javax.swing.JTextField();
        rbEstado = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbEpecialidades = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btGuardar = new javax.swing.JButton();
        btNuevo = new javax.swing.JButton();
        btEliminar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        jLabel1.setFont(new java.awt.Font("Cantarell", 1, 28)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Especialidades Médicas");

        tfBusqueda.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfBusquedaKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfBusquedaKeyTyped(evt);
            }
        });

        tfIdEspecialidad.setEditable(false);

        tfNombreEspecialidad.setEditable(false);
        tfNombreEspecialidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfNombreEspecialidadKeyTyped(evt);
            }
        });

        rbEstado.setFont(new java.awt.Font("Cantarell", 1, 15)); // NOI18N
        rbEstado.setText("Estado");
        rbEstado.setEnabled(false);

        tbEpecialidades.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tbEpecialidades.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbEpecialidadesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbEpecialidades);

        jLabel2.setFont(new java.awt.Font("Cantarell", 1, 15)); // NOI18N
        jLabel2.setText("Id Especialidad");

        jLabel3.setFont(new java.awt.Font("Cantarell", 1, 15)); // NOI18N
        jLabel3.setText("Nombre");

        btGuardar.setFont(new java.awt.Font("Cantarell", 1, 17)); // NOI18N
        btGuardar.setText("Guardar");
        btGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btGuardarActionPerformed(evt);
            }
        });

        btNuevo.setFont(new java.awt.Font("Cantarell", 1, 17)); // NOI18N
        btNuevo.setText("Nuevo");
        btNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNuevoActionPerformed(evt);
            }
        });

        btEliminar.setFont(new java.awt.Font("Cantarell", 1, 17)); // NOI18N
        btEliminar.setText("Eliminar");
        btEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEliminarActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Cantarell", 1, 15)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Nombre Especialidad:    ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(15, 15, 15))
            .addGroup(layout.createSequentialGroup()
                .addGap(210, 210, 210)
                .addComponent(jSeparator1)
                .addGap(227, 227, 227))
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(20, 20, 20)
                .addComponent(tfBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
            .addGroup(layout.createSequentialGroup()
                .addGap(160, 475, Short.MAX_VALUE)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(106, 106, 106)
                .addComponent(btGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jLabel2)
                        .addGap(17, 17, 17)
                        .addComponent(tfIdEspecialidad))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(jLabel3)
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rbEstado, javax.swing.GroupLayout.DEFAULT_SIZE, 268, Short.MAX_VALUE)
                            .addComponent(tfNombreEspecialidad))))
                .addGap(74, 74, 74)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(46, 46, 46)
                        .addComponent(btNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(58, 58, 58)
                        .addComponent(btEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(37, 37, 37))
            .addGroup(layout.createSequentialGroup()
                .addGap(112, 112, 112)
                .addComponent(jScrollPane1)
                .addGap(153, 153, 153))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addGap(5, 5, 5)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel4))
                    .addComponent(tfBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 307, Short.MAX_VALUE)
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfIdEspecialidad, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(btNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(tfNombreEspecialidad, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rbEstado)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void tfBusquedaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfBusquedaKeyTyped
        Service.Validar.esLetra(evt);
    }//GEN-LAST:event_tfBusquedaKeyTyped

    private void tfBusquedaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfBusquedaKeyReleased
        cleanTable();
        desactivarCampoNombre();
        cleanProperties();
        String busqueda = tfBusqueda.getText();
        List<Especialidad> listaEspe = new ArrayList<>();

        if (!busqueda.isEmpty()) {
            listaEspe = espeData.obtenerEspecialidadesPorNombre(busqueda);
            if (!listaEspe.isEmpty()) {
                for (Especialidad espe : listaEspe) {
                    String estado = espe.isEstado() ? "Activo" : "Inactivo";//Cambio estado a un String más legible para el usuario.
                    modelo.addRow(new Object[]{espe.getIdEspecialidad(), espe.getNombreEspecialidad(), estado});
                }
                activarTabla();
            }
        } else {
            cargarEspecialidades();
            activarTabla();
        }
    }//GEN-LAST:event_tfBusquedaKeyReleased

    private void tbEpecialidadesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbEpecialidadesMouseClicked
        int rowSelected = tbEpecialidades.getSelectedRow();
        if (rowSelected != -1 && tbEpecialidades.isEnabled()) {
            int idEspecialidad = (int) tbEpecialidades.getValueAt(rowSelected, 0);
            Especialidad espe = espeData.obtenerEspecialidadPorId(idEspecialidad);
            if (espe != null) {
                tfIdEspecialidad.setText(String.valueOf(espe.getIdEspecialidad()));
                tfNombreEspecialidad.setText(espe.getNombreEspecialidad());
                rbEstado.setSelected(espe.isEstado());
                edit = true;
                activarCampoNombre();
            }
        }
    }//GEN-LAST:event_tbEpecialidadesMouseClicked

    private void btNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNuevoActionPerformed
        cleanAll();
        desactivarTabla();
        edit = false;
        cargarEspecialidades();
        activarCampoNombre();
        tfNombreEspecialidad.requestFocus();
    }//GEN-LAST:event_btNuevoActionPerformed

    private void btGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btGuardarActionPerformed
        //Si el flag edit está en True se intenta hacer la edición...
        String nombreActualizado = tfNombreEspecialidad.getText();
        String idEspecialidadStr = tfIdEspecialidad.getText();
        if (edit == true) {
            if (!nombreActualizado.isEmpty() && !idEspecialidadStr.isEmpty()) {
                int idEspecialidad = Integer.parseInt(tfIdEspecialidad.getText());
                Especialidad especialidad = new Especialidad(idEspecialidad, nombreActualizado, true);
                espeData.actualizarEspecialidad(especialidad);
                cleanAll();
                desactivarCampoNombre();
                tbEpecialidades.clearSelection();
            } else {
                JOptionPane.showMessageDialog(null, "El campo nombre de Especialidad no puede estar vacio.");
            }
        } else {
            //Si el flag está en False se intenta guardar
            if (!nombreActualizado.isEmpty()) {
                Especialidad especialidad = new Especialidad(nombreActualizado, true);
                espeData.agregarEspecialidad(especialidad);
                desactivarCampoNombre();
                cleanAll();
                tbEpecialidades.clearSelection();
            }
        }

    }//GEN-LAST:event_btGuardarActionPerformed

    private void btEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEliminarActionPerformed
        String idEspecialidadStr = tfIdEspecialidad.getText();
        if (!idEspecialidadStr.isEmpty()) {
            int idEspecialidad = Integer.parseInt(idEspecialidadStr);
            int confirmacion = JOptionPane.showConfirmDialog(null, "¿Está seguro de que desea eliminar esta especialidad?", "Confirmación de eliminación", JOptionPane.YES_NO_OPTION);
            if (confirmacion == JOptionPane.YES_OPTION) {
                espeData.eliminarEspecialidad(idEspecialidad);
                cleanAll();
                cleanTable();
                cargarEspecialidades();
            }
        } else {
            JOptionPane.showMessageDialog(null, "Tiene que elegir una Especialidad");
        }
    }//GEN-LAST:event_btEliminarActionPerformed

    private void tfNombreEspecialidadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfNombreEspecialidadKeyTyped
        Service.Validar.esLetra(evt);
    }//GEN-LAST:event_tfNombreEspecialidadKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btEliminar;
    private javax.swing.JButton btGuardar;
    private javax.swing.JButton btNuevo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JRadioButton rbEstado;
    private javax.swing.JTable tbEpecialidades;
    private javax.swing.JTextField tfBusqueda;
    private javax.swing.JTextField tfIdEspecialidad;
    private javax.swing.JTextField tfNombreEspecialidad;
    // End of variables declaration//GEN-END:variables

    private void armarCabeceraTabla() {
        modelo.addColumn("idEspecialidad");
        modelo.addColumn("nombreEspecialidad");
        modelo.addColumn("estado");
        tbEpecialidades.setModel(modelo);
    }

    private void cargarEspecialidades() {
        List<Especialidad> listaEspecialidades = espeData.listarEspecialidades();
        Collections.sort(listaEspecialidades);
        for (Especialidad espe : listaEspecialidades) {
            if (listaEspecialidades != null) {
                String estado = espe.isEstado() ? "Activo" : "Inactivo";//Cambio a visualización más legible para el usuario.
                modelo.addRow(new Object[]{espe.getIdEspecialidad(), espe.getNombreEspecialidad(), estado});
            }
        }
    }

    private void cleanTable() {
        modelo.setRowCount(0);
    }

    private void cleanAll() {
        tfBusqueda.setText("");
        tfIdEspecialidad.setText("");
        tfNombreEspecialidad.setText("");
        rbEstado.setSelected(false);
    }

    private void cleanProperties() {
        tfIdEspecialidad.setText("");
        tfNombreEspecialidad.setText("");
        rbEstado.setSelected(false);
    }

    private void activarCampoNombre() {
        tfNombreEspecialidad.setEditable(true);
    }

    private void desactivarCampoNombre() {
        tfNombreEspecialidad.setEditable(false);
    }

    private void desactivarTabla() {
        tbEpecialidades.setEnabled(false);
    }

    private void activarTabla() {
        tbEpecialidades.setEnabled(true);
    }
}

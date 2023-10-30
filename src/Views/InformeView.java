package Views;

import Controller.AfiliadoData;
import Controller.EspecialidadData;
import Controller.OrdenData;
import Controller.PrestadorData;
import Model.Afiliado;
import Model.Especialidad;
import Model.Orden;
import Model.Prestador;
import Service.Pdf;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;
import Service.CustomJTable;

/**
 *
 * @author andres
 */
public class InformeView extends javax.swing.JPanel {

    DefaultTableModel modeloTablaAfiliado = new DefaultTableModel() {
        @Override
        public boolean isCellEditable(int row, int column) {
            return false;
        }
    };
    DefaultTableModel modeloTablaPrestador = new DefaultTableModel() {
        @Override
        public boolean isCellEditable(int row, int column) {
            return false;
        }
    };
    DefaultTableModel modeloTablaOrdenes = new DefaultTableModel() {
        @Override
        public boolean isCellEditable(int row, int column) {
            return false;
        }
    };
    DefaultTableModel modeloTablaPrestadores = new DefaultTableModel() {
        @Override
        public boolean isCellEditable(int row, int column) {
            return false;
        }
    };

    AfiliadoData afiData = new AfiliadoData();
    PrestadorData prestadorData = new PrestadorData();
    OrdenData ordenData = new OrdenData();
    EspecialidadData espeData = new EspecialidadData();

    public InformeView() {
        initComponents();
        cabeceraTablaAfiliado();
        cabeceraTablaPrestadores();
        cargarTablaAfiliados();
        cabeceraTablaOrdenes();
        cargarTablaOrdenes();
        cargarComboEspeciliadades();
        cabeceraPrestadoresXEspecialidad();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbAfiliadoPrestador = new CustomJTable();
        jButton1 = new javax.swing.JButton();
        cbListadoAfiliado = new javax.swing.JCheckBox();
        cbListadoPrestadores = new javax.swing.JCheckBox();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        dcFecha = new com.toedter.calendar.JDateChooser();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbOrdenes = new CustomJTable();
        jButton2 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        cbEspecialidad = new javax.swing.JComboBox<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbPrestadores = new CustomJTable();
        jButton3 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();

        jLabel1.setFont(new java.awt.Font("Cantarell", 1, 20)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Informe de Afiliados y Prestadores Activos");

        tbAfiliadoPrestador.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tbAfiliadoPrestador);

        jButton1.setFont(new java.awt.Font("Cantarell", 0, 17)); // NOI18N
        jButton1.setText("Imprimir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        cbListadoAfiliado.setSelected(true);
        cbListadoAfiliado.setText("Listado Afiliados");
        cbListadoAfiliado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbListadoAfiliadoActionPerformed(evt);
            }
        });

        cbListadoPrestadores.setText("Listado Prestadores");
        cbListadoPrestadores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbListadoPrestadoresActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(117, 117, 117)
                        .addComponent(cbListadoAfiliado, javax.swing.GroupLayout.DEFAULT_SIZE, 196, Short.MAX_VALUE)
                        .addGap(169, 169, 169)
                        .addComponent(cbListadoPrestadores, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5)
                        .addGap(50, 50, 50))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 705, Short.MAX_VALUE))
                .addGap(28, 28, 28))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbListadoAfiliado)
                            .addComponent(cbListadoPrestadores)
                            .addComponent(jLabel5)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 318, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );

        jTabbedPane1.addTab("Afiliados/Prestadores", jPanel2);

        jLabel2.setFont(new java.awt.Font("Cantarell", 1, 20)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Informe de Órdenes por Fecha");

        dcFecha.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                dcFechaPropertyChange(evt);
            }
        });

        tbOrdenes.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(tbOrdenes);

        jButton2.setFont(new java.awt.Font("Cantarell", 0, 17)); // NOI18N
        jButton2.setText("Imprimir");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(96, 96, 96)
                        .addComponent(dcFecha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(56, 56, 56)
                        .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 711, Short.MAX_VALUE))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 727, Short.MAX_VALUE))
                        .addContainerGap())))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(dcFecha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(36, 36, 36)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 324, Short.MAX_VALUE)
                .addGap(30, 30, 30)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Órdenes", jPanel3);

        jLabel3.setFont(new java.awt.Font("Cantarell", 1, 20)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Informe de Prestadores por Especialidades");

        cbEspecialidad.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbEspecialidadItemStateChanged(evt);
            }
        });

        tbPrestadores.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane3.setViewportView(tbPrestadores);

        jButton3.setFont(new java.awt.Font("Cantarell", 0, 17)); // NOI18N
        jButton3.setText("Imprimir");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 737, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(300, 300, 300)
                        .addComponent(cbEspecialidad, 0, 170, Short.MAX_VALUE)
                        .addGap(284, 284, 284)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 705, Short.MAX_VALUE)
                .addGap(30, 30, 30))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(cbEspecialidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 318, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
        );

        jTabbedPane1.addTab("Prestadores", jPanel4);

        jLabel4.setFont(new java.awt.Font("Cantarell", 1, 28)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Informes");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(17, 17, 17))
            .addGroup(layout.createSequentialGroup()
                .addGap(260, 260, 260)
                .addComponent(jSeparator1)
                .addGap(277, 277, 277))
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jTabbedPane1)
                .addGap(37, 37, 37))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel4)
                .addGap(0, 0, 0)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(jTabbedPane1)
                .addGap(23, 23, 23))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void cbListadoAfiliadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbListadoAfiliadoActionPerformed
        if (cbListadoAfiliado.isSelected()) {
            cargarTablaAfiliados();
            cbListadoPrestadores.setSelected(false);
        }
    }//GEN-LAST:event_cbListadoAfiliadoActionPerformed

    private void cbListadoPrestadoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbListadoPrestadoresActionPerformed
        if (cbListadoPrestadores.isSelected()) {
            cargarTablaPrestadores();
            cbListadoAfiliado.setSelected(false);
        }
    }//GEN-LAST:event_cbListadoPrestadoresActionPerformed

    private void dcFechaPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_dcFechaPropertyChange
        cleanTableOrdenes();
        Date fecha = dcFecha.getDate();
        if (fecha != null) {
            LocalDate localDate = fecha.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
            List<Orden> listaOrdenes = ordenData.listaDeOrdenes();
            if (listaOrdenes != null) {
                for (Orden orden : listaOrdenes) {
                    if (orden.getFecha().equals(localDate)) {
                        Object[] rowData = {
                            orden.getIdOrden(),
                            orden.getFecha().toString(),
                            orden.getFormaDePago(),
                            orden.getImporte(),
                            orden.getAfiliado().getIdAfiliado(),
                            orden.getPrestador().getIdPrestador()};
                        modeloTablaOrdenes.addRow(rowData);
                    }
                }
            }
        }
    }//GEN-LAST:event_dcFechaPropertyChange

    private void cbEspecialidadItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbEspecialidadItemStateChanged
        cleanTablaPrestadoresxEspe();
        cargarTablaPrestadoresxEspecialidad();
    }//GEN-LAST:event_cbEspecialidadItemStateChanged

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // Obtener la tabla que deseas imprimir
        if (cbListadoAfiliado.isSelected()) {
            JTable tableToPrint = tbAfiliadoPrestador;
            Pdf.generarPdf(tableToPrint, 1);
            JOptionPane.showMessageDialog(null, "PDF generado con éxito");
        } else {
            JTable tableToPrint = tbAfiliadoPrestador;
            Pdf.generarPdf(tableToPrint, 2);
            JOptionPane.showMessageDialog(null, "PDF generado con éxito");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        JTable tablaImprimir = tbOrdenes;
        Pdf.generarPdf(tablaImprimir, 3);
        JOptionPane.showMessageDialog(null, "PDF generado con éxito");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        JTable tableToPrint = tbPrestadores;
        Pdf.generarPdf(tableToPrint, 4);
        JOptionPane.showMessageDialog(null, "PDF generado con éxito");

    }//GEN-LAST:event_jButton3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbEspecialidad;
    private javax.swing.JCheckBox cbListadoAfiliado;
    private javax.swing.JCheckBox cbListadoPrestadores;
    private com.toedter.calendar.JDateChooser dcFecha;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable tbAfiliadoPrestador;
    private javax.swing.JTable tbOrdenes;
    private javax.swing.JTable tbPrestadores;
    // End of variables declaration//GEN-END:variables

    private void cabeceraTablaPrestadores() {
        modeloTablaPrestador.addColumn("ID Prestador");
        modeloTablaPrestador.addColumn("Apellido");
        modeloTablaPrestador.addColumn("Nombre");
        modeloTablaPrestador.addColumn("Especialidad");
        tbAfiliadoPrestador.setModel(modeloTablaPrestador);

        // Establecer el ancho preferido de la columna ID (columna 0)
        //TableColumnModel columnModel = tbPrestadores.getColumnModel();
        //TableColumn idColumn = columnModel.getColumn(0);
        //idColumn.setPreferredWidth(20);
    }

    private void cargarTablaPrestadores() {
        cleanTablePrestadores();
        List<Prestador> listaPrestador = prestadorData.listarPrestadores();
        Collections.sort(listaPrestador);
        if (listaPrestador != null) {
            for (Prestador prestador : listaPrestador) {
                if (prestador.getEspecialidad() != null) {

                    modeloTablaPrestador.addRow(new Object[]{prestador.getIdPrestador(), prestador.getApellidoPrestador(), prestador.getNombrePrestador(), prestador.getEspecialidad().getNombreEspecialidad()});
                }
            }
        }
        tbAfiliadoPrestador.setModel(modeloTablaPrestador);
    }

    private void cabeceraTablaAfiliado() {
        modeloTablaAfiliado.addColumn("ID Afiliado");
        modeloTablaAfiliado.addColumn("Apellido");
        modeloTablaAfiliado.addColumn("Nombre");
        modeloTablaAfiliado.addColumn("Dni");
        tbAfiliadoPrestador.setModel(modeloTablaAfiliado);
    }

    private void cargarTablaAfiliados() {
        cleanTableAfiliado();
        List<Afiliado> listaAfiliado = afiData.listarAfiliados();
        Collections.sort(listaAfiliado);
        if (listaAfiliado != null) {
            for (Afiliado afiliado : listaAfiliado) {
                modeloTablaAfiliado.addRow(new Object[]{afiliado.getIdAfiliado(), afiliado.getApellidoAfiliado(), afiliado.getNombreAfiliado(), afiliado.getDni()});
            }
        }
        tbAfiliadoPrestador.setModel(modeloTablaAfiliado);
    }

    private void cleanTableAfiliado() {
        modeloTablaAfiliado.setRowCount(0);
    }

    private void cleanTablePrestadores() {
        modeloTablaPrestador.setRowCount(0);
    }

    private void cleanTableOrdenes() {
        modeloTablaOrdenes.setRowCount(0);
    }

    private void cabeceraTablaOrdenes() {
        modeloTablaOrdenes.addColumn("ID Orden");
        modeloTablaOrdenes.addColumn("Fecha");
        modeloTablaOrdenes.addColumn("Forma de Pago");
        modeloTablaOrdenes.addColumn("Importe");
        modeloTablaOrdenes.addColumn("ID Afiliado");
        modeloTablaOrdenes.addColumn("ID Prestador");
        tbOrdenes.setModel(modeloTablaOrdenes);
    }

    private void cargarTablaOrdenes() {
        cleanTableOrdenes();
        List<Orden> listaOrden = ordenData.listaDeOrdenes();
        if (listaOrden != null) {
            for (Orden orden : listaOrden) {
                modeloTablaOrdenes.addRow(new Object[]{orden.getIdOrden(), orden.getFecha(), orden.getFormaDePago(), orden.getImporte(), orden.getAfiliado().getIdAfiliado(), orden.getPrestador().getIdPrestador()});
            }
        }
        tbOrdenes.setModel(modeloTablaOrdenes);
    }

    private void cabeceraPrestadoresXEspecialidad() {
        modeloTablaPrestadores.addColumn("ID Prestador");
        modeloTablaPrestadores.addColumn("Apellido");
        modeloTablaPrestadores.addColumn("Nombre");
        modeloTablaPrestadores.addColumn("Matricula");
        modeloTablaPrestadores.addColumn("Especialidad");
        tbPrestadores.setModel(modeloTablaPrestadores);
    }

    private void cargarTablaPrestadoresxEspecialidad() {
        cleanTablaPrestadoresxEspe();
        List<Prestador> listaPrestador = prestadorData.listarPrestadores();
        Collections.sort(listaPrestador);
        if (listaPrestador != null) {
            for (Prestador prestador : listaPrestador) {
                if (prestador.getEspecialidad() != null) {
                    if (prestador.getEspecialidad().getNombreEspecialidad().equals(cbEspecialidad.getSelectedItem())) {
                        modeloTablaPrestadores.addRow(new Object[]{prestador.getIdPrestador(), prestador.getApellidoPrestador(), prestador.getNombrePrestador(), prestador.getMatricula(), prestador.getEspecialidad().getNombreEspecialidad()});
                    }
                }
            }
        }
        tbPrestadores.setModel(modeloTablaPrestadores);
    }

    private void cleanTablaPrestadoresxEspe() {
        modeloTablaPrestadores.setRowCount(0);
    }

    private void cargarComboEspeciliadades() {
        List<Especialidad> listaEspecialidad = espeData.listarEspecialidades();
        if (listaEspecialidad != null) {
            for (Especialidad especialidad : listaEspecialidad) {
                cbEspecialidad.addItem(especialidad.getNombreEspecialidad());
            }
        }
    }
}

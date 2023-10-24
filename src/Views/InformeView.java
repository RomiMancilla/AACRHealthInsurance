package Views;

import Controller.AfiliadoData;
import Controller.PrestadorData;
import Model.Afiliado;
import Model.Prestador;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;

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
    AfiliadoData afiData = new AfiliadoData();
    PrestadorData prestadorData = new PrestadorData();

    public InformeView() {
        initComponents();
        cabeceraTablaAfiliado();
        cabeceraTablaPrestadores();
        cargarTablaAfiliados();
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
        tbAfiliadoPrestador = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        cbListadoAfiliado = new javax.swing.JCheckBox();
        cbListadoPrestadores = new javax.swing.JCheckBox();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));

        jLabel1.setFont(new java.awt.Font("Cantarell", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Informe de Afiliados Activos");

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

        jButton1.setText("Imprimir");

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
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 706, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addGap(635, 635, 635)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 33, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(192, 192, 192)
                .addComponent(cbListadoAfiliado)
                .addGap(169, 169, 169)
                .addComponent(cbListadoPrestadores)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addGap(39, 39, 39)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbListadoAfiliado)
                    .addComponent(cbListadoPrestadores))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(22, 22, 22))
        );

        jTabbedPane1.addTab("Informe Afiliados", jPanel2);

        jPanel3.setBackground(new java.awt.Color(255, 204, 204));

        jLabel2.setText("Informe de Órdenes por afiliado");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(186, 186, 186)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(260, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel2)
                .addContainerGap(490, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Informe Órdenes", jPanel3);

        jPanel4.setBackground(new java.awt.Color(204, 255, 204));

        jLabel3.setText("Informe de Prestadores por Especialidades");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(172, 172, 172)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(248, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel3)
                .addContainerGap(483, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Informe Prestadores", jPanel4);

        add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, -1));

        jLabel4.setFont(new java.awt.Font("Cantarell", 1, 24)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Informes");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 780, -1));
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 50, 280, -1));
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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox cbListadoAfiliado;
    private javax.swing.JCheckBox cbListadoPrestadores;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable tbAfiliadoPrestador;
    // End of variables declaration//GEN-END:variables

    private void cabeceraTablaPrestadores() {
        modeloTablaPrestador.addColumn("ID");
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
        if (listaPrestador != null) {
            for (Prestador prestador : listaPrestador) {
                modeloTablaPrestador.addRow(new Object[]{prestador.getIdPrestador(), prestador.getApellidoPrestador(), prestador.getNombrePrestador(), prestador.getEspecialidad().getNombreEspecialidad()});
            }
        }
        tbAfiliadoPrestador.setModel(modeloTablaPrestador);
    }

    private void cabeceraTablaAfiliado() {
        modeloTablaAfiliado.addColumn("idAfiliado");
        modeloTablaAfiliado.addColumn("apellidoAfiliado");
        modeloTablaAfiliado.addColumn("nombreAfiliado");
        modeloTablaAfiliado.addColumn("dni");
        tbAfiliadoPrestador.setModel(modeloTablaAfiliado);
    }

    private void cargarTablaAfiliados() {
        cleanTableAfiliado();
        List<Afiliado> listaAfiliado = afiData.listarAfiliados();
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

}

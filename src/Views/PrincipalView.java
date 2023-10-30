package Views;

import com.formdev.flatlaf.FlatDarculaLaf;
import com.formdev.flatlaf.FlatLightLaf;
import com.formdev.flatlaf.intellijthemes.FlatDarkFlatIJTheme;
import com.formdev.flatlaf.intellijthemes.FlatSpacegrayIJTheme;
import com.formdev.flatlaf.intellijthemes.FlatXcodeDarkIJTheme;
import com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatGitHubIJTheme;
import com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatMaterialDarkerIJTheme;
import com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatMaterialDeepOceanIJTheme;
import com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatMaterialLighterIJTheme;
import com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatSolarizedLightIJTheme;
import com.formdev.flatlaf.themes.FlatMacDarkLaf;
import com.formdev.flatlaf.themes.FlatMacLightLaf;
import java.awt.BorderLayout;
import java.util.Locale;
import javax.swing.UIManager;
import Service.ImagenFondoPanel;
import Service.JPanelDegrade;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.SwingUtilities;

/**
 *
 * @author andres
 */
public class PrincipalView extends javax.swing.JFrame {

    private boolean claro = true;

    public PrincipalView() {
        initComponents();
        mostrarFecha();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpBack = new javax.swing.JPanel();
        jpBanner = new ImagenFondoPanel();
        jpMenu = new JPanelDegrade();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        lbFecha = new javax.swing.JLabel();
        lbDia = new javax.swing.JLabel();
        rbClaro = new javax.swing.JRadioButton();
        jpPanelDinamico = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1080, 835));

        jpBack.setBackground(new java.awt.Color(204, 255, 204));

        jpBanner.setBackground(new java.awt.Color(0, 102, 255));

        javax.swing.GroupLayout jpBannerLayout = new javax.swing.GroupLayout(jpBanner);
        jpBanner.setLayout(jpBannerLayout);
        jpBannerLayout.setHorizontalGroup(
            jpBannerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 815, Short.MAX_VALUE)
        );
        jpBannerLayout.setVerticalGroup(
            jpBannerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 137, Short.MAX_VALUE)
        );

        jpMenu.setBackground(new java.awt.Color(51, 204, 255));

        jButton1.setFont(new java.awt.Font("Cantarell", 0, 20)); // NOI18N
        jButton1.setText("Afiliados");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Cantarell", 0, 20)); // NOI18N
        jButton2.setText("Prestadores");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Cantarell", 0, 20)); // NOI18N
        jButton3.setText("Informes");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Cantarell", 0, 20)); // NOI18N
        jButton4.setText("Especialidades");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setFont(new java.awt.Font("Cantarell", 0, 20)); // NOI18N
        jButton5.setText("Órdenes");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jPanel1.setOpaque(false);

        lbFecha.setBackground(new java.awt.Color(204, 204, 204));
        lbFecha.setFont(new java.awt.Font("Cantarell", 1, 26)); // NOI18N
        lbFecha.setForeground(new java.awt.Color(255, 255, 255));
        lbFecha.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        lbDia.setFont(new java.awt.Font("Cantarell", 1, 26)); // NOI18N
        lbDia.setForeground(new java.awt.Color(255, 255, 255));
        lbDia.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbFecha, javax.swing.GroupLayout.DEFAULT_SIZE, 205, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(lbDia, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(lbDia, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbFecha, javax.swing.GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE)
                .addGap(26, 26, 26))
        );

        rbClaro.setFont(new java.awt.Font("Cantarell", 1, 17)); // NOI18N
        rbClaro.setForeground(new java.awt.Color(255, 255, 255));
        rbClaro.setText("Claro");
        rbClaro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        rbClaro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/lightMode.png"))); // NOI18N
        rbClaro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbClaroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpMenuLayout = new javax.swing.GroupLayout(jpMenu);
        jpMenu.setLayout(jpMenuLayout);
        jpMenuLayout.setHorizontalGroup(
            jpMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpMenuLayout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(jpMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpMenuLayout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addGroup(jpMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(rbClaro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(25, 25, 25))
        );
        jpMenuLayout.setVerticalGroup(
            jpMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton5)
                .addGap(41, 41, 41)
                .addComponent(jButton3)
                .addGap(129, 129, 129)
                .addComponent(jButton1)
                .addGap(43, 43, 43)
                .addComponent(jButton2)
                .addGap(41, 41, 41)
                .addComponent(jButton4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 175, Short.MAX_VALUE)
                .addComponent(rbClaro)
                .addGap(28, 28, 28))
        );

        jpPanelDinamico.setBackground(new java.awt.Color(102, 153, 255));

        javax.swing.GroupLayout jpPanelDinamicoLayout = new javax.swing.GroupLayout(jpPanelDinamico);
        jpPanelDinamico.setLayout(jpPanelDinamicoLayout);
        jpPanelDinamicoLayout.setHorizontalGroup(
            jpPanelDinamicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jpPanelDinamicoLayout.setVerticalGroup(
            jpPanelDinamicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jpBackLayout = new javax.swing.GroupLayout(jpBack);
        jpBack.setLayout(jpBackLayout);
        jpBackLayout.setHorizontalGroup(
            jpBackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpBackLayout.createSequentialGroup()
                .addGroup(jpBackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jpBanner, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jpPanelDinamico, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, 0)
                .addComponent(jpMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jpBackLayout.setVerticalGroup(
            jpBackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpBackLayout.createSequentialGroup()
                .addComponent(jpBanner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jpPanelDinamico, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jpMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpBack, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpBack, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        jpPanelDinamico.setLayout(new BorderLayout());
        AfiliadoView afiliadosView = new AfiliadoView();
        afiliadosView.setSize(817, 663);
        afiliadosView.setLocation(0, 0);
        jpPanelDinamico.removeAll();
        jpPanelDinamico.add(afiliadosView, BorderLayout.CENTER);
        jpPanelDinamico.revalidate();
        jpPanelDinamico.repaint();
        afiliadosView.setFocusTfBusqueda();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        jpPanelDinamico.setLayout(new BorderLayout());
        PrestadorView prestadorView = new PrestadorView();
        prestadorView.setSize(817, 663);
        prestadorView.setLocation(0, 0);
        jpPanelDinamico.removeAll();
        jpPanelDinamico.add(prestadorView, BorderLayout.CENTER);
        jpPanelDinamico.revalidate();
        jpPanelDinamico.repaint();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        jpPanelDinamico.setLayout(new BorderLayout());
        InformeView informe = new InformeView();
        informe.setSize(817, 663);
        informe.setLocation(0, 0);
        jpPanelDinamico.removeAll();
        jpPanelDinamico.add(informe, BorderLayout.CENTER);
        jpPanelDinamico.revalidate();
        jpPanelDinamico.repaint();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        jpPanelDinamico.setLayout(new BorderLayout());
        EspecialidadView especialidadView = new EspecialidadView();
        especialidadView.setSize(817, 663);
        especialidadView.setLocation(0, 0);
        jpPanelDinamico.removeAll();
        jpPanelDinamico.add(especialidadView, BorderLayout.CENTER);
        jpPanelDinamico.revalidate();
        jpPanelDinamico.repaint();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        jpPanelDinamico.setLayout(new BorderLayout());
        OrdenView ordenView = new OrdenView();
        ordenView.setSize(817, 663);
        ordenView.setLocation(0, 0);
        jpPanelDinamico.removeAll();
        jpPanelDinamico.add(ordenView, BorderLayout.CENTER);
        jpPanelDinamico.revalidate();
        jpPanelDinamico.repaint();
        ordenView.setFocusTfBusquedaOrden();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void rbClaroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbClaroActionPerformed
        // Cambia el texto del JRadioButton
        if (claro) {
            rbClaro.setText("Oscuro");

            // Carga el nuevo ícono
            ImageIcon nuevoIcono = new ImageIcon(getClass().getResource("/Images/darkMode.png"));

            // Asigna el ícono al JRadioButton
            rbClaro.setIcon(nuevoIcono);
            FlatMacDarkLaf.setup();
            cambiarTema("com.formdev.flatlaf.FlatDarkLaf");
            claro = false;
        } else {
            rbClaro.setText("Claro");
            ImageIcon iconoClaro = new ImageIcon(getClass().getResource("/Images/lightMode.png"));
            rbClaro.setIcon(iconoClaro);
            FlatMacLightLaf.setup();
            cambiarTema("com.formdev.flatlaf.FlatLightLaf");
            claro = true;
        }

    }//GEN-LAST:event_rbClaroActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Locale.setDefault(new Locale("es", "ES"));
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
            java.util.logging.Logger.getLogger(PrincipalView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PrincipalView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PrincipalView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PrincipalView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //FlatMacDarkLaf.setup();
        FlatMacLightLaf.setup();
        //FlatMaterialLighterIJTheme.setup();
        //FlatLightLaf.setup();
        UIManager.put("Button.arc", 999);
        UIManager.put("Component.arrowType", "chevron");

//        UIManager.put("Button.arc", 50);
        UIManager.put("Component.arc", 18);//ComboBox redondeado
//        UIManager.put("ProgressBar.arc", 50);
        UIManager.put("TextComponent.arc", 10);//Redondea TextField

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PrincipalView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jpBack;
    private javax.swing.JPanel jpBanner;
    private javax.swing.JPanel jpMenu;
    private javax.swing.JPanel jpPanelDinamico;
    private javax.swing.JLabel lbDia;
    private javax.swing.JLabel lbFecha;
    private javax.swing.JRadioButton rbClaro;
    // End of variables declaration//GEN-END:variables

    private void mostrarFecha() {
        // Obtener la fecha actual
        Date fechaActual = new Date();

        // Formato personalizado para mostrar el día de la semana
        SimpleDateFormat formatoDiaSemana = new SimpleDateFormat("EEEE");
        String diaSemana = formatoDiaSemana.format(fechaActual);
        // Convertir solo la primera letra a mayúscula
        diaSemana = diaSemana.substring(0, 1).toUpperCase() + diaSemana.substring(1);

        // Crear un formato para la fecha
        SimpleDateFormat formatoFecha = new SimpleDateFormat("dd-MM-yyyy");

        // Obtener la fecha formateada
        String textoFecha = formatoFecha.format(fechaActual);

        // Establecer el texto en el JLabel
        lbDia.setText(diaSemana);
        lbFecha.setText(textoFecha);
    }

    private void cambiarTema(String tema) {
        try {
            UIManager.setLookAndFeel(tema);
            SwingUtilities.updateComponentTreeUI(this); // Reemplaza "this" con tu ventana principal
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}

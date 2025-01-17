package Vista;

public class ISometer extends javax.swing.JFrame {

    /**
     * Creates new form ISometer
     */
    public ISometer() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        lb_mensaje1 = new javax.swing.JLabel();
        tf_titulo = new javax.swing.JTextField();
        lb_mensaje2 = new javax.swing.JLabel();
        tf_fechaT = new javax.swing.JTextField();
        lb_mensaje3 = new javax.swing.JLabel();
        sp_escala = new javax.swing.JSpinner();
        bt_confirmar = new javax.swing.JButton();
        lb_mensaje4 = new javax.swing.JLabel();
        lb_mensaje5 = new javax.swing.JLabel();
        lb_mensaje6 = new javax.swing.JLabel();
        lb_mensaje7 = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(java.awt.Color.darkGray);

        jLabel1.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel1.setForeground(java.awt.Color.white);
        jLabel1.setText("Sistema Jornadas de Investigación - Someter");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(547, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap())
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 880, 50));

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lb_mensaje1.setText("Título del artículo:");
        jPanel3.add(lb_mensaje1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 36, -1, -1));

        tf_titulo.setEditable(false);
        tf_titulo.setBackground(java.awt.Color.lightGray);
        jPanel3.add(tf_titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 30, 660, -1));

        lb_mensaje2.setText("Fecha tope:");
        jPanel3.add(lb_mensaje2, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 86, -1, -1));

        tf_fechaT.setEditable(false);
        tf_fechaT.setBackground(java.awt.Color.lightGray);
        jPanel3.add(tf_fechaT, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 80, 130, -1));

        lb_mensaje3.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        lb_mensaje3.setForeground(java.awt.Color.black);
        lb_mensaje3.setText("Recomendación:");
        jPanel3.add(lb_mensaje3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 123, -1, -1));

        sp_escala.setModel(new javax.swing.SpinnerNumberModel(1, 1, 3, 1));
        jPanel3.add(sp_escala, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 120, -1, -1));

        bt_confirmar.setText("Confirmar");
        bt_confirmar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel3.add(bt_confirmar, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 160, 90, -1));

        lb_mensaje4.setText("en una escala de 3 puntos");
        jPanel3.add(lb_mensaje4, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 120, -1, -1));

        lb_mensaje5.setText("1: si recomienda que el artículo se rechaza");
        jPanel3.add(lb_mensaje5, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 140, -1, -1));

        lb_mensaje6.setText("2: si es publicable sujeto a modificaciones del autor, o");
        jPanel3.add(lb_mensaje6, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 160, -1, -1));

        lb_mensaje7.setText("3: si se acepta para su publicación");
        jPanel3.add(lb_mensaje7, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 180, -1, -1));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 880, 210));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(ISometer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ISometer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ISometer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ISometer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ISometer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_confirmar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lb_mensaje1;
    private javax.swing.JLabel lb_mensaje2;
    private javax.swing.JLabel lb_mensaje3;
    private javax.swing.JLabel lb_mensaje4;
    private javax.swing.JLabel lb_mensaje5;
    private javax.swing.JLabel lb_mensaje6;
    private javax.swing.JLabel lb_mensaje7;
    private javax.swing.JSpinner sp_escala;
    private javax.swing.JTextField tf_fechaT;
    private javax.swing.JTextField tf_titulo;
    // End of variables declaration//GEN-END:variables
}

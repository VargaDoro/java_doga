package nezet;

import java.awt.HeadlessException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import modell.Auto;

public class AutoMegjelenito extends javax.swing.JFrame {

    private List<Auto> autok;
    
    public AutoMegjelenito() {
        initComponents();
        autok = new ArrayList<>();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cmbRendszam = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtFizetesiMod = new javax.swing.JTextField();
        txtDoanyzo = new javax.swing.JTextField();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnuProgram = new javax.swing.JMenu();
        mnuPrgBetolt = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        mnuPrgKilep = new javax.swing.JMenuItem();
        mnuLekerdezes = new javax.swing.JMenu();
        mnuLkOszz = new javax.swing.JMenuItem();
        mnuLkDohanyzas = new javax.swing.JMenuItem();
        mnuLkLeghosszF = new javax.swing.JMenuItem();
        mnuLkKikDolgoztak = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        cmbRendszam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbRendszamActionPerformed(evt);
            }
        });

        jLabel1.setText("Válasszon rendszámot:");

        jLabel3.setText("Lehet doháyozni?:");

        jLabel5.setText("Támogatott fizetési mód:");

        mnuProgram.setText("Program");

        mnuPrgBetolt.setText("Betöltés");
        mnuPrgBetolt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuPrgBetoltActionPerformed(evt);
            }
        });
        mnuProgram.add(mnuPrgBetolt);
        mnuProgram.add(jSeparator1);

        mnuPrgKilep.setText("Kilépés");
        mnuPrgKilep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuPrgKilepActionPerformed(evt);
            }
        });
        mnuProgram.add(mnuPrgKilep);

        jMenuBar1.add(mnuProgram);

        mnuLekerdezes.setText("Lekérdezések");

        mnuLkOszz.setText("Össz bevétel");
        mnuLkOszz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuLkOszzActionPerformed(evt);
            }
        });
        mnuLekerdezes.add(mnuLkOszz);

        mnuLkDohanyzas.setText("Minden autóba lehet dohányozni");
        mnuLkDohanyzas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuLkDohanyzasActionPerformed(evt);
            }
        });
        mnuLekerdezes.add(mnuLkDohanyzas);

        mnuLkLeghosszF.setText("Leghosszabb fuvar");
        mnuLkLeghosszF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuLkLeghosszFActionPerformed(evt);
            }
        });
        mnuLekerdezes.add(mnuLkLeghosszF);

        mnuLkKikDolgoztak.setText("Kik dolgoztak 202.12.31-én?");
        mnuLkKikDolgoztak.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuLkKikDolgoztakActionPerformed(evt);
            }
        });
        mnuLekerdezes.add(mnuLkKikDolgoztak);

        jMenuBar1.add(mnuLekerdezes);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel5)
                    .addComponent(jLabel3))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtFizetesiMod)
                    .addComponent(cmbRendszam, 0, 132, Short.MAX_VALUE)
                    .addComponent(txtDoanyzo))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cmbRendszam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFizetesiMod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtDoanyzo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void mnuPrgBetoltActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuPrgBetoltActionPerformed
        try {
            List<String> sorok = Files.readAllLines(Path.of("fuvarok.csv"));

            for (int sorIndex = 2; sorIndex < sorok.size(); sorIndex++) {
                String sor = sorok.get(sorIndex);
                Auto auto = new Auto(sor);
                autok.add(auto);
                cmbRendszam.addItem(auto.getRndszam());
            }
            megjelenites(autok.get(0));
        } catch (IOException ex) {
            Logger.getLogger(AutoMegjelenito.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_mnuPrgBetoltActionPerformed

    private void mnuLkLeghosszFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuLkLeghosszFActionPerformed
        
    }//GEN-LAST:event_mnuLkLeghosszFActionPerformed

    private void mnuPrgKilepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuPrgKilepActionPerformed
        kilepes();
    }//GEN-LAST:event_mnuPrgKilepActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        kilepes();
    }//GEN-LAST:event_formWindowClosing

    private void cmbRendszamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbRendszamActionPerformed
        int i = cmbRendszam.getSelectedIndex();
        Auto auto = autok.get(i);
        megjelenites(auto);
    }//GEN-LAST:event_cmbRendszamActionPerformed

    private void mnuLkOszzActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuLkOszzActionPerformed
        String msg = "Az 'xyz-456'rendszámú autónak a zösszes bevétele: "+osszBevetel("xyz-456");
        JOptionPane.showMessageDialog(rootPane, msg);
    }//GEN-LAST:event_mnuLkOszzActionPerformed

    private void mnuLkDohanyzasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuLkDohanyzasActionPerformed
        String msg = "Lehet-e az összes autóban dohányozni? "+lehetEDohanyozni();
        JOptionPane.showMessageDialog(rootPane, msg);
    }//GEN-LAST:event_mnuLkDohanyzasActionPerformed

    private void mnuLkKikDolgoztakActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuLkKikDolgoztakActionPerformed
        String msg = "Ők dolgoztak: "+kikDolgoztak("2022.12.31.");
        JOptionPane.showMessageDialog(rootPane, msg);
    }//GEN-LAST:event_mnuLkKikDolgoztakActionPerformed

    private String kikDolgoztak(String datum){
        int N = autok.size(), i = 0;
        String rndSzam = "";
        for (Auto auto : autok) {
            if(auto.getDatum().equals(datum)){
                rndSzam += auto.getRndszam()+", ";
            }
        }
        return rndSzam; 
    }
    
    private boolean lehetEDohanyozni(){
        int N = autok.size(), i = 0;
        while(i < N && autok.get(i).getDohanyzas() == "igen"){
            i++;
        }
        return i >= N;
    }
    
    private int osszBevetel(String rndSzam){
        int N = autok.size();
        int i = 0;
        int ossz = 0;
        for (Auto auto : autok) {
            if(auto.getRndszam().equals(rndSzam)){
                ossz += auto.getOsszeg();
                i++;
            }
        }
        return ossz;
    }
    
    private void megjelenites(Auto auto) {
        txtFizetesiMod.setText(auto.getFizetesi_mod());
        txtDoanyzo.setText(auto.getDohanyzas());
    }
    
    private void kilepes() throws HeadlessException {
        String msg = "Biztos kilépsz?";
        String cim = "Kilépés";
        int msgTip = JOptionPane.QUESTION_MESSAGE;
        int optTip = JOptionPane.YES_NO_OPTION;
        int gomb = JOptionPane.showConfirmDialog(rootPane, msg, cim, optTip);
        if (gomb == JOptionPane.YES_OPTION) {
            int hibaKod = 0;
            System.exit(hibaKod);
        }
    }
    
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
            java.util.logging.Logger.getLogger(AutoMegjelenito.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AutoMegjelenito.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AutoMegjelenito.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AutoMegjelenito.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AutoMegjelenito().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cmbRendszam;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JMenu mnuLekerdezes;
    private javax.swing.JMenuItem mnuLkDohanyzas;
    private javax.swing.JMenuItem mnuLkKikDolgoztak;
    private javax.swing.JMenuItem mnuLkLeghosszF;
    private javax.swing.JMenuItem mnuLkOszz;
    private javax.swing.JMenuItem mnuPrgBetolt;
    private javax.swing.JMenuItem mnuPrgKilep;
    private javax.swing.JMenu mnuProgram;
    private javax.swing.JTextField txtDoanyzo;
    private javax.swing.JTextField txtFizetesiMod;
    // End of variables declaration//GEN-END:variables
}

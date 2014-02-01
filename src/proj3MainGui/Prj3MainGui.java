/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package proj3MainGui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Administrator
 */
public class Prj3MainGui extends javax.swing.JFrame
{

    /**
     * Creates new form Prj3MainGui
     */
    public Prj3MainGui()
    {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        pnlHeader = new javax.swing.JPanel();
        headerLbl = new javax.swing.JLabel();
        pnlSearch = new javax.swing.JPanel();
        rbsearchAND = new javax.swing.JRadioButton();
        rbsearchPHRASE = new javax.swing.JRadioButton();
        rbsearchOR = new javax.swing.JRadioButton();
        lblType = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        lblResults = new javax.swing.JLabel();
        scrpnlResultList = new javax.swing.JScrollPane();
        lstResults = new javax.swing.JList();
        txtsearchText = new javax.swing.JTextField();
        lblCriteria = new javax.swing.JLabel();
        pnlFileMaint = new javax.swing.JPanel();
        rbFileADD = new javax.swing.JRadioButton();
        rbFileDelete = new javax.swing.JRadioButton();
        cmbmaintFileList = new javax.swing.JComboBox();
        jbUdate = new javax.swing.JButton();
        lblFileMaint = new javax.swing.JLabel();
        pnlButton = new javax.swing.JPanel();
        jbSearch = new javax.swing.JButton();
        jbClear = new javax.swing.JButton();
        jbExit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("COP2805 Project 3");
        setPreferredSize(new java.awt.Dimension(635, 525));
        setResizable(false);

        pnlHeader.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        pnlHeader.setPreferredSize(new java.awt.Dimension(400, 50));

        headerLbl.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        headerLbl.setForeground(new java.awt.Color(0, 102, 153));
        headerLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        headerLbl.setText("COP2805 Project 3 GUI Template");
        headerLbl.setMaximumSize(new java.awt.Dimension(300, 25));

        javax.swing.GroupLayout pnlHeaderLayout = new javax.swing.GroupLayout(pnlHeader);
        pnlHeader.setLayout(pnlHeaderLayout);
        pnlHeaderLayout.setHorizontalGroup(
            pnlHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlHeaderLayout.createSequentialGroup()
                .addGap(111, 111, 111)
                .addComponent(headerLbl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(69, Short.MAX_VALUE))
        );
        pnlHeaderLayout.setVerticalGroup(
            pnlHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlHeaderLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(headerLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pnlSearch.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial Rounded MT Bold", 0, 12), java.awt.SystemColor.inactiveCaption), "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 14), java.awt.SystemColor.activeCaption)); // NOI18N
        pnlSearch.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        pnlSearch.setPreferredSize(new java.awt.Dimension(225, 250));

        rbsearchAND.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        rbsearchAND.setText("AND");
        rbsearchAND.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                rbsearchANDActionPerformed(evt);
            }
        });

        rbsearchPHRASE.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        rbsearchPHRASE.setText("PHRASE");
        rbsearchPHRASE.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                rbsearchPHRASEActionPerformed(evt);
            }
        });

        rbsearchOR.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        rbsearchOR.setText("OR");

        lblType.setFont(new java.awt.Font("Arial", 2, 14)); // NOI18N
        lblType.setForeground(new java.awt.Color(0, 102, 153));
        lblType.setText("Search Type");

        jSeparator1.setMinimumSize(new java.awt.Dimension(200, 10));

        lblResults.setFont(new java.awt.Font("Arial", 2, 14)); // NOI18N
        lblResults.setForeground(new java.awt.Color(0, 102, 153));
        lblResults.setText("Search Results");

        lstResults.setBackground(new java.awt.Color(204, 204, 255));
        lstResults.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        lstResults.setModel(new javax.swing.AbstractListModel()
        {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        scrpnlResultList.setViewportView(lstResults);

        txtsearchText.setBackground(new java.awt.Color(204, 204, 255));
        txtsearchText.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtsearchText.setToolTipText("Enter the Search Item or Phrase");
        txtsearchText.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        lblCriteria.setFont(new java.awt.Font("Arial", 2, 14)); // NOI18N
        lblCriteria.setForeground(new java.awt.Color(0, 102, 153));
        lblCriteria.setText("Search Criteria");
        lblCriteria.setToolTipText("");

        javax.swing.GroupLayout pnlSearchLayout = new javax.swing.GroupLayout(pnlSearch);
        pnlSearch.setLayout(pnlSearchLayout);
        pnlSearchLayout.setHorizontalGroup(
            pnlSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSearchLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(pnlSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rbsearchAND)
                    .addComponent(rbsearchOR)
                    .addComponent(rbsearchPHRASE))
                .addGap(69, 69, 69)
                .addGroup(pnlSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(lblResults)
                    .addComponent(lblCriteria)
                    .addComponent(lblType))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(pnlSearchLayout.createSequentialGroup()
                .addGroup(pnlSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlSearchLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(pnlSearchLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(txtsearchText))
                    .addGroup(pnlSearchLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(scrpnlResultList)))
                .addContainerGap())
        );
        pnlSearchLayout.setVerticalGroup(
            pnlSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSearchLayout.createSequentialGroup()
                .addGroup(pnlSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlSearchLayout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(rbsearchAND)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rbsearchOR)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rbsearchPHRASE))
                    .addGroup(pnlSearchLayout.createSequentialGroup()
                        .addComponent(lblType)
                        .addGap(86, 86, 86)
                        .addComponent(lblCriteria)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtsearchText, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblResults)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(scrpnlResultList, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE)
                .addContainerGap())
        );

        pnlFileMaint.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 14), java.awt.SystemColor.activeCaption)); // NOI18N
        pnlFileMaint.setPreferredSize(new java.awt.Dimension(200, 250));

        rbFileADD.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        rbFileADD.setText("ADD");

        rbFileDelete.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        rbFileDelete.setText("DELETE");

        cmbmaintFileList.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        cmbmaintFileList.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbmaintFileList.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        jbUdate.setText("Update");

        lblFileMaint.setFont(new java.awt.Font("Arial", 2, 14)); // NOI18N
        lblFileMaint.setForeground(new java.awt.Color(0, 102, 153));
        lblFileMaint.setText("File Maintenance");

        javax.swing.GroupLayout pnlFileMaintLayout = new javax.swing.GroupLayout(pnlFileMaint);
        pnlFileMaint.setLayout(pnlFileMaintLayout);
        pnlFileMaintLayout.setHorizontalGroup(
            pnlFileMaintLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cmbmaintFileList, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(pnlFileMaintLayout.createSequentialGroup()
                .addGroup(pnlFileMaintLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rbFileDelete)
                    .addComponent(rbFileADD)
                    .addGroup(pnlFileMaintLayout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(jbUdate)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlFileMaintLayout.createSequentialGroup()
                .addGap(0, 40, Short.MAX_VALUE)
                .addComponent(lblFileMaint)
                .addGap(26, 26, 26))
        );
        pnlFileMaintLayout.setVerticalGroup(
            pnlFileMaintLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFileMaintLayout.createSequentialGroup()
                .addComponent(lblFileMaint)
                .addGap(4, 4, 4)
                .addComponent(rbFileADD)
                .addGap(18, 18, 18)
                .addComponent(rbFileDelete)
                .addGap(39, 39, 39)
                .addComponent(cmbmaintFileList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbUdate)
                .addContainerGap())
        );

        pnlButton.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        pnlButton.setPreferredSize(new java.awt.Dimension(277, 45));

        jbSearch.setText("Search");
        jbSearch.setToolTipText("Click to excute the search\n");
        jbSearch.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jbSearchActionPerformed(evt);
            }
        });

        jbClear.setText("Clear");
        jbClear.setToolTipText("");

        jbExit.setText("Exit");
        jbExit.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jbExitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlButtonLayout = new javax.swing.GroupLayout(pnlButton);
        pnlButton.setLayout(pnlButtonLayout);
        pnlButtonLayout.setHorizontalGroup(
            pnlButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlButtonLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jbSearch)
                .addGap(41, 41, 41)
                .addComponent(jbClear)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbExit)
                .addGap(24, 24, 24))
        );
        pnlButtonLayout.setVerticalGroup(
            pnlButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlButtonLayout.createSequentialGroup()
                .addGroup(pnlButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbSearch)
                    .addComponent(jbClear)
                    .addComponent(jbExit))
                .addGap(0, 18, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(pnlSearch, javax.swing.GroupLayout.DEFAULT_SIZE, 399, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlFileMaint, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(pnlButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 584, Short.MAX_VALUE)
            .addComponent(pnlHeader, javax.swing.GroupLayout.DEFAULT_SIZE, 584, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlHeader, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pnlSearch, javax.swing.GroupLayout.DEFAULT_SIZE, 368, Short.MAX_VALUE)
                    .addComponent(pnlFileMaint, javax.swing.GroupLayout.DEFAULT_SIZE, 368, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pnlButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbSearchActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jbSearchActionPerformed
    {//GEN-HEADEREND:event_jbSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbSearchActionPerformed

    private void rbsearchANDActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_rbsearchANDActionPerformed
    {//GEN-HEADEREND:event_rbsearchANDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbsearchANDActionPerformed

    private void rbsearchPHRASEActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_rbsearchPHRASEActionPerformed
    {//GEN-HEADEREND:event_rbsearchPHRASEActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbsearchPHRASEActionPerformed

    private void jbExitActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jbExitActionPerformed
    {//GEN-HEADEREND:event_jbExitActionPerformed
       	//use an anonymous inner class to handle the exit event
	jbExit.addActionListener(new ActionListener()
	{
	public void actionPerformed(ActionEvent e)
		{
		  System.exit (0);  
		}
        });
    }//GEN-LAST:event_jbExitActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[])
    {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try
        {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
            {
                if ("Nimbus".equals(info.getName()))
                {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex)
        {
            java.util.logging.Logger.getLogger(Prj3MainGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(Prj3MainGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(Prj3MainGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(Prj3MainGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new Prj3MainGui().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox cmbmaintFileList;
    private javax.swing.JLabel headerLbl;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton jbClear;
    private javax.swing.JButton jbExit;
    private javax.swing.JButton jbSearch;
    private javax.swing.JButton jbUdate;
    private javax.swing.JLabel lblCriteria;
    private javax.swing.JLabel lblFileMaint;
    private javax.swing.JLabel lblResults;
    private javax.swing.JLabel lblType;
    private javax.swing.JList lstResults;
    private javax.swing.JPanel pnlButton;
    private javax.swing.JPanel pnlFileMaint;
    private javax.swing.JPanel pnlHeader;
    private javax.swing.JPanel pnlSearch;
    private javax.swing.JRadioButton rbFileADD;
    private javax.swing.JRadioButton rbFileDelete;
    private javax.swing.JRadioButton rbsearchAND;
    private javax.swing.JRadioButton rbsearchOR;
    private javax.swing.JRadioButton rbsearchPHRASE;
    private javax.swing.JScrollPane scrpnlResultList;
    private javax.swing.JTextField txtsearchText;
    // End of variables declaration//GEN-END:variables
}

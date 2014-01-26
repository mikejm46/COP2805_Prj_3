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

        headerPnl = new javax.swing.JPanel();
        headerLbl = new javax.swing.JLabel();
        searchPnl = new javax.swing.JPanel();
        rbsearchAND = new javax.swing.JRadioButton();
        rbsearchPHRASE = new javax.swing.JRadioButton();
        rbsearchOR = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        searchList = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList();
        txtsearchText = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        maintPnl = new javax.swing.JPanel();
        rbADD = new javax.swing.JRadioButton();
        rbmaintDelete = new javax.swing.JRadioButton();
        cmbmaintFileList = new javax.swing.JComboBox();
        jButton1 = new javax.swing.JButton();
        buttonPnl = new javax.swing.JPanel();
        jbSearch = new javax.swing.JButton();
        jbClear = new javax.swing.JButton();
        jbExit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("COP2805 Project 3");
        setPreferredSize(new java.awt.Dimension(435, 475));
        setResizable(false);

        headerPnl.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        headerPnl.setPreferredSize(new java.awt.Dimension(400, 50));

        headerLbl.setFont(new java.awt.Font("Tahoma", 2, 20)); // NOI18N
        headerLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        headerLbl.setText("COP2805 Project 3 GUI Template");
        headerLbl.setMaximumSize(new java.awt.Dimension(300, 25));

        javax.swing.GroupLayout headerPnlLayout = new javax.swing.GroupLayout(headerPnl);
        headerPnl.setLayout(headerPnlLayout);
        headerPnlLayout.setHorizontalGroup(
            headerPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerPnlLayout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addComponent(headerLbl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(72, Short.MAX_VALUE))
        );
        headerPnlLayout.setVerticalGroup(
            headerPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headerPnlLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(headerLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        searchPnl.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial Rounded MT Bold", 0, 12), java.awt.SystemColor.inactiveCaption), "Search", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 14), java.awt.SystemColor.activeCaption)); // NOI18N
        searchPnl.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        searchPnl.setPreferredSize(new java.awt.Dimension(225, 250));

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

        jLabel1.setFont(new java.awt.Font("Arial", 2, 12)); // NOI18N
        jLabel1.setText("Search Type");

        jSeparator1.setMinimumSize(new java.awt.Dimension(200, 10));

        jLabel2.setFont(new java.awt.Font("Arial", 2, 12)); // NOI18N
        jLabel2.setText("Search Results");

        jList1.setModel(new javax.swing.AbstractListModel()
        {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        searchList.setViewportView(jList1);

        txtsearchText.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtsearchText.setToolTipText("Enter the Search Item or Phrase");

        jLabel3.setFont(new java.awt.Font("Arial", 2, 12)); // NOI18N
        jLabel3.setText("Search Criteria");
        jLabel3.setToolTipText("");

        javax.swing.GroupLayout searchPnlLayout = new javax.swing.GroupLayout(searchPnl);
        searchPnl.setLayout(searchPnlLayout);
        searchPnlLayout.setHorizontalGroup(
            searchPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(searchPnlLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(searchPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rbsearchAND)
                    .addComponent(rbsearchOR)
                    .addComponent(rbsearchPHRASE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(searchPnlLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(searchList))
            .addGroup(searchPnlLayout.createSequentialGroup()
                .addGroup(searchPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(searchPnlLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(searchPnlLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(txtsearchText)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, searchPnlLayout.createSequentialGroup()
                .addGap(0, 74, Short.MAX_VALUE)
                .addGroup(searchPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2))
                .addGap(75, 75, 75))
        );
        searchPnlLayout.setVerticalGroup(
            searchPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(searchPnlLayout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rbsearchAND)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rbsearchOR)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rbsearchPHRASE)
                .addGap(9, 9, 9)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtsearchText, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addComponent(searchList, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        maintPnl.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "File Maint", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 14), java.awt.SystemColor.activeCaption)); // NOI18N
        maintPnl.setPreferredSize(new java.awt.Dimension(200, 250));

        rbADD.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        rbADD.setText("ADD");

        rbmaintDelete.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        rbmaintDelete.setText("DELETE");

        cmbmaintFileList.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        cmbmaintFileList.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jButton1.setText("Update");

        javax.swing.GroupLayout maintPnlLayout = new javax.swing.GroupLayout(maintPnl);
        maintPnl.setLayout(maintPnlLayout);
        maintPnlLayout.setHorizontalGroup(
            maintPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(maintPnlLayout.createSequentialGroup()
                .addGroup(maintPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(maintPnlLayout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(jButton1))
                    .addComponent(rbmaintDelete)
                    .addComponent(rbADD))
                .addContainerGap(50, Short.MAX_VALUE))
            .addComponent(cmbmaintFileList, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        maintPnlLayout.setVerticalGroup(
            maintPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(maintPnlLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(rbADD)
                .addGap(18, 18, 18)
                .addComponent(rbmaintDelete)
                .addGap(39, 39, 39)
                .addComponent(cmbmaintFileList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        buttonPnl.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        buttonPnl.setPreferredSize(new java.awt.Dimension(277, 45));

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

        javax.swing.GroupLayout buttonPnlLayout = new javax.swing.GroupLayout(buttonPnl);
        buttonPnl.setLayout(buttonPnlLayout);
        buttonPnlLayout.setHorizontalGroup(
            buttonPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buttonPnlLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jbSearch)
                .addGap(41, 41, 41)
                .addComponent(jbClear)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbExit)
                .addGap(24, 24, 24))
        );
        buttonPnlLayout.setVerticalGroup(
            buttonPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buttonPnlLayout.createSequentialGroup()
                .addGroup(buttonPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
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
                .addComponent(searchPnl, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(maintPnl, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(buttonPnl, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 435, Short.MAX_VALUE)
            .addComponent(headerPnl, javax.swing.GroupLayout.DEFAULT_SIZE, 435, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(headerPnl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(searchPnl, javax.swing.GroupLayout.DEFAULT_SIZE, 320, Short.MAX_VALUE)
                    .addComponent(maintPnl, javax.swing.GroupLayout.DEFAULT_SIZE, 320, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(buttonPnl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
    private javax.swing.JPanel buttonPnl;
    private javax.swing.JComboBox cmbmaintFileList;
    private javax.swing.JLabel headerLbl;
    private javax.swing.JPanel headerPnl;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JList jList1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton jbClear;
    private javax.swing.JButton jbExit;
    private javax.swing.JButton jbSearch;
    private javax.swing.JPanel maintPnl;
    private javax.swing.JRadioButton rbADD;
    private javax.swing.JRadioButton rbmaintDelete;
    private javax.swing.JRadioButton rbsearchAND;
    private javax.swing.JRadioButton rbsearchOR;
    private javax.swing.JRadioButton rbsearchPHRASE;
    private javax.swing.JScrollPane searchList;
    private javax.swing.JPanel searchPnl;
    private javax.swing.JTextField txtsearchText;
    // End of variables declaration//GEN-END:variables
}

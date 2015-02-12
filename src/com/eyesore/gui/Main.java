/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eyesore.gui;

import com.eyesore.engine.mybatis.domain.Task;
import com.eyesore.engine.mybatis.services.TaskImpl;
import com.eyesore.engine.mybatis.util.Time;

/**
 *
 * @author sora
 */
public class Main extends javax.swing.JFrame {
    
    private TaskImpl taskImpl;
    private Task task;

    /**
     * Creates new form Main
     */
    public Main() {        
        initComponents();
        taskImpl = new com.eyesore.engine.mybatis.services.TaskImpl();
        taskImpl.displayTask(lstTask);
    }
    
    private void TEST(String text){
        System.out.println("" + text);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        lstTask = new javax.swing.JList();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtDetail = new javax.swing.JTextArea();
        btnAdd = new javax.swing.JButton();
        btnClose = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnFile = new javax.swing.JMenu();
        mnItemDone = new javax.swing.JCheckBoxMenuItem();
        mnItemRemove = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jLabel1.setText("List task");

        lstTask.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        lstTask.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lstTaskMouseClicked(evt);
            }
        });
        lstTask.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                lstTaskValueChanged(evt);
            }
        });
        jScrollPane2.setViewportView(lstTask);

        txtDetail.setEditable(false);
        txtDetail.setColumns(20);
        txtDetail.setRows(5);
        jScrollPane3.setViewportView(txtDetail);

        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnClose.setText("Close");
        btnClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseActionPerformed(evt);
            }
        });

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        mnFile.setText("File");

        mnItemDone.setText("Check as done");
        mnItemDone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnItemDoneActionPerformed(evt);
            }
        });
        mnFile.add(mnItemDone);

        mnItemRemove.setText("Remove task");
        mnItemRemove.setEnabled(false);
        mnItemRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnItemRemoveActionPerformed(evt);
            }
        });
        mnFile.add(mnItemRemove);

        jMenuItem3.setText("Exit");
        mnFile.add(jMenuItem3);

        jMenuBar1.add(mnFile);

        jMenu2.setText("Help");

        jMenuItem1.setText("About");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem1);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane3))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(160, Short.MAX_VALUE)
                .addComponent(btnDelete)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAdd)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnClose)
                .addGap(13, 13, 13))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdd)
                    .addComponent(btnClose)
                    .addComponent(btnDelete))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // Display addtask window.
        new AddTask(this, rootPaneCheckingEnabled).setVisible(true);
    }//GEN-LAST:event_btnAddActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // Set task service to null
        taskImpl.tearDown();
    }//GEN-LAST:event_formWindowClosing

    private void lstTaskValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_lstTaskValueChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_lstTaskValueChanged

    private void lstTaskMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lstTaskMouseClicked
        // Write txtDetail with the detail of task     
        setDetail();
    }//GEN-LAST:event_lstTaskMouseClicked

    private void mnItemDoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnItemDoneActionPerformed
        // Update status task.
        taskImpl.updateTask(task.getTask(), mnItemDone.isSelected());
        taskImpl.displayTask(lstTask);
    }//GEN-LAST:event_mnItemDoneActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // Display "About" window.
        new About( this, true).setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed
        // Exit program.
        taskImpl.tearDown();
        System.exit(0);
    }//GEN-LAST:event_btnCloseActionPerformed

    private void mnItemRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnItemRemoveActionPerformed
        // Delete selected task.
        deleteTask();        
    }//GEN-LAST:event_mnItemRemoveActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        deleteTask();
    }//GEN-LAST:event_btnDeleteActionPerformed

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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnClose;
    private javax.swing.JButton btnDelete;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea jTextArea1;
    public javax.swing.JList lstTask;
    private javax.swing.JMenu mnFile;
    private javax.swing.JCheckBoxMenuItem mnItemDone;
    private javax.swing.JMenuItem mnItemRemove;
    private javax.swing.JTextArea txtDetail;
    // End of variables declaration//GEN-END:variables
    
    
    /**
     * Write txtDetail with task information.
     */
    private void setDetail(){
        int selectedIndex = lstTask.getSelectedIndex();
        if(selectedIndex == -1){
            return;
        }
        
        task = taskImpl.getSelectedTask(selectedIndex);                
        txtDetail.setText("");
        String day = "Day : " + task.getDay();
        String repeat = "Repeat : " + task.getRepeat();
        String status = "Finished : " + task.getStatus();

        txtDetail.setText(day + "\n" + repeat + "\n" + status);
        
        setFinishedState();
        setRemoveState();
    }
    
    /**
     * Set mnItemDone selected status.
     */
    private void setFinishedState(){
        boolean isSelected = task.getStatus();
        
        if(isSelected == true){
            mnItemDone.setSelected(true);
            mnItemDone.setText("Cancel finished");            
        } else{
            mnItemDone.setSelected(false);
            mnItemDone.setText("Finished");
        }
    }
    
    /**
     * Set mnItemRemove state to enable when list is selected.
     */
    private void setRemoveState(){
        mnItemRemove.setEnabled(true);
    }
    
    /**
     * Delete selected task.
     */
    private void deleteTask(){
        taskImpl.deleteTask();
        taskImpl.displayTask(lstTask);
    }
    
    public TaskImpl getTaskImpl(){
        return taskImpl;
    }
}

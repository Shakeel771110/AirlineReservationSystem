/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.airline_project;

import com.mycompany.airline.AddAdmin;
import com.mycompany.airline.AddCustomer;
import com.mycompany.airline.AddFlight;
import com.mycompany.airline.BookTicket;
import com.mycompany.airline.GetTicket;
import com.mycompany.airline.SearchCustomer;
import java.awt.PopupMenu;

/**
 *
 * @author N TECH
 */
public class Main extends javax.swing.JFrame {

    /**
     * Creates new form Main
     */
    public Main() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Desktop = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        customerMenu = new javax.swing.JMenu();
        addCustomerMenuItem = new javax.swing.JMenuItem();
        searchCustomerMenuItem = new javax.swing.JMenuItem();
        flightMenu = new javax.swing.JMenu();
        addFlightMenuItem = new javax.swing.JMenuItem();
        bookFlightMenuItem = new javax.swing.JMenuItem();
        ticketMenu = new javax.swing.JMenu();
        viewTicketMenuItem = new javax.swing.JMenuItem();
        adminMenu = new javax.swing.JMenu();
        addAdminMenuItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout DesktopLayout = new javax.swing.GroupLayout(Desktop);
        Desktop.setLayout(DesktopLayout);
        DesktopLayout.setHorizontalGroup(
            DesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 860, Short.MAX_VALUE)
        );
        DesktopLayout.setVerticalGroup(
            DesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 457, Short.MAX_VALUE)
        );

        customerMenu.setText("Customer");
        customerMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customerMenuActionPerformed(evt);
            }
        });

        addCustomerMenuItem.setText("Add Customer");
        addCustomerMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addCustomerMenuItemActionPerformed(evt);
            }
        });
        customerMenu.add(addCustomerMenuItem);

        searchCustomerMenuItem.setText("Search Customer");
        searchCustomerMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchCustomerMenuItemActionPerformed(evt);
            }
        });
        customerMenu.add(searchCustomerMenuItem);

        jMenuBar1.add(customerMenu);

        flightMenu.setText("Flight");
        flightMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                flightMenuActionPerformed(evt);
            }
        });

        addFlightMenuItem.setText("Add Flight");
        addFlightMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addFlightMenuItemActionPerformed(evt);
            }
        });
        flightMenu.add(addFlightMenuItem);

        bookFlightMenuItem.setText("Book Flight");
        bookFlightMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookFlightMenuItemActionPerformed(evt);
            }
        });
        flightMenu.add(bookFlightMenuItem);

        jMenuBar1.add(flightMenu);

        ticketMenu.setText("Ticket");

        viewTicketMenuItem.setText("View Ticket");
        viewTicketMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewTicketMenuItemActionPerformed(evt);
            }
        });
        ticketMenu.add(viewTicketMenuItem);

        jMenuBar1.add(ticketMenu);

        adminMenu.setText("Admin");
        adminMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminMenuActionPerformed(evt);
            }
        });

        addAdminMenuItem.setText("Add Admin");
        addAdminMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addAdminMenuItemActionPerformed(evt);
            }
        });
        adminMenu.add(addAdminMenuItem);

        jMenuBar1.add(adminMenu);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Desktop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Desktop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void searchCustomerMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchCustomerMenuItemActionPerformed
        // TODO add your handling code here:
         SearchCustomer searchCustomer = new SearchCustomer();
        Desktop.add(searchCustomer);
        searchCustomer.setVisible(true);
    }//GEN-LAST:event_searchCustomerMenuItemActionPerformed

    private void bookFlightMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookFlightMenuItemActionPerformed
        // TODO add your handling code here:
        BookTicket bookTicket = new BookTicket();
        Desktop.add(bookTicket);
        bookTicket.setVisible(true);

    }//GEN-LAST:event_bookFlightMenuItemActionPerformed

    private void customerMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customerMenuActionPerformed
        // TODO add your handling code here:
        //AddCustomer addCustomer = new AddCustomer();
    }//GEN-LAST:event_customerMenuActionPerformed

    private void addCustomerMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addCustomerMenuItemActionPerformed
        // TODO add your handling code here:
        AddCustomer addCustomer = new AddCustomer();
        PopupMenu Customer = null;
        Desktop.add(addCustomer);
        addCustomer.setVisible(true);
    }//GEN-LAST:event_addCustomerMenuItemActionPerformed

    private void flightMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_flightMenuActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_flightMenuActionPerformed

    private void adminMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminMenuActionPerformed
        
    }//GEN-LAST:event_adminMenuActionPerformed

    private void addFlightMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addFlightMenuItemActionPerformed
        // TODO add your handling code here:
         AddFlight addFlight = new AddFlight();
        //PopupMenu Flight = null;
        Desktop.add(addFlight);
        addFlight.setVisible(true);
        
        //new AddFlight() ;
        
    }//GEN-LAST:event_addFlightMenuItemActionPerformed

    private void addAdminMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addAdminMenuItemActionPerformed
        // TODO add your handling code here:
        AddAdmin addAdmin = new AddAdmin();
        Desktop.add(addAdmin);
        addAdmin.setVisible(true);
    }//GEN-LAST:event_addAdminMenuItemActionPerformed

    private void viewTicketMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewTicketMenuItemActionPerformed
        // TODO add your handling code here:
        GetTicket getTicket = new GetTicket();
        Desktop.add(getTicket);
        getTicket.setVisible(true);

    }//GEN-LAST:event_viewTicketMenuItemActionPerformed

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
    private javax.swing.JDesktopPane Desktop;
    private javax.swing.JMenuItem addAdminMenuItem;
    private javax.swing.JMenuItem addCustomerMenuItem;
    private javax.swing.JMenuItem addFlightMenuItem;
    private javax.swing.JMenu adminMenu;
    private javax.swing.JMenuItem bookFlightMenuItem;
    private javax.swing.JMenu customerMenu;
    private javax.swing.JMenu flightMenu;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem searchCustomerMenuItem;
    private javax.swing.JMenu ticketMenu;
    private javax.swing.JMenuItem viewTicketMenuItem;
    // End of variables declaration//GEN-END:variables
}

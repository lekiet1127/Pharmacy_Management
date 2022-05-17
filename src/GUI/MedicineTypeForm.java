/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Controller.Helper.Image_Auth;
import Controller.Helper.Mgsbox;
import Controller.ModelDAO.TypeOfMedicineDAO;
import Model.TypeOfMedicine;
import java.awt.Color;
import java.awt.Font;
import java.util.List;
import javax.swing.JFileChooser;
import javax.swing.JTable;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author Laxus
 */
public class MedicineTypeForm extends javax.swing.JPanel {

    /**
     * Creates new form MedicineTypeForm
     */
    public MedicineTypeForm() {
        initComponents();
        LoadDataToTable();
        EditTable(tblMeType);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtDrugTypeID = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblMeType = new javax.swing.JTable();
        txtDrugNameID = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        rdoYes = new javax.swing.JRadioButton();
        rdoNo = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        txtUserObject = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtNote = new javax.swing.JTextArea();
        btnEdit = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 51, 255));
        jLabel1.setText("Medicine type");

        jLabel2.setText("Drug type ID:");

        jLabel3.setText("Drug name ID:");

        tblMeType.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Drug type ID", "Drug name ID", "Prescription drugs", "User objec", "Note"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblMeType.setFocusable(false);
        tblMeType.setIntercellSpacing(new java.awt.Dimension(0, 0));
        tblMeType.setRowHeight(25);
        tblMeType.setSelectionBackground(new java.awt.Color(232, 57, 95));
        tblMeType.setShowVerticalLines(false);
        tblMeType.getTableHeader().setReorderingAllowed(false);
        tblMeType.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblMeTypeMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblMeType);

        jLabel4.setText("Prescription drugs:");

        buttonGroup1.add(rdoYes);
        rdoYes.setText("Yes");

        buttonGroup1.add(rdoNo);
        rdoNo.setText("No");

        jLabel5.setText("User object:");

        jLabel6.setText("Note:");

        txtNote.setColumns(20);
        txtNote.setRows(5);
        jScrollPane2.setViewportView(txtNote);

        btnEdit.setBackground(new java.awt.Color(0, 153, 255));
        btnEdit.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnEdit.setForeground(new java.awt.Color(255, 255, 255));
        btnEdit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/edit.png"))); // NOI18N
        btnEdit.setText("Edit");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        btnDelete.setBackground(new java.awt.Color(0, 153, 255));
        btnDelete.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnDelete.setForeground(new java.awt.Color(255, 255, 255));
        btnDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/delete.png"))); // NOI18N
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane2))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel1)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(18, 18, 18)
                                            .addComponent(txtDrugTypeID, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addGap(18, 18, 18)
                                            .addComponent(txtDrugNameID, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addComponent(jLabel2)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 100, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(rdoYes)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rdoNo))
                            .addComponent(txtUserObject, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtDrugTypeID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(rdoYes)
                    .addComponent(rdoNo))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtDrugNameID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(txtUserObject, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 299, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEdit)
                    .addComponent(btnDelete))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void tblMeTypeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblMeTypeMouseClicked
        // TODO add your handling code here:
        if (evt.getClickCount() == 1) {
            this.index = tblMeType.rowAtPoint(evt.getPoint());
            if (this.index >= 0) {
                this.edit();
            }
        }
    }//GEN-LAST:event_tblMeTypeMouseClicked

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        // TODO add your handling code here:
        update();
    }//GEN-LAST:event_btnEditActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        if (Image_Auth.USER.isEpeIsRole()) {
            delete();
            clearForm();
        } else {
            Mgsbox.alert(this, "Chỉ trưởng phòng mới được phép xóa");
        }
    }//GEN-LAST:event_btnDeleteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnEdit;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JRadioButton rdoNo;
    private javax.swing.JRadioButton rdoYes;
    private javax.swing.JTable tblMeType;
    private javax.swing.JTextField txtDrugNameID;
    private javax.swing.JTextField txtDrugTypeID;
    private javax.swing.JTextArea txtNote;
    private javax.swing.JTextField txtUserObject;
    // End of variables declaration//GEN-END:variables
    TypeOfMedicineDAO TM = new TypeOfMedicineDAO();
    JFileChooser fileChooser = new JFileChooser();
    int index = 0;

    private void LoadDataToTable() {
        DefaultTableModel model = (DefaultTableModel) tblMeType.getModel();
        model.setRowCount(0);
        try {
            List<TypeOfMedicine> listTypeMe = TM.selectAll();
            listTypeMe.forEach(e -> {
                model.addRow(new Object[]{e.getTomID(),
                    e.getTomName(),
                    e.isTomIsPrecription() ? "Yes" : "No",
                    e.getTomUserObject(),
                    e.getTomNote()});
            });
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void setModel(TypeOfMedicine model) {
        txtDrugTypeID.setText(model.getTomID());
        txtDrugNameID.setText(model.getTomName());
        txtUserObject.setText(model.getTomUserObject());
        rdoYes.setSelected(model.isTomIsPrecription());
        rdoNo.setSelected(!model.isTomIsPrecription());
        txtNote.setText(model.getTomNote());
    }

    TypeOfMedicine getModel() {
        TypeOfMedicine model = new TypeOfMedicine();
        model.setTomID(txtDrugTypeID.getText());
        model.setTomName(txtDrugNameID.getText());
        model.setTomIsPrecription(rdoYes.isSelected());
        model.setTomUserObject(txtUserObject.getText());
        model.setTomNote(txtNote.getText());
        return model;
    }

    private void clearForm() {
        final String a = "";
        txtDrugNameID.setText(a);
        txtDrugTypeID.setText(a);
        txtUserObject.setText(a);
        txtNote.setText(a);
        buttonGroup1.clearSelection();
    }
    
    public void search(String text) {
        DefaultTableModel model = (DefaultTableModel) tblMeType.getModel();
        TableRowSorter<DefaultTableModel> rowSorter = new TableRowSorter<>(model);
        tblMeType.setRowSorter(rowSorter);
        rowSorter.setRowFilter(RowFilter.regexFilter(text));
    }

    //Update
    private void update() {
        TypeOfMedicine model = getModel();
        try {
            TM.update(model);
            this.LoadDataToTable();
            Mgsbox.alert(this, "Update successful!");
        } catch (Exception e) {
            Mgsbox.alert(this, "Update failed!");
        }
    }

    //Delete
    private void delete() {
        if (Mgsbox.comfirm(this, "Do you really want to delete this Medicine Type?")) {
            String TMID = txtDrugTypeID.getText();
            try {
                TM.delete(TMID);
                this.LoadDataToTable();
                //this.clearForm();
                Mgsbox.alert(this, "Delete successfully!");
            } catch (Exception e) {
                Mgsbox.alert(this, "Delete failed!");
            }
        }
    }
    
    private void edit() {
        // setTrang();
        try {
            String manv = (String) tblMeType.getValueAt(this.index, 0);
            TypeOfMedicine model = TM.selectByID(manv);
            if (model != null) {
                this.setModel(model);
                //this.setStatus(false);
            }
        } catch (Exception e) {
            Mgsbox.error(this, "Data Query Error!!!");
        }
    }
    
    private void EditTable(JTable a){
        a.getTableHeader().setFont(new Font("Segoe UI", Font.BOLD, 12));
        a.getTableHeader().setOpaque(false);
        a.getTableHeader().setBackground(new Color(32, 136, 203));
        a.getTableHeader().setForeground(new Color(255, 255, 255));
        a.setRowHeight(25);
    }
}
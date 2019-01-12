/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View.Consultar;

import DAO.DisciplinaDAO;
import DAO.ProfessorDisciplinaDAO;
import Model.Disciplina;
import Model.ProfessorDisciplina;
import View.Alterar.AlterarDisciplina;
import View.Alterar.AlterarProfessor;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author adria
 */
public class ConsultaProfessor extends javax.swing.JInternalFrame {

    /**
     * Creates new form ConsultaProfessor
     */
    public ConsultaProfessor() {
        initComponents();
        ListaTable();
    }

    private void ListaTable() {
        DefaultTableModel modelo = (DefaultTableModel) JTConsultarProfessor.getModel();
        ProfessorDisciplinaDAO profDiscDAO = new ProfessorDisciplinaDAO();
        modelo.setNumRows(0);
        for (ProfessorDisciplina profDisc : profDiscDAO.listarProfessor()) {
            modelo.addRow(new Object[]{
                profDisc.getIdProfDic(),
                profDisc.getNome(),
                profDisc.getDisciplina()
            });
        }

    }

    private void ListaTable(String nome) {
        DefaultTableModel modelo = (DefaultTableModel) JTConsultarProfessor.getModel();
        ProfessorDisciplinaDAO profDiscDAO = new ProfessorDisciplinaDAO();
        modelo.setNumRows(0);

        for (ProfessorDisciplina profDisc : profDiscDAO.listarProfessor(nome)) {
            modelo.addRow(new Object[]{
                profDisc.getIdProfDic(),
                profDisc.getNome(),
                profDisc.getDisciplina()
            });
        }

    }

    private void ListaMateria(String nome) {
        DefaultTableModel modelo = (DefaultTableModel) JTConsultarProfessor.getModel();
        ProfessorDisciplinaDAO profDiscDAO = new ProfessorDisciplinaDAO();
        modelo.setNumRows(0);

        for (ProfessorDisciplina profDisc : profDiscDAO.listarMateria(nome)) {
            modelo.addRow(new Object[]{
                profDisc.getIdProfDic(),
                profDisc.getNome(),
                profDisc.getDisciplina()
            });
        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        TFPesquisa = new javax.swing.JTextField();
        JBEditar = new javax.swing.JButton();
        JBExcluir = new javax.swing.JButton();
        TFDisc = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        JTConsultarProfessor = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();

        setClosable(true);
        setMaximumSize(new java.awt.Dimension(580, 440));
        setMinimumSize(new java.awt.Dimension(580, 440));
        setPreferredSize(new java.awt.Dimension(580, 440));
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(0, 119, 36));
        jPanel1.setPreferredSize(new java.awt.Dimension(570, 73));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Consulta de Professores");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(91, 91, 91)
                .addComponent(jLabel1)
                .addContainerGap(117, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 574, 73);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        TFPesquisa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TFPesquisaKeyReleased(evt);
            }
        });

        JBEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/editar.png"))); // NOI18N
        JBEditar.setToolTipText("Excluir");
        JBEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBEditarActionPerformed(evt);
            }
        });

        JBExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/delete.png"))); // NOI18N
        JBExcluir.setToolTipText("Excluir");
        JBExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBExcluirActionPerformed(evt);
            }
        });

        TFDisc.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TFDiscKeyReleased(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Disciplina:");

        JTConsultarProfessor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome", "Disciplina"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(JTConsultarProfessor);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText(" Nome :");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TFDisc, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TFPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 531, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(JBExcluir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(JBEditar)))
                .addGap(30, 30, 30))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(TFPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(TFDisc)
                        .addComponent(jLabel2)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JBEditar)
                    .addComponent(JBExcluir))
                .addGap(185, 185, 185))
        );

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 70, 580, 440);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JBExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBExcluirActionPerformed
        // Excluir Professor
        int linha = JTConsultarProfessor.getSelectedRow();
        if (linha == -1) {
            JOptionPane.showMessageDialog(null, "Selecione um professor", "Sistema de Provas", JOptionPane.ERROR_MESSAGE);
        } else {
            ProfessorDisciplina profDisc = new ProfessorDisciplina();
            ProfessorDisciplinaDAO profDiscDAO = new ProfessorDisciplinaDAO();
            profDisc.setIdProfDic((int) JTConsultarProfessor.getValueAt(linha, 0));

            int resposta;
            resposta = JOptionPane.showConfirmDialog(null, "Deseja excluir " + JTConsultarProfessor.getValueAt(linha, 1) + "?");
            if (resposta == JOptionPane.YES_OPTION) {
                // verifica se o usuário clicou no botão YES
                profDiscDAO.DeleteDisciplinaProfessor(profDisc);
            }
            ListaTable();
        }
    }//GEN-LAST:event_JBExcluirActionPerformed

    private void TFDiscKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TFDiscKeyReleased
        // TODO add your handling code here:
        if (!"".equals(TFDisc.getText())) {
            ListaTable(TFDisc.getText());
        } else {
            ListaTable();
        }
    }//GEN-LAST:event_TFDiscKeyReleased

    private void TFPesquisaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TFPesquisaKeyReleased
        // TODO add your handling code here:
        if (!"".equals(TFPesquisa.getText())) {
            ListaMateria(TFPesquisa.getText());
        } else {
            ListaTable();
        }

    }//GEN-LAST:event_TFPesquisaKeyReleased

    private void JBEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBEditarActionPerformed
        // TODO add your handling code here:
        int linha = JTConsultarProfessor.getSelectedRow();
        if (linha == -1) {
            JOptionPane.showMessageDialog(null, "Selecione um professor", "Sistema de Provas", JOptionPane.ERROR_MESSAGE);
        } else {
            ProfessorDisciplinaDAO dao = new ProfessorDisciplinaDAO();
            int id = dao.getIdprofessorfromProfessorDisciplina((int) JTConsultarProfessor.getValueAt(linha, 0));
            AlterarProfessor altas= new AlterarProfessor(id);
            Principal.Principal.Desktop.add(altas);
            altas.show();

        }

    }//GEN-LAST:event_JBEditarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBEditar;
    private javax.swing.JButton JBExcluir;
    private javax.swing.JTable JTConsultarProfessor;
    private javax.swing.JTextField TFDisc;
    private javax.swing.JTextField TFPesquisa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}

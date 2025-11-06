package view;

import model.Aluno;
import java.text.DecimalFormat;
// @author Alex

public class TelaAvaliacao extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(TelaAvaliacao.class.getName());

    public TelaAvaliacao() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTFNome = new javax.swing.JTextField();
        jTFNota1 = new javax.swing.JTextField();
        jTFNota2 = new javax.swing.JTextField();
        jTFNota3 = new javax.swing.JTextField();
        jLNome = new javax.swing.JLabel();
        jLNota1 = new javax.swing.JLabel();
        jLNota2 = new javax.swing.JLabel();
        jLNota3 = new javax.swing.JLabel();
        jButtonCalcular = new javax.swing.JButton();
        jButtonLimpar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTAHistorico = new javax.swing.JTextArea();
        jLHistorico = new javax.swing.JLabel();
        jTFResultado = new javax.swing.JTextField();
        jLResultado = new javax.swing.JLabel();
        jButtonLimparHistorico = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 51));

        jTFNome.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jTFNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFNomeActionPerformed(evt);
            }
        });

        jTFNota1.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jTFNota1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFNota1ActionPerformed(evt);
            }
        });

        jTFNota2.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N

        jTFNota3.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N

        jLNome.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLNome.setForeground(new java.awt.Color(255, 255, 255));
        jLNome.setText("Nome do aluno");

        jLNota1.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLNota1.setForeground(new java.awt.Color(255, 255, 255));
        jLNota1.setText("Nota 1");

        jLNota2.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLNota2.setForeground(new java.awt.Color(255, 255, 255));
        jLNota2.setText("Nota 2");

        jLNota3.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLNota3.setForeground(new java.awt.Color(255, 255, 255));
        jLNota3.setText("Nota 3");

        jButtonCalcular.setBackground(new java.awt.Color(110, 196, 51));
        jButtonCalcular.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jButtonCalcular.setForeground(new java.awt.Color(255, 255, 255));
        jButtonCalcular.setText("Calcular");
        jButtonCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCalcularActionPerformed(evt);
            }
        });

        jButtonLimpar.setBackground(new java.awt.Color(110, 196, 51));
        jButtonLimpar.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jButtonLimpar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonLimpar.setText("Limpar");
        jButtonLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLimparActionPerformed(evt);
            }
        });

        jTAHistorico.setColumns(20);
        jTAHistorico.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jTAHistorico.setRows(5);
        jScrollPane1.setViewportView(jTAHistorico);

        jLHistorico.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLHistorico.setForeground(new java.awt.Color(255, 255, 255));
        jLHistorico.setText("Historico");

        jTFResultado.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jTFResultado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFResultadoActionPerformed(evt);
            }
        });

        jLResultado.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLResultado.setForeground(new java.awt.Color(255, 255, 255));
        jLResultado.setText("Resultado");

        jButtonLimparHistorico.setBackground(new java.awt.Color(255, 153, 51));
        jButtonLimparHistorico.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jButtonLimparHistorico.setText("Limpar Historico");
        jButtonLimparHistorico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLimparHistoricoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLNota1)
                .addGap(101, 101, 101)
                .addComponent(jLNota2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLNota3)
                .addGap(29, 29, 29))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(114, 114, 114)
                        .addComponent(jTFNome, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(148, 148, 148)
                        .addComponent(jLNome)))
                .addGap(120, 120, 120))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTFResultado, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonCalcular)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jTFNota1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jTFNota2, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButtonLimpar)
                            .addComponent(jTFNota3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLResultado)
                        .addGap(146, 146, 146))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(jLHistorico)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonLimparHistorico, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(15, 15, 15))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLNome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTFNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLNota1)
                    .addComponent(jLNota2)
                    .addComponent(jLNota3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFNota1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTFNota2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTFNota3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jButtonCalcular)
                    .addComponent(jButtonLimpar))
                .addGap(11, 11, 11)
                .addComponent(jLResultado)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTFResultado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLHistorico)
                    .addComponent(jButtonLimparHistorico))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(10, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTFNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFNomeActionPerformed
        
    }//GEN-LAST:event_jTFNomeActionPerformed

    private void jButtonCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCalcularActionPerformed
    if(jTFNome.getText().trim().isEmpty() || jTFNota1.getText().trim().isEmpty() || jTFNota2.getText().trim().isEmpty() ||jTFNota3.getText().trim().isEmpty()){
           jTFResultado.setText("Preencha todos os campos ");
           jTFNome.requestFocus();
           return;
        }
      try{
          double nota1  = Double.parseDouble(jTFNota1.getText());
          double nota2  = Double.parseDouble(jTFNota2.getText());
          double nota3  = Double.parseDouble(jTFNota3.getText());
          
          
          Aluno aluno = new Aluno();
          DecimalFormat formatter = new DecimalFormat("#.##");
          
          
          double resultado = aluno.calcularMedia(nota1,nota2,nota3);
          
          jTFResultado.setText("Média: " + "  " + formatter.format(resultado)  + "  " + " " + (aluno.getSituacao()));
          jTAHistorico.append("Nome: " + " " +jTFNome.getText() + " | " + formatter.format(resultado) + " | " + aluno.getSituacao()+"\n");
          
      }
      catch(NumberFormatException ex){
        jTFResultado.setText("Digite apenas números ");
      }        
      catch(IllegalArgumentException ex){
        jTFResultado.setText(ex.getMessage());
            }    
    }//GEN-LAST:event_jButtonCalcularActionPerformed

    private void jButtonLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLimparActionPerformed
        //jTAHistorico.setText("");
        jTFResultado.setText("");
        jTFNome.setText("");
        jTFNota1.setText("");
        jTFNota2.setText("");
        jTFNota3.setText("");
        jTFNome.requestFocus();
    }//GEN-LAST:event_jButtonLimparActionPerformed

    private void jTFResultadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFResultadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFResultadoActionPerformed

    private void jButtonLimparHistoricoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLimparHistoricoActionPerformed
        jTAHistorico.setText("");
        jTFNome.requestFocus();
    }//GEN-LAST:event_jButtonLimparHistoricoActionPerformed

    private void jTFNota1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFNota1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFNota1ActionPerformed

    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> new TelaAvaliacao().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCalcular;
    private javax.swing.JButton jButtonLimpar;
    private javax.swing.JButton jButtonLimparHistorico;
    private javax.swing.JLabel jLHistorico;
    private javax.swing.JLabel jLNome;
    private javax.swing.JLabel jLNota1;
    private javax.swing.JLabel jLNota2;
    private javax.swing.JLabel jLNota3;
    private javax.swing.JLabel jLResultado;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTAHistorico;
    private javax.swing.JTextField jTFNome;
    private javax.swing.JTextField jTFNota1;
    private javax.swing.JTextField jTFNota2;
    private javax.swing.JTextField jTFNota3;
    private javax.swing.JTextField jTFResultado;
    // End of variables declaration//GEN-END:variables
}

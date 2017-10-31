/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Telas;


import javax.swing.JOptionPane;
import model.produto.Produto;
import service.produto.ServicoProduto;

/**
 *
 * @author andreson.csilva
 */
public class CadastrarProdutos extends javax.swing.JPanel {

    /**
     * Creates new form CadastrarProdutos
     */
    public CadastrarProdutos() {
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

        Cor_text = new javax.swing.JTextField();
        Modelo_text = new javax.swing.JTextField();
        Codigo_text = new javax.swing.JTextField();
        Tamanho_combo = new javax.swing.JComboBox<>();
        Preco_float = new javax.swing.JTextField();
        Marca_text = new javax.swing.JTextField();
        Codigo_label = new javax.swing.JLabel();
        Preco_label = new javax.swing.JLabel();
        Cor_label = new javax.swing.JLabel();
        Modelo_label = new javax.swing.JLabel();
        Tamanho_label = new javax.swing.JLabel();
        Marca_label = new javax.swing.JLabel();
        Cadastrar_button = new javax.swing.JButton();
        Cancelar_button = new javax.swing.JButton();

        Cor_text.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Cor_textActionPerformed(evt);
            }
        });

        Tamanho_combo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "Masculino", "Feminino", "Outros" }));

        Codigo_label.setText("Código:");

        Preco_label.setText("Preço:");

        Cor_label.setText("Cor:");

        Modelo_label.setText("Modelo:");

        Tamanho_label.setText("Tamanho:");

        Marca_label.setText("Marca:");

        Cadastrar_button.setText("Cadastrar");
        Cadastrar_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Cadastrar_buttonActionPerformed(evt);
            }
        });

        Cancelar_button.setText("Cancelar");
        Cancelar_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Cancelar_buttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Codigo_label)
                        .addGap(0, 475, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(Codigo_text)
                            .addComponent(Modelo_label, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Modelo_text, javax.swing.GroupLayout.DEFAULT_SIZE, 171, Short.MAX_VALUE)
                            .addComponent(Tamanho_label, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Tamanho_combo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Cor_label)
                            .addComponent(Marca_label)
                            .addComponent(Preco_label)
                            .addComponent(Marca_text)
                            .addComponent(Cor_text)
                            .addComponent(Preco_float, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Cadastrar_button)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Cancelar_button)
                        .addGap(23, 23, 23))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(Codigo_label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Codigo_text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Modelo_label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Modelo_text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(Tamanho_label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Tamanho_combo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Marca_label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Marca_text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Cor_label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Cor_text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Preco_label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Cadastrar_button)
                        .addComponent(Cancelar_button))
                    .addComponent(Preco_float, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(25, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void Cor_textActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Cor_textActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Cor_textActionPerformed
        //Listener do botão cadastrar
    private void Cadastrar_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Cadastrar_buttonActionPerformed
        Produto  p = new Produto();
        
        try{
          p.setCod_produto(Long.parseLong(Codigo_text.getText().toString()));
        }catch(Exception e){
           
        }
         
        try {
          p.setPreco(Float.parseFloat(Preco_float.getText().toString()));
        } catch (Exception e) {

        }
        
        p.setModelo(Modelo_text.getText());
        
        p.setMarca(Marca_text.getText());
        
        p.setCor(Cor_text.getText());
        
        p.setTamanho((String) Tamanho_combo.getSelectedItem());
        
        try{
            //Chama o serviço quarto
            ServicoProduto.cadastrarProduto(p);
        }catch (Exception e){
            //tratamento de erro
            JOptionPane.showMessageDialog(null, e.getMessage(),
                    "Erro", JOptionPane.ERROR_MESSAGE);
            return;
            
        }
        
        //Inserido com sucesso
        JOptionPane.showMessageDialog(null, "Produto inserido",
                "Cadastro bem-sucedido", JOptionPane.INFORMATION_MESSAGE);
        
        //limpa os campos
        Codigo_text.setText("");
        Preco_float.setText("");
        Modelo_text.setText("");
        Tamanho_combo.setSelectedIndex(0);
        Marca_text.setText("");
        Cor_text.setText("");
    }//GEN-LAST:event_Cadastrar_buttonActionPerformed
    //Listener para cancelar(fechar)
    private void Cancelar_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Cancelar_buttonActionPerformed
        
    }//GEN-LAST:event_Cancelar_buttonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Cadastrar_button;
    private javax.swing.JButton Cancelar_button;
    private javax.swing.JLabel Codigo_label;
    private javax.swing.JTextField Codigo_text;
    private javax.swing.JLabel Cor_label;
    private javax.swing.JTextField Cor_text;
    private javax.swing.JLabel Marca_label;
    private javax.swing.JTextField Marca_text;
    private javax.swing.JLabel Modelo_label;
    private javax.swing.JTextField Modelo_text;
    private javax.swing.JTextField Preco_float;
    private javax.swing.JLabel Preco_label;
    private javax.swing.JComboBox<String> Tamanho_combo;
    private javax.swing.JLabel Tamanho_label;
    // End of variables declaration//GEN-END:variables
}

package graphic;

import enums.Mode;
import model.Address;
import model.People;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class Application extends javax.swing.JFrame {

    private List<People> peoples = new ArrayList<People>();
    private List<Address> addresses = new ArrayList<Address>();
    private SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
    private Enum action;
    private String tipoEmail;
    private String tipoTel;
    private String tipoEnd;

    public Application() {
        initComponents();
        setLocationRelativeTo(null);
        manipulateInterface(Mode.NAVEGAR);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        emailGroup = new javax.swing.ButtonGroup();
        telGroup = new javax.swing.ButtonGroup();
        enderecoGroup = new javax.swing.ButtonGroup();
        guiasPanel = new javax.swing.JTabbedPane();
        visualizarPessoaPanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        pessoaTable = new javax.swing.JTable();
        documentoTextField = new javax.swing.JTextField();
        nomeTextField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        emailTextField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        nascimentoTextField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        emailPrincipalRadioButton = new javax.swing.JRadioButton();
        emailSecundarioRadioButton = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        telefoneTextField = new javax.swing.JTextField();
        telResRadioButton = new javax.swing.JRadioButton();
        telComerRadioButton = new javax.swing.JRadioButton();
        telCelRadioButton = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        endResRadioButton = new javax.swing.JRadioButton();
        endComerRadioButton = new javax.swing.JRadioButton();
        jLabel7 = new javax.swing.JLabel();
        logradouroTextField = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        numeroTextField = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        complementoTextField = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        bairroTextField = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        cepTextField = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        cidadeTextField = new javax.swing.JTextField();
        salvarButton = new javax.swing.JButton();
        cancelarButton = new javax.swing.JButton();
        novoButton = new javax.swing.JButton();
        editarButton = new javax.swing.JButton();
        excluirButton = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        visualizarEnderecoPanel = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        enderecoTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        guiasPanel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        guiasPanel.setFont(new java.awt.Font("Liberation Sans", 0, 24)); // NOI18N

        visualizarPessoaPanel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        visualizarPessoaPanel.setFont(new java.awt.Font("Liberation Sans", 0, 36)); // NOI18N

        pessoaTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "Documento", "Nascimento", "Tipo Email", "Email", "Tipo Telefone", "Telefone", "Endereco Id"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        pessoaTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pessoaTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(pessoaTable);

        documentoTextField.setFont(new java.awt.Font("Liberation Sans", 0, 24)); // NOI18N
        documentoTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                documentoTextFieldActionPerformed(evt);
            }
        });

        nomeTextField.setFont(new java.awt.Font("Liberation Sans", 0, 24)); // NOI18N
        nomeTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomeTextFieldActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Liberation Sans", 0, 24)); // NOI18N
        jLabel1.setText("Nome:");

        jLabel4.setFont(new java.awt.Font("Liberation Sans", 0, 24)); // NOI18N
        jLabel4.setText("Email:");

        emailTextField.setFont(new java.awt.Font("Liberation Sans", 0, 24)); // NOI18N
        emailTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailTextFieldActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Liberation Sans", 0, 24)); // NOI18N
        jLabel2.setText("Documento:");

        nascimentoTextField.setFont(new java.awt.Font("Liberation Sans", 0, 24)); // NOI18N
        nascimentoTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                nascimentoTextFieldFocusGained(evt);
            }
        });
        nascimentoTextField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nascimentoTextFieldMouseClicked(evt);
            }
        });
        nascimentoTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nascimentoTextFieldActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Liberation Sans", 0, 24)); // NOI18N
        jLabel3.setText("Nascimento:");

        emailGroup.add(emailPrincipalRadioButton);
        emailPrincipalRadioButton.setFont(new java.awt.Font("Liberation Sans", 0, 24)); // NOI18N
        emailPrincipalRadioButton.setText("Principal");
        emailPrincipalRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailPrincipalRadioButtonActionPerformed(evt);
            }
        });

        emailGroup.add(emailSecundarioRadioButton);
        emailSecundarioRadioButton.setFont(new java.awt.Font("Liberation Sans", 0, 24)); // NOI18N
        emailSecundarioRadioButton.setText("Secundário");
        emailSecundarioRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailSecundarioRadioButtonActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Liberation Sans", 0, 24)); // NOI18N
        jLabel5.setText("Telefone:");

        telefoneTextField.setFont(new java.awt.Font("Liberation Sans", 0, 24)); // NOI18N
        telefoneTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                telefoneTextFieldActionPerformed(evt);
            }
        });

        telGroup.add(telResRadioButton);
        telResRadioButton.setFont(new java.awt.Font("Liberation Sans", 0, 24)); // NOI18N
        telResRadioButton.setText("Residencial");
        telResRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                telResRadioButtonActionPerformed(evt);
            }
        });

        telGroup.add(telComerRadioButton);
        telComerRadioButton.setFont(new java.awt.Font("Liberation Sans", 0, 24)); // NOI18N
        telComerRadioButton.setText("Comercial");
        telComerRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                telComerRadioButtonActionPerformed(evt);
            }
        });

        telGroup.add(telCelRadioButton);
        telCelRadioButton.setFont(new java.awt.Font("Liberation Sans", 0, 24)); // NOI18N
        telCelRadioButton.setText("Celular");
        telCelRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                telCelRadioButtonActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Liberation Sans", 0, 24)); // NOI18N
        jLabel6.setText("Endereço:");

        enderecoGroup.add(endResRadioButton);
        endResRadioButton.setFont(new java.awt.Font("Liberation Sans", 0, 24)); // NOI18N
        endResRadioButton.setText("Residencial");
        endResRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                endResRadioButtonActionPerformed(evt);
            }
        });

        enderecoGroup.add(endComerRadioButton);
        endComerRadioButton.setFont(new java.awt.Font("Liberation Sans", 0, 24)); // NOI18N
        endComerRadioButton.setText("Comercial");
        endComerRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                endComerRadioButtonActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Liberation Sans", 0, 24)); // NOI18N
        jLabel7.setText("Logradouro:");

        logradouroTextField.setFont(new java.awt.Font("Liberation Sans", 0, 24)); // NOI18N
        logradouroTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logradouroTextFieldActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Liberation Sans", 0, 24)); // NOI18N
        jLabel8.setText("Número:");

        numeroTextField.setFont(new java.awt.Font("Liberation Sans", 0, 24)); // NOI18N
        numeroTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numeroTextFieldActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Liberation Sans", 0, 24)); // NOI18N
        jLabel9.setText("Complemento:");

        complementoTextField.setFont(new java.awt.Font("Liberation Sans", 0, 24)); // NOI18N
        complementoTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                complementoTextFieldActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Liberation Sans", 0, 24)); // NOI18N
        jLabel10.setText("Bairro:");

        bairroTextField.setFont(new java.awt.Font("Liberation Sans", 0, 24)); // NOI18N
        bairroTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bairroTextFieldActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Liberation Sans", 0, 24)); // NOI18N
        jLabel11.setText("CEP:");

        cepTextField.setFont(new java.awt.Font("Liberation Sans", 0, 24)); // NOI18N
        cepTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cepTextFieldActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Liberation Sans", 0, 24)); // NOI18N
        jLabel12.setText("Cidade:");

        cidadeTextField.setFont(new java.awt.Font("Liberation Sans", 0, 24)); // NOI18N
        cidadeTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cidadeTextFieldActionPerformed(evt);
            }
        });

        salvarButton.setBackground(new java.awt.Color(102, 255, 102));
        salvarButton.setFont(new java.awt.Font("Liberation Sans", 0, 24)); // NOI18N
        salvarButton.setText("Salvar");
        salvarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
                    salvarButtonActionPerformed(evt);
                } catch (ParseException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        cancelarButton.setBackground(new java.awt.Color(255, 0, 0));
        cancelarButton.setFont(new java.awt.Font("Liberation Sans", 0, 24)); // NOI18N
        cancelarButton.setText("Cancelar");
        cancelarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarButtonActionPerformed(evt);
            }
        });

        novoButton.setBackground(new java.awt.Color(102, 255, 102));
        novoButton.setFont(new java.awt.Font("Liberation Sans", 0, 24)); // NOI18N
        novoButton.setText("Novo");
        novoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                novoButtonActionPerformed(evt);
            }
        });

        editarButton.setBackground(new java.awt.Color(255, 204, 51));
        editarButton.setFont(new java.awt.Font("Liberation Sans", 0, 24)); // NOI18N
        editarButton.setText("Editar");
        editarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarButtonActionPerformed(evt);
            }
        });

        excluirButton.setBackground(new java.awt.Color(255, 51, 51));
        excluirButton.setFont(new java.awt.Font("Liberation Sans", 0, 24)); // NOI18N
        excluirButton.setText("Excluir");
        excluirButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                excluirButtonActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Liberation Sans", 0, 24)); // NOI18N
        jLabel13.setText("(dia/mês/ano)");

        javax.swing.GroupLayout visualizarPessoaPanelLayout = new javax.swing.GroupLayout(visualizarPessoaPanel);
        visualizarPessoaPanel.setLayout(visualizarPessoaPanelLayout);
        visualizarPessoaPanelLayout.setHorizontalGroup(
            visualizarPessoaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(visualizarPessoaPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(visualizarPessoaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(visualizarPessoaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel6)
                        .addGroup(visualizarPessoaPanelLayout.createSequentialGroup()
                            .addComponent(endResRadioButton)
                            .addGap(18, 18, 18)
                            .addComponent(endComerRadioButton))
                        .addGroup(visualizarPessoaPanelLayout.createSequentialGroup()
                            .addGroup(visualizarPessoaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING))
                            .addGroup(visualizarPessoaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(visualizarPessoaPanelLayout.createSequentialGroup()
                                    .addGap(43, 43, 43)
                                    .addComponent(nomeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, visualizarPessoaPanelLayout.createSequentialGroup()
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(emailTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGap(18, 18, 18)
                            .addGroup(visualizarPessoaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(visualizarPessoaPanelLayout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(documentoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jLabel3)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(nascimentoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jLabel13))
                                .addGroup(visualizarPessoaPanelLayout.createSequentialGroup()
                                    .addComponent(emailSecundarioRadioButton)
                                    .addGap(29, 29, 29)
                                    .addGroup(visualizarPessoaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(visualizarPessoaPanelLayout.createSequentialGroup()
                                            .addComponent(telComerRadioButton)
                                            .addGap(31, 31, 31)
                                            .addComponent(telCelRadioButton))
                                        .addComponent(emailPrincipalRadioButton)))))
                        .addGroup(visualizarPessoaPanelLayout.createSequentialGroup()
                            .addComponent(jLabel5)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(telefoneTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(telResRadioButton))
                        .addGroup(visualizarPessoaPanelLayout.createSequentialGroup()
                            .addGroup(visualizarPessoaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, visualizarPessoaPanelLayout.createSequentialGroup()
                                    .addComponent(jLabel12)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cidadeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, visualizarPessoaPanelLayout.createSequentialGroup()
                                    .addComponent(jLabel7)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(logradouroTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGap(18, 18, 18)
                            .addComponent(jLabel8)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(numeroTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel9)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(complementoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jLabel10)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(bairroTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jLabel11)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(cepTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, visualizarPessoaPanelLayout.createSequentialGroup()
                            .addComponent(salvarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(134, 134, 134)
                            .addComponent(cancelarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(427, 427, 427)))
                    .addGroup(visualizarPessoaPanelLayout.createSequentialGroup()
                        .addComponent(novoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(editarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(excluirButton, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(visualizarPessoaPanelLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1560, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        visualizarPessoaPanelLayout.setVerticalGroup(
            visualizarPessoaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(visualizarPessoaPanelLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(visualizarPessoaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(novoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(editarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(excluirButton, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(visualizarPessoaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nomeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3)
                    .addComponent(nascimentoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(documentoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addGap(31, 31, 31)
                .addGroup(visualizarPessoaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(visualizarPessoaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(emailSecundarioRadioButton)
                        .addComponent(emailTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(emailPrincipalRadioButton))
                    .addGroup(visualizarPessoaPanelLayout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addGroup(visualizarPessoaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(telefoneTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(telResRadioButton)
                            .addComponent(telComerRadioButton)
                            .addComponent(telCelRadioButton)
                            .addComponent(jLabel5))))
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addGap(19, 19, 19)
                .addGroup(visualizarPessoaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(endResRadioButton)
                    .addComponent(endComerRadioButton))
                .addGap(18, 18, 18)
                .addGroup(visualizarPessoaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(logradouroTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(numeroTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(complementoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(bairroTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(cepTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(visualizarPessoaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(cidadeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addGroup(visualizarPessoaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(salvarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cancelarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15))
        );

        guiasPanel.addTab("Pessoas", visualizarPessoaPanel);

        enderecoTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Tipo", "Logradouro", "Número", "Complemento", "Bairro", "CEP", "Cidade"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(enderecoTable);

        javax.swing.GroupLayout visualizarEnderecoPanelLayout = new javax.swing.GroupLayout(visualizarEnderecoPanel);
        visualizarEnderecoPanel.setLayout(visualizarEnderecoPanelLayout);
        visualizarEnderecoPanelLayout.setHorizontalGroup(
            visualizarEnderecoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 1560, Short.MAX_VALUE)
        );
        visualizarEnderecoPanelLayout.setVerticalGroup(
            visualizarEnderecoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 825, Short.MAX_VALUE)
        );

        guiasPanel.addTab("Endereços", visualizarEnderecoPanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(guiasPanel)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(guiasPanel)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nomeTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomeTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomeTextFieldActionPerformed

    private void documentoTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_documentoTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_documentoTextFieldActionPerformed

    private void nascimentoTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nascimentoTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nascimentoTextFieldActionPerformed

    private void emailTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailTextFieldActionPerformed

    private void emailSecundarioRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailSecundarioRadioButtonActionPerformed
        tipoEmail = ((JRadioButton) evt.getSource()).getText();
    }//GEN-LAST:event_emailSecundarioRadioButtonActionPerformed

    private void telefoneTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_telefoneTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_telefoneTextFieldActionPerformed

    private void logradouroTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logradouroTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_logradouroTextFieldActionPerformed

    private void numeroTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numeroTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_numeroTextFieldActionPerformed

    private void complementoTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_complementoTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_complementoTextFieldActionPerformed

    private void bairroTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bairroTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bairroTextFieldActionPerformed

    private void cepTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cepTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cepTextFieldActionPerformed

    private void cidadeTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cidadeTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cidadeTextFieldActionPerformed

    private void cancelarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarButtonActionPerformed
        manipulateInterface(Mode.NAVEGAR);
    }//GEN-LAST:event_cancelarButtonActionPerformed

    private void excluirButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_excluirButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_excluirButtonActionPerformed

    private void novoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_novoButtonActionPerformed
        manipulateInterface(Mode.NOVO);
    }//GEN-LAST:event_novoButtonActionPerformed

    private void salvarButtonActionPerformed(java.awt.event.ActionEvent evt) throws ParseException {//GEN-FIRST:event_salvarButtonActionPerformed
        if(action.equals(Mode.NOVO)) {
            savePeople();
        }
        else if(action.equals(Mode.EDITAR)) {
            updatePeople(pessoaTable.getSelectedRow());
            orderLists();
        }

        orderLists();
        loadTablePeople();
        loadTableAddress();
        manipulateInterface(Mode.NAVEGAR);

    }//GEN-LAST:event_salvarButtonActionPerformed

    private void editarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarButtonActionPerformed
        manipulateInterface(Mode.EDITAR);
    }//GEN-LAST:event_editarButtonActionPerformed

    private void emailPrincipalRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailPrincipalRadioButtonActionPerformed
        tipoEmail = ((JRadioButton) evt.getSource()).getText();
    }//GEN-LAST:event_emailPrincipalRadioButtonActionPerformed

    private void telResRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_telResRadioButtonActionPerformed
        tipoTel = ((JRadioButton) evt.getSource()).getText();
    }//GEN-LAST:event_telResRadioButtonActionPerformed

    private void telComerRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_telComerRadioButtonActionPerformed
        tipoTel = ((JRadioButton) evt.getSource()).getText();
    }//GEN-LAST:event_telComerRadioButtonActionPerformed

    private void telCelRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_telCelRadioButtonActionPerformed
        tipoTel = ((JRadioButton) evt.getSource()).getText();
    }//GEN-LAST:event_telCelRadioButtonActionPerformed

    private void endResRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_endResRadioButtonActionPerformed
        tipoEnd = ((JRadioButton) evt.getSource()).getText();
    }//GEN-LAST:event_endResRadioButtonActionPerformed

    private void endComerRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_endComerRadioButtonActionPerformed
        tipoEnd = ((JRadioButton) evt.getSource()).getText();
    }//GEN-LAST:event_endComerRadioButtonActionPerformed

    private void nascimentoTextFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nascimentoTextFieldFocusGained

    }//GEN-LAST:event_nascimentoTextFieldFocusGained

    private void nascimentoTextFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nascimentoTextFieldMouseClicked
    }//GEN-LAST:event_nascimentoTextFieldMouseClicked

    private void pessoaTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pessoaTableMouseClicked
        manipulateInterface(Mode.SELECAO);
        var pessoa = peoples.get(pessoaTable.getSelectedRow());
        var endereco = getAddressByPeople(pessoa);

        nomeTextField.setText(pessoa.getNome());
        documentoTextField.setText(pessoa.getDoc());
        nascimentoTextField.setText(formato.format(pessoa.getNascimento()));
        emailTextField.setText(pessoa.getEmail().values().toArray()[0].toString());

        if(pessoa.getEmail().keySet().toArray()[0].toString().equals("Principal")) {
            emailPrincipalRadioButton.setSelected(true);
        }
        else {
            emailSecundarioRadioButton.setSelected(true);
        }

        telefoneTextField.setText(pessoa.getTelefone().values().toArray()[0].toString());

        if(pessoa.getTelefone().keySet().toArray()[0].toString().equals("Residencial")) {
            telResRadioButton.setSelected(true);
        }
        else if(pessoa.getTelefone().keySet().toArray()[0].toString().equals("Celular")) {
            telCelRadioButton.setSelected(true);
        }
        else {
            telComerRadioButton.setSelected(true);
        }

        logradouroTextField.setText(endereco.getLogradouro());
        numeroTextField.setText(String.valueOf(endereco.getNumero()));
        complementoTextField.setText(endereco.getComplemento());
        bairroTextField.setText(endereco.getBairro());
        cepTextField.setText(endereco.getCep());
        cidadeTextField.setText(endereco.getCidade());

        if(pessoa.getEndereco().keySet().toArray()[0].toString().equals("Comercial")) {
            endResRadioButton.setSelected(true);
        }
        else {
            endComerRadioButton.setSelected(true);
        }
    }//GEN-LAST:event_pessoaTableMouseClicked

    private void loadTablePeople() {
        String[] colunas = {"Nome", "Documento", "Nascimento", "Tipo Email", "Email", "Tipo Telefone", "Telefone", "Endereço Id"};
        DefaultTableModel model = new DefaultTableModel(colunas, 0);

        peoples.forEach(people -> model.addRow(new Object[]{people.getNome(),
                people.getDoc(),
                formato.format(people.getNascimento()),
                people.getEmail().keySet().toArray()[0],
                people.getEmail().values().toArray()[0],
                people.getTelefone().keySet().toArray()[0],
                people.getTelefone().values().toArray()[0],
                getAddressByPeople(people).getId()}));

        pessoaTable.setModel(model);
    }

    private void loadTableAddress() {
        String[] colunas = {"Id", "Tipo", "Logradouro", "Número", "Complemento", "Bairro", "CEP", "Cidade"};
        DefaultTableModel model = new DefaultTableModel(colunas, 0);

        addresses.forEach(address -> model.addRow(new Object[]{address.getId(),
                        address.getTipo(),
                        address.getLogradouro(),
                        address.getNumero(),
                        address.getComplemento(),
                        address.getBairro(),
                        address.getCep(),
                        address.getCidade()})
        );

        enderecoTable.setModel(model);
    }

    public void manipulateInterface(Mode mode) {
        switch (mode) {
            case NAVEGAR:
                clearFields();
                enableFields(false);
                enableButtons(true, false, false, false, false);
                action = mode;
                break;
            case NOVO:
                clearFields();
                enableFields(true);
                enableButtons(false, true, false, true, false);
                action = mode;
                break;
            case EDITAR:
                enableFields(true);
                enableButtons(true, true, false, true, false);
                action = mode;
                break;
            case EXCLUIR:
                enableFields(false);
                enableButtons(false, false, true, false, false);
                action = mode;
                break;
            case SELECAO:
                enableFields(false);
                enableButtons(true, false, true, false, true);
                action = mode;
                break;
        }
    }

    private void enableButtons(Boolean... args) {
        novoButton.setEnabled(args[0]);
        salvarButton.setEnabled(args[1]);
        editarButton.setEnabled(args[2]);
        cancelarButton.setEnabled(args[3]);
        excluirButton.setEnabled(args[4]);
    }

    private void clearFields() {
        nomeTextField.setText("");
        documentoTextField.setText("");
        nascimentoTextField.setText("");
        telefoneTextField.setText("");
        emailTextField.setText("");
        logradouroTextField.setText("");
        numeroTextField.setText("");
        complementoTextField.setText("");
        bairroTextField.setText("");
        cepTextField.setText("");
        cidadeTextField.setText("");

        emailGroup.clearSelection();
        telGroup.clearSelection();
        enderecoGroup.clearSelection();
    }

    private void enableFields(Boolean bol) {
        nomeTextField.setEnabled(bol);
        documentoTextField.setEnabled(bol);
        nascimentoTextField.setEnabled(bol);
        telefoneTextField.setEnabled(bol);
        emailTextField.setEnabled(bol);
        logradouroTextField.setEnabled(bol);
        numeroTextField.setEnabled(bol);
        complementoTextField.setEnabled(bol);
        bairroTextField.setEnabled(bol);
        cepTextField.setEnabled(bol);
        cidadeTextField.setEnabled(bol);

        emailPrincipalRadioButton.setEnabled(bol);
        emailSecundarioRadioButton.setEnabled(bol);

        telCelRadioButton.setEnabled(bol);
        telComerRadioButton.setEnabled(bol);
        telResRadioButton.setEnabled(bol);

        endComerRadioButton.setEnabled(bol);
        endResRadioButton.setEnabled(bol);
    }

    private void savePeople() throws ParseException {
        var endereco = createAddress();

        var pessoa = new People(nomeTextField.getText(),
                documentoTextField.getText(),
                formato.parse(nascimentoTextField.getText()));

        pessoa.getEmail().put(tipoEmail, emailTextField.getText());
        pessoa.getTelefone().put(tipoTel, telefoneTextField.getText());
        pessoa.getEndereco().put(tipoEnd, endereco);

        peoples.add(pessoa);
    }

    private Address createAddress() {
        var endereco = new Address(logradouroTextField.getText(),
                Integer.parseInt(numeroTextField.getText()),
                complementoTextField.getText(),
                bairroTextField.getText(),
                cepTextField.getText(),
                cidadeTextField.getText(),
                tipoEnd,
                nomeTextField.getText());

        addresses.add(endereco);

        return endereco;
    }

    public void updatePeople(Integer index) throws ParseException {
        var email = new HashMap<String, String>();
        var tel = new HashMap<String, String>();
        var end = new HashMap<String, Address>();

        peoples.get(index).setNome(nomeTextField.getText());
        peoples.get(index).setDoc(documentoTextField.getText());
        peoples.get(index).setNascimento(formato.parse(nascimentoTextField.getText()));

        email.put(tipoEmail, emailTextField.getText());
        tel.put(tipoTel, telefoneTextField.getText());
        end.put(tipoEnd, updateAddress(index));

        peoples.get(index).setEmail(email);
        peoples.get(index).setTelefone(tel);
        peoples.get(index).setEndereco(end);
    }

    public Address updateAddress(Integer index) {
        var indexEnd = addresses.indexOf(getAddressByPeople(peoples.get(index)));
        addresses.get(indexEnd).setNome(peoples.get(index).getNome());
        addresses.get(indexEnd).setTipo(tipoEnd);
        addresses.get(indexEnd).setLogradouro(logradouroTextField.getText());
        addresses.get(indexEnd).setNumero(Integer.parseInt(numeroTextField.getText()));
        addresses.get(indexEnd).setBairro(bairroTextField.getText());
        addresses.get(indexEnd).setCep(cepTextField.getText());
        addresses.get(indexEnd).setCidade(cidadeTextField.getText());

        return addresses.get(indexEnd);
    }

    private Address getAddressByPeople(People people) {
        return (Address) people.getEndereco().values().toArray()[0];
    }

    private void orderLists() {
        Collections.sort(peoples);
        Collections.sort(addresses);
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Application().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField bairroTextField;
    private javax.swing.JButton cancelarButton;
    private javax.swing.JTextField cepTextField;
    private javax.swing.JTextField cidadeTextField;
    private javax.swing.JTextField complementoTextField;
    private javax.swing.JTextField documentoTextField;
    private javax.swing.JButton editarButton;
    private javax.swing.ButtonGroup emailGroup;
    private javax.swing.JRadioButton emailPrincipalRadioButton;
    private javax.swing.JRadioButton emailSecundarioRadioButton;
    private javax.swing.JTextField emailTextField;
    private javax.swing.JRadioButton endComerRadioButton;
    private javax.swing.JRadioButton endResRadioButton;
    private javax.swing.ButtonGroup enderecoGroup;
    private javax.swing.JTable enderecoTable;
    private javax.swing.JButton excluirButton;
    private javax.swing.JTabbedPane guiasPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField logradouroTextField;
    private javax.swing.JTextField nascimentoTextField;
    private javax.swing.JTextField nomeTextField;
    private javax.swing.JButton novoButton;
    private javax.swing.JTextField numeroTextField;
    private javax.swing.JTable pessoaTable;
    private javax.swing.JButton salvarButton;
    private javax.swing.JRadioButton telCelRadioButton;
    private javax.swing.JRadioButton telComerRadioButton;
    private javax.swing.ButtonGroup telGroup;
    private javax.swing.JRadioButton telResRadioButton;
    private javax.swing.JTextField telefoneTextField;
    private javax.swing.JPanel visualizarEnderecoPanel;
    private javax.swing.JPanel visualizarPessoaPanel;
    // End of variables declaration//GEN-END:variables

}

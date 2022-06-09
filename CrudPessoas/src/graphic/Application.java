package graphic;

public class Application extends javax.swing.JFrame {

    public Application() {
        initComponents();
        setLocationRelativeTo(null);
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        emailGroup = new javax.swing.ButtonGroup();
        telGroup = new javax.swing.ButtonGroup();
        enderecoGroup = new javax.swing.ButtonGroup();
        guiasPanel = new javax.swing.JTabbedPane();
        visualizarEnderecoPanel = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        enderecoTable = new javax.swing.JTable();
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        guiasPanel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        guiasPanel.setFont(new java.awt.Font("Liberation Sans", 0, 24)); // NOI18N

        enderecoTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Logradouro", "Numero", "Complemento", "Bairro", "CEP", "Cidade"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
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
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 1526, Short.MAX_VALUE)
        );
        visualizarEnderecoPanelLayout.setVerticalGroup(
            visualizarEnderecoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 825, Short.MAX_VALUE)
        );

        guiasPanel.addTab("Visualizar Endereços", visualizarEnderecoPanel);

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

        telGroup.add(telComerRadioButton);
        telComerRadioButton.setFont(new java.awt.Font("Liberation Sans", 0, 24)); // NOI18N
        telComerRadioButton.setText("Comercial");

        telGroup.add(telCelRadioButton);
        telCelRadioButton.setFont(new java.awt.Font("Liberation Sans", 0, 24)); // NOI18N
        telCelRadioButton.setText("Celular");

        jLabel6.setFont(new java.awt.Font("Liberation Sans", 0, 24)); // NOI18N
        jLabel6.setText("Endereço:");

        enderecoGroup.add(endResRadioButton);
        endResRadioButton.setFont(new java.awt.Font("Liberation Sans", 0, 24)); // NOI18N
        endResRadioButton.setText("Residencial");

        enderecoGroup.add(endComerRadioButton);
        endComerRadioButton.setFont(new java.awt.Font("Liberation Sans", 0, 24)); // NOI18N
        endComerRadioButton.setText("Comercial");

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

        editarButton.setBackground(new java.awt.Color(255, 204, 51));
        editarButton.setFont(new java.awt.Font("Liberation Sans", 0, 24)); // NOI18N
        editarButton.setText("Editar");

        excluirButton.setBackground(new java.awt.Color(255, 51, 51));
        excluirButton.setFont(new java.awt.Font("Liberation Sans", 0, 24)); // NOI18N
        excluirButton.setText("Excluir");
        excluirButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                excluirButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout visualizarPessoaPanelLayout = new javax.swing.GroupLayout(visualizarPessoaPanel);
        visualizarPessoaPanel.setLayout(visualizarPessoaPanelLayout);
        visualizarPessoaPanelLayout.setHorizontalGroup(
            visualizarPessoaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(visualizarPessoaPanelLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1525, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 1, Short.MAX_VALUE))
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
                                    .addComponent(nascimentoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                            .addGap(115, 115, 115)
                            .addComponent(cancelarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(493, 493, 493)))
                    .addGroup(visualizarPessoaPanelLayout.createSequentialGroup()
                        .addComponent(novoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(editarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(excluirButton, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                    .addComponent(documentoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(guiasPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 1526, javax.swing.GroupLayout.PREFERRED_SIZE)
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
        // TODO add your handling code here:
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
        // TODO add your handling code here:
    }//GEN-LAST:event_cancelarButtonActionPerformed

    private void excluirButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_excluirButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_excluirButtonActionPerformed

    
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

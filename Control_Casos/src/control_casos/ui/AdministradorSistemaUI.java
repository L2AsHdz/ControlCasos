/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control_casos.ui;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JFormattedTextField;
import javax.swing.JPasswordField;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import org.jdesktop.swingx.autocomplete.AutoCompleteDecorator;

/**
 *
 * @author Asael
 */
public class AdministradorSistemaUI extends javax.swing.JFrame {
    
    public JButton getBtnActualizarP() {
        return btnActualizarP;
    }

    public JButton getBtnActualizarTC() {
        return btnActualizarTC;
    }

    public JButton getBtnActualizarU() {
        return btnActualizarU;
    }

    public JButton getBtnAgregarP() {
        return btnAgregarP;
    }

    public JButton getBtnAgregarTC() {
        return btnAgregarTC;
    }

    public JButton getBtnAgregarU() {
        return btnAgregarU;
    }

    public JButton getBtnEliminarTC() {
        return btnEliminarTC;
    }

    public JButton getBtnEliminarU() {
        return btnEliminarU;
    }

    public JButton getBtnElimnarP() {
        return btnElimnarP;
    }

    public JComboBox<String> getCbAdminP() {
        return cbAdminP;
    }

    public JComboBox<String> getCbTipoUser() {
        return cbTipoUser;
    }

    public JDialog getDialogProyecto() {
        return dialogProyecto;
    }

    public JDialog getDialogTipoCaso() {
        return dialogTipoCaso;
    }

    public JDialog getDialogUsuario() {
        return dialogUsuario;
    }

    public JFormattedTextField getFtxtDPI() {
        return ftxtDPI;
    }

    public JPasswordField getPasword() {
        return pasword;
    }

    public JTextField getTxtCantEtapas() {
        return txtCantEtapas;
    }

    public JTextArea getTxtDescripcion() {
        return txtDescripcion;
    }

    public JTextField getTxtNombre() {
        return txtNombre;
    }

    public JTextField getTxtNombreProyecto() {
        return txtNombreProyecto;
    }

    public JTextField getTxtNombreTC() {
        return txtNombreTC;
    }

    public JTextField getTxtNombreUsuario() {
        return txtNombreUsuario;
    }

    public JTable getTblProyectos() {
        return tblProyectos;
    }

    public JTable getTblTipoCaso() {
        return tblTipoCaso;
    }

    public JTable getTblUsuario() {
        return tblUsuario;
    }

    
    
    public AdministradorSistemaUI() {
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

        dialogUsuario = new javax.swing.JDialog();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        ftxtDPI = new javax.swing.JFormattedTextField();
        txtNombreUsuario = new javax.swing.JTextField();
        pasword = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();
        cbTipoUser = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblUsuario = new javax.swing.JTable();
        btnAgregarU = new javax.swing.JButton();
        btnActualizarU = new javax.swing.JButton();
        btnEliminarU = new javax.swing.JButton();
        btnCerrar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        dialogProyecto = new javax.swing.JDialog();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtNombreProyecto = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtDescripcion = new javax.swing.JTextArea();
        jLabel8 = new javax.swing.JLabel();
        cbAdminP = new javax.swing.JComboBox<>();
        btnAgregarP = new javax.swing.JButton();
        btnActualizarP = new javax.swing.JButton();
        btnElimnarP = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblProyectos = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        btnLimpiarProyecto = new javax.swing.JButton();
        dialogTipoCaso = new javax.swing.JDialog();
        jLabel9 = new javax.swing.JLabel();
        txtNombreTC = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        btnAgregarTC = new javax.swing.JButton();
        btnActualizarTC = new javax.swing.JButton();
        btnEliminarTC = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblTipoCaso = new javax.swing.JTable();
        btnLimpiarTipoCaso = new javax.swing.JButton();
        btnCerrarTipoCaso = new javax.swing.JButton();
        txtCantEtapas = new javax.swing.JFormattedTextField();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuUsuario = new javax.swing.JMenu();
        itemUsuario = new javax.swing.JMenuItem();
        menuProyecto = new javax.swing.JMenu();
        itemProyecto = new javax.swing.JMenuItem();
        itemDesactivarP = new javax.swing.JMenuItem();
        menuTipoCaso = new javax.swing.JMenu();
        itemTipoCaso = new javax.swing.JMenuItem();
        menuReporte = new javax.swing.JMenu();
        itemRProyecto = new javax.swing.JMenuItem();
        itemRCaso = new javax.swing.JMenuItem();
        itemRHD = new javax.swing.JMenuItem();
        itemRDesarrollador = new javax.swing.JMenuItem();

        dialogUsuario.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        dialogUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        dialogUsuario.setMinimumSize(new java.awt.Dimension(400, 300));
        dialogUsuario.setModal(true);
        dialogUsuario.setSize(new java.awt.Dimension(655, 465));

        jLabel1.setText("Nombre");

        jLabel2.setText("DPI");

        jLabel3.setText("Nombre de Usuario");

        jLabel4.setText("Contraseña");

        try {
            ftxtDPI.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####-#####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        ftxtDPI.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel5.setText("Tipo Usuario");

        cbTipoUser.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Administrador Sistema", "Administrador Proyecto", "Desarrollador" }));
        cbTipoUser.setSelectedIndex(-1);

        tblUsuario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "DPI", "Nombre", "Tipo Usuario", "Usuario Sistema"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblUsuarioMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblUsuario);

        btnAgregarU.setText("Agregar");
        btnAgregarU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarUActionPerformed(evt);
            }
        });

        btnActualizarU.setText("Actualizar");
        btnActualizarU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarUActionPerformed(evt);
            }
        });

        btnEliminarU.setText("Elimnar");
        btnEliminarU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarUActionPerformed(evt);
            }
        });

        btnCerrar.setText("Cerrar");
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });

        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout dialogUsuarioLayout = new javax.swing.GroupLayout(dialogUsuario.getContentPane());
        dialogUsuario.getContentPane().setLayout(dialogUsuarioLayout);
        dialogUsuarioLayout.setHorizontalGroup(
            dialogUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dialogUsuarioLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(dialogUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane1)
                    .addGroup(dialogUsuarioLayout.createSequentialGroup()
                        .addGroup(dialogUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dialogUsuarioLayout.createSequentialGroup()
                                .addGroup(dialogUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                            .addGroup(dialogUsuarioLayout.createSequentialGroup()
                                .addComponent(btnAgregarU)
                                .addGap(36, 36, 36)))
                        .addGroup(dialogUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(dialogUsuarioLayout.createSequentialGroup()
                                .addGroup(dialogUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(pasword, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtNombreUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(28, 28, 28))
                            .addGroup(dialogUsuarioLayout.createSequentialGroup()
                                .addComponent(btnActualizarU)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                                .addComponent(btnEliminarU)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(dialogUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(dialogUsuarioLayout.createSequentialGroup()
                                .addGroup(dialogUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel2))
                                .addGap(30, 30, 30)
                                .addGroup(dialogUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ftxtDPI, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cbTipoUser, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dialogUsuarioLayout.createSequentialGroup()
                                .addGap(56, 56, 56)
                                .addComponent(btnLimpiar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnCerrar)))
                        .addGap(5, 5, 5)))
                .addContainerGap(97, Short.MAX_VALUE))
        );
        dialogUsuarioLayout.setVerticalGroup(
            dialogUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dialogUsuarioLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(dialogUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(dialogUsuarioLayout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jLabel1)
                        .addGap(23, 23, 23)
                        .addGroup(dialogUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtNombreUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(dialogUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(pasword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(dialogUsuarioLayout.createSequentialGroup()
                        .addGroup(dialogUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(ftxtDPI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(dialogUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(cbTipoUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(23, 23, 23)
                .addGroup(dialogUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgregarU)
                    .addComponent(btnActualizarU)
                    .addComponent(btnEliminarU)
                    .addComponent(btnLimpiar)
                    .addComponent(btnCerrar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(85, Short.MAX_VALUE))
        );

        dialogProyecto.setSize(new java.awt.Dimension(750, 480));

        jLabel6.setText("Nombre Proyecto");

        jLabel7.setText("Descripcion");

        txtDescripcion.setColumns(20);
        txtDescripcion.setRows(5);
        jScrollPane2.setViewportView(txtDescripcion);

        jLabel8.setText("Administrador de Proyecto");

        AutoCompleteDecorator.decorate(cbAdminP);
        cbAdminP.setEditable(true);
        cbAdminP.setMaximumRowCount(25);

        btnAgregarP.setText("Agregar");
        btnAgregarP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarPActionPerformed(evt);
            }
        });

        btnActualizarP.setText("Actualizar");
        btnActualizarP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarPActionPerformed(evt);
            }
        });

        btnElimnarP.setText("Eliminar");
        btnElimnarP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnElimnarPActionPerformed(evt);
            }
        });

        tblProyectos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Nombre", "Estado", "DPI Admin.", "Admin. de Proyecto"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblProyectos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblProyectosMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tblProyectos);

        jButton1.setText("Cerrar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btnLimpiarProyecto.setText("Limpiar");
        btnLimpiarProyecto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarProyectoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout dialogProyectoLayout = new javax.swing.GroupLayout(dialogProyecto.getContentPane());
        dialogProyecto.getContentPane().setLayout(dialogProyectoLayout);
        dialogProyectoLayout.setHorizontalGroup(
            dialogProyectoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dialogProyectoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(dialogProyectoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane3)
                    .addGroup(dialogProyectoLayout.createSequentialGroup()
                        .addGroup(dialogProyectoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(dialogProyectoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(dialogProyectoLayout.createSequentialGroup()
                                .addComponent(btnAgregarP)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnActualizarP)
                                .addGap(33, 33, 33)
                                .addComponent(btnElimnarP)
                                .addGap(44, 44, 44)
                                .addComponent(btnLimpiarProyecto)
                                .addGap(48, 48, 48)
                                .addComponent(jButton1))
                            .addGroup(dialogProyectoLayout.createSequentialGroup()
                                .addComponent(txtNombreProyecto, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cbAdminP, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane2))))
                .addContainerGap(66, Short.MAX_VALUE))
        );
        dialogProyectoLayout.setVerticalGroup(
            dialogProyectoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dialogProyectoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(dialogProyectoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtNombreProyecto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(cbAdminP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(dialogProyectoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(dialogProyectoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAgregarP)
                    .addGroup(dialogProyectoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton1)
                        .addComponent(btnLimpiarProyecto)
                        .addComponent(btnElimnarP)
                        .addComponent(btnActualizarP)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(68, Short.MAX_VALUE))
        );

        jLabel9.setText("Nombre");

        jLabel10.setText("Cantidad Etapas");

        btnAgregarTC.setText("Agregar");
        btnAgregarTC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarTCActionPerformed(evt);
            }
        });

        btnActualizarTC.setText("Actualizar");
        btnActualizarTC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarTCActionPerformed(evt);
            }
        });

        btnEliminarTC.setText("Eliminar");
        btnEliminarTC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarTCActionPerformed(evt);
            }
        });

        tblTipoCaso.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Nombre", "Cant. Etapas"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblTipoCaso.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblTipoCasoMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(tblTipoCaso);

        btnLimpiarTipoCaso.setText("Limpiar");
        btnLimpiarTipoCaso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarTipoCasoActionPerformed(evt);
            }
        });

        btnCerrarTipoCaso.setText("Cerrar");
        btnCerrarTipoCaso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarTipoCasoActionPerformed(evt);
            }
        });

        try {
            txtCantEtapas.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("########")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout dialogTipoCasoLayout = new javax.swing.GroupLayout(dialogTipoCaso.getContentPane());
        dialogTipoCaso.getContentPane().setLayout(dialogTipoCasoLayout);
        dialogTipoCasoLayout.setHorizontalGroup(
            dialogTipoCasoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dialogTipoCasoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(dialogTipoCasoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane4)
                    .addGroup(dialogTipoCasoLayout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNombreTC, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtCantEtapas))
                    .addGroup(dialogTipoCasoLayout.createSequentialGroup()
                        .addComponent(btnAgregarTC)
                        .addGap(18, 18, 18)
                        .addComponent(btnActualizarTC)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnEliminarTC)
                        .addGap(27, 27, 27)
                        .addComponent(btnLimpiarTipoCaso)
                        .addGap(18, 18, 18)
                        .addComponent(btnCerrarTipoCaso)))
                .addContainerGap(163, Short.MAX_VALUE))
        );
        dialogTipoCasoLayout.setVerticalGroup(
            dialogTipoCasoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dialogTipoCasoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(dialogTipoCasoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtNombreTC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(txtCantEtapas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(dialogTipoCasoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgregarTC)
                    .addComponent(btnActualizarTC)
                    .addComponent(btnEliminarTC)
                    .addComponent(btnLimpiarTipoCaso)
                    .addComponent(btnCerrarTipoCaso))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(134, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        menuUsuario.setText("Usuarios");

        itemUsuario.setText("Agregar Usuario");
        itemUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemUsuarioActionPerformed(evt);
            }
        });
        menuUsuario.add(itemUsuario);

        jMenuBar1.add(menuUsuario);

        menuProyecto.setText("Proyectos");

        itemProyecto.setText("Crear Proyecto");
        itemProyecto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemProyectoActionPerformed(evt);
            }
        });
        menuProyecto.add(itemProyecto);

        itemDesactivarP.setText("Desactivar Proyecto");
        menuProyecto.add(itemDesactivarP);

        jMenuBar1.add(menuProyecto);

        menuTipoCaso.setText("Tipos de Caso");

        itemTipoCaso.setText("Crear Tipo Caso");
        itemTipoCaso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemTipoCasoActionPerformed(evt);
            }
        });
        menuTipoCaso.add(itemTipoCaso);

        jMenuBar1.add(menuTipoCaso);

        menuReporte.setText("Reportes");

        itemRProyecto.setText("Reporte Proyectos");
        menuReporte.add(itemRProyecto);

        itemRCaso.setText("Reportes Casos");
        menuReporte.add(itemRCaso);

        itemRHD.setText("Reporte Horas y Dinero");
        menuReporte.add(itemRHD);

        itemRDesarrollador.setText("Reporte Desarrolladores");
        menuReporte.add(itemRDesarrollador);

        jMenuBar1.add(menuReporte);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 674, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 390, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void itemUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemUsuarioActionPerformed
        ControladorUI.itemAgregarUser();
    }//GEN-LAST:event_itemUsuarioActionPerformed

    private void btnAgregarUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarUActionPerformed
        ControladorUI.btnAgregarUser();
    }//GEN-LAST:event_btnAgregarUActionPerformed

    private void btnActualizarUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarUActionPerformed
        ControladorUI.btnActualizarUser();
    }//GEN-LAST:event_btnActualizarUActionPerformed

    private void btnEliminarUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarUActionPerformed
        ControladorUI.btnEliminarUser();
    }//GEN-LAST:event_btnEliminarUActionPerformed

    private void tblUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblUsuarioMouseClicked
        ControladorUI.tblMouseClickedUser();
    }//GEN-LAST:event_tblUsuarioMouseClicked

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        ControladorUI.limpiarCamposUsuario();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        ControladorUI.cerrarDialog(dialogUsuario);
    }//GEN-LAST:event_btnCerrarActionPerformed

    private void itemProyectoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemProyectoActionPerformed
        ControladorUI.itemAgregarProyecto();
    }//GEN-LAST:event_itemProyectoActionPerformed

    private void btnAgregarPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarPActionPerformed
        ControladorUI.btnAgregarProject();
    }//GEN-LAST:event_btnAgregarPActionPerformed

    private void btnActualizarPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarPActionPerformed
        ControladorUI.btnActualizarProject();
    }//GEN-LAST:event_btnActualizarPActionPerformed

    private void btnElimnarPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnElimnarPActionPerformed
        ControladorUI.btnEliminarProject();
    }//GEN-LAST:event_btnElimnarPActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        ControladorUI.cerrarDialog(dialogProyecto);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void tblProyectosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblProyectosMouseClicked
        ControladorUI.tblMouseClickedProject();
    }//GEN-LAST:event_tblProyectosMouseClicked

    private void btnLimpiarProyectoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarProyectoActionPerformed
        ControladorUI.limpiarCamposProyecto();
    }//GEN-LAST:event_btnLimpiarProyectoActionPerformed

    private void itemTipoCasoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemTipoCasoActionPerformed
        ControladorUI.itemAgregarTipoCaso();
    }//GEN-LAST:event_itemTipoCasoActionPerformed

    private void btnAgregarTCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarTCActionPerformed
        ControladorUI.btnAgregarTipoCaso();
    }//GEN-LAST:event_btnAgregarTCActionPerformed

    private void btnActualizarTCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarTCActionPerformed
        ControladorUI.btnActualizarTipoCaso();
    }//GEN-LAST:event_btnActualizarTCActionPerformed

    private void btnEliminarTCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarTCActionPerformed
        ControladorUI.btnEliminarTipoCaso();
    }//GEN-LAST:event_btnEliminarTCActionPerformed

    private void btnLimpiarTipoCasoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarTipoCasoActionPerformed
        ControladorUI.limpiarCamposTipoCaso();
    }//GEN-LAST:event_btnLimpiarTipoCasoActionPerformed

    private void btnCerrarTipoCasoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarTipoCasoActionPerformed
        ControladorUI.cerrarDialog(dialogTipoCaso);
    }//GEN-LAST:event_btnCerrarTipoCasoActionPerformed

    private void tblTipoCasoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblTipoCasoMouseClicked
        ControladorUI.tblMouseClickedTipoCaso();
    }//GEN-LAST:event_tblTipoCasoMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizarP;
    private javax.swing.JButton btnActualizarTC;
    private javax.swing.JButton btnActualizarU;
    private javax.swing.JButton btnAgregarP;
    private javax.swing.JButton btnAgregarTC;
    private javax.swing.JButton btnAgregarU;
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnCerrarTipoCaso;
    private javax.swing.JButton btnEliminarTC;
    private javax.swing.JButton btnEliminarU;
    private javax.swing.JButton btnElimnarP;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnLimpiarProyecto;
    private javax.swing.JButton btnLimpiarTipoCaso;
    private javax.swing.JComboBox<String> cbAdminP;
    private javax.swing.JComboBox<String> cbTipoUser;
    private javax.swing.JDialog dialogProyecto;
    private javax.swing.JDialog dialogTipoCaso;
    private javax.swing.JDialog dialogUsuario;
    private javax.swing.JFormattedTextField ftxtDPI;
    private javax.swing.JMenuItem itemDesactivarP;
    private javax.swing.JMenuItem itemProyecto;
    private javax.swing.JMenuItem itemRCaso;
    private javax.swing.JMenuItem itemRDesarrollador;
    private javax.swing.JMenuItem itemRHD;
    private javax.swing.JMenuItem itemRProyecto;
    private javax.swing.JMenuItem itemTipoCaso;
    private javax.swing.JMenuItem itemUsuario;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JMenu menuProyecto;
    private javax.swing.JMenu menuReporte;
    private javax.swing.JMenu menuTipoCaso;
    private javax.swing.JMenu menuUsuario;
    private javax.swing.JPasswordField pasword;
    private javax.swing.JTable tblProyectos;
    private javax.swing.JTable tblTipoCaso;
    private javax.swing.JTable tblUsuario;
    private javax.swing.JFormattedTextField txtCantEtapas;
    private javax.swing.JTextArea txtDescripcion;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNombreProyecto;
    private javax.swing.JTextField txtNombreTC;
    private javax.swing.JTextField txtNombreUsuario;
    // End of variables declaration//GEN-END:variables
}

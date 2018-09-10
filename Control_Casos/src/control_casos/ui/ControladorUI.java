package control_casos.ui;

import control_casos.backend.datos.ControladorUsuarios;
import control_casos.backend.usuarios.Usuario;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class ControladorUI {
    private static Login log = new Login();
    private static AdministradorProyectoUI adminUI = new AdministradorProyectoUI();
    private static AdministradorSistemaUI adminSUI = new AdministradorSistemaUI();
    private static DesarrolladorUI developerUI = new DesarrolladorUI();
    private static ControladorUsuarios controlUser = new ControladorUsuarios();

    public ControladorUI() {
        log.setLocationRelativeTo(null);
        log.setResizable(false);
        log.setVisible(true);
    }
    
    //Controla las acciones del boton iniciar en el login
    public static void btnIniciar(){
        String nombre = log.getTxtLoginName().getText();
        String pass = log.getTxtLoginPass().getText();
        String acceso = Validaciones.validarLogin(nombre, pass);
        if (acceso.equals("")) {
            ArrayList<Usuario> users = controlUser.leerUsuario();
            int tipoUser = controlUser.verificarUsuario(users, nombre, pass);
            
            switch (tipoUser) {
                case 0:
                    JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrecta", 
                        "Error login", JOptionPane.WARNING_MESSAGE);
                    break;
                    
                case 1:
                    adminSUI.setLocationRelativeTo(null);
                    adminSUI.setResizable(false);
                    adminSUI.setVisible(true);
                    break;
                
                case 2:
                    adminUI.setLocationRelativeTo(null);
                    adminUI.setResizable(false);
                    adminUI.setVisible(true);
                    break;
                    
                case 3:
                    developerUI.setLocationRelativeTo(null);
                    developerUI.setResizable(false);
                    developerUI.setVisible(true);
                    break;
            }
        }else {
            JOptionPane.showMessageDialog(null, acceso, "Error login", JOptionPane.INFORMATION_MESSAGE);
        }
        
    }
    
    public static void itemAgregarUser(){
        adminSUI.getDialogUsuario().setLocationRelativeTo(null);
        adminSUI.getDialogUsuario().setResizable(false);
        adminSUI.getDialogUsuario().setVisible(true);
        
    }
}

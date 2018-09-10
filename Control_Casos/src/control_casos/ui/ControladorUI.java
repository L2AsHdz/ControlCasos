package control_casos.ui;

import control_casos.backend.datos.ControladorUsuarios;
import control_casos.backend.usuarios.Usuario;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ControladorUI {
    private static String dpi2 = "";
    private static Login log = new Login();
    private static AdministradorProyectoUI adminUI = new AdministradorProyectoUI();
    private static AdministradorSistemaUI adminSUI = new AdministradorSistemaUI();
    private static DesarrolladorUI developerUI = new DesarrolladorUI();
    private static ControladorUsuarios controlUser = new ControladorUsuarios();
    private static Usuario usuario;
    private static ArrayList<Usuario> listUser = null;

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
                    log.setVisible(false);
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
        limpiarCamposUsuario();
        adminSUI.getDialogUsuario().setLocationRelativeTo(null);
        adminSUI.getDialogUsuario().setResizable(false);
        refrescarTablaUsuario();
        adminSUI.getDialogUsuario().setVisible(true);
    }
    
    public static void btnAgregarUser(){
        String nombre = adminSUI.getTxtNombre().getText();
        String dpi = adminSUI.getFtxtDPI().getText();
        String nombreUser = adminSUI.getTxtNombreUsuario().getText();
        String pass = adminSUI.getPasword().getText();
        int tipo = adminSUI.getCbTipoUser().getSelectedIndex()+1;
        String acceso = Validaciones.validarAgregarUsuario(dpi, nombre, nombreUser, pass, tipo);
        
        if (acceso.equals("")) {
            usuario = new Usuario(dpi, nombre, nombreUser, pass, tipo);
            if (controlUser.create(usuario)) {
                limpiarCamposUsuario();
                JOptionPane.showMessageDialog(null, "Usuario creado", "Exito!", JOptionPane.INFORMATION_MESSAGE);
            }else {
                JOptionPane.showMessageDialog(null, "DPI o nombre de usuario ya existe", "Error", JOptionPane.WARNING_MESSAGE);
            }
        }else {
            JOptionPane.showMessageDialog(null, acceso, "Error", JOptionPane.INFORMATION_MESSAGE);
        }
        refrescarTablaUsuario();
    }
    
    public static void btnActualizarUser(){
        String nombre = adminSUI.getTxtNombre().getText();
        String dpi = adminSUI.getFtxtDPI().getText();
        String nombreUser = adminSUI.getTxtNombreUsuario().getText();
        String pass = adminSUI.getPasword().getText();
        int tipo = adminSUI.getCbTipoUser().getSelectedIndex()+1;
        String acceso = Validaciones.validarAgregarUsuario(dpi, nombre, nombreUser, pass, tipo);
        if (acceso.equals("")) {
            usuario = new Usuario(dpi, nombre, nombreUser, pass, tipo);
            if (controlUser.actualizar(usuario)) {
                refrescarTablaUsuario();
                JOptionPane.showMessageDialog(null, "Se actualizo el usuario", "Exito!", JOptionPane.INFORMATION_MESSAGE);
            }else {
                JOptionPane.showMessageDialog(null, "No se actualizo registro", "Error", JOptionPane.WARNING_MESSAGE);
            }
            limpiarCamposUsuario();
        }else {
            JOptionPane.showMessageDialog(null, acceso, "Error", JOptionPane.INFORMATION_MESSAGE);
        }
    }
    
    public static void tblMouseClicked(){
        int fila = adminSUI.getTblUsuario().getSelectedRow();
        dpi2 = adminSUI.getTblUsuario().getValueAt(fila, 0).toString();
        usuario = controlUser.leerUsuarioFila(dpi2);
        adminSUI.getTxtNombre().setText(usuario.getNombre());
        adminSUI.getFtxtDPI().setText(usuario.getDpi());
        adminSUI.getTxtNombreUsuario().setText(usuario.getNombreUsuarioS());
        adminSUI.getPasword().setText(usuario.getPassword());
        adminSUI.getCbTipoUser().setSelectedIndex(usuario.getTipo()-1);
    }
    
    public static void btnEliminarUser(){
        int x = JOptionPane.showConfirmDialog(null, "ESTAS SEGURO DE ELIMINAR ESTE RESGITRO?");
        if (x == 0 && !dpi2.equals("")) {
            if (controlUser.delete(dpi2)) {
                refrescarTablaUsuario();
                JOptionPane.showMessageDialog(null, "Se elimino el registro", "Exito!", JOptionPane.INFORMATION_MESSAGE);
            }else {
                JOptionPane.showMessageDialog(null, "No se elimino registro");
            }
            limpiarCamposUsuario();
        }
        
    }
    
    private static void limpiarCamposUsuario(){
        adminSUI.getTxtNombre().setText("");
        adminSUI.getFtxtDPI().setText("");
        adminSUI.getTxtNombreUsuario().setText("");
        adminSUI.getPasword().setText("");
        adminSUI.getCbTipoUser().setSelectedIndex(-1);
    }
    
    private static void refrescarTablaUsuario(){
        DefaultTableModel model = (DefaultTableModel) adminSUI.getTblUsuario().getModel();
        model.setRowCount(0);
        
        listUser= controlUser.leerUsuario();
        for (Usuario u : listUser) {
            u.setTipoN();
            if (u.getNombreUsuarioS().isEmpty()) {
                u.setNombreUsuarioS("No Creado");
            }
            Object item[] = new Object[5];
            item[0] = u.getDpi();
            item[1] = u.getNombre();
            item[2] = u.getTipoN();
            item[3] = u.getNombreUsuarioS();
            model.addRow(item);
        }
        adminSUI.getTblUsuario().setModel(model);
    }
}

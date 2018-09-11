package control_casos.ui;

import control_casos.backend.casos.Caso;
import control_casos.backend.casos.TipoCaso;
import control_casos.backend.datos.ControladorCasos;
import control_casos.backend.datos.ControladorProyectos;
import control_casos.backend.datos.ControladorTipoCasos;
import control_casos.backend.datos.ControladorUsuarios;
import control_casos.backend.proyectos.Proyecto;
import control_casos.backend.usuarios.Usuario;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ControladorUI {
    private static String dpi2 = "";
    private static int idP = 0;
    private static int idTC = 0;
    private static int idC = 0;
    private static Login log = new Login();
    private static AdministradorProyectoUI adminUI = new AdministradorProyectoUI();
    private static AdministradorSistemaUI adminSUI = new AdministradorSistemaUI();
    private static DesarrolladorUI developerUI = new DesarrolladorUI();
    private static ControladorUsuarios controlUser = new ControladorUsuarios();
    private static Usuario usuario;
    private static ArrayList<Usuario> listUser = null;
    private static ControladorProyectos controlProject = new ControladorProyectos();
    private static Proyecto proyecto;
    private static ArrayList<Proyecto> listProject = null;
    private static ControladorTipoCasos controlCaseType = new ControladorTipoCasos();
    private static TipoCaso tipoCaso = new TipoCaso();
    private static ArrayList<TipoCaso> listCaseType = null;
    private static ControladorCasos controlCase = new ControladorCasos();
    private static Caso caso;
    private static ArrayList<Caso> listCase= null;

    public ControladorUI() {
        log.setLocationRelativeTo(null);
        log.setResizable(false);
        log.setVisible(true);
    }
    
    //////////////////////////METODOS USUARIO///////////////////////////////////
    
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
                    log.dispose();
                    abrirJFrame(adminSUI);
                    break;
                
                case 2:
                    log.dispose();
                    abrirJFrame(adminUI);
                    break;
                    
                case 3:
                    abrirJFrame(developerUI);
                    break;
            }
        }else {
            JOptionPane.showMessageDialog(null, acceso, "Error login", JOptionPane.INFORMATION_MESSAGE);
        }
        
    }
    
    public static void itemAgregarUser(){
        limpiarCamposUsuario();
        refrescarTablaUsuario();
        abrirJDialog(adminSUI.getDialogUsuario());
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
                if (usuario.getTipo() == 2) {
                    adminSUI.getCbAdminP().addItem(usuario.getDpi());
                }
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
    
    public static void tblMouseClickedUser(){
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
    
    public static void limpiarCamposUsuario(){
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
            Object item[] = new Object[4];
            item[0] = u.getDpi();
            item[1] = u.getNombre();
            item[2] = u.getTipoN();
            item[3] = u.getNombreUsuarioS();
            model.addRow(item);
        }
        adminSUI.getTblUsuario().setModel(model);
    }
    //-----------------------FIN METODOS USUARIO-------------------------------/
    
    
    /////////////////////////METODOS PROYECTO///////////////////////////////////
    
    public static void itemAgregarProyecto(){
        cargarItemsDpiAdminP();
        refrescarTablaProyecto();
        limpiarCamposProyecto();
        abrirJDialog(adminSUI.getDialogProyecto());
    }
    
    public static void btnAgregarProject(){
        DefaultTableModel model = (DefaultTableModel) adminSUI.getTblProyectos().getModel();
        int id = model.getRowCount()+1;
        int estado = 1;
        String nombre = adminSUI.getTxtNombreProyecto().getText();
        String descripcion = adminSUI.getTxtDescripcion().getText();
        int indexAdminP = adminSUI.getCbAdminP().getSelectedIndex();
        String dpiAdminP ="";
        if (indexAdminP != -1) {
            dpiAdminP = adminSUI.getCbAdminP().getSelectedItem().toString();
        }
        String acceso = Validaciones.validarAgregarProyecto(nombre, indexAdminP);
        
        if (acceso.equals("")) {
            proyecto = new Proyecto(id, nombre, descripcion, estado, dpiAdminP);
            if (controlProject.create(proyecto)) {
                adminUI.getCbIDProyecto().addItem(String.valueOf(proyecto.getId()));
                limpiarCamposProyecto();
                JOptionPane.showMessageDialog(null, "Proyecto creado", "Exito!", JOptionPane.INFORMATION_MESSAGE);
            }else {
                JOptionPane.showMessageDialog(null, "Proyecto ya existe", "Error", JOptionPane.WARNING_MESSAGE);
            }
        }else {
            JOptionPane.showMessageDialog(null, acceso, "Error", JOptionPane.INFORMATION_MESSAGE);
        }
        refrescarTablaProyecto();
    }
    
    public static void btnActualizarProject(){
        int id = idP;
        int estado = 1;
        String nombre = adminSUI.getTxtNombreProyecto().getText();
        String descripcion = adminSUI.getTxtDescripcion().getText();
        int indexAdminP = adminSUI.getCbAdminP().getSelectedIndex();
        String dpiAdminP ="";
        if (indexAdminP != -1) {
            dpiAdminP = adminSUI.getCbAdminP().getSelectedItem().toString();
        }
        String acceso = Validaciones.validarAgregarProyecto(nombre, indexAdminP);
        if (acceso.equals("")) {
            proyecto = new Proyecto(id, nombre, descripcion, estado, dpiAdminP);
            if (controlProject.actualizar(proyecto)) {
                refrescarTablaProyecto();
                JOptionPane.showMessageDialog(null, "Se actualizo el proyecto", "Exito!", JOptionPane.INFORMATION_MESSAGE);
            }else {
                JOptionPane.showMessageDialog(null, "No se actualizo registro", "Error", JOptionPane.WARNING_MESSAGE);
            }
            limpiarCamposProyecto();
        }else {
            JOptionPane.showMessageDialog(null, acceso, "Error", JOptionPane.INFORMATION_MESSAGE);
        }
    }
    
    public static void tblMouseClickedProject(){
        int fila = adminSUI.getTblProyectos().getSelectedRow();
        idP = Integer.parseInt(adminSUI.getTblProyectos().getValueAt(fila, 0).toString());
        proyecto = controlProject.leerProyectoFila(idP);
        adminSUI.getTxtNombreProyecto().setText(proyecto.getNombre());
        adminSUI.getTxtDescripcion().setText(proyecto.getDescripcion());
        adminSUI.getCbAdminP().setSelectedItem(proyecto.getDpiAdminP());
    }
    
    public static void btnEliminarProject(){
        int x = -1;
        if (idP > 0) {
            x = JOptionPane.showConfirmDialog(null, "ESTAS SEGURO DE ELIMINAR ESTE RESGITRO?");
        }
        if (x == 0 && idP > 0) {
            if (controlProject.delete(idP)) {
                refrescarTablaProyecto();
                JOptionPane.showMessageDialog(null, "Se elimino el registro", "Exito!", JOptionPane.INFORMATION_MESSAGE);
            }else {
                JOptionPane.showMessageDialog(null, "No se elimino registro");
            }
            limpiarCamposProyecto();
        }
    }
    
    public static void limpiarCamposProyecto(){
        adminSUI.getTxtNombreProyecto().setText("");
        adminSUI.getTxtDescripcion().setText("");
        adminSUI.getCbAdminP().setSelectedIndex(-1);
    }
    
    private static void cargarItemsDpiAdminP(){
        adminSUI.getCbAdminP().removeAllItems();
        listUser = controlUser.leerUsuario();
        for (Usuario u: listUser) {
            if (u.getTipo() == 2) {
                adminSUI.getCbAdminP().addItem(u.getDpi());
            }
        }
    }
    
    private static void refrescarTablaProyecto(){
        DefaultTableModel model = (DefaultTableModel) adminSUI.getTblProyectos().getModel();
        model.setRowCount(0);
        
        listProject = controlProject.leerProyecto();
        for (Proyecto p: listProject) {
            p.setEstadoN();
            Object item[] = new Object[5];
            item[0] = p.getId();
            item[1] = p.getNombre();
            item[2] = p.getEstadoN();
            item[3] = p.getDpiAdminP();
            item[4] = p.getNombreAdminP();
            model.addRow(item);
        }
        adminSUI.getTblProyectos().setModel(model);
    }
    //-----------------------FIN METODOS PROYECTO------------------------------/
    
    
    /////////////////////////METODOS TIPO CASO//////////////////////////////////
    
    public static void itemAgregarTipoCaso(){
        refrescarTablaTipoCaso();
        limpiarCamposTipoCaso();
        abrirJDialog(adminSUI.getDialogTipoCaso());
    }
    
    public static void btnAgregarTipoCaso(){
        DefaultTableModel model = (DefaultTableModel) adminSUI.getTblTipoCaso().getModel();
        int id = model.getRowCount()+1;
        String nombre = adminSUI.getTxtNombreTC().getText();
        String textoInt = adminSUI.getTxtCantEtapas().getText();
        String acceso = Validaciones.validarAgregarTipoCaso(nombre, textoInt);
        
        if (acceso.equals("")) {
            int cantidadEtapas = Integer.parseInt(textoInt);
            tipoCaso = new TipoCaso(id, nombre, cantidadEtapas);
            if (controlCaseType.create(tipoCaso)) {
                adminUI.getCbIDTipoCaso().addItem(String.valueOf(tipoCaso.getId()));
                limpiarCamposTipoCaso();
                JOptionPane.showMessageDialog(null, "Tipo de caso creado", "Exito!", JOptionPane.INFORMATION_MESSAGE);
            }else {
                JOptionPane.showMessageDialog(null, "Ocurrio un error al ingresar el registro, intente de nuevo", "Error", JOptionPane.WARNING_MESSAGE);
            }
        }else {
            JOptionPane.showMessageDialog(null, acceso, "Error", JOptionPane.INFORMATION_MESSAGE);
        }
        refrescarTablaTipoCaso();
    }
    
    public static void btnActualizarTipoCaso(){
        int id = idTC;
        String nombre = adminSUI.getTxtNombreTC().getText();
        String textoInt = adminSUI.getTxtCantEtapas().getText().trim();
        String acceso = Validaciones.validarAgregarTipoCaso(nombre, textoInt);
        
        if (acceso.equals("")) {
            int cantidadEtapas = Integer.parseInt(textoInt);
            tipoCaso = new TipoCaso(id, nombre, cantidadEtapas);
            if (controlCaseType.actualizar(tipoCaso)) {
                refrescarTablaTipoCaso();
                JOptionPane.showMessageDialog(null, "Se actualizo el tipo de caso", "Exito!", JOptionPane.INFORMATION_MESSAGE);
            }else {
                JOptionPane.showMessageDialog(null, "No se actualizo registro", "Error", JOptionPane.WARNING_MESSAGE);
            }
            limpiarCamposTipoCaso();
        }else {
            JOptionPane.showMessageDialog(null, acceso, "Error", JOptionPane.INFORMATION_MESSAGE);
        }
    }
    
    public static void tblMouseClickedTipoCaso(){
        int fila = adminSUI.getTblTipoCaso().getSelectedRow();
        idTC = Integer.parseInt(adminSUI.getTblTipoCaso().getValueAt(fila, 0).toString());
        tipoCaso = controlCaseType.leerTipoCasoFila(idTC);
        adminSUI.getTxtNombreTC().setText(tipoCaso.getNombre());
        adminSUI.getTxtCantEtapas().setText(String.valueOf(tipoCaso.getCantidadEtapas()));
    }
    
    public static void btnEliminarTipoCaso(){
        int x = -1;
        if (idTC > 0) {
            x = JOptionPane.showConfirmDialog(null, "ESTAS SEGURO DE ELIMINAR ESTE RESGITRO?");
        }
        if (x == 0 && idTC > 0) {
            if (controlCaseType.delete(idTC)) {
                refrescarTablaTipoCaso();
                JOptionPane.showMessageDialog(null, "Se elimino el registro", "Exito!", JOptionPane.INFORMATION_MESSAGE);
            }else {
                JOptionPane.showMessageDialog(null, "No se elimino registro");
            }
            limpiarCamposTipoCaso();
        }
    }
    
    public static void limpiarCamposTipoCaso(){
        adminSUI.getTxtNombreTC().setText("");
        adminSUI.getTxtCantEtapas().setText("");
    }
    
    private static void refrescarTablaTipoCaso(){
        DefaultTableModel model = (DefaultTableModel) adminSUI.getTblTipoCaso().getModel();
        model.setRowCount(0);
        
        listCaseType = controlCaseType.leerTipoCaso();
        for (TipoCaso ct: listCaseType) {
            Object item[] = new Object[3];
            item[0] = ct.getId();
            item[1] = ct.getNombre();
            item[2] = ct.getCantidadEtapas();
            model.addRow(item);
        }
        adminSUI.getTblTipoCaso().setModel(model);
    }
    //---------------------FIN METODOS TIPO CASO-------------------------------/
    
    
    /////////////////////////////METODOS CASOS//////////////////////////////////
    
    public static void itemAgregarCaso(){
        cargarItemsCaso();
        refrescarTablaCaso();
        limpiarCamposCaso();
        abrirJDialog(adminUI.getDialogCaso());
    }
    
    public static void btnAgregarCaso(){
        DefaultTableModel model = (DefaultTableModel) adminUI.getTblCaso().getModel();
        int id = model.getRowCount()+1;
        String nombre = adminUI.getTxtNombreC().getText();
        String descripcion = adminUI.getTxtDescripcion().getText();
        Date fechaInicio = adminUI.getTxtFechaInicio().getDate();
        Date fechaLimite = adminUI.getTxtFechaLimite().getDate();
        int estado = 1;
        int idProyecto = adminUI.getCbIDProyecto().getSelectedIndex()+1;
        int idTipoCaso = adminUI.getCbIDTipoCaso().getSelectedIndex()+1;
        String acceso = Validaciones.validarAgregarCaso(nombre, idProyecto, idTipoCaso, fechaInicio, fechaLimite);
        
        if (acceso.equals("")) {
            caso = new Caso(id, nombre, descripcion, fechaInicio, fechaLimite, estado, idProyecto, idTipoCaso);
            if (controlCase.create(caso)) {
                limpiarCamposCaso();
                JOptionPane.showMessageDialog(null, "Tipo de caso creado", "Exito!", JOptionPane.INFORMATION_MESSAGE);
            }else {
                JOptionPane.showMessageDialog(null, "Ocurrio un error al ingresar el registro, intente de nuevo", "Error", JOptionPane.WARNING_MESSAGE);
            }
        }else {
            JOptionPane.showMessageDialog(null, acceso, "Error", JOptionPane.INFORMATION_MESSAGE);
        }
        refrescarTablaCaso();
    }
    
    public static void btnActualizarCaso(){
        int id = idC;
        String nombre = adminUI.getTxtNombreC().getText();
        String descripcion = adminUI.getTxtDescripcion().getText();
        Date fechaInicio = adminUI.getTxtFechaInicio().getDate();
        Date fechaLimite = adminUI.getTxtFechaLimite().getDate();
        int estado = 1;
        int idProyecto = adminUI.getCbIDProyecto().getSelectedIndex()+1;
        int idTipoCaso = adminUI.getCbIDTipoCaso().getSelectedIndex()+1;
        String acceso = Validaciones.validarAgregarCaso(nombre, idProyecto, idTipoCaso, fechaInicio, fechaLimite);
        
        if (acceso.equals("")) {
            caso = new Caso(id, nombre, descripcion, fechaInicio, fechaLimite, estado, idProyecto, idTipoCaso);
            if (controlCase.actualizar(caso)) {
                refrescarTablaCaso();
                JOptionPane.showMessageDialog(null, "Se actualizo el caso", "Exito!", JOptionPane.INFORMATION_MESSAGE);
            }else {
                JOptionPane.showMessageDialog(null, "No se actualizo registro", "Error", JOptionPane.WARNING_MESSAGE);
            }
            limpiarCamposCaso();
        }else {
            JOptionPane.showMessageDialog(null, acceso, "Error", JOptionPane.INFORMATION_MESSAGE);
        }
    }
    
    public static void tblMouseClickedCase(){
        int fila = adminUI.getTblCaso().getSelectedRow();
        idC = Integer.parseInt(adminUI.getTblCaso().getValueAt(fila, 0).toString());
        System.out.println(idC);
        caso = controlCase.leerCasoFila(idC);
        adminUI.getTxtNombreC().setText(caso.getNombre());
        adminUI.getTxtFechaInicio().setDate(caso.getFechaInicio());
        adminUI.getTxtFechaLimite().setDate(caso.getFechaLimite());
        adminUI.getCbIDProyecto().setSelectedIndex(caso.getIdProyecto()-1);
        adminUI.getCbIDTipoCaso().setSelectedIndex(caso.getIdTipoCaso()-1);
        adminUI.getTxtDescripcion().setText(caso.getDescripcion());
    }
    
    public static void btnEliminarCase(){
        int x = -1;
        if (idC > 0) {
            x = JOptionPane.showConfirmDialog(null, "ESTAS SEGURO DE ELIMINAR ESTE RESGITRO?");
        }
        if (x == 0 && idC > 0) {
            if (controlCase.delete(idC)) {
                refrescarTablaCaso();
                JOptionPane.showMessageDialog(null, "Se elimino el registro", "Exito!", JOptionPane.INFORMATION_MESSAGE);
            }else {
                JOptionPane.showMessageDialog(null, "No se elimino registro");
            }
            limpiarCamposCaso();
        }
    }
    
    public static void limpiarCamposCaso(){
        adminUI.getTxtNombreC().setText("");
        adminUI.getTxtFechaInicio().setDate(null);
        adminUI.getTxtFechaLimite().setDate(null);
        adminUI.getCbIDProyecto().setSelectedIndex(-1);
        adminUI.getCbIDTipoCaso().setSelectedIndex(-1);
        adminUI.getTxtDescripcion().setText("");
    }
    
    private static void cargarItemsCaso(){
        adminUI.getCbIDProyecto().removeAllItems();
        adminUI.getCbIDTipoCaso().removeAllItems();
        listProject = controlProject.leerProyecto();
        for (Proyecto p: listProject) {
            adminUI.getCbIDProyecto().addItem(String.valueOf(p.getId()));
        }
        
        listCaseType = controlCaseType.leerTipoCaso();
        for (TipoCaso tc: listCaseType) {
            adminUI.getCbIDTipoCaso().addItem(String.valueOf(tc.getId()));
        }
    }
    
    private static void refrescarTablaCaso(){
        DefaultTableModel model = (DefaultTableModel) adminUI.getTblCaso().getModel();
        model.setRowCount(0);
        
        listCase = controlCase.leerCaso();
        for (Caso c: listCase) {
            c.setEstadoN();
            Object item[] = new Object[6];
            item[0] = c.getId();
            item[1] = c.getNombre();
            item[2] = c.getNombreProyecto();
            item[3] = c.getTipoCaso();
            item[4] = c.getEstadoN();
            item[5] = c.getFechaLimite();
            model.addRow(item);
        }
        adminUI.getTblCaso().setModel(model);
    }
    //-------------------------FIN METODOS CASOS-------------------------------/
    
    
    private static void abrirJFrame(JFrame jf){
        jf.setLocationRelativeTo(null);
        jf.setExtendedState(JFrame.MAXIMIZED_BOTH);
        jf.setResizable(false);
        jf.setVisible(true);
    }
    
    private static void abrirJDialog(JDialog jd){
        jd.setLocationRelativeTo(null);
        jd.setResizable(false);
        jd.setVisible(true);
    }
    
    public static void cerrarDialog(JDialog jd){
        jd.dispose();
    }
}

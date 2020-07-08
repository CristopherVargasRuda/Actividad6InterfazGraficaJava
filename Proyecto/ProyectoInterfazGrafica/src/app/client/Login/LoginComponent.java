package app.client.Login;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import app.client.VistaPrincipal.VistaPrincipalComponent;

public class LoginComponent implements ActionListener{
    
    private LoginTemplate loginTemplate;
    private VistaPrincipalComponent vistaPrincipal;
    
    public LoginComponent(){
        this.loginTemplate = new LoginTemplate(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        if(e.getSource()== loginTemplate.getbRegistrarse()){
            JOptionPane.showMessageDialog(null, "Boton Registro", "Advertencia", 1);
        }
        if(e.getSource()== loginTemplate.getbCerrar()){
            System.exit(0);
        }
        if(e.getSource()== loginTemplate.getbEntrar()){
            //this.mostrarDatosUsuario();
            this.entrar();
        }
    }
    
    public void mostrarDatosUsuario(){
        String check= "No";
        String nombreUsuario = loginTemplate.gettNombreUsuario().getText();
        String claveUsuario = new String(loginTemplate.gettClaveUsuario().getPassword());
        if(loginTemplate.getCheckRecuerdame().isSelected()){
            check="Si";
        }

        JOptionPane.showMessageDialog(
            null, "Nombre Usuario: "+nombreUsuario+"\n Clave Usuario: "+claveUsuario
            +"\n¿Recuerdame?: "+check, "Advertencia", 1);
    }

    public void entrar(){
        if(vistaPrincipal == null)
            this.vistaPrincipal = new VistaPrincipalComponent(this);
        else
            this.vistaPrincipal.getVistaPrincipalTemplate().setVisible(true);
        loginTemplate.setVisible(false);
    }
    
    public LoginTemplate getLoginTemplate() {
        return this.loginTemplate;
    }
    
    
   
    
}

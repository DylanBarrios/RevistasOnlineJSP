package Alien.usuarios;

import java.io.IOException;
import java.io.InputStream;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.Part;

public class usuario {
    
    private String usuario;
    private String clave;
    private String descripcion;
    private String rol;
    private InputStream perfil;
    private Part filePart=null;

    public usuario(HttpServletRequest request) throws IOException, ServletException{
        usuario = request.getParameter("usuario");
        clave = request.getParameter("clave");
        descripcion = request.getParameter("descripcion");
        rol = request.getParameter("roles");
        filePart = request.getPart("foto");
        perfil = filePart.getInputStream();
        
    }

    
    
    /**
     * @return the usuario
     */
    public String getUsuario() {
        return usuario;
    }

    /**
     * @param usuario the usuario to set
     */
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    /**
     * @return the clave
     */
    public String getClave() {
        return clave;
    }

    /**
     * @param clave the clave to set
     */
    public void setClave(String clave) {
        this.clave = clave;
    }

    /**
     * @return the descripcion
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * @param descripcion the descripcion to set
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * @return the rol
     */
    public String getRol() {
        return rol;
    }

    /**
     * @param rol the rol to set
     */
    public void setRol(String rol) {
        this.rol = rol;
    }
    
    /**
     * @param perfil the perfil to set
     */
    public void setPerfil(InputStream perfil) {
        this.perfil = perfil;
    }

    public InputStream getPerfil() {
        return perfil;
    }

    
    
    /**
     * @return the filePart
     */
    public Part getFilePart() {
        return filePart;
    }

    /**
     * @param filePart the filePart to set
     */
    public void setFilePart(Part filePart) {
        this.filePart = filePart;
    }
    
    
    
}

package Alien.usuarios;

import java.io.IOException;
import java.io.InputStream;
import java.util.Date;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.Part;

/**
 *
 * @author jara
 */
public class revista {
    private String autor;
    private String nombreRevista;
    private String descripcion;
    private String categoria;
    private String etiqueta;
    private float cuotaSuscripcion;
    private String FechaCreacion;
    private InputStream pdf;
    Part part = null;
    
    
    public revista(HttpServletRequest request) throws IOException, ServletException {
        autor = request.getParameter("autor");
        nombreRevista = request.getParameter("nombreRevista");
        descripcion = request.getParameter("descripcion");
        categoria = request.getParameter("categoria");
        etiqueta = request.getParameter("etiqueta");
        cuotaSuscripcion = Float.parseFloat(request.getParameter("cuotaSuscripcion"));
        FechaCreacion = request.getParameter("fecha");
        part = request.getPart("pdf");
        pdf= part.getInputStream();
    
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getNombreRevista() {
        return nombreRevista;
    }

    public void setNombreRevista(String nombreRevista) {
        this.nombreRevista = nombreRevista;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getEtiqueta() {
        return etiqueta;
    }

    public void setEtiqueta(String etiqueta) {
        this.etiqueta = etiqueta;
    }

    public float getCuotaSuscripcion() {
        return cuotaSuscripcion;
    }

    public void setCuotaSuscripcion(float cuotaSuscripcion) {
        this.cuotaSuscripcion = cuotaSuscripcion;
    }

    public String getFechaCreacion() {
        return FechaCreacion;
    }

    public void setFechaCreacion(String FechaCreacion) {
        this.FechaCreacion = FechaCreacion;
    }

    public InputStream getPdf() {
        return pdf;
    }

    public void setPdf(InputStream pdf) {
        this.pdf = pdf;
    }

    
}

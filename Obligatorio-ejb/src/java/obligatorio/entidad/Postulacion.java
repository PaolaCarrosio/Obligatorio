package obligatorio.entidad;

import java.util.Date;

public class Postulacion {
    
    private Integer id;
    private Anuncio anuncio;
    private Postulante postulante;
    private Date fechaPostulacion;
    private String estado;
    
    public Postulacion(){
        
    }
    
    public Postulacion(Integer id, Anuncio anuncio, Postulante postulante, Date fechaPostulacion, String estado){
        this.id = id;
        this.anuncio = anuncio;
        this.postulante = postulante;
        this.fechaPostulacion = fechaPostulacion;
        this.estado = estado;
    }

    /**
     * @return the id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return the anuncio
     */
    public Anuncio getAnuncio() {
        return anuncio;
    }

    /**
     * @param anuncio the anuncio to set
     */
    public void setAnuncio(Anuncio anuncio) {
        this.anuncio = anuncio;
    }

    /**
     * @return the postulante
     */
    public Postulante getPostulante() {
        return postulante;
    }

    /**
     * @param postulante the postulante to set
     */
    public void setPostulante(Postulante postulante) {
        this.postulante = postulante;
    }

    /**
     * @return the fechaPostulacion
     */
    public Date getFechaPostulacion() {
        return fechaPostulacion;
    }

    /**
     * @param fechaPostulacion the fechaPostulacion to set
     */
    public void setFechaPostulacion(Date fechaPostulacion) {
        this.fechaPostulacion = fechaPostulacion;
    }

    /**
     * @return the estado
     */
    public String getEstado() {
        return estado;
    }

    /**
     * @param estado the estado to set
     */
    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    
}

package obligatorio.entidad;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;

@Entity
public class Empresa extends Usuario{
    
    private String razonSocial;
    private String rut;
    private List<Anuncio> anuncios;

    public Empresa(Integer id, String usuario, String clave, String nombre, String direccion, String telefono, String mail, String razonSocial, String rut) {
        super(id, usuario, clave, nombre, direccion, telefono, mail);
        this.razonSocial = razonSocial;
        this.rut = rut;
        this.anuncios = new ArrayList<>();
    }
    
    public Empresa() {
        this.anuncios = new ArrayList<>();
    }
    
    /**
     * @return the razonSocial
     */
    public String getRazonSocial() {
        return razonSocial;
    }

    /**
     * @param razonSocial the razonSocial to set
     */
    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    /**
     * @return the rut
     */
    public String getRut() {
        return rut;
    }

    /**
     * @param rut the rut to set
     */
    public void setRut(String rut) {
        this.rut = rut;
    }

    /**
     * @return the anuncios
     */
    public List<Anuncio> getAnuncios() {
        return anuncios;
    }

    /**
     * @param anuncios the anuncios to set
     */
    public void setAnuncios(List<Anuncio> anuncios) {
        this.anuncios = anuncios;
    }
    
    public void addToAnuncio(Anuncio anuncio){
        this.anuncios.add(anuncio);
    }
    
}

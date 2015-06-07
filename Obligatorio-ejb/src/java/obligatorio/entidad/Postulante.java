package obligatorio.entidad;

import javax.persistence.Entity;

@Entity
public class Postulante extends Usuario{
    
    private Integer edad;
    private char sexo;
    private char estadoCivil;
    
    public Postulante(){
        
    }
    
    public Postulante(Integer id, String usuario, String clave, String nombre, String direccion, String telefono, String mail, Integer edad, char sexo, char estadoCivil){
        super(id, usuario, clave, nombre, direccion, telefono, mail);
        this.edad = edad;
        this.sexo = sexo;
        this.estadoCivil = estadoCivil;
    }

    /**
     * @return the edad
     */
    public Integer getEdad() {
        return edad;
    }

    /**
     * @param edad the edad to set
     */
    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    /**
     * @return the sexo
     */
    public char getSexo() {
        return sexo;
    }

    /**
     * @param sexo the sexo to set
     */
    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    /**
     * @return the estadoCivil
     */
    public char getEstadoCivil() {
        return estadoCivil;
    }

    /**
     * @param estadoCivil the estadoCivil to set
     */
    public void setEstadoCivil(char estadoCivil) {
        this.estadoCivil = estadoCivil;
    }
    
}


/**
 * Write a description of class Trabajador here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Trabajador extends Persona
{
   
   private double salario;
   private RegimenPensional regimenPensional;

    public Trabajador() {
    }
    
    public Trabajador(String nombre, String identificacion, String tipoTrabajador, double salario) {
        super(nombre, identificacion, tipoTrabajador);
        this.salario = salario;
    }

    public void afiliar(RegimenPensional regimenPensional) {
        this.regimenPensional = regimenPensional;
    }

    public double calcularAporteMensual() {
        return salario * 0.16;
    }
    
    public double simularPension(int tiempoCotizacion) throws Exception {
        if (regimenPensional != null) {
            return regimenPensional.calcularPension(salario, tiempoCotizacion);
        } else {
            throw new Exception("Trabajador no está afiliado a ningún régimen pensional");
        }
    }

    
    

//Start GetterSetterExtension Source Code

    /**GET Method Propertie salario*/
    public double getSalario(){
        return this.salario;
    }//end method getSalario

    /**SET Method Propertie salario*/
    public void setSalario(double salario){
        this.salario = salario;
    }//end method setSalario

    /**GET Method Propertie regimenPensional*/
    public RegimenPensional getRegimenPensional(){
        return this.regimenPensional;
    }//end method getRegimenPensional

    /**SET Method Propertie regimenPensional*/
    public void setRegimenPensional(RegimenPensional regimenPensional){
        this.regimenPensional = regimenPensional;
    }//end method setRegimenPensional

//End GetterSetterExtension Source Code


}//End class
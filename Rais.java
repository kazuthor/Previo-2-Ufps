
/**
 * Write a description of class Rais here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Rais extends RegimenPensional
{
    private double saldoAcumulado;
    private int expectativaVida;

    public Rais() {
    }
    
    public Rais(double saldoAcumulado, int expectativaVida) {
        this.saldoAcumulado = saldoAcumulado;
        this.expectativaVida = expectativaVida;
    }

    @Override
    public double calcularPension(double salario, int tiempoCotizacion) {
        return saldoAcumulado / expectativaVida;
    }

    
    

//Start GetterSetterExtension Source Code

    /**GET Method Propertie saldoAcumulado*/
    public double getSaldoAcumulado(){
        return this.saldoAcumulado;
    }//end method getSaldoAcumulado

    /**SET Method Propertie saldoAcumulado*/
    public void setSaldoAcumulado(double saldoAcumulado){
        this.saldoAcumulado = saldoAcumulado;
    }//end method setSaldoAcumulado

    /**GET Method Propertie expectativaVida*/
    public int getExpectativaVida(){
        return this.expectativaVida;
    }//end method getExpectativaVida

    /**SET Method Propertie expectativaVida*/
    public void setExpectativaVida(int expectativaVida){
        this.expectativaVida = expectativaVida;
    }//end method setExpectativaVida

//End GetterSetterExtension Source Code


}//End class
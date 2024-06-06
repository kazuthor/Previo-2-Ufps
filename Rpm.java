
/**
 * Write a description of class Rpm here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Rpm extends RegimenPensional
{
    
    public Rpm() {
    }
    
    @Override
    public double calcularPension(double salario, int tiempoCotizacion) {
        
        double IBL = salario;
        
        double P;
        if (tiempoCotizacion < 1300) {
            P = 0.65;
        } else {
            int semanasAdicionales = tiempoCotizacion - 1300;
            P = 0.65 + (semanasAdicionales / 50) * 0.015;
            P = Math.min(P, 0.8);  
        }

        
        return IBL * P;
    }
}

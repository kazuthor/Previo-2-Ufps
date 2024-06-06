import java.util.ArrayList;
import java.util.*;

/**
 * Write a description of class SistemaPensional here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SistemaPensional
{
    private ArrayList<Trabajador> trabajadores;

    public SistemaPensional() {
        trabajadores = new ArrayList<>();
    }

    public void afiliarTrabajador(Trabajador trabajador, RegimenPensional regimenPensional) {
        trabajador.afiliar(regimenPensional);
        trabajadores.add(trabajador);
    }

    public double calcularAporteMensual(Trabajador trabajador) {
        return trabajador.calcularAporteMensual();
    }

    public double simularPension(Trabajador trabajador, int tiempoCotizacion) throws Exception {
        return trabajador.simularPension(tiempoCotizacion);
    }

    public static void main(String[] args) {
        SistemaPensional sistema = new SistemaPensional();

        
        Trabajador trabajador1 = new Trabajador("Juan David Leal Suarez", "1098070633", "dependiente", 3000000);
        RegimenPensional regimenRpm = new Rpm();
        sistema.afiliarTrabajador(trabajador1, regimenRpm);

        Trabajador trabajador2 = new Trabajador("Maria Nikol Estupiñan Gomez", "11098070634", "independiente", 4000000);
        RegimenPensional regimenRais = new Rais(50000000, 20);
        sistema.afiliarTrabajador(trabajador2, regimenRais);
        
        System.out.println("Sistema Pensional en Colombia");
        
        System.out.println("************************************** ");
        System.out.println("Aporte mensual trabajador 1: " + sistema.calcularAporteMensual(trabajador1));
        System.out.println("Aporte mensual trabajador 2: " + sistema.calcularAporteMensual(trabajador2));

        System.out.println("************************************** ");
        try {
            System.out.println("Pensión futura trabajador 1: " + sistema.simularPension(trabajador1, 1400));
            System.out.println("Pensión futura trabajador 2: " + sistema.simularPension(trabajador2, 1400));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}





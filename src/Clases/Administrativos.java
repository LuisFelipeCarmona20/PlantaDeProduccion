package Clases;
import java.util.Scanner;

public class Administrativos extends PlantaProduccion {

    private String titulosLaborales;
    private int añosExperiencia;
    private int personasAcargo;
    private int numeroExtencion;

    public void informesPlanta(){
        System.out.println("Estamos en informes de la planta");
    }
    public void consultarTitulos(){
        System.out.println("Estamos en consultar los titulos");
    }
    public void modificarTitulos(){
        System.out.println("Estamos en modificar los titulos");
    }
}

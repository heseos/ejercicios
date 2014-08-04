// Clase que prueba la clase Empleado
import java.util.Scanner;

public class PruebaEmpleado
{
	// Objeto para leer entradas desde el teclado
	private static Scanner entrada;
	private static double porcentaje1;
	private static double porcentaje2;
	
	// Metodo que inicializa las aplicaciones en java
	public static void main( String args[] )
	{
		entrada = new Scanner ( System.in ); // inicializando el objeto para leer datos del teclado
		
		// Variable a utilizar para leer la entrada
		double porciento; 
		
		// Declaracion de objetos
		Empleado empleado1 = new Empleado( "Randolf", "Cuello", 15000 ); // Objeto empleado1
		Empleado empleado2 = new Empleado( "Leidy", "Maldonado", 25000 ); // objeto empleado2
		
		System.out.println(" ********Programa que muestra infomacion de los empleado********\n\n ");
		// Mostrar informacion de los empleado
		System.out.printf("El sueldo anual de %s %s es: %.2f$RD\n",
			empleado1.obtenerNombre(), empleado1.obtenerApellido(),
			empleado1.obtenerSalario() * 12 );
		
		System.out.printf("El sueldo anual de %s %s es: %.2f$RD\n\n",
			empleado2.obtenerNombre(), empleado2.obtenerApellido(),
			empleado2.obtenerSalario() * 12 );
		
		// leer el % a aumentar
		System.out.printf("Ingrese el porcentaje a aumentar para el empleado %s %s: ",
				empleado1.obtenerNombre(), empleado1.obtenerApellido() );
		porciento = entrada.nextDouble();
		System.out.printf("Ingrese el porcentaje a aumentar para el empleado %s %s: ",
				empleado2.obtenerNombre(), empleado2.obtenerApellido() );
		porciento = entrada.nextDouble();
		
		// Sacarle el porcentaje a salario empleado1
		if ( porciento > 0.0 )
		{
			porcentaje1 = ( empleado1.obtenerSalario() * 12 * porciento ) / 100;
		
		} // fin del if para empleado2
		
		// Sacarle el porcentaje al salario de empleado2
		if ( porciento > 0.0 )
			 {
			porcentaje2 = ( empleado2.obtenerSalario() * 12 * porciento ) / 100;
			
			 } // fin del if para empleado2
		
		
		// Mostrar mensaje con un aumento de %
		
		// Multiplicar el salario por 12 y sumarle el porcentaje1
		System.out.println("\n\n \"Informacion actualizada con un aumento de porcentaje\"\n\n ");
		System.out.printf("El sueldo anual de %s %s es: %.2f$RD\n",
				empleado1.obtenerNombre(), empleado1.obtenerApellido(),
				( empleado1.obtenerSalario() * 12 ) + porcentaje1 );
		
		// multiplicar el salario por 12 y sumarle porcentaje2
		System.out.printf("El sueldo anual de %s %s es: %.2f$RD\n\n",
				empleado2.obtenerNombre(), empleado2.obtenerApellido(),
				( empleado2.obtenerSalario() * 12 ) + porcentaje2 );

	}  // Fin del metodo main

} // Fin de la clase PruebaEmpleado
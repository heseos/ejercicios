// Clase que contiene metodos para un empleado.

public class Empleado
{
	// Variables de instancia
	private String nombre;
	private String apellido;
	private double salario;

	// Constructor
	public Empleado( String nomb, String apell, double sala )
	{
		nombre = nomb;
		apellido = apell;

		// si el valor de sueldo es negativo sueldo sera igual a cero
		if ( sala > 0.0 )
			salario = sala;  
		
		if ( sala <= 0.0 )
			sala = 0.0;

	}  // Fin del constructor

	// Metodo que establece el nombre
	public void establecerNombre( String valorNombre )
	{
		nombre = valorNombre;
	} // Fin del metodo establecer nombre

	// Metodo para obtener el nombre
	public String obtenerNombre()
	{
		return nombre;
	} // Fin del metodo obtener nombre

	// Metodo para establecer el apellido
	public void establecerApellido( String valorApellido )
	{
		apellido = valorApellido;
	} // Fin del metodo establecer apellido

	// Metodo para obtener apellido
	public String obtenerApellido()
	{
		return apellido;
	}  // Fin del metodo para obtener apellido

	// metodo para establecer salario
	public void establecerSalario( double valorSalario )
	{
		if ( valorSalario > 0.0 )
			salario  = valorSalario;
		
		if (valorSalario <= 0.0)
			valorSalario = 0.0;		
	}  // Fin del metodo para establecer salario
	
	// metodo para obtener el salario
	public double obtenerSalario()
	{
		return salario;
	} // fin del metodo para obtener salario

}  // fin de la clase Empleado

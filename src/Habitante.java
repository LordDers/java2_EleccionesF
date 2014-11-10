public class Habitante
{
	// Propiedades / Atributos
	private String v_dni;
	private String v_nombre;
	private String v_apellido;
	private int v_edad;
	private String v_nacionalidad;
	private String v_fecha_nacimiento;
	private String v_sexo;
	private int v_telefono;

	// Metodo / Constructor
	/*public Habitante (String dni, String nombre, String apellido, int edad, String nacionalidad, String f_nacimiento, String sexo, int telefono)
	{
		this.v_dni = dni;
		this.v_nombre = nombre;
		this.v_apellido = apellido;
		this.v_edad = edad;
		this.v_nacionalidad = nacionalidad;
		this.v_fecha_nacimiento = f_nacimiento;
		this.v_sexo = sexo;
		this.v_telefono = telefono;
	}*/

	public void setDni(String dni)
	{
		this.v_dni = dni;
	}

	public String getDni()
	{
		return v_dni;
	}

	public void setNombre(String nombre)
	{
		this.v_nombre = nombre;
	}

	public String getNombre()
	{
		return v_nombre;
	}

	public void setApellido(String apellido)
	{
		this.v_apellido = apellido;
	}

	public String getApellido()
	{
		return v_apellido;
	}

	public void setEdad(int edad)
	{
		this.v_edad = edad;
	}

	public int getEdad()
	{
		return v_edad;
	}

	public void setNacionalidad(String nacionalidad)
	{
		this.v_nacionalidad = nacionalidad;
	}

	public String getNacionalidad()
	{
		return v_nacionalidad;
	}

	public void setNacimiento(String f_nacimiento)
	{
		this.v_fecha_nacimiento = f_nacimiento;
	}

	public String getNacimiento()
	{
		return v_fecha_nacimiento;
	}

	public void setSexo(String sexo)
	{
		this.v_sexo = sexo;
	}

	public String getSexo()
	{
		return v_sexo;
	}

	public void setTelefono(int telefono)
	{
		this.v_telefono = telefono;
	}

	public int getTelefono()
	{
		return v_telefono;
	}
}

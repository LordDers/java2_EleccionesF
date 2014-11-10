public class Ayuntamiento
{
	private String v_nombre;
	private String v_alcalde;
	private int v_numero;
	private String v_localidad;
	private String v_direccion;

	/*public Ayuntamiento (String nombre, String alcalde, int numero, String localidad, String direccion)
	{
		this.v_nombre = nombre;
		this.v_alcalde = alcalde;
		this.v_numero = numero;
		this.v_localidad = localidad;
		this.v_direccion = direccion;
	}*/

	public void setNombre (String nombre)
	{
		//nombre = "aa";
		this.v_nombre = nombre;
	}

	public String getNombre ()
	{
		return v_nombre;
	}

	public void setAlcalde (String alcalde)
	{
		this.v_alcalde = alcalde;
	}

	public String getAlcalde ()
	{
		return v_alcalde;
	}

	public void setNumero (int numero)
	{
		this.v_numero = numero;
	}

	public int getNumero ()
	{
		return v_numero;
	}

	public void setLocalidad (String localidad)
	{
		this.v_localidad = localidad;
	}

	public String getLocalidad ()
	{
		return v_localidad;
	}

	public void setDireccion (String direccion)
	{
		this.v_direccion = direccion;
	}

	public String getDireccion ()
	{
		return v_direccion;
	}
}

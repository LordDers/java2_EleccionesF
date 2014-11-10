public class EspacioPublico
{
	private String v_nombre;
	private String v_direccion;
	private String v_tipo;

	/*public class EspacioPublico (String nombre, String direccion, String tipo)
	{
		this.v_nombre = nombre;
		this.v_direccion = direccion;
		this.v_tipo = tipo;
	}*/

	public void setNombre (String nombre)
	{
		this.v_nombre = nombre;
	}

	public String getNombre ()
	{
		return v_nombre;
	}

	public void setDireccion (String direccion)
	{
		this.v_direccion = direccion;
	}

	public String getDireccion ()
	{
		return v_direccion;
	}

	public void setTipo (String tipo)
	{
		this.v_tipo = tipo;
	}

	public String getTipo ()
	{
		return v_tipo;
	}
}

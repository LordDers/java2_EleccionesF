public class Inmueble
{
	private String v_localidad;
	private String v_direccion;
	private String v_tipo; // finca, piso, oficina...
	private String v_fecha_construccion;
	private String v_fecha_compra;

	/*public Inmueble (String localidad, String direccion, String tipo, String f_construccion, String f_compra)
	{
		this.v_localidad = localidad;
		this.v_direccion = direccion;
		this.v_tipo = tipo;
		this.v_fecha_construccion = f_construccion;
		this.v_fecha_compra = f_compra;
	}*/

	public void setLocalidad(String localidad)
	{
		this.v_localidad = localidad;
	}

	public String getLocalidad()
	{
		return v_localidad;
	}

	public void setDireccion(String direccion)
	{
		this.v_direccion = direccion;
	}

	public String getDireccion()
	{
		return v_direccion;
	}

	public void setTipo(String tipo)
	{
		this.v_tipo = tipo;
	}

	public String getTipo()
	{
		return v_tipo;
	}

	public void setConstruccion(String f_construccion)
	{
		this.v_fecha_construccion = f_construccion;
	}

	public String getConstruccion()
	{
		return v_fecha_construccion;
	}

	public void setCompra(String f_compra)
	{
		this.v_fecha_compra = f_compra;
	}

	public String getCompra()
	{
		return v_fecha_compra;
	}
}

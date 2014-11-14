public class Partido
{
	private String v_nombre;
	private String v_presidente;
	private int v_numero; // numero de afiliados
	private String v_tipo; // izq der
	private int v_votos;
	private boolean v_gobierno; // Si - No

	/*public Partido (String nombre, String presidente, int numero, String tipo, int votos, boolean gobierno)
	{
		this.v_nombre = nombre;
		this.v_presidente = presidente;
		this.v_numero = numero;
		this.v_tipo = tipo;
		this.v_votos = votos;
		this.v_gobierno = gobierno;
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

	public void setPresidente (String presidente)
	{
		this.v_presidente = presidente;
	}

	public String getPresidente ()
	{
		return v_presidente;
	}

	public void setNumero (int numero)
	{
		this.v_numero = numero;
	}

	public int getNumero ()
	{
		return v_numero;
	}

	public void setTipo (String tipo)
	{
		this.v_tipo = tipo;
	}

	public String getTipo ()
	{
		return v_tipo;
	}

	public void setVotos (int votos)
	{
		this.v_votos = votos;
	}

	public int getVotos ()
	{
		return v_votos;
	}

	public void setGobierno(boolean gobierno)
	{
		this.v_gobierno = gobierno;
	}

	public boolean getGobierno()
	{
		return v_gobierno;
	}
}

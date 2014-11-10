//import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.FileReader;
//import java.io.FileWriter;

import java.util.ArrayList;

import java.util.Scanner;

public class Elecciones
{
	public static void main (String args[]) 
	{
		// Variables Habitante
		String hdni = "72514751R";
		String hnombre = "Ruben";
		String hapellido = "Alvarez";
		int hedad = 21;
		String hnacionalidad = "Espanyola";
		String hfecha_nacimiento = "06062006";
		String hsexo = "H";
		int htelefono = 943742620;
		String habi_dni, habi_nombre, habi_ape, habi_nacionalidad, habi_fnaci, habi_sexo;
		int habi_edad, habi_tlf;

		Habitante operhabitante = new Habitante();

		// Enviar valores a Habitante.java
		operhabitante.setDni(hdni);
		operhabitante.setNombre(hnombre);
		operhabitante.setApellido(hapellido);
		operhabitante.setEdad(hedad);
		operhabitante.setNacionalidad(hnacionalidad);
		operhabitante.setNacimiento(hfecha_nacimiento);
		operhabitante.setSexo(hsexo);
		operhabitante.setTelefono(htelefono);

		// Recoger valores de Habitante.java
		habi_dni = operhabitante.getDni();
		habi_nombre = operhabitante.getNombre();
		habi_ape = operhabitante.getApellido();
		habi_edad = operhabitante.getEdad();
		habi_nacionalidad = operhabitante.getNacionalidad();
		habi_fnaci = operhabitante.getNacimiento();
		habi_sexo = operhabitante.getSexo();
		habi_tlf = operhabitante.getTelefono();

		// Datos del habitante
		System.out.println(" Datos del Habitante");
		System.out.println("DNI: " + habi_dni);
		System.out.println("Nombre: " + habi_nombre + " " + habi_ape);
		System.out.println("Fecha de Nacimiento: " + habi_fnaci);
		System.out.println("Edad: " + habi_edad);
		System.out.println("Nacionalidad: " + habi_nacionalidad);
		System.out.println("Sexo: " + habi_sexo);
		System.out.println("Telefono: " + habi_tlf);

		//		------------------------

		// Variables Inmueble
		String ilocalidad = "Guipuzcoa";
		String idireccion = "An";
		String itipo = "Piso";
		String ifecha_construccion = "10111990";
		String ifecha_compra = "16061996";
		String in_loca, in_dir, in_tipo, in_fcon, in_fcom;

		Inmueble operinmueble = new Inmueble();

		// Enviar valores a Inmueble.java
		operinmueble.setLocalidad(ilocalidad);
		operinmueble.setDireccion(idireccion);
		operinmueble.setTipo(itipo);
		operinmueble.setConstruccion(ifecha_construccion);
		operinmueble.setCompra(ifecha_compra);

		// Recoger valores de Inmueble.java
		in_loca = operinmueble.getLocalidad();
		in_dir = operinmueble.getDireccion();
		in_tipo = operinmueble.getTipo();
		in_fcon = operinmueble.getConstruccion();
		in_fcom = operinmueble.getCompra();

		// Datos del Inmueble
		System.out.println("\n\n Datos del Inmueble");
		System.out.println("Localidad: " + in_loca);
		System.out.println("Direccion: " + in_dir);
		System.out.println("Tipo: " + in_tipo);
		System.out.println("Fecha de Construccion: " + in_fcon);
		System.out.println("Fecha de compra: " + in_fcom);

		//		------------------------

		// Variables EspacioPublico
		/*String epnombre;
		String epdireccion;
		String eptipo;*/
		String[] espub = new String[3];

		EspacioPublico ep = new EspacioPublico();

		// Enviar valores a EspacioPublico.java
		ep.setNombre("Sinde");
		ep.setDireccion("aaa");
		ep.setTipo("Parque");

		// Recoger valores de EspacioPublico.java
		espub[0] = ep.getNombre();
		espub[1] = ep.getDireccion();
		espub[2] = ep.getTipo();

		// Datos del Espacio Publico
		System.out.println("\n\n Datos del Espacio Publico");
		System.out.println("Nombre: " + espub[0]);
		System.out.println("Direccion: " + espub[1]);
		System.out.println("Tipo: " + espub[2]);

		//		------------------------

		// Variables Ayuntamiento
		String anombre = "Fujn"/*, aalcalde, alocalidad, adireccion*/;
		//int anumero;
		String ayu_nombre, ayu_alcalde, ayu_localidad, ayu_direccion;
		int ayu_numero;

		Scanner sc = new Scanner(System.in);
		Ayuntamiento ayu = new Ayuntamiento();

		// Enviar valores a Ayuntamiento.java
		ayu.setNombre(anombre);
		ayu.setAlcalde("Matias");
		ayu.setLocalidad("Guipuzcoa");
		ayu.setDireccion("asd");
		ayu.setNumero(6);

		//Recoger valores de Ayuntamiento.java
		ayu_alcalde = ayu.getAlcalde();
		ayu_localidad = ayu.getLocalidad();
		ayu_direccion = ayu.getDireccion();
		ayu_numero = ayu.getNumero();

		// Datos del Ayuntamiento
		System.out.println("\n\n Datos del Ayuntamiento");

		//System.out.println("Nombre definido en el programa: " + anombre); // Nombre asignado en Elecciones.java
		/*System.out.print("Nombre introducido: ");
		anombre = sc.next(); // Nombre introducido por teclado*/
		ayu_nombre = ayu.getNombre(); // Recoger valor de Nombre de Ayuntamiento.java
		System.out.println("Nombre definido en la clase: " + ayu_nombre); // Nombre asignado en Ayuntamiento.java

		System.out.println("Alcalde: " + ayu_alcalde);
		System.out.println("Localidad: " + ayu_localidad);
		System.out.println("Direccion: " + ayu_direccion);
		System.out.println("Numero de personal: " + ayu_numero);

		//		------------------------

		// Variables Partido
		String pnombre = "Voiwa";
		//String ppresidente;
		int pnumero = 26;
		//String ptipo;
		int pvotos = 66;
		boolean pgobierno;
		String par_nombre, par_presidente, par_tipo;
		int par_numero, par_votos;
		boolean par_gobierno;

		Partido p = new Partido();

		// Enviar valores a Partido.java
		p.setNombre(pnombre);
		p.setPresidente("Lian");
		p.setNumero(pnumero);
		p.setTipo("C");
		p.setVotos(pvotos);
		p.setGobierno(true);

		// Recoger valores de Partido.java
		par_nombre = p.getNombre();
		par_presidente = p.getPresidente();
		par_numero = p.getNumero();
		par_tipo = p.getTipo();
		par_votos = p.getVotos();
		par_gobierno = p.getGobierno();

		// Datos del Partido
		System.out.println("\n\n Datos del Partido");
		System.out.println("Nombre: " + par_nombre);
		System.out.println("Presidente: " + par_presidente);
		System.out.println("Numero miembros: " + par_numero);
		System.out.println("Tipo: " + par_tipo);
		System.out.println("Votos: " + par_votos);
		if (par_gobierno == true)
		{
			System.out.println("Gobierna");
			String s = "Gobierna";
		}
		else
		{
			System.out.println("NO Gobierna");
			String n = "No Gobierna";
		}

		System.out.println("\n\n Partidos");

		// Leyendo el archivo listadosPartidos.txt
		try
		{
			BufferedReader br = new BufferedReader(new FileReader("listadosPartidos.txt"));

			ArrayList <String> partidos = new ArrayList <String> ();

			String linea = br.readLine();
			while(linea != null)
			{
				//System.out.println(linea);
				partidos.add(linea);
				linea = br.readLine();
			}

			for(int i=0; i<partidos.size(); i++)
			{
				System.out.println(partidos.get(i));
			}

			// Vaciar el ArrayList
			partidos.clear();
			// Comprobamos que se haya vaciado
			System.out.println("\nVaciado correctamente. (" + partidos.size() + ")");
			
		}catch(IOException e)
		{
			System.out.println("Error E/S: "+e);
		}
	}
}

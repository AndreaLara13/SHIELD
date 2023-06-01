/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SHIELD;

import java.sql.ResultSet;
import java.sql.SQLException;

public class main 
{
	public static void main (String []args)
	{
		DataBase conexion =  new DataBase();
		ResultSet result;
		String id;
		String no_serie; 
                String tipo; 
                String interventores; 
                String nombre; 
                String zona; 
                String num_bajas; 
                String heridos; 
                String codigo; 
                String nombre_grupo; 
                String integrantes; 
                String rfc; 
                String ceo; 
                String tipo_armamento;
                		
		// = conexion.getQuery("select * from shield");
                result = conexion.getQuery("select * from grupo_superheroes");
		try
		{
			while(result.next())
			{
                            nombre_grupo = result.getString("nombre_grupo");
                            integrantes = result.getString("integrantes");
                            System.out.println(nombre_grupo + ": " + integrantes);
                            
                            for( String integrante : integrantes.split(",") ) {
                                System.out.println(integrante);
                            }
                            /*
				id = result.getString("Id");
				no_serie = result.getString("no_serie");
				tipo = result.getString("tipo");
				interventores = result.getString("interventores");
                                nombre = result.getString("nombre");
                                zona = result.getString("zona");
                                num_bajas = result.getString("num_bajas");
                                heridos = result.getString("heridos");
                                codigo = result.getString("codigo");
                                nombre_grupo = result.getString("nombre_grupo");
                                integrante = result.getString("integrante");
                                rfc = result.getString("rfc");
                                ceo = result.getString("ceo");
                                tipo_armamento = result.getString("tipo_armamento");
                                
				
				System.out.println (id);
				System.out.println(no_serie);
                                System.out.println(tipo);
                                System.out.println(interventores);
                                System.out.println(nombre);
                                System.out.println(zona);
                                System.out.println(num_bajas);
                                System.out.println(heridos);
                                System.out.println(codigo);
                                System.out.println(nombre_grupo);
                                System.out.println(integrante);
                                System.out.println(rfc);
                                System.out.println(ceo);
                                System.out.println(tipo_armamento);
				*/
			}
		}
		catch (SQLException e)
		{
			e.printStackTrace();
		}
		
	}
}
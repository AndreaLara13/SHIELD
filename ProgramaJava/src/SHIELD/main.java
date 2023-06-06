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
                String bajas; 
                String heridos; 
                String codigo; 
                String nombre_grupo; 
                String integrantes; 
                String rfc; 
                String ceo; 
                String tipo_armamento;
                String fk_ataquemutante;
                String fk_ataqueeconom;
                String fk_ataqueextr;
                String fk_ataqueinvasion;
                		
		
                result = conexion.getQuery("select * from ataque");
                
                
		try
		{
			while(result.next())
			{
                            nombre = result.getString("nombre");
                            zona = result.getString("zona");
                            bajas = result.getString("bajas");
                            heridos = result.getString("heridos");
                            fk_ataquemutante = result.getString("fk_ataquemutante");
                            fk_ataqueeconom = result.getString("fk_ataqueeconom");
                            fk_ataqueextr = result.getString("fk_ataqueextr");
                            fk_ataqueinvasion = result.getString("fk_ataqueinvasion");
                            System.out.println(nombre + ": ");
                            System.out.println("zona: " + zona + ": ");
                            System.out.println("bajas: " + bajas + ": ");
                            System.out.println("heridos: " + heridos + ": " );
                            System.out.println("id de ataque mutante: " + fk_ataquemutante + ": " );
                            System.out.println("id de ataque economico: " + fk_ataqueeconom + ": " );
                            System.out.println("id de ataque extraterrestre: " + fk_ataqueextr + ": " );
                            System.out.println("id de ataque invasion: " + fk_ataqueinvasion + ": " );
                           
			}
		}
		catch (SQLException e)
		{
			e.printStackTrace();
		}
		
	}
}

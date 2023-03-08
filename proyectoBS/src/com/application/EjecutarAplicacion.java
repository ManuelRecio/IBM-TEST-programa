package com.application;

import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.conection.Conexion;
import com.utils.Utilidades;

public class EjecutarAplicacion {

	public static void main(String[] args) {
		
		if(null!=args && args.length!=0 && Utilidades.esNumero(args[0])){
			int id = Integer.parseInt(args[0]);
			Conexion conexion = new Conexion();
			Connection cn = null;
			PreparedStatement pst = null;
			ResultSet rs = null;
			boolean vacio = true;
			
			try {
				FileWriter fichero = new FileWriter("C:\\JavaArchivos\\fichero-proyecto.txt");
				fichero.write("ID_PROVEEDOR - NOMBRE - FECHA_DE_ALTA - ID_CLIENTE\n");
				cn = conexion.conectar();
				pst = cn.prepareStatement("SELECT * FROM proveedores WHERE id_cliente=?");
				pst.setInt(1, id);
				rs = pst.executeQuery();
				
				while(rs.next()) {
					vacio = false;
					int idProveedor = rs.getInt(1);
					String nombre = rs.getString(2);
					Date fechaAlta = rs.getDate(3);
					int idCliente = rs.getInt(4);
					fichero.write("    "+idProveedor + "  -  "+nombre+"  -   "+fechaAlta+"  -   "+idCliente+"\n");
				}
				fichero.close();
				
				if(vacio) {
					System.out.println("El cliente no tiene proovedores asignados");
				}else {
					System.out.println("Se genera el archivo en C:/JavaArchivos/fichero-proyecto.txt");
				}
				
				
			} catch (SQLException e) {
				e.printStackTrace();
			} catch (IOException e) {
				System.out.println("Error al crear fichero en el directorio C:/");
				e.printStackTrace();
			} finally {
				
					try {
						if(null!=rs) {
							rs.close();
						}
						if(null!=pst) {
							pst.close();
						}
						if(null!=cn) {
							cn.close();
						}
					} catch (SQLException e) {
						e.printStackTrace();
					}
				
			}
			
		}else {
			System.out.println("El valor introducido no es un id correcto");
		}
	}

}

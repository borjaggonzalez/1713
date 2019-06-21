package com.ipartek.formacion.modelo;

import java.util.List;

import com.ipartek.formacion.Alumno;

/**
 * Operaciones basicas de CRUD para pojos
 * 
 * @author Curso
 *
 */
public interface ICrudAble<P> {

	List<P> getAll();

	P getById(int id);

	boolean insert(P pojo); //Le pasamos el objeto porque ya tiene los datos necesarios.
	
	boolean delete (int id);
	
	boolean update(P pojo);//Le pasamos el objeto porque ya incluye un id.

}

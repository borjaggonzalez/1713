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
	/**
	 * listado de P.
	 * @return Lista<P>, si no hay datos lista inicializada
	 */
	List<P> getAll();

	/**
	 * Recupera P por su identificador.
	 * @param id
	 * @return P, si no existe null
	 */
	P getById(int id);

	/**
	 * Crear un nuevo regristro
	 * @param pojo
	 * @return true si se ha creado, false en caso contrario
	 */
	boolean insert(P pojo); // Le pasamos el objeto porque ya tiene los datos necesarios.

	/**
	 * Borra un registro
	 * @param id
	 * @return true si se ha eliminado, false en caso contrario
	 */
	boolean delete(int id);

	/**
	 * Modifica un registro
	 * @param pojo
	 * @return true si se ha modificado, false en caso contrario
	 */
	boolean update(P pojo);// Le pasamos el objeto porque ya incluye un id.

}

package com.ipartek.formacion;

public class Youtube {

	// propiedades
	private String titulo;
	private String codigo;
	private int reproducciones;

	// constructores
	public static final int LONGITUD_CODIGO = 11;
	public static final int LONGITUD_MIN_TITULO = 2;
	public static final int LONGITUD_MAX_TITULO = 150;
	public static final String URL = "https://www.youtube.com/watch?v=";

	public Youtube(String titulo, String codigo) throws Exception {
		super();
		//this.titulo = titulo; // minimo 2 caracteres, maximo 150.
		//this.codigo = codigo; // codigo de 11 caracteres.
		this.setTitulo(titulo);
		this.setCodigo(codigo);
		
		this.reproducciones = 0;
	}

	// getter y setters
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) throws Exception {
		if (titulo != null && titulo.length() >= LONGITUD_MIN_TITULO && titulo.length() <= LONGITUD_MAX_TITULO) {
			this.titulo = titulo;
		} else {
			String msg = String.format("La longitud del titulo tiene que ser de " + LONGITUD_MIN_TITULO    +  "  a "+LONGITUD_MAX_TITULO  +" caracteres");
			throw new Exception(msg);
		}

	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) throws Exception {
		if (codigo != null && codigo.length() == LONGITUD_CODIGO) {
			this.codigo = codigo;
		} else {
			throw new Exception("La longitud del codigo debe ser de: " + LONGITUD_CODIGO + " caracteres");
		}

	}

	public int getReproducciones() {
		return reproducciones;
	}

	public void setReproducciones(int reproducciones) {
		this.reproducciones = reproducciones;
	}

	// funciones

	@Override
	public String toString() {
		return "Youtube [titulo=" + titulo + ", codigo=" + codigo + ", reproducciones=" + reproducciones + "]";
	}

	public String getUrl() {
		return URL + codigo;
	}

}

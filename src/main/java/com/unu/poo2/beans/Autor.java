package com.unu.poo2.beans;

public class Autor {
   private String codigoAutor;
   private String nombreAutor;
   private String nacionalidad;
public String getCodigoAutor() {
	return codigoAutor;
}
public void setCodigoAutor(String codigoAutor) {
	this.codigoAutor = codigoAutor;
}
public String getNombreAutor() {
	return nombreAutor;
}
public void setNombreAutor(String nombreAutor) {
	this.nombreAutor = nombreAutor;
}
public String getNacionalidad() {
	return nacionalidad;
}
public void setNacionalidad(String nacionalidad) {
	this.nacionalidad = nacionalidad;
}
public Autor(String codigoAutor, String nombreAutor, String nacionalidad) {
	this.codigoAutor = codigoAutor;
	this.nombreAutor = nombreAutor;
	this.nacionalidad = nacionalidad;
}
   
}

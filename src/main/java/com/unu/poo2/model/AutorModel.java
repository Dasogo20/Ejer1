package com.unu.poo2.model;

import java.util.ArrayList;
import java.util.List;

import com.unu.poo2.beans.Autor;

public class AutorModel {

	public List<Autor> listarAutores(){
		
		ArrayList<Autor> autores = new ArrayList<>();
		autores.add(new Autor("1", "Daniel Soria", "Peruana"));
		autores.add(new Autor("2", "Rosa Perez", "Colombiana"));
		autores.add(new Autor("3", "Jose Gonzales", "Argentino"));
		
		
		return autores;
	}

}

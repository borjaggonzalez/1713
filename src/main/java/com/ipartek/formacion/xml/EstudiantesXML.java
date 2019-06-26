package com.ipartek.formacion.xml;

import org.w3c.dom.*;
import org.xml.sax.SAXException;

import javax.xml.parsers.*;
import java.io.*;

/**
 * Ejercicio para aprender a parsear para aprender a trabajar y parsear con XML
 * 
 * @see https://www.tutorialspoint.com/java_xml/java_dom_parse_document.htm
 * @author Curso
 *
 */
public class EstudiantesXML {
	public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {

		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = factory.newDocumentBuilder();

		// Similiar a String pero preparado para trabajar con String grandes o ficheros
		// de texto
		StringBuilder xmlStringBuilder = new StringBuilder();

		xmlStringBuilder.append("<?xml version=\"1.0\"?> <class> </class>");
		ByteArrayInputStream input = new ByteArrayInputStream(xmlStringBuilder.toString().getBytes("UTF-8"));
		Document doc = builder.parse(input);
		
		

	}
}

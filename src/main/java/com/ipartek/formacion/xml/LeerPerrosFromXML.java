package com.ipartek.formacion.xml;

import org.w3c.dom.*;
import org.xml.sax.SAXException;

import com.ipartek.formacion.Perro;

import javax.xml.parsers.*;
import java.io.*;

/**
 * Leer XML con listado de perros Guardar en ArrayList Mostrar por pantalla
 * 
 * @author Borja
 *
 */
public class LeerPerrosFromXML {

	public static void main(String[] args)  {
	      try {
	    	  
	    	  /*
	    	   * ClassLoader classLoader = new LeerPerrosFromXML().getClass().getClassLoader();
	           *File inputFile = new File(classLoader.getResource("perros.xml").getFile());
	    	   */
	          File inputFile = new File("C:\\1713\\eclipse-workspace\\1713\\src\\main\\java\\com\\ipartek\\formacion\\xml\\perros.xml");
	          DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
	          DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
	          Document doc = dBuilder.parse(inputFile);
	          doc.getDocumentElement().normalize();
	          System.out.println("Root element :" + doc.getDocumentElement().getNodeName());
	          NodeList nList = doc.getElementsByTagName("perro");
	          System.out.println("----------------------------");
	          
	          //TODO setearlo en perro y mostrarlo desde la clase perro
	          
	          Perro perro = new Perro();
	          for (int temp = 0; temp < nList.getLength(); temp++) {
	             Node nNode = nList.item(temp);
	             System.out.println("\nCurrent Element :" + nNode.getNodeName());
	             
	             if (nNode.getNodeType() == Node.ELEMENT_NODE) {
	                Element eElement = (Element) nNode;
	                System.out.println("Perro: "); 
	                System.out.println("Nombre : " 
	                   + eElement
	                   .getElementsByTagName("nombre")
	                   .item(0)
	                   .getTextContent());
	                System.out.println("Raza : " 
	                   + eElement
	                   .getElementsByTagName("raza")
	                   .item(0)
	                   .getTextContent());
	                System.out.println("Edad : " 
	                   + eElement
	                   .getElementsByTagName("edad")
	                   .item(0)
	                   .getTextContent());
	                System.out.println("Vacunado : " 
	                   + eElement
	                   .getElementsByTagName("vacunado")
	                   .item(0)
	                   .getTextContent());
	             }
	          }
	       } catch (Exception e) {
	          e.printStackTrace();
	       }
	  
	}

}

/**
 * 
 */
package ar.edu.unju.fi.tracking.model;

import java.time.LocalDateTime;
import java.util.List;

/**
 * Esta clase representa un registro Tracking 
 * @author grupo 6
 *
 */
public class RegistroTracking {
	
	/*
	 * *********Atributos********** 
	 */
	
	/**
	 * Atributo que representa la fecha y hora que se registro
	 */
	LocalDateTime fechaHora;
	
	/**
	 * Atributo que representa tipo de vehiculo que se registro
	 */
	Vehiculo vehiculo;
	
	/**
	 * Atributo que respresenta los tripulantes que se registro
	 */
	List<Tripulante> tripulantes;
	
	/**
	 * Atributo que representa la localidad donde se registro
	 */
	Localidad localidad;
	
	/**
	 * Atributo que representa el detalle del lugar donde se realizo el registro
	 */
	String detalleLugarRegistro;
}

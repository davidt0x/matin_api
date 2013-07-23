package org.matin.database;

/**
 * This exception is thrown when the user queries the database for a material
 * and does not find it.
 * 
 * @author Dave Turner
 *
 */
public class MatINMaterialNotFoundException extends Exception {
	public MatINMaterialNotFoundException(String message)
	{
		super(message);
	}
}

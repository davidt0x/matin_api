package org.matin.database;

/**
 * This class is a superclass of all classes that can be written to the MatIN database.
 * 
 * This class provides methods common to all objects that may be written to the MatIN
 * database. Only objects that are subclasses of MatINWritableObject may be written 
 * to the database directly. Other objects might be writable to the database indirectly
 * however.
 * 
 * @author Dave Turner
 *
 */
public abstract class MatINWriteableObject {
	
	/**
	 * This method commits the MatINWritableObject to a remote database.
	 *  
	 * @param dbObject The database to commit this object to.
	 */
	public void commit(MatIN dbObject)
	{ 
	}
	
}

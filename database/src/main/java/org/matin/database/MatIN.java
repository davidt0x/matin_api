/**
 * 
 */
package org.matin.database;

/**
 * The main class for accessing the Materials Innovation Network (MatIN)
 * database.
 * 
 * This class allows users to login to the MatIN database, add samples, data objects,
 * query the data graph, etc. It is the main interface to the database. 
 * 
 * @author Dave Turner
 *
 */
public class MatIN {

	private final String databaseURL;
	private final int uid;
	private final String sessionKey;
	
	public MatIN(String databaseURL, int uid, String sessionKey)
	{
		this.databaseURL = databaseURL;
		this.uid = uid;
		this.sessionKey = sessionKey;
	}
	
	
	
}

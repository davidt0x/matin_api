package org.matin.database;

/**
 * This class represents categories of materials.
 * 
 * 
 * @author Dave Turner
 *
 */
public class MaterialCategory extends MatINWriteableObject {

	protected String name;
	
	public MaterialCategory(String name) {
		super();
		this.name = name;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
		
}

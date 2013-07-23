package org.matin.database;

import java.util.ArrayList;
import java.util.List;

/**
 * The Sample class provides an interface for reading and writing material 
 * sample objects to the matIN database. 
 * 
 * Samples represent organizational structures in the matIN database. They 
 * usually represent either a physical material specimen that has been 
 * experimentally measured or a simulated dataset that is a model for an 
 * actual material system. Samples may have any number of data objects that
 * represent the results of these experiments or simulations. Generally, these
 * data objects capture some aspect of the structure of the sample's material.
 * 
 * @author Dave Turner
 *
 */
public class Sample extends MatINWriteableObject {

	protected String name;
	
	protected String description; 
	
	protected Material material;
	
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

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * @return the material
	 */
	public Material getMaterial() {
		return material;
	}

	/**
	 * @param material the material to set
	 */
	public void setMaterial(Material material) {
		this.material = material;
	}

	protected List<String> imageURLs = new ArrayList<String>();
	
	
}

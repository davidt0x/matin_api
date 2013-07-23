package org.matin.database;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        MatIN dbCon = MatINConnectionFactory.MatINConnect("http://database.org:4040", "dmt36", "password");
        
        try {
        	Material material = dbCon.FindMaterial("Iron");
        
        	Sample sample = new Sample("M1", "This is a piece of Iron", material);
        
        	System.out.println(sample.getDescription());
        } catch(MatINMaterialNotFoundException ex)
        {
        	System.out.println(ex.toString());
        }
    }
}

package app;

import java.io.*;
import entities.Product;

/**
*
* @author sass
*/
public class Files {

    public static void main(String[] args) {
    	
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {

        	//Here the user enter the source file path
            System.out.print("Insert the .csv path: ");
            String sourceFileStr = br.readLine();
            
            //Create a File object with the given path
            File sourcePath = new File(sourceFileStr);
            
            //Create the "out" subfolder if it doesn't exist
            File outFolder = new File(sourcePath.getParentFile(), "out");
            if(!outFolder.exists()) {
            	outFolder.mkdir();
            }
            
            //Set the output file path
            String newFile = new File(outFolder, "summary.csv").getPath();

            try (BufferedReader reader = new BufferedReader(new FileReader(sourceFileStr));
                 BufferedWriter writer = new BufferedWriter(new FileWriter(newFile))) {

                String line;
                
                // Read each line from the input file
                while ((line = reader.readLine()) != null) {
                    
                	//Split the line into fields base on the commas
                	String[] fields = line.split(",");
                    String name = fields[0];
                    double price = Double.parseDouble(fields[1]);
                    int quantity = Integer.parseInt(fields[2]);
                    
                    //Create a Product object with the read data
                    Product product = new Product(name, price, quantity);

                    //Write the object data in the output file
                    writer.write(product.getName() + "," + String.format("%.2f", product.finalPrice()) + "\n");
                }

                System.out.println(newFile + " CREATED!");

            } catch (IOException e) {
                System.out.println("Error: " + e.getMessage());
            }

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

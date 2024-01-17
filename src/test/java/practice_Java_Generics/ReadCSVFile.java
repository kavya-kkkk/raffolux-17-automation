/**
 * 
 */
package practice_Java_Generics;

import java.io.FileReader;
import java.io.IOException;

import com.opencsv.CSVReader;

/**
 * @author hp
 *
 */
public class ReadCSVFile 
{
	
	public static void main(String[] args) {
        String csvFile = "C:\\Learnings\\UI_Elements_CsvFile.csv";
        try 
        {
            CSVReader reader = new CSVReader(new FileReader(csvFile));
            String[] nextLine;
            while ((nextLine = reader.readNext()) != null) {
                // Access data from CSV file here
                String name = nextLine[1];
                int age = Integer.parseInt(nextLine[2]);
                String country = nextLine[3];
                System.out.println("Name: " + name + ", Age: " + age + ", Country: " + country);
            }
        } 
        catch (IOException e) 
        {
          System.out.println(e.getMessage());
        }
        catch(Exception e1)
        {
        	
        	System.out.println(e1.getStackTrace());
        	System.out.println(e1.getMessage());
        	System.out.println(" =========================  Exception Alert  ============================= ");
        }
    }

}

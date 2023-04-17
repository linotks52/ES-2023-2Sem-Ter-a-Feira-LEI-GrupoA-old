package pt.iscte_iul.ista.DIAM;

import java.io.*;

public class SaveCsv {
	
	 public static void main(String[] args) {
		 
	        String OndeGuardar = "D:/Users/Utilizador/Desktop/CSVs/";
	        String nome = "OLA2";
	        String DfilePath=OndeGuardar + nome + ".csv"; 
	        String SfilePath="D:/Users/Utilizador/Desktop/horario_exemplo.csv";
	        
	        try {
	            // Create a FileReader to read data from the source CSV file
	            FileReader fileReader = new FileReader(SfilePath);
	            // Create a BufferedReader to read data from the FileReader
	            BufferedReader bufferedReader = new BufferedReader(fileReader);
	            // Create a FileWriter to write data to the destination CSV file
	            FileWriter fileWriter = new FileWriter(DfilePath);
	            // Create a BufferedWriter to write data to the FileWriter
	            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
	            String line;
	            // Read each line of the source CSV file and write it to the destination CSV file
	            while ((line = bufferedReader.readLine()) != null) {
	                bufferedWriter.write(line);
	                bufferedWriter.newLine();
	            }
	            // Close the BufferedReader and BufferedWriter
	            bufferedReader.close();
	            bufferedWriter.close();
	            System.out.println("Data written to the destination CSV file successfully.");
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	    }
	}



package fileutils;

import java.lang.NullPointerException;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.File;
import java.io.PrintWriter;
import java.util.*;

import javax.swing.JOptionPane;

public class ParseFile
{
	// make an Array List
	private static ArrayList<ArrayList> fileDataArray = new ArrayList<>();
	private static ArrayList<String> fileNames = new ArrayList<>();
	public static ArrayList<String> fNames = new ArrayList<>();
	public static Map<String, String> indexMapTable = new TreeMap<>();
	
	public ParseFile()
	{
	}

	public static void main(String[] args) throws IOException, NullPointerException
	{
		//get a list of files
		fNames = retrieveFileList();

		
		//get the file contents
		try
		{
			readFile();
		}
		catch (FileNotFoundException e)
		{
			JOptionPane.showMessageDialog(null, "No File Found @ C:\\Temp", "Text File Error", JOptionPane.WARNING_MESSAGE);
		}
		catch (IOException e) {
			JOptionPane.showMessageDialog(null, "File I/O @ C:\\Temp", "Text File Error", JOptionPane.WARNING_MESSAGE);
		}
		
		//parse the data
		try
		{
		indexMapTable = parseArrayListContents(fileDataArray);
		}
		catch (NullPointerException e)
		{
			JOptionPane.showMessageDialog(null, "No File to Parse", "Text File Error", JOptionPane.WARNING_MESSAGE);
		}
		catch (FileNotFoundException e)
		{
			JOptionPane.showMessageDialog(null, "No File Found @ C:\\Temp", "Text File Error", JOptionPane.WARNING_MESSAGE);
		}
		catch (IOException e)
		{
			JOptionPane.showMessageDialog(null, "File I/O @ C:\\Temp", "Text File Error", JOptionPane.WARNING_MESSAGE);
		}
		
		//send the index data to file
		try
		{
			printMapContents(indexMapTable);
		} 
		catch (FileNotFoundException e)
		{
			JOptionPane.showMessageDialog(null, "No File Found - C:\\IndexTemp", "Index Map File Error", JOptionPane.WARNING_MESSAGE);
		}
		catch (IOException e)
		{
			JOptionPane.showMessageDialog(null, "File I/O Error - C:\\IndexTemp", "Index Map File Error", JOptionPane.WARNING_MESSAGE);
		}

	} 
/**
 * readFile - reads a list of files from the C:\temp directory, reads each file and puts the
 * file contents in an ArrayList.
 * The ArrayList with the files data is the added to another ArrayList.
 * 
 * @return fileDataArray - An ArrayList of ArrayList's
 * @throws IOException
 */
	public static ArrayList<ArrayList> readFile() throws IOException , NullPointerException
	{
		//some temporary storage
		String fileName;
		String inString;
		int fileCount = 0;

		// open a file path, print out the path and file name
		File path = new File("C:\\Temp\\");
		// put the file names in a file list
		File[] files = path.listFiles();
		fileCount = files.length;
		System.out.println("Files = " + fileCount);

		// loop through the file list
		for (int i = 0; i < files.length; i++) 
		{
			if (files[i].isFile())
			{
				//save the file name in the order of processing
				fileName = files[i].toString();
				fileNames.add(fileName);
				
				// make a temperary Array List
				ArrayList<String> fileData = new ArrayList<>();

				// this line weeds out other directories/folders
				System.out.println(files[i]);

				Scanner fileInput = new Scanner(files[i]);
				// get the file contents put it in an array list
				while (fileInput.hasNext())
				{
					inString = fileInput.next();
					fileData.add(inString);
				}

				fileInput.close();
				//add the filedata array to the dataArrray ArrayList
				fileDataArray.add(fileData);
			}
		}
		
		return fileDataArray;
	}

	/**
	 * 
	 * @param dataArray
	 * @return Map<String, String> the inverted Index
	 * @throws IOException 
	 */
	@SuppressWarnings("rawtypes")
	public static  Map<String, String> parseArrayListContents(ArrayList<ArrayList> dataArray) throws IOException , NullPointerException
	{
		ArrayList<String> fileContents = new ArrayList<>();
		Map<String, String> tempIndexMap = new TreeMap<>();
		// data arraylist should equal number of files
		System.out.println("Data Array Size " + dataArray.size());
		int count =0;
		//loop through the array 
		for (int j = 0; j < dataArray.size(); j++)
		{
			//some working strings
			String word = null;
			String fileNum = null;
			String index = null;
			StringBuilder tempString = new StringBuilder();
			
			/* ** loop through the arraylist's make word/position pairs ** */
			// get first ArrayList in the Data array list
			List<String> tempD = dataArray.get(j);
			// find out how long,loop through it
			for (int k = 0; k < tempD.size(); k++)
			{
				//clear the temperary string
				tempString.delete(0,tempString.length());
				//get the word 
				word = tempD.get(k) + ":";
				//file number is the inex from the array
				fileNum = String.valueOf(j);
				//index is the loop count 
				index = String.valueOf(k);
				//make a single string to hold file number and word place
				tempString.append(word);
				tempString.append(fileNum);
				tempString.append("@");
				tempString.append(index);
				count ++;
				// print word file#, INDEX
				System.out.println(word + " " + tempString);
				//add the word/position pairs to a new ArrayList
				fileContents.add(tempString.toString());
			}
			System.out.println("Count = " + count);
		}
		//sort the ArrayList so we can get rid of duplicates
		Collections.sort(fileContents);
		//print te raw data to file
		try
		{
			printRawFileContents(fileContents);
		} 
		catch (FileNotFoundException e)
		{
			JOptionPane.showMessageDialog(null, "No File Found - C:\\IndexTemp", "Index Map File Error", JOptionPane.WARNING_MESSAGE);
		}
		
		//get rid of duplicates in the list make the inverted Index
		tempIndexMap = mergeDuplicates(fileContents);
		
		return tempIndexMap;
	}
	
	/**
	 * iterate through the RAW data from the files and remove duplicate entries.
	 * append the file/location index to the key.
	 * 
	 * PATH and FILE NAME Still hardcoded
	 * @param fileContents
	 * @return Map of key Value pairs representing the word location of the text in the files that will be searched
	 */
	public static Map<String, String> mergeDuplicates(ArrayList<String> fileContents)
	{

	    Map<String, String> indexTable = new TreeMap<>();
	    // get rid of duplicates
	    // loop through the fileContents andmake a map
	    for (int i = 0; i < fileContents.size(); i++)
	    {
		String[] stTemp = new String[2];
		stTemp = fileContents.get(i).toString().split(":");

	    if (!indexTable.containsKey(stTemp[0]))
	    {
		indexTable.put(stTemp[0], stTemp[1]);
	    }
	    else
	    {
		// get the previous index value and append it
		// String valueTemp = indexTable.get(indexTable.size()-1);
		String valueTemp = indexTable.get(stTemp[0]);
		valueTemp = valueTemp + "," + stTemp[1];
		indexTable.put(stTemp[0], valueTemp);
	    }
	}

	return indexTable;
    }
	
	/**
	 * printRawFileContents prints the complete, sorted, contents of the search files word: file@location
	 *  to a text file.
	 * PATH and FILE NAME Still hardcoded
	 * @param fileContents
	 * @throws IOException
	 */
	public static void printRawFileContents(ArrayList<String> fileContents) throws IOException
	{
	    //make a directory if none exists
	    new File("C://IndexTemp").mkdirs();
	    //print to file the contents of the file(s)	
	    PrintWriter outFile = new PrintWriter(new FileWriter("C:\\IndexTemp\\Raw_File_Contents.txt"));
				
	    for(int i = 0; i < fileContents.size();i++)
		outFile.println(fileContents.get(i));
	    outFile.close();
	}
	
	/**
	 * printMapContents prints the contents of the inverted index to a text file.
	 * 
	 * @param indexMapTable
	 * @throws IOException
	 */
	public static void printMapContents(Map<String, String> indexMapTable) throws IOException
	{
	    //make a directory if none exists    
	    new File("C://IndexTemp").mkdirs();
	    PrintWriter outFile = new PrintWriter(new FileWriter("C:\\IndexTemp\\Index_Map_File.txt"));
	    List<String> indexMapKeys = new ArrayList<>(indexMapTable.keySet());
	    for(String key : indexMapKeys)
		outFile.println(key + ":" + indexMapTable.get(key));
	    outFile.close();
	}
	
	/**
	 * retrieveFileList will get the path and file name of the files used for searching and the
	 * inverted Index
	 * 
	 * @return an ArrayList of path\file names
	 */
	
	public static ArrayList<String> retrieveFileList ()
	{
	    ArrayList<String> fileList = new ArrayList<>();
	    // open a file path, print out the path and file name
	    File path = new File("C:\\Temp\\");
	    // put the file names in a file list
	    File[] files = path.listFiles();

	    for (int i = 0; i < files.length; i++)
	    {
		fileList.add(files[i].toString());
	    }
	    return fileList;
	}
	
	public static void removeFile()
	{
	 //methode to remove a file from the list of files for searching   
	}
	
}
package com;
import java.io.*;
import java.util.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.ParseException;
import java.text.SimpleDateFormat; 
import java.util.Date;
public class InsuranceSolution {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
	//	List<String> lines = Collections.emptyList();  
	    List<String> lines = Files.readAllLines(Paths.get("input.txt"), StandardCharsets.UTF_8);
	   List<Insurance> l = readLine("input.txt");
		CompareList(l);
		expiryDate(l);
	}

	   // System.out.println(lines);

	    // reading text file into ArrayList in Java 6
	public static List<Insurance> readLine(String a) 
	{
    List<Insurance> listOfLines = new ArrayList<>();
	    BufferedReader bufReader;
		try {
			bufReader = new BufferedReader(new FileReader(a));
			    String line;
	   line = bufReader.readLine();
	    while (line != null) {
	    String[] field = line.split(" ");
			Insurance i = new Insurance(field[0],field[1],field[2],field[3],field[4],field[5]);
	      listOfLines.add(i);
	      line = bufReader.readLine();
	    }
	}
	catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	    //bufReader.close();
	// System.out.println(listOfLines);	
	return listOfLines;
	}
	
	public static void CompareList(List<Insurance> i1) 
	{
		int sum=0;
		String b=i1.getPolicyNo().substring(0,2);
	for(int i=0;i<i1.size()-1;i++)
	{
	 for(int j=i+1;j<i1.size()-1;j++)
		{
		 
			if(i1.get(i).getPolicyNo().contains(i1.get(j).getPolicyNo()))
			{
				
			 sum=sum+Integer.parseInt(i1.get(i).getCostOfPolicy());	
					
			}
			System.out.println(b+" "+sum);
		}
			
	}

	
	
	}
	public static void expiryDate(List<Insurance> i2) throws ParseException, MyException
	{
		for(Insurance j:i2)
		{
			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	        Date dateE = sdf.parse(j.dateOfExpiry);
	        Date dateD= sdf.parse(j.dateOfDischarge);
	        if(dateD.compareTo(dateE)>0)
			{
	        	String a=j.getPolicyNo();
			    throw new MyException(a);
		}
	}
	
}
}
	
































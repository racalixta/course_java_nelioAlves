package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;

public class Program {

	public static void main(String[] args) {
		
		Map<String, Integer> candidates = new LinkedHashMap<>();
		String path = "C:\\temp\\ws-eclipse\\course_java_nelioAlves\\_txt\\mod19ex03.txt";
		
		try(BufferedReader br = new BufferedReader(new FileReader(path))) {
			
			String line = br.readLine();
			
			while(line != null) {
				
				String[] fields = line.split(",");
				String name = fields[0];
				Integer votes = Integer.parseInt(fields[1]);
				
				if(candidates.containsKey(name)) {
					int sum = candidates.get(name) + votes;		
					candidates.put(name, sum);
					
				} else {
					candidates.put(fields[0], votes);
					
				}
				
				line = br.readLine();
				
			}
			
			for(String key : candidates.keySet()) {
				System.out.println(key + ": " + candidates.get(key));
			}
			
		}catch(IOException e) {
			System.out.println("ERROR: " + e.getMessage());
		}
		
	}

}

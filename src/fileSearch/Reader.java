package fileSearch;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.concurrent.Semaphore;

public class Reader {

	private Semaphore sem = new Semaphore(2);
	private String find;
	
	Reader(String find) {
		this.find = find.toLowerCase();
	}
	
	public void read(String filePath) {
		
		try {
			sem.acquire();
		} catch ( InterruptedException e1 ) {
			e1.printStackTrace();
		}
		
		try {
            File file = new File(filePath);
            Scanner scanner = new Scanner(file);
            
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                
                if (line.toLowerCase().startsWith(this.find))
                	System.out.println(filePath + " -> " + line);
            }
            
            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
		
		System.out.println("Arquivo " + filePath + " finalizado!");
		sem.release();
	}

}

package fileSearch;

public class Main {
	
	public static void main(String[] args) {
		Reader reader = new Reader("AR");
		
		new Thread(() -> reader.read("./files/nomescompletos-00.txt")).start();
		new Thread(() -> reader.read("./files/nomescompletos-01.txt")).start();
		new Thread(() -> reader.read("./files/nomescompletos-02.txt")).start();
		new Thread(() -> reader.read("./files/nomescompletos-03.txt")).start();
		new Thread(() -> reader.read("./files/nomescompletos-04.txt")).start();
		new Thread(() -> reader.read("./files/nomescompletos-05.txt")).start();
		new Thread(() -> reader.read("./files/nomescompletos-06.txt")).start();
		new Thread(() -> reader.read("./files/nomescompletos-07.txt")).start();
		new Thread(() -> reader.read("./files/nomescompletos-08.txt")).start();
		new Thread(() -> reader.read("./files/nomescompletos-09.txt")).start();
	}
}

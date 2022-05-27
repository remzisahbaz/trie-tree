package app;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import domain.Trie;

public class App {
	
	public static void main(String[] args) throws IOException {
		
		File file = new File("sozluk[689].txt");
		FileReader fileReader = new FileReader(file);
		String line;

		BufferedReader br = new BufferedReader(fileReader);
		Trie node= new Trie();
		
		while ((line = br.readLine()) != null) {

		    node.insert(line);
		}

		br.close();
		
		
	
		System.out.println(node.search("A"));
		System.out.println(node);
	
	}

}

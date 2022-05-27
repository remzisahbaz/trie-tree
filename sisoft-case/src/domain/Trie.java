package domain;

import java.util.Iterator;
import java.util.Map.Entry;

public class Trie {

	private TrieNode root;
//	private Iterator<Entry<Character, TrieNode>> iterator= 
//			root.children.entrySet().iterator();

	public Trie() {
		root= new TrieNode();
	}
	@SuppressWarnings("unlikely-arg-type")
	public void insert(String word) {
		TrieNode curNode= root;
		
		char[] arr= word.toCharArray();
		
		for(char curChar : arr) {
			if(curNode.children.containsKey(curNode)==false) {
				
				curNode.children.put(curChar, new TrieNode());
			
			}
			curNode=curNode.children.get(curChar);
		}
		curNode.isWord=true;
	}
	
	
	public boolean search(String word) {
		
		TrieNode curNode= root;
		char[] arr= word.toCharArray();
		
		for(char curChar :arr) {
			
			if(curNode.children.containsKey(curChar)==false) {
		return false;
		}
		curNode=curNode.children.get(curChar);
		}
		return curNode.isWord=true;
	}
	

	
	public boolean startsWith(String prefix) {
		
		TrieNode curNode =root;
		char[] arr= prefix.toCharArray();
		
		for(char curChar:arr) {
			
			if(curNode.children.containsKey(curChar)==false) {
				
				return false;
			}
			curNode=curNode.children.get(curChar);
		}
		return true;
	}
	
	public void getIter() {
		
//	
//		System.out.println(iterator);
//        while(root.getIterator().hasNext())
//        {
//             Entry<Character, TrieNode> entry = root.getIterator().next();
//             System.out.println("Key = " + entry.getKey() + 
//                                 ", Value = " + entry.getValue());
//        }
	}
}

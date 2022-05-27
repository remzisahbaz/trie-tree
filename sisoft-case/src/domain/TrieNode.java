package domain;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Objects;

public class TrieNode {

	public Map<Character,TrieNode> children= new HashMap<>();
	public boolean isWord;
	private Iterator<Entry<Character, TrieNode>> iterator= children.entrySet().iterator();
	
	
	
	public Iterator<Entry<Character, TrieNode>> getIterator() {
		return iterator;
	}

	
	@Override
	public int hashCode() {
		return Objects.hash(children);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TrieNode other = (TrieNode) obj;
		return Objects.equals(children, other.children);
	}
	
	
	
}

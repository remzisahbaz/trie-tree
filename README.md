# trie-tree

🔖


TrieNode curNode= root;	
char[] arr= word.toCharArray();
	
		for(char curChar : arr) {
			if(curNode.children.containsKey(curNode)==false) {
				
				curNode.children.put(curChar, new TrieNode());
			
			}
			curNode=curNode.children.get(curChar);
		}
		curNode.isWord=true;
    
    ..........
    

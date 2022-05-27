# trie-tree

🔖
char[] arr= word.toCharArray();


TrieNode curNode= root;		
		for(char curChar : arr) {
			if(curNode.children.containsKey(curNode)==false) {
				
				curNode.children.put(curChar, new TrieNode());
			
			}
			curNode=curNode.children.get(curChar);
		}
		curNode.isWord=true;
    
    ..........
    

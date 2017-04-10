package graph;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatedChar {
	char returnChar(String str){
		LinkedHashMap<Character,Integer> hmap=new LinkedHashMap<Character,Integer>();
		for(int i=0;i<str.length();i++){
			char c=str.charAt(i);
			hmap.put(c, hmap.containsKey(c)?hmap.get(c)+1:1);
		}
		for (Map.Entry<Character, Integer> item : hmap.entrySet()) {
			if(item.getValue()==1){
				return item.getKey();
			}
		}
		return ' ';
	}
	char usingListAndSet(String str){
		HashSet<Character> repeating=new HashSet<Character>();
		ArrayList<Character> nonrepeating=new ArrayList<Character>();
		for(int i=0;i<str.length();i++){
			char c=str.charAt(i);
			if(repeating.contains(c)){
				continue;
			}
			else if(nonrepeating.contains(c)){
				nonrepeating.remove((Character)c);
				repeating.add(c);
			}
		}
		return nonrepeating.get(0);
	}
	public static void main(String[] args) {
		FirstNonRepeatedChar s=new FirstNonRepeatedChar();
		System.out.println(s.returnChar("asdasdapwep"));
		System.out.println(s.returnChar("asdasdalwe"));
	}
}

package graph;

public class ConvertStringToInteger {
	int convert(String str){
		int result=0;
		for(int i=0;i<str.length();i++){
			result=result*10+str.charAt(i)-'0';
		}
		return result;
	}
	public static void main(String[] args) {
		ConvertStringToInteger c=new ConvertStringToInteger();
		System.out.println(c.convert("1234"));
	}
}

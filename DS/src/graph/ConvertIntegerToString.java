package graph;

public class ConvertIntegerToString {
	int calLength(int num){
		int l=0;
		while(num!=0){
			l++;
			num=num/10;
		}
		return l;
	}
	String convert(int num){
		String s="";
		int length=calLength(num);
		char c[]=new char[length];
		for(int i=length-1;i>=0;i--){
			c[i]=(char)(num%10+48);
			num=num/10;
		}
		for (int i = 0; i < c.length; i++) {
			s=s+c[i];
		}
		return s;
	}
	public static void main(String[] args) {
		ConvertIntegerToString c=new ConvertIntegerToString();
		System.out.println(c.convert(1234));
	}
}

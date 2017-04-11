package graph;
//implement merge sort to calculate insertion value in array
public class CalInsertionArray {
	static int count=0;
	void merge(int ar[],int p,int q,int r){
		int n1=q-p+1;
		int n2=r-q;
		int a[]=new int[n1+1];
		int b[]=new int[n2+1];
		for(int i=p;i<=q;i++){
			a[i-p+1]=ar[i];
		}
		for(int j=q+1;j<=r;j++){
			b[j-q]=ar[j];
		}
		a[n1]=Integer.MAX_VALUE;
		b[n2]=Integer.MAX_VALUE;
		int k=p;
		int i=0,j=0;
		for(k=p;k<=r;k++){
			if(a[i]<=b[j]){
				ar[k]=a[i];
				i++;
			}
			else{
				System.out.println("inside j");
				ar[k]=b[j];
				j++;
				count++;
			}
		}
	}
	void CalInsertion(int ar[],int p,int r){
		int q=0;
		if(p<r){
			q=(int)Math.floor((p+r)/2);
			CalInsertion(ar, p, q);
			CalInsertion(ar, q+1, r);
			merge(ar,p,q,r);
		}
	}
	public static void main(String[] args) {
		CalInsertionArray c=new CalInsertionArray();
		int a[]={1,2,3,4,5};
		c.CalInsertion(a,0,4);
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		System.out.println(count);
	}
}

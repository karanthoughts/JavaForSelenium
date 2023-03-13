package testing;

public class ArraysConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		int i=10;
//		i=20;
//		i=30;
//		System.out.println(i);
		
		int i[]=new int[4];
		i[0]=10;
		i[1]=20;
		i[2]=30;
		i[3]=40;
		
	//	System.out.println(i[0]);
		//System.out.println(i[3]);
		//System.out.println(i[4]);
		//System.out.println(i[-1]);
		//System.out.println(i);
		//System.out.println(i[0]+i[2]);
		
		int len=i.length;
//		System.out.println("length = " + len);
//		System.out.println("hi = " + (len-1));
//		System.out.println("li = " + 0);
		
//		for (int k=0;k<=len;k++) {
//			System.out.println(i[k]);
//		}
		
//		for (int k=0;k<=len-1;k++) {
//			System.out.println(i[k]);
//		}
		
//		for (int k=0;k<len;k++) {
//			System.out.println(i[k]);
//		}
		
//		for (int k=0;k<i.length;k++) {
//			System.out.println(i[k]);
//		}
		
//		for(int e:i) {
//			System.out.println(e);
//		}
		
		//double array
		double d[]=new double[3];
		d[0]=12.33;
		d[1]=100;
		d[2]=34.44;
	//	d[3]=21.33;
		//System.out.println(d[3]);
		
//		for(double e:d) {
//			System.out.println(e);
//		}
		
		//char array
		char c[]=new char[3];
		c[0]='a';
		c[1]='$';
		c[2]='1';
		
//		for(char e:c) {
//			System.out.println(e);
//		}
		
		//string array
		String lang[]=new String[4];
		lang[0]="java";
		lang[1]="python";
		lang[2]="js";
		lang[3]="ruby";
		//System.out.println(lang[0]+lang[1]);
		
//		for(int p=0;p<lang.length;p++) {
//			System.out.println(p + ":" + lang[p]);
//		}
//		
//		for(String e:lang) {
//			System.out.println(e);
//		}
		
		//object array
		
		Object emp[]=new Object[4];
		emp[0]="tom";
		emp[1]=25;
		emp[2]='m';
		emp[3]=23.44;
		for(Object e:emp) {
			System.out.println(e);
		}
	}

}

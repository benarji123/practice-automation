import java.sql.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Sample {

	public static void main(String[] args) {
  /* String s="NaradaZ Benarji";
   StringBuffer s1 =new StringBuffer();
   StringBuffer s2 =new StringBuffer();
   for(int i=0;i<s.length();i++) {
	   if(s.charAt(i)>='A'&& s.charAt(i)<='Z') {
		   s1.append(s.charAt(i));
	   }else {
		   s2.append(s.charAt(i));
	   }
   }
     
System.out.println(s1.length());
System.out.println(s2.length());
     */
		/*int []obj= {1,2,3,4,5,7,8};
		int n=obj.length+1;
		int sum=(n*(n+1))/2;
		for(int i=0;i<obj.length;i++) {
			sum=sum-obj[i];
		}
		System.out.println(sum);*/
		/*int []obj= {1,2,3,4,5,7,8,2,4,5,2};
		for(int i=0;i<obj.length;i++) {
			for(int j=i+1;j<obj.length;j++) {
				if(obj[i]==obj[j]) {
					System.out.println(obj[j]);
				}
			}
			
		}*/
		int []obj= {1,2,3,4,5,7,8,8,2,3};
		HashMap<Integer,Integer>o=new HashMap<Integer,Integer>();
		for(int i=0;i<obj.length;i++) {
			if(o.containsKey(obj[i])) {
				Integer num=o.get(obj[i]);
				o.put(obj[i], num+1);
			}else {
				o.put(obj[i], 1);
			}
		}
		System.out.println(o);
}
}

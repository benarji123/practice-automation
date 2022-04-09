import java.util.Collection;
import java.util.HashMap;

public class Practice {
public static void main(String[] args) {

//stringReverse("alekh");
//swap();
	reverseNumber();
	counting() ;
StringBuffer s=new StringBuffer("naradabenarji");
char letter='a';
int c=0;
for(int i=0;i<s.length();i++) {
	if(s.charAt(i)==letter) {
		c=c+1;
	}
}
//System.out.println("count of"+letter+c);
}
//string reverse 
static void stringReverse(String enterstring) {
	String s=enterstring;
	char[] c = s.toCharArray();
	int l=c.length;
	for(int i=l-1;i>=0;i--) {
		System.out.print(c[i]);
	}
}
//swap twovaribles
static void swap() {
	int x=3;
	int y=5;
	int re;
	re=x;
	x=y;
	y=re;
	System.out.println(x);
	System.out.println(y);
}
static void counting() {
	String s="hai this is narada benarji and narada hai";
	String[] spt = s.split(" ");
	HashMap<String,Integer> obj=new HashMap<String,Integer>();
	for(int i=0;i<spt.length;i++) {
		if(obj.containsKey(spt[i])) {
			Integer c = obj.get(spt[i]);
			obj.put(spt[i], c=c+1);
		}else {
			obj.put(spt[i],1);
		}
	}
	System.out.println(obj);
}

public static void reverseNumber() {
	int number=454;
	int temp=number;

	int reverse=0;
	for(;number!=0;number=number/10) {
		int remainder= (number%10);
		reverse= reverse*10+remainder;
		
	
	}
	if(temp==reverse) {
		System.out.println("palindrome");
	}else {
		System.out.println("not pali");
	}
    
}
}
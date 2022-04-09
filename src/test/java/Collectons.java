import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Collectons {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String>obj=new ArrayList<String>();
         obj.add("alekh");
         obj.add("narada");
         obj.add("benarji");
         
         System.out.println(obj);
        for(int i=0;i<obj.size();i++) {
        	System.out.println(obj.get(i));
        }
	}

}

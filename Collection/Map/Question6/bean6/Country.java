package bean6;

import java.util.Hashtable;
import java.util.Set;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.ArrayList;

public class Country {
	Hashtable<String,String> M1=new Hashtable<String,String>();
	
	public Hashtable<String,String> saveCountryCapital(String CountryName,String capital){
		M1.put(CountryName,capital);
		return M1;
	}
	
	public String getCapital(String CountryName) {
		if(M1.containsKey(CountryName)) {
			return M1.get(CountryName);
		}
		return null;
	}
	
	public String getCountry(String capitalName) {
		Set<Entry<String, String>> set=M1.entrySet();
		Iterator<Entry<String, String>> it=set.iterator();
		
		while(it.hasNext()) {
			Map.Entry<String,String> me=it.next();
			if(me.getValue().equals(capitalName))
				return me.getKey();
		}
		
		return null;
	}
    
	public Hashtable<String,String> swapKeyValue(){
		Hashtable<String,String> M2=new Hashtable<String,String>();
		Set<Entry<String,String>> set=M1.entrySet();
		Iterator<Entry<String,String>> it=set.iterator();
		
		while(it.hasNext()) {
			Map.Entry<String, String> me= it.next();
			M2.put(me.getValue(), me.getKey());
		}
		return M2;
	}
	
    public ArrayList<String> toArrayList(){
    	ArrayList<String> list=new ArrayList<>();
    	Set<Entry<String,String>> set=M1.entrySet();
		Iterator<Entry<String,String>> it=set.iterator();
		
		while(it.hasNext()) {
			Map.Entry<String, String> me= it.next();
			list.add(me.getKey());
		}
		return list;
    }
}



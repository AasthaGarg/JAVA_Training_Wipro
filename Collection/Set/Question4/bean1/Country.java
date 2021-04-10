package bean1;

import java.util.TreeSet;
import java.util.Iterator;
public class Country {
	TreeSet<String> H1=new TreeSet<String>();
	
	public TreeSet<String> saveCountryName(String CountryName) {
		H1.add(CountryName);
		return H1;
	}
	
	public String getCountryName(String CountryName) {
		Iterator<String> it=H1.iterator();
		while(it.hasNext()) {
			if(it.next().equals(CountryName)) {
				return CountryName;
			}
		}
		return null;
	}

}
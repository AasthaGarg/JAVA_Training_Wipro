package bean;
import java.util.HashSet;
import java.util.Iterator;
public class Country {
	HashSet<String> H1=new HashSet<String>();
	
	public HashSet<String> saveCountryName(String CountryName) {
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

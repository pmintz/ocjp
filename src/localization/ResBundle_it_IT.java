package localization;

import java.util.ListResourceBundle;

//Now, let’s define a ResBundle for the Italian locale. You give the class the suffix "_it_IT". The language
//code "it" stands for Italian and the country code "IT" stands for Italy (Listing 13-6).
//Listing 13-6. ResBundle_it_IT.java

//Italian version
public class ResBundle_it_IT extends ListResourceBundle {
	public Object[][] getContents() {	
		return contents;
	}
	static final Object[][] contents = {
			{ "MovieName", "Che Bella Giornata" },
			{ "GrossRevenue", (Long) 43000000L }, // in euros
			{ "Year", (Integer)2011 }};
}

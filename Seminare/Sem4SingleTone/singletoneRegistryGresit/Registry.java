package singletoneRegistryGresit;

import java.util.HashMap;
import java.util.Map;

public class Registry {

	private static Map<String,Firm> regMap=new HashMap<>();
	
	public static Firm getFirm(String firmName) {
		if(!(regMap.containsKey(firmName))) {
			regMap.put(firmName, new Firm(firmName,0));
			
		}
		return regMap.get(firmName);
	}
}

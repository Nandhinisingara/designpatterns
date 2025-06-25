package designpatterns.singleton;

import java.util.HashMap;
import java.util.Map;

public class ConfigManager {
	
	private ConfigManager() {
	}
	
	
	public static class ConfigManagerHelper {
		private static final ConfigManager INSTANCE = new ConfigManager();;
	}
	
	public static ConfigManager getInstance() {
		return ConfigManagerHelper.INSTANCE;
		
	}
	
	public Map<Integer,String> loadConfigs() {
		 Map<Integer ,String> mapDetails = new HashMap<>();
		 mapDetails.put(1, "Apple");
		 mapDetails.put(2, "Banana");
		 mapDetails.put(3, "Orange");
		 return mapDetails;
	}
	

}

package it.idealegno.bean;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DataStore {
	
	public static class Category {
		String type;
		List<Item> items;
		
		Category(String type, Item ... items) {
			this.type = type;
			for (Item item : items) {
				item.setType(type);
			}
			this.items = Arrays.asList(items);
		}
		
		public List<Item> getItems() {
			return items;
		}
		
		
	}
	
	public static final String COMP_ACC = "complementi-accessori";
	public static final String TARGHE = "targhe";
	public static final String ESP = "espositori";
	public static final String AST_SCAT = "astucci-scatole";
	
	static public Category complementiAccessori = new Category(COMP_ACC,
			new Item("albero"),
			new Item("appendini"),
			new Item("esempi-pezzi"),
			new Item("maniglia-serradura"),
			new Item("portabott"),
			new Item("taglieri")
	);
	
	static public Category targhe = new Category(TARGHE,
			new Item("espositore-queen-vittoria"),
			new Item("portabott"),
			new Item("targa-scritta-laser"),
			new Item("targa-serradura")
	);
	
	static public Category espositori = new Category(ESP, 
			new Item("esp-cart"),
			new Item("espositore-bianco-grande"),
			new Item("espositore-cassettini"),
			new Item("espositore-legno-serradura"),
			new Item("espositore-pedon"),
			new Item("portamaniglie")
	);
	
	static public Category astucciScatole = new Category(AST_SCAT,
			new Item("portabott-soarda"),
			new Item("scatola-pelle"),
			new Item("scatole"),
			new Item("urne")
	);
	
	static Map<String, Category> store = new HashMap<String, Category>() {

		private static final long serialVersionUID = 1L;
		
		{
			put(COMP_ACC, complementiAccessori);
			put(TARGHE, targhe);
			put(ESP, espositori);
			put(AST_SCAT, astucciScatole);
		}
		
	};
	

}

package it.idealegno.bean;

import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@RequestScoped
@Named
public class ProdottiBean {
	
	private String category = DataStore.COMP_ACC;
	
	private List<Item> prodotti;
	
	public void loadProdotti() {
		prodotti = DataStore.store.get(category).getItems();
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}
	
	public List<Item> getProdotti() {
		return prodotti;
	}
	
	public String getJsonStore() {
		return DataStore.jsonStore;
	}

}

package it.idealegno.bean;

import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@RequestScoped
@Named
public class ProdottiBean {
	
	private String category = DataStore.COMP_ACC;
	
	public void loadProdotti() {
		System.out.println(getCategory());
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}
	
	public List<Item> getProdotti() {
		return DataStore.store.get(category).getItems();
	}

}

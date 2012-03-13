package it.idealegno.bean;

public class Item {

	private String id;
	private String description;
	private String title;
	private String type;
	
	public Item(String id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getPath() {
		return "/img/prodotti/" + getType() +"/" + id + "-picc.jpg";
	}
	
	public String getPathLarge() {
		return "/img/prodotti/" + getType() + "/" + id + ".jpg";
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}


}

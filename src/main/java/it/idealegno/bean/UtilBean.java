package it.idealegno.bean;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Produces;
import javax.faces.context.FacesContext;
import javax.inject.Named;

@ApplicationScoped
@Named
public class UtilBean {
	
	@Named @Produces
	public String getCpath() {
		return FacesContext.getCurrentInstance().getExternalContext().getRequestContextPath();
	}

}

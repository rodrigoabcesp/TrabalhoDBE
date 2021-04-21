package br.com.fiap.bean;

import javax.faces.bean.ManagedBean;

import br.com.fiap.Dao.MenuDao;
import br.com.fiap.model.Menu;

@ManagedBean
public class menuBean {

	private Menu menu = new Menu();
	
	public void save() {
		new MenuDao().save(this.menu);
		System.out.println(this.menu);
	}

	public Menu getMenu() {
		return menu;
	}

	public void setMenu(Menu menu) {
		this.menu = menu;
	}
	
	
	
}

package jp.co.aivick.demo.form;

import javax.validation.constraints.NotEmpty;

import jp.co.aivick.demo.domain.MenuType;
import jp.co.aivick.demo.entity.Menu_Recipe;

public class MenuForm {
//field	
	private Integer menu_id;
	
	@NotEmpty
	private String menuName;
	@NotEmpty
	private MenuType menuType;
	@NotEmpty
	private Integer menuPrice;
	@NotEmpty
	private Menu_Recipe menuRecipe;
	
	public Integer getMenu_id() {
		return menu_id;
	}
//getter&setter
	public void setId(Integer menu_id) {
		this.menu_id = menu_id;
	}
	public String getName() {
		return menuName;
	}
	public void setName(String menuName) {
		this.menuName = menuName;
	}
	public MenuType getType() {
		return menuType;
	}
	public void setType(MenuType menuType) {
		this.menuType = menuType;
	}
	public Integer getPrice() {
		return menuPrice;
	}
	public void setPrice(Integer menuPrice) {
		this.menuPrice = menuPrice;
	}
	public Menu_Recipe getMenuRecipe() {
		return menuRecipe;
	}
	public void setRecipeList(Menu_Recipe menuRecipe) {
		this.menuRecipe = menuRecipe;
	}
	
	
}
package jp.co.aivick.demo.form;

import java.util.List;

import javax.validation.constraints.NotEmpty;

import jp.co.aivick.demo.domain.MenuType;
import jp.co.aivick.demo.entity.Recipe;

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
	private List<Recipe> recipeList;
	
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
	public List<Recipe> getRecipeList() {
		return recipeList;
	}
	public void setRecipeList(List<Recipe> recipeList) {
		this.recipeList = recipeList;
	}
	
	
}
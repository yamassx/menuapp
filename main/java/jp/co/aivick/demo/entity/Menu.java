package jp.co.aivick.demo.entity;


import org.seasar.doma.*;

import jp.co.aivick.demo.domain.MenuType;


@Entity
@Table(name="menu")
public class Menu{

//field
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "menu_id")
	private Integer menu_id;
	
	@Column(name="menuName")
	private String menuName;
	
	@Column(name= "menuType")
	private MenuType menuType;
	
	@Column(name= "menuPrice")
	private Integer menuPrice;
	
	/*
	 * @Column(name= "recipeList") private Menu_Recipe menuRecipe;
	 */

//getter&setter
	public Integer getId() {
		return menu_id;
	}

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

	public void setMenuType(MenuType menuType) {
		this.menuType = MenuType.of(menuType.toString());
	}

	public Integer getPrice() {
		return menuPrice;
	}

	public void setPrice(Integer menuPrice) {
		this.menuPrice = menuPrice;
	}

	/*
	 * public Menu_Recipe getRecipeList() { return menuRecipe; }
	 * 
	 * public void setRecipeList(Menu_Recipe recipe) { this.menuRecipe = recipe; }
	 */
	
	
}
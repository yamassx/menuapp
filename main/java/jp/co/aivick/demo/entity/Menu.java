package jp.co.aivick.demo.entity;


import org.seasar.doma.*;

import jp.co.aivick.demo.domain.MenuType;


@Entity(immutable = true)
@Table(name="menu")
public class Menu {

//field
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "menu_id")
	private final Integer menu_id;
	
	@Column(name="menuName")
	private final String menuName;
	
	@Column(name= "menuType")
	private final MenuType menuType;
	
	@Column(name= "menuPrice")
	private final Integer menuPrice;
	
//constructor
	public Menu(Integer menu_id,String menuName, MenuType menuType, Integer menuPrice ){
		this.menu_id = menu_id;
		this.menuName = menuName;
		this.menuPrice = menuPrice;
		this.menuType = menuType;
	}

//getter
	public Integer getId() {
		return menu_id;
	}

	public String getName() {
		return menuName;
	}

	public MenuType getType() {
		return menuType;
	}

	public Integer getPrice() {
		return menuPrice;
	}
		
}
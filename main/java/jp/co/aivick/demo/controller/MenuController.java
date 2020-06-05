package jp.co.aivick.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import jp.co.aivick.demo.entity.Menu;
import jp.co.aivick.demo.form.MenuForm;
import jp.co.aivick.demo.service.MenuService;

@Controller
@RequestMapping("/menus")
public class MenuController{
	@Autowired
	MenuService menuService;
	
	@GetMapping("/list")
	public String list(Model model) {
		List<Menu> menus = menuService.findAll();
		model.addAttribute("menus", menus);
		
		return "menus/recipes.html";
	}
	
	@GetMapping("/create")
	public String showCreate(Model model) {
		model.addAttribute("menus", new MenuForm());
		
		return "menus/create.html";
	}
	
	@PostMapping("/create")
	public String create(@Validated MenuForm menuForm, BindingResult bindingResult) {
		if (bindingResult.hasErrors()) {
			return "menus/create.html";
		}
		
		Menu menu = new Menu(null,menuForm.getName(),menuForm.getType(),menuForm.getPrice());
		
		Menu createdMenu = menuService.create(menu);
		
		return "redirect:/menus/update/" + createdMenu.getId();
	}
	
	@GetMapping("/update/{id}")
	public String showUpdate(@PathVariable("id") String id, Model model) {
		Menu menu = menuService.findBy(id);
		MenuForm menuForm = new MenuForm();
	    menuForm.setId(menu.getId());
		menuForm.setName(menu.getName());
		menuForm.setPrice(menu.getPrice());
		menuForm.setType(menu.getType());
//		menuForm.setRecipeList(menu.getRecipeList());
		
		model.addAttribute("menuForm" ,menuForm);
		return "menus/update.html";
	}
	
	@PostMapping("/update/{id}")
	public String update(@PathVariable("id") String id, @Validated MenuForm menuForm,
	        BindingResult bindingResult) {
		if(bindingResult.hasErrors()) {
			return "menus/update.html";
		}
		
		Menu menu = new Menu(null,menuForm.getName(),menuForm.getType(),menuForm.getPrice());
		Menu updatedMenu = menuService.update(menu);
	    	
		return "redirect:/menus/update" + updatedMenu.getId();
	}
}
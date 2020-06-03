package jp.co.aivick.demo.form;

import javax.validation.constraints.NotEmpty;

public class RecipeForm {
//field	
	private Integer recipe_id;
	
	@NotEmpty
	private String recipe_name;
	@NotEmpty
	private Double cal;
//getter&setter
	public Integer getId() {
		return recipe_id;
	}
	public void setId(Integer id) {
		this.recipe_id = id;
	}
	public String getName() {
		return recipe_name;
	}
	public void setName(String name) {
		this.recipe_name = name;
	}
	public Double getCal() {
		return cal;
	}
	public void setCal(Double cal) {
		this.cal = cal;
	}
}

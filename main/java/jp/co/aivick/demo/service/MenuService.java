package jp.co.aivick.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import jp.co.aivick.demo.dao.MenuDao;
import jp.co.aivick.demo.entity.Menu;

public class MenuService{
	@Autowired
    private MenuDao menuDao;

    public Menu findBy(String id) {
        return menuDao.find(id);
    }

    public List<Menu> findAll() {
        return this.menuDao.findAll();
    }

    @Transactional
    public Menu create(Menu menu) {
        menuDao.insert(menu);
        return menu;
    }

    @Transactional
    public Menu update(Menu menu) {
        menuDao.update(menu);
        return menu;
    }
}
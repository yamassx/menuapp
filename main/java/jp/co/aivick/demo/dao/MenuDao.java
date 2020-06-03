package jp.co.aivick.demo.dao;

import java.util.List;

import org.seasar.doma.*;
import org.seasar.doma.boot.ConfigAutowireable;

import jp.co.aivick.demo.entity.Menu;

@ConfigAutowireable
@Dao
public interface MenuDao {
	
	@Select
    Menu find(String id);

    @Select
    List<Menu> findAll();

    @Insert
    int insert(Menu menu);

    @Update
    int update(Menu menu);

}

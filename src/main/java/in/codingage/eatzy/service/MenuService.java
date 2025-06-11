package in.codingage.eatzy.service;

import in.codingage.eatzy.model.Menu;

import java.util.List;

public interface MenuService {


    List<Menu> getAllMenu();
    Menu createMenu(Menu menu);
    Menu updateMenu(String id, Menu menu);
    void deleteMenu(String id);


}

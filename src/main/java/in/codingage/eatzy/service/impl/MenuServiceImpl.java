package in.codingage.eatzy.service.impl;

import in.codingage.eatzy.model.Menu;
import in.codingage.eatzy.repository.MenuRepository;
import in.codingage.eatzy.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class MenuServiceImpl implements MenuService {


    @Autowired
    private MenuRepository menuRepository;


    public List<Menu> getAllMenu() {
        return menuRepository.findAll();
    }


    public Menu createMenu(Menu menu) {
        menu.setId(null);
        return menuRepository.save(menu);
    }

    public Menu updateMenu(String id, Menu menu) {
        Optional<Menu> existingMenu = menuRepository.findById(id);
        if (existingMenu.isPresent()) {
            Menu updateMenu = existingMenu.get();
            updateMenu.setName(menu.getName());
            updateMenu.setDescription(menu.getDescription());
            updateMenu.setCategory(menu.getCategory());
            updateMenu.setPrice(menu.getPrice());
            updateMenu.setImage(menu.getImage());
            updateMenu.setType(menu.getType());
            updateMenu.setSpiceLevel(menu.getSpiceLevel());
            return menuRepository.save(updateMenu);
        } else {
            throw new RuntimeException("Menu item not found with id: " + id);
        }
    }

    public void deleteMenu(String id) {
        menuRepository.deleteById(id);
    }

}

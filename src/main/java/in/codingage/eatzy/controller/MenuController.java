package in.codingage.eatzy.controller;


import in.codingage.eatzy.model.Menu;
import in.codingage.eatzy.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Menu")
@CrossOrigin(origins = "*")
public class MenuController {


    @Autowired
    private MenuService menuService;

    @GetMapping("/all")
    public List<Menu> getAllMenu() {
        return menuService.getAllMenu();
    }

    @PostMapping("/add")
    public Menu createMenu(@RequestBody Menu menu) {
        return menuService.createMenu(menu);
    }

    @PutMapping("/updateById")
    public Menu updateMenu(@RequestParam String id, @RequestBody Menu menu) {
        return menuService.updateMenu(id, menu);
    }

    @DeleteMapping("/deleteById")
    public String deleteMenu(@RequestParam String id) {
        menuService.deleteMenu(id);
        return "Menu item deleted successfully!";
    }



}

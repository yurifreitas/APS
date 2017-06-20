/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocios;

/**
 *
 * @author APLPoloNaval
 */
public class Cardapios {
    Menu breakFastMenu;
    Menu Sandubamenu;
    // coloquei um menu a mais...
    Menu coffeMenu;
    

    public Cardapios(Menu pankakeMenu, Menu coffeMenu,Menu Sandubamenu) {
        this.breakFastMenu = pankakeMenu;
        this.coffeMenu = coffeMenu;
        this.Sandubamenu = Sandubamenu;
    }

    public void printMenu() {
        /*
        ArrayList p = this.breakFastMenu.getMenuItems();
        for (int i = 0; i < p.size(); i++) {
            MenuItem menuItem = (MenuItem) p.get(i);
            System.out.println("Name:"+menuItem.getName());
            System.out.println("Description:"+menuItem.getDescription());
            System.out.println("Vegetarian:"+menuItem.isVegetarian());
            System.out.println("Price:"+menuItem.getPrice());
            
        }
        
        MenuItem[] d = this.dinerMenu.getMenuItems();
        for (int i = 0; i < this.dinerMenu.numberOfItems; i++) {
            MenuItem menuItem = d[i];
            System.out.println("Name:"+menuItem.getName());
            System.out.println("Description:"+menuItem.getDescription());
            System.out.println("Vegetarian:"+menuItem.isVegetarian());
            System.out.println("Price:"+menuItem.getPrice());
            
            
        }*/

        Iterator panqueca = this.breakFastMenu.createIterator();
        Iterator cafe = this.coffeMenu.createIterator();
        Iterator Sanduba = this.Sandubamenu.createIterator();
        
        printMenu(panqueca);
        printMenu(cafe);
        printMenu(Sanduba);


    }

    private void printMenu(Iterator iterator) {
        while (iterator.hasNext()) {
            MenuItem menuItem = (MenuItem) iterator.next();
            System.out.println("Name:" + menuItem.getName());
            System.out.println("Description:" + menuItem.getDescription());
            System.out.println("Vegetarian:" + menuItem.isVegetarian());
            System.out.println("Price:" + menuItem.getPrice());

        }
    }
}

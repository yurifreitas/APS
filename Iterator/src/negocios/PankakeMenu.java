/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocios;

import java.util.ArrayList;

/**
 *
 * @author APLPoloNaval
 */
public class PankakeMenu  implements Menu{
    ArrayList menuItems;
    
    public PankakeMenu(){
        this.menuItems =  new ArrayList();
        
        addItem("Panquecas de ricota", "rica em proteinas", false, 26.0);
    }

 
    
    @Override
    public Iterator createIterator(){
        return new PankakeMenuIterator(this.menuItems);
    }

    private void addItem(String name, String description, boolean vegetarian, double price) {
         MenuItem menuItem =  new MenuItem(name, description, vegetarian, price);
         this.menuItems.add(menuItem);

    }
    
}

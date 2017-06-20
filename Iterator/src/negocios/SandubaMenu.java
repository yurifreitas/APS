/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocios;

import java.util.HashMap;

/**
 *
 * @author aluno
 */
public class SandubaMenu  implements Menu {
    HashMap menuItem;
    int position;

    public SandubaMenu() {
        this.menuItem = new HashMap();
        addItem("Integral", "Pao integra com alface", true, 30.0);
    }

    @Override
    public Iterator createIterator() {
        return new SandubaMenuIteratorimplements(this.menuItem);
    }

    private void addItem(String name, String description, boolean vegetarian, double price) {
        MenuItem item = new MenuItem(name, description, vegetarian, price);
        this.menuItem.put(this.position, item);
    }
}

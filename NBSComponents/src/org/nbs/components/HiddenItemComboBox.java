/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.nbs.components;

import java.io.Serializable;
import javax.swing.ComboBoxModel;
import javax.swing.JComboBox;
import org.nbs.resources.Item;

/**
 * created on Nov 16, 2015
 * @author mmh
 */
public class HiddenItemComboBox extends JComboBox<Item> implements Serializable{
private Item selectedHiddenId;
    public HiddenItemComboBox(ComboBoxModel<Item> aModel) {
        super(aModel);
    }

    public HiddenItemComboBox(Item[] items) {
        super(items);
    }


    public HiddenItemComboBox() {
    }

    public Item getSelectedHiddenId() {
        return selectedHiddenId;
    }

    public void setSelectedHiddenId(Item selectedHiddenId) {
        this.selectedHiddenId = selectedHiddenId;
    }

    @Override
    public Item getSelectedItem() {
        return (Item)super.getSelectedItem();
    }

    @Override
    public void setModel(ComboBoxModel<Item> aModel) {
        super.setModel(aModel); //To change body of generated methods, choose Tools | Templates.
    }

}

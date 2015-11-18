/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.nbs.resources;

import javax.swing.DefaultComboBoxModel;

/**
 * created on Nov 16, 2015
 *
 * @author mmh
 */
public class HiddenComboBoxModel extends DefaultComboBoxModel<Item> {

    public HiddenComboBoxModel(Item[] Items) {
        super(Items);
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.nbs.components;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.Serializable;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JToggleButton;

/**
 * created on Nov 18, 2015
 *
 * @author mmh
 */
public class SwitchBox extends JToggleButton implements Serializable {

    public SwitchBox() {
        try {
            BufferedImage bi = ImageIO.read(getClass().getResourceAsStream("/org/nbs/images/SwitchSprite.png"));

            BufferedImage subimage1 = bi.getSubimage(0, 0, 48, 21);
            BufferedImage subimage2 = bi.getSubimage(0, 59, 48, 21);
            setIcon(new ImageIcon(subimage1));
            setRolloverEnabled(false);
            setContentAreaFilled(false);
            setSelectedIcon(new ImageIcon(subimage2));
        } catch (IOException ex) {
            Logger.getLogger(SwitchBox.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}

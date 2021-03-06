package it.polimi.ingsw.client.GUI.controllers;

import it.polimi.ingsw.client.ClientAppGUI;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.util.Objects;

/**
 * NicknameController class is a controller for nickname
 */
public class NicknameController {

    private ClientAppGUI gui;

    @FXML private TextField nickname;
    @FXML public ImageView sound;

    /**
     * onButtonClick method gets the text of the nickname set from the button (GUI/client side)
     */
    @FXML
    protected void onButtonClick() {

       if(nickname.getText() != "")
           gui.getClientGUI().setNickname(nickname.getText());

    }

    /**
     * setGui method sets a GUI
     * @param gui
     */

    public void setGui(ClientAppGUI gui) {
        this.gui = gui;
    }

    /**
     * clear nickname method clears a nickname
     */
    public void clearNickname() {
        this.nickname.clear();
    }

    @FXML
    protected void onSoundClick() {
        gui.changeSound();
    }
}

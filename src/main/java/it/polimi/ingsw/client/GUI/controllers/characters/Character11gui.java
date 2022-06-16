package it.polimi.ingsw.client.GUI.controllers.characters;

import it.polimi.ingsw.client.ClientAppGUI;
import it.polimi.ingsw.model.Model;
import it.polimi.ingsw.model.enumeration.Colour;
import it.polimi.ingsw.model.gameboard.characters.Character11;
import it.polimi.ingsw.model.player.Student;
import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

import java.util.ArrayList;
import java.util.Objects;

public class Character11gui implements Character{

    @FXML public ImageView student0, student1, student2, student3;
    @FXML public Label selected0, selected1, selected2, selected3;

    int previusSelected = -1;

    private ClientAppGUI gui;
    private ArrayList<Student> students;
    private Model model;
    private Stage dialog;

    private int selectedStudent = -1;

    @FXML private Label effect;

    @FXML
    protected void onButtonClick() {

        if(selectedStudent >=0 && selectedStudent<5){
            Platform.runLater(()-> gui.getClientGUI().asyncWriteToSocket("100,11," + selectedStudent));
            dialog.close();
        }
    }

    @Override
    public void setGui(ClientAppGUI gui, Stage dialog) {
        this.gui = gui;
        this.dialog = dialog;
    }

    @Override
    public void setModel(Model model, int cardPosition){
        this.model = model;

        Character11 card = (Character11) model.getGameBoard().getThreeCharacterCards().get(cardPosition);

        students = card.getStudents();
        for(int i=0; i<students.size(); i++){
            if(i==0){
                student0.setImage(getStudentImage(students.get(0).getColour()));
            } else if(i==1){
                student1.setImage(getStudentImage(students.get(1).getColour()));
            }  else if(i==2){
                student2.setImage(getStudentImage(students.get(2).getColour()));
            }  else if(i==3){
                student3.setImage(getStudentImage(students.get(3).getColour()));
            }
        }

    }

    private Image getStudentImage(Colour colour) {
        if (colour.equals(Colour.Green))
            return new Image(Objects.requireNonNull(getClass().getResourceAsStream("/Graphics/student_green.png")));
        else if (colour.equals(Colour.Red))
            return new Image(Objects.requireNonNull(getClass().getResourceAsStream("/Graphics/student_red.png")));
        else if (colour.equals(Colour.Yellow))
            return new Image(Objects.requireNonNull(getClass().getResourceAsStream("/Graphics/student_yellow.png")));
        else if (colour.equals(Colour.Pink))
            return new Image(Objects.requireNonNull(getClass().getResourceAsStream("/Graphics/student_pink.png")));
        else if (colour.equals(Colour.Blue))
            return new Image(Objects.requireNonNull(getClass().getResourceAsStream("/Graphics/student_blue.png")));
        else return null;

    }

    @FXML
    protected void chooseStudent0() {
        removeSelected(previusSelected);
        previusSelected = 0;
        selected0.setText("°");
        selectedStudent = students.get(0).getColour().ordinal();
    }
    @FXML
    protected void chooseStudent1() {
        removeSelected(previusSelected);
        previusSelected = 1;
        selected1.setText("°");
        selectedStudent = students.get(1).getColour().ordinal();
    }
    @FXML
    protected void chooseStudent2() {
        removeSelected(previusSelected);
        previusSelected = 2;
        selected2.setText("°");
        selectedStudent = students.get(2).getColour().ordinal();
    }
    @FXML
    protected void chooseStudent3() {
        removeSelected(previusSelected);
        previusSelected = 3;
        selected3.setText("°");
        selectedStudent = students.get(3).getColour().ordinal();
    }


    private void removeSelected(int i){
        if(i == 0)
            selected0.setText("");
        else if(i == 1)
            selected1.setText("");
        else if(i == 2)
            selected2.setText("");
        else if(i == 3)
            selected3.setText("");
    }

}

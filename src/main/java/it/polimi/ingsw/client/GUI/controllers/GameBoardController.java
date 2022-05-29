package it.polimi.ingsw.client.GUI.controllers;

import it.polimi.ingsw.client.ClientAppGUI;
import it.polimi.ingsw.model.Model;
import it.polimi.ingsw.model.enumeration.Colour;
import it.polimi.ingsw.model.enumeration.TowerColour;
import it.polimi.ingsw.model.gameboard.Cloud;
import it.polimi.ingsw.model.gameboard.Island;
import it.polimi.ingsw.model.player.Player;
import it.polimi.ingsw.model.player.Professor;
import it.polimi.ingsw.model.player.Student;
import it.polimi.ingsw.model.player.Tower;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import java.util.Objects;

public class GameBoardController {


    private ClientAppGUI gui;
    private Colour choice;
    private Model model;
    private String nickname;
    private Player myPlayer;

    int alreadyUsed = 0;

    @FXML public Pane schoolBoard0, schoolBoard1 ,schoolBoard2, cloud0, cloud1, cloud2;
    @FXML public Pane island0, island1, island2, island3, island4, island5, island6, island7, island8, island9, island10, island11;
    @FXML public ImageView cloudStudent00, cloudStudent01, cloudStudent02, cloudStudent03, cloudStudent10, cloudStudent11, cloudStudent12, cloudStudent13, cloudStudent20, cloudStudent21, cloudStudent22, cloudStudent23;

    // PLAYER 0
    @FXML public ImageView entrance00, entrance01, entrance02, entrance03, entrance04, entrance05, entrance06, entrance07, entrance08;
    @FXML public ImageView green00, green01, green02, green03, green04, green05, green06, green07, green08, green09;
    @FXML public ImageView red00, red01, red02, red03, red04, red05, red06, red07, red08, red09;
    @FXML public ImageView yellow00, yellow01, yellow02, yellow03, yellow04, yellow05, yellow06, yellow07, yellow08, yellow09;
    @FXML public ImageView pink00, pink01, pink02, pink03, pink04, pink05, pink06, pink07, pink08, pink09;
    @FXML public ImageView blue00, blue01, blue02, blue03, blue04, blue05, blue06, blue07, blue08, blue09;
    @FXML public ImageView greenProf0, redProf0, yellowProf0, pinkProf0, blueProf0;
    @FXML public ImageView tower00, tower01, tower02, tower03, tower04, tower05, tower06, tower07;
    // PLAYER 1
    @FXML public ImageView entrance10, entrance11, entrance12, entrance13, entrance14, entrance15, entrance16, entrance17, entrance18;
    @FXML public ImageView green10, green11, green12, green13, green14, green15, green16, green17, green18, green19;
    @FXML public ImageView red10, red11, red12, red13, red14, red15, red16, red17, red18, red19;
    @FXML public ImageView yellow10, yellow11, yellow12, yellow13, yellow14, yellow15, yellow16, yellow17, yellow18, yellow19;
    @FXML public ImageView pink10, pink11, pink12, pink13, pink14, pink15, pink16, pink17, pink18, pink19;
    @FXML public ImageView blue10, blue11, blue12, blue13, blue14, blue15, blue16, blue17, blue18, blue19;
    @FXML public ImageView greenProf1, redProf1, yellowProf1, pinkProf1, blueProf1;
    @FXML public ImageView tower10, tower11, tower12, tower13, tower14, tower15, tower16, tower17;
    // PLAYER 2
    @FXML public ImageView entrance20, entrance21, entrance22, entrance23, entrance24, entrance25, entrance26, entrance27, entrance28;
    @FXML public ImageView green20, green21, green22, green23, green24, green25, green26, green27, green28, green29;
    @FXML public ImageView red20, red21, red22, red23, red24, red25, red26, red27, red28, red29;
    @FXML public ImageView yellow20, yellow21, yellow22, yellow23, yellow24, yellow25, yellow26, yellow27, yellow28, yellow29;
    @FXML public ImageView pink20, pink21, pink22, pink23, pink24, pink25, pink26, pink27, pink28, pink29;
    @FXML public ImageView blue20, blue21, blue22, blue23, blue24, blue25, blue26, blue27, blue28, blue29;
    @FXML public ImageView greenProf2, redProf2, yellowProf2, pinkProf2, blueProf2;
    @FXML public ImageView tower20, tower21, tower22, tower23, tower24, tower25, tower26, tower27;


    @FXML public ImageView greenIsland0, redIsland0, yellowIsland0, pinkIsland0, blueIsland0, towerIsland0, mothernature0;
    @FXML public Label greenText0, redText0, yellowText0, pinkText0, blueText0, towerText0;
    @FXML public ImageView greenIsland1, redIsland1, yellowIsland1, pinkIsland1, blueIsland1, towerIsland1, mothernature1;
    @FXML public Label greenText1, redText1, yellowText1, pinkText1, blueText1, towerText1;
    @FXML public ImageView greenIsland2, redIsland2, yellowIsland2, pinkIsland2, blueIsland2, towerIsland2, mothernature2;
    @FXML public Label greenText2, redText2, yellowText2, pinkText2, blueText2, towerText2;
    @FXML public ImageView greenIsland3, redIsland3, yellowIsland3, pinkIsland3, blueIsland3, towerIsland3, mothernature3;
    @FXML public Label greenText3, redText3, yellowText3, pinkText3, blueText3, towerText3;
    @FXML public ImageView greenIsland4, redIsland4, yellowIsland4, pinkIsland4, blueIsland4, towerIsland4, mothernature4;
    @FXML public Label greenText4, redText4, yellowText4, pinkText4, blueText4, towerText4;
    @FXML public ImageView greenIsland5, redIsland5, yellowIsland5, pinkIsland5, blueIsland5, towerIsland5, mothernature5;
    @FXML public Label greenText5, redText5, yellowText5, pinkText5, blueText5, towerText5;
    @FXML public ImageView greenIsland6, redIsland6, yellowIsland6, pinkIsland6, blueIsland6, towerIsland6, mothernature6;
    @FXML public Label greenText6, redText6, yellowText6, pinkText6, blueText6, towerText6;
    @FXML public ImageView greenIsland7, redIsland7, yellowIsland7, pinkIsland7, blueIsland7, towerIsland7, mothernature7;
    @FXML public Label greenText7, redText7, yellowText7, pinkText7, blueText7, towerText7;
    @FXML public ImageView greenIsland8, redIsland8, yellowIsland8, pinkIsland8, blueIsland8, towerIsland8, mothernature8;
    @FXML public Label greenText8, redText8, yellowText8, pinkText8, blueText8, towerText8;
    @FXML public ImageView greenIsland9, redIsland9, yellowIsland9, pinkIsland9, blueIsland9, towerIsland9, mothernature9;
    @FXML public Label greenText9, redText9, yellowText9, pinkText9, blueText9, towerText9;
    @FXML public ImageView greenIsland10, redIsland10, yellowIsland10, pinkIsland10, blueIsland10, towerIsland10, mothernature10;
    @FXML public Label greenText10, redText10, yellowText10, pinkText10, blueText10, towerText10;
    @FXML public ImageView greenIsland11, redIsland11, yellowIsland11, pinkIsland11, blueIsland11, towerIsland11, mothernature11;
    @FXML public Label greenText11, redText11, yellowText11, pinkText11, blueText11, towerText11;

    @FXML
    protected void diningRoomGreen() {}
    @FXML
    protected void diningRoomRed() {}
    @FXML
    protected void diningRoomYellow() {}
    @FXML
    protected void diningRoomPink() {}
    @FXML
    protected void diningRoomBlue() {}

    private void update() {
        schoolBoard0.setVisible(true);
        schoolBoard1.setVisible(true);
        cloud0.setVisible(true);
        cloud1.setVisible(true);
        if(model.getPlayers().size() > 2){
            schoolBoard2.setVisible(true);
            cloud2.setVisible(true);
        }

        alreadyUsed = 0;
        for (Player p : model.getPlayers()) {
            if (p.getNickname().equals(nickname)) {
                myPlayer = p;
                updatePlayerSchoolBoard(p, true);
            } else {
                updatePlayerSchoolBoard(p, false);
                alreadyUsed++;
            }
        }

        int[] deletedIslands = new int[12];
        for(int n=0; n<12; n++){
            deletedIslands[n] = 0;
        }
        for(Island i : model.getGameBoard().getIslands()){
            if(i.getIslandIndex() == 0){
                updateisland0(i);
                deletedIslands[0] = 1;
            } else if(i.getIslandIndex() == 1){
                updateisland1(i);
                deletedIslands[1] = 1;
            } else if(i.getIslandIndex() == 2){
                updateisland2(i);
                deletedIslands[2] = 1;
            } else if(i.getIslandIndex() == 3){
                updateisland3(i);
                deletedIslands[3] = 1;
            }  else if(i.getIslandIndex() == 4){
                updateisland4(i);
                deletedIslands[4] = 1;
            }  else if(i.getIslandIndex() == 5){
                updateisland5(i);
                deletedIslands[5] = 1;
            }  else if(i.getIslandIndex() == 6){
                updateisland6(i);
                deletedIslands[6] = 1;
            }  else if(i.getIslandIndex() == 7){
                updateisland7(i);
                deletedIslands[7] = 1;
            }  else if(i.getIslandIndex() == 8){
                updateisland8(i);
                deletedIslands[8] = 1;
            }  else if(i.getIslandIndex() == 9){
                updateisland9(i);
                deletedIslands[9] = 1;
            }  else if(i.getIslandIndex() == 10){
                updateisland10(i);
                deletedIslands[10] = 1;
            }  else if(i.getIslandIndex() == 11){
                updateisland11(i);
                deletedIslands[11] = 1;
            }
        }

        for(int is=0; is<12; is++){
            if(deletedIslands[is] == 0){
                switch (is) {
                    case 0 -> island0.setVisible(false);
                    case 1 -> island1.setVisible(false);
                    case 2 -> island2.setVisible(false);
                    case 3 -> island3.setVisible(false);
                    case 4 -> island4.setVisible(false);
                    case 5 -> island5.setVisible(false);
                    case 6 -> island6.setVisible(false);
                    case 7 -> island7.setVisible(false);
                    case 8 -> island8.setVisible(false);
                    case 9 -> island9.setVisible(false);
                    case 10 -> island10.setVisible(false);
                    case 11 -> island11.setVisible(false);
                }
            }
        }
        int n=0;
        for(Cloud c: model.getGameBoard().getClouds()){
            if(n==0){
                setCloud(c.seeStudents().get(0).getColour(), cloudStudent00);
                setCloud(c.seeStudents().get(1).getColour(), cloudStudent01);
                setCloud(c.seeStudents().get(2).getColour(), cloudStudent02);
                if(model.getPlayers().size() ==3)
                    setCloud(c.seeStudents().get(3).getColour(), cloudStudent03);
            } else if(n==1){
                setCloud(c.seeStudents().get(0).getColour(), cloudStudent10);
                setCloud(c.seeStudents().get(1).getColour(), cloudStudent11);
                setCloud(c.seeStudents().get(2).getColour(), cloudStudent12);
                if(model.getPlayers().size() ==3)
                    setCloud(c.seeStudents().get(3).getColour(), cloudStudent13);
            } else if(n==2){
                setCloud(c.seeStudents().get(0).getColour(), cloudStudent20);
                setCloud(c.seeStudents().get(1).getColour(), cloudStudent21);
                setCloud(c.seeStudents().get(2).getColour(), cloudStudent22);
                if(model.getPlayers().size() ==3)
                    setCloud(c.seeStudents().get(3).getColour(), cloudStudent23);
            }
            n++;
        }
    }

    public void setGui(ClientAppGUI gui) {
        this.gui = gui;
        schoolBoard0.setVisible(false);
        schoolBoard1.setVisible(false);
        schoolBoard2.setVisible(false);
        cloud0.setVisible(false);
        cloud1.setVisible(false);
        cloud2.setVisible(false);
    }


    public void setModel(Model model) {
        this.model = model;
        System.out.println("Ricevuto il model");
        update();
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }


   protected void chooseIsland1(){
        String student = getColorString(choice);
        gui.getClientGUI().asyncWriteToSocket(student + ",1");

    }

    protected void chooseDiningRoom(){
        String student = getColorString(choice);
        gui.getClientGUI().asyncWriteToSocket(student);
    }

    private String getColorString(Colour color){
        int col = color.ordinal();
        return switch (col) {
            case 0 -> "0";
            case 1 -> "1";
            case 2 -> "2";
            case 3 -> "3";
            case 4 -> "4";
            default -> null;
        };
    }

    @FXML
    protected void chooseStudent0(){
        choice = myPlayer.getPlayerSchoolBoard().getStudentsEntrance().get(0).getColour();
        System.out.println("studente 0: " + choice);

    }
    @FXML
    protected void chooseStudent1(){
        choice = myPlayer.getPlayerSchoolBoard().getStudentsEntrance().get(1).getColour();
        System.out.println("studente 1: " + choice);
    }
    @FXML
    protected void chooseStudent2(){
        choice = myPlayer.getPlayerSchoolBoard().getStudentsEntrance().get(2).getColour();
        System.out.println("studente 2: " + choice);
    }
    @FXML
    protected void chooseStudent3(){
        choice = myPlayer.getPlayerSchoolBoard().getStudentsEntrance().get(3).getColour();
        System.out.println("studente 3: " + choice);
    }
    @FXML
    protected void chooseStudent4(){
        if(entrance04.getImage() != null){
            choice = myPlayer.getPlayerSchoolBoard().getStudentsEntrance().get(4).getColour();
            System.out.println("studente 4: " + choice);
        }
    }
    @FXML
    protected void chooseStudent5(){
        if(entrance05.getImage() != null){
            choice = myPlayer.getPlayerSchoolBoard().getStudentsEntrance().get(5).getColour();
            System.out.println("studente 5: " + choice);
        }
    }
    @FXML
    protected void chooseStudent6(){
        if(entrance06.getImage() != null){
            choice = myPlayer.getPlayerSchoolBoard().getStudentsEntrance().get(6).getColour();
            System.out.println("studente 6: " + choice);
        }
    }

    @FXML
    protected void chooseStudent7(){
        if(entrance07.getImage() != null){
            choice = myPlayer.getPlayerSchoolBoard().getStudentsEntrance().get(7).getColour();
            System.out.println("studente 7: " + choice);
        }
    }
    @FXML
    protected void chooseStudent8(){
        if(entrance08.getImage() != null){
            choice = myPlayer.getPlayerSchoolBoard().getStudentsEntrance().get(8).getColour();
            System.out.println("studente 8: " + choice);
        }
    }















    //PLAYER SCHOOLBOARD
    private void updatePlayerSchoolBoard(Player p, boolean mainPlayer){
        int i, k = 0;
        for (Student s : p.getPlayerSchoolBoard().getStudentsEntrance()) {
            setEntrance(k, s.getColour(), mainPlayer);
            k++;
        }
        for(int t=k; t < 9; t++){
            getEntrance(t, mainPlayer).setImage(null);
        }

        int green = p.getPlayerSchoolBoard().getDiningRoom().numOfStudentByColor(Colour.Green);
        for (i = 0; i < green; i++)
            getGreen(i, mainPlayer).setVisible(true);
        for (int j = i; j < 10; j++)
            getGreen(j, mainPlayer).setVisible(false);

        int red = p.getPlayerSchoolBoard().getDiningRoom().numOfStudentByColor(Colour.Green);
        for (i = 0; i < red; i++)
            getRed(i, mainPlayer).setVisible(true);
        for (int j = i; j < 10; j++)
            getRed(j, mainPlayer).setVisible(false);

        int yellow = p.getPlayerSchoolBoard().getDiningRoom().numOfStudentByColor(Colour.Green);
        for (i = 0; i < yellow; i++)
            getYellow(i, mainPlayer).setVisible(true);
        for (int j = i; j < 10; j++)
            getYellow(j, mainPlayer).setVisible(false);

        int pink = p.getPlayerSchoolBoard().getDiningRoom().numOfStudentByColor(Colour.Green);
        for (i = 0; i < pink; i++)
            getPink(i, mainPlayer).setVisible(true);
        for (int j = i; j < 10; j++)
            getPink(j, mainPlayer).setVisible(false);

        int blue = p.getPlayerSchoolBoard().getDiningRoom().numOfStudentByColor(Colour.Green);
        for (i = 0; i < blue; i++)
            getBlue(i, mainPlayer).setVisible(true);
        for (int j = i; j < 10; j++)
            getBlue(j, mainPlayer).setVisible(false);

        k = 0;
        for (Professor pr : p.getPlayerSchoolBoard().getProfessors()) {
            setProfessor(k, pr.getProfessorColour(), mainPlayer);
            k++;
        }
        for(int t=k; t < 5; t++){
            getProfessor(t, mainPlayer).setImage(null);
        }

        k = 0;
        for (Tower tr : p.getPlayerSchoolBoard().getTowers()) {
            setTower(k, tr.getTowerColor(), mainPlayer);
            k++;
        }
        for(int t=k; t < 8; t++){
            getTower(t, mainPlayer).setImage(null);
        }
    }
    private void setEntrance(int i, Colour colour, boolean mainPlayer) {
        if (colour.equals(Colour.Green))
            getEntrance(i, mainPlayer).setImage(new Image(Objects.requireNonNull(getClass().getResourceAsStream("/Graphics/student_green.png"))));
        else if (colour.equals(Colour.Red))
            getEntrance(i, mainPlayer).setImage(new Image(Objects.requireNonNull(getClass().getResourceAsStream("/Graphics/student_red.png"))));
        else if (colour.equals(Colour.Yellow))
            getEntrance(i, mainPlayer).setImage(new Image(Objects.requireNonNull(getClass().getResourceAsStream("/Graphics/student_yellow.png"))));
        else if (colour.equals(Colour.Pink))
            getEntrance(i, mainPlayer).setImage(new Image(Objects.requireNonNull(getClass().getResourceAsStream("/Graphics/student_pink.png"))));
        else if (colour.equals(Colour.Blue))
            getEntrance(i, mainPlayer).setImage(new Image(Objects.requireNonNull(getClass().getResourceAsStream("/Graphics/student_blue.png"))));

    }
    private void setProfessor(int i, Colour colour, boolean mainPlayer) {
        if (colour.equals(Colour.Green))
            getProfessor(i, mainPlayer).setImage(new Image(Objects.requireNonNull(getClass().getResourceAsStream("/Graphics/teacher_green.png"))));
        else if (colour.equals(Colour.Red))
            getProfessor(i, mainPlayer).setImage(new Image(Objects.requireNonNull(getClass().getResourceAsStream("/Graphics/teacher_red.png"))));
        else if (colour.equals(Colour.Yellow))
            getProfessor(i, mainPlayer).setImage(new Image(Objects.requireNonNull(getClass().getResourceAsStream("/Graphics/teacher_yellow.png"))));
        else if (colour.equals(Colour.Pink))
            getProfessor(i, mainPlayer).setImage(new Image(Objects.requireNonNull(getClass().getResourceAsStream("/Graphics/teacher_pink.png"))));
        else if (colour.equals(Colour.Blue))
            getProfessor(i, mainPlayer).setImage(new Image(Objects.requireNonNull(getClass().getResourceAsStream("/Graphics/teacher_blue.png"))));

    }
    private void setTower(int i, TowerColour colour, boolean mainPlayer) {
        if (colour.equals(TowerColour.Black))
            getTower(i, mainPlayer).setImage(new Image(Objects.requireNonNull(getClass().getResourceAsStream("/Graphics/black_tower.png"))));
        else if (colour.equals(TowerColour.White))
            getTower(i, mainPlayer).setImage(new Image(Objects.requireNonNull(getClass().getResourceAsStream("/Graphics/white_tower.png"))));
        else if (colour.equals(TowerColour.Grey))
            getTower(i, mainPlayer).setImage(new Image(Objects.requireNonNull(getClass().getResourceAsStream("/Graphics/grey_tower.png"))));

    }

    private void setCloud(Colour colour, ImageView img) {
        if (colour.equals(Colour.Green))
            img.setImage(new Image(Objects.requireNonNull(getClass().getResourceAsStream("/Graphics/student_green.png"))));
        else if (colour.equals(Colour.Red))
            img.setImage(new Image(Objects.requireNonNull(getClass().getResourceAsStream("/Graphics/student_red.png"))));
        else if (colour.equals(Colour.Yellow))
            img.setImage(new Image(Objects.requireNonNull(getClass().getResourceAsStream("/Graphics/student_yellow.png"))));
        else if (colour.equals(Colour.Pink))
            img.setImage(new Image(Objects.requireNonNull(getClass().getResourceAsStream("/Graphics/student_pink.png"))));
        else if (colour.equals(Colour.Blue))
            img.setImage(new Image(Objects.requireNonNull(getClass().getResourceAsStream("/Graphics/student_blue.png"))));

    }

    private ImageView getGreen(int pos, boolean mainPlayer) {
        if(mainPlayer){
            return switch (pos) {
                case 0 -> green00;
                case 1 -> green01;
                case 2 -> green02;
                case 3 -> green03;
                case 4 -> green04;
                case 5 -> green05;
                case 6 -> green06;
                case 7 -> green07;
                case 8 -> green08;
                case 9 -> green09;
                default -> null;
            };
        } else if(alreadyUsed == 0){
            return switch (pos) {
                case 0 -> green10;
                case 1 -> green11;
                case 2 -> green12;
                case 3 -> green13;
                case 4 -> green14;
                case 5 -> green15;
                case 6 -> green16;
                case 7 -> green17;
                case 8 -> green18;
                case 9 -> green19;
                default -> null;
            };
        } else {
            return switch (pos) {
                case 0 -> green20;
                case 1 -> green21;
                case 2 -> green22;
                case 3 -> green23;
                case 4 -> green24;
                case 5 -> green25;
                case 6 -> green26;
                case 7 -> green27;
                case 8 -> green28;
                case 9 -> green29;
                default -> null;
            };
        }
    }
    private ImageView getRed(int pos, boolean mainPlayer) {
        if(mainPlayer){
            return switch (pos) {
                case 0 -> red00;
                case 1 -> red01;
                case 2 -> red02;
                case 3 -> red03;
                case 4 -> red04;
                case 5 -> red05;
                case 6 -> red06;
                case 7 -> red07;
                case 8 -> red08;
                case 9 -> red09;
                default -> null;
            };
        } else if(alreadyUsed == 0){
            return switch (pos) {
                case 0 -> red10;
                case 1 -> red11;
                case 2 -> red12;
                case 3 -> red13;
                case 4 -> red14;
                case 5 -> red15;
                case 6 -> red16;
                case 7 -> red17;
                case 8 -> red18;
                case 9 -> red19;
                default -> null;
            };
        } else {
            return switch (pos) {
                case 0 -> red20;
                case 1 -> red21;
                case 2 -> red22;
                case 3 -> red23;
                case 4 -> red24;
                case 5 -> red25;
                case 6 -> red26;
                case 7 -> red27;
                case 8 -> red28;
                case 9 -> red29;
                default -> null;
            };
        }
    }
    private ImageView getYellow(int pos, boolean mainPlayer) {
        if(mainPlayer){
            return switch (pos) {
                case 0 -> yellow00;
                case 1 -> yellow01;
                case 2 -> yellow02;
                case 3 -> yellow03;
                case 4 -> yellow04;
                case 5 -> yellow05;
                case 6 -> yellow06;
                case 7 -> yellow07;
                case 8 -> yellow08;
                case 9 -> yellow09;
                default -> null;
            };
        } else if(alreadyUsed == 0){
            return switch (pos) {
                case 0 -> yellow10;
                case 1 -> yellow11;
                case 2 -> yellow12;
                case 3 -> yellow13;
                case 4 -> yellow14;
                case 5 -> yellow15;
                case 6 -> yellow16;
                case 7 -> yellow17;
                case 8 -> yellow18;
                case 9 -> yellow19;
                default -> null;
            };
        } else {
            return switch (pos) {
                case 0 -> yellow20;
                case 1 -> yellow21;
                case 2 -> yellow22;
                case 3 -> yellow23;
                case 4 -> yellow24;
                case 5 -> yellow25;
                case 6 -> yellow26;
                case 7 -> yellow27;
                case 8 -> yellow28;
                case 9 -> yellow29;
                default -> null;
            };
        }
    }
    private ImageView getPink(int pos, boolean mainPlayer) {
        if(mainPlayer){
            return switch (pos) {
                case 0 -> pink00;
                case 1 -> pink01;
                case 2 -> pink02;
                case 3 -> pink03;
                case 4 -> pink04;
                case 5 -> pink05;
                case 6 -> pink06;
                case 7 -> pink07;
                case 8 -> pink08;
                case 9 -> pink09;
                default -> null;
            };
        } else if(alreadyUsed == 0){
            return switch (pos) {
                case 0 -> pink10;
                case 1 -> pink11;
                case 2 -> pink12;
                case 3 -> pink13;
                case 4 -> pink14;
                case 5 -> pink15;
                case 6 -> pink16;
                case 7 -> pink17;
                case 8 -> pink18;
                case 9 -> pink19;
                default -> null;
            };
        } else {
            return switch (pos) {
                case 0 -> pink20;
                case 1 -> pink21;
                case 2 -> pink22;
                case 3 -> pink23;
                case 4 -> pink24;
                case 5 -> pink25;
                case 6 -> pink26;
                case 7 -> pink27;
                case 8 -> pink28;
                case 9 -> pink29;
                default -> null;
            };
        }

    }
    private ImageView getBlue(int pos, boolean mainPlayer) {
        if(mainPlayer){
            return switch (pos) {
                case 0 -> blue00;
                case 1 -> blue01;
                case 2 -> blue02;
                case 3 -> blue03;
                case 4 -> blue04;
                case 5 -> blue05;
                case 6 -> blue06;
                case 7 -> blue07;
                case 8 -> blue08;
                case 9 -> blue09;
                default -> null;
            };
        } else if(alreadyUsed == 0){
            return switch (pos) {
                case 0 -> blue10;
                case 1 -> blue11;
                case 2 -> blue12;
                case 3 -> blue13;
                case 4 -> blue14;
                case 5 -> blue15;
                case 6 -> blue16;
                case 7 -> blue17;
                case 8 -> blue18;
                case 9 -> blue19;
                default -> null;
            };
        } else {
            return switch (pos) {
                case 0 -> blue20;
                case 1 -> blue21;
                case 2 -> blue22;
                case 3 -> blue23;
                case 4 -> blue24;
                case 5 -> blue25;
                case 6 -> blue26;
                case 7 -> blue27;
                case 8 -> blue28;
                case 9 -> blue29;
                default -> null;
            };
        }
    }
    private ImageView getEntrance(int pos, boolean mainPlayer) {
        if(mainPlayer){
            return switch (pos) {
                case 0 -> entrance00;
                case 1 -> entrance01;
                case 2 -> entrance02;
                case 3 -> entrance03;
                case 4 -> entrance04;
                case 5 -> entrance05;
                case 6 -> entrance06;
                case 7 -> entrance07;
                case 8 -> entrance08;
                default -> null;
            };
        } else if(alreadyUsed == 0){
            return switch (pos) {
                case 0 -> entrance10;
                case 1 -> entrance11;
                case 2 -> entrance12;
                case 3 -> entrance13;
                case 4 -> entrance14;
                case 5 -> entrance15;
                case 6 -> entrance16;
                case 7 -> entrance17;
                case 8 -> entrance18;
                default -> null;
            };
        } else {
            return switch (pos) {
                case 0 -> entrance20;
                case 1 -> entrance21;
                case 2 -> entrance22;
                case 3 -> entrance23;
                case 4 -> entrance24;
                case 5 -> entrance25;
                case 6 -> entrance26;
                case 7 -> entrance27;
                case 8 -> entrance28;
                default -> null;
            };
        }
    }
    private ImageView getProfessor(int pos, boolean mainPlayer) {
        if(mainPlayer){
            return switch (pos) {
                case 0 -> greenProf0;
                case 1 -> redProf0;
                case 2 -> yellowProf0;
                case 3 -> pinkProf0;
                case 4 -> blueProf0;
                default -> null;
            };
        } else if(alreadyUsed == 0){
            return switch (pos) {
                case 0 -> greenProf1;
                case 1 -> redProf1;
                case 2 -> yellowProf1;
                case 3 -> pinkProf1;
                case 4 -> blueProf1;
                default -> null;
            };
        } else {
            return switch (pos) {
                case 0 -> greenProf2;
                case 1 -> redProf2;
                case 2 -> yellowProf2;
                case 3 -> pinkProf2;
                case 4 -> blueProf2;
                default -> null;
            };
        }

    }
    private ImageView getTower(int pos, boolean mainPlayer) {
        if(mainPlayer){
            return switch (pos) {
                case 0 -> tower00;
                case 1 -> tower01;
                case 2 -> tower02;
                case 3 -> tower03;
                case 4 -> tower04;
                case 5 -> tower05;
                case 6 -> tower06;
                case 7 -> tower07;
                default -> null;
            };
        } else if(alreadyUsed == 0){
            return switch (pos) {
                case 0 -> tower10;
                case 1 -> tower11;
                case 2 -> tower12;
                case 3 -> tower13;
                case 4 -> tower14;
                case 5 -> tower15;
                case 6 -> tower16;
                case 7 -> tower17;
                default -> null;
            };
        } else {
            return switch (pos) {
                case 0 -> tower20;
                case 1 -> tower21;
                case 2 -> tower22;
                case 3 -> tower23;
                case 4 -> tower24;
                case 5 -> tower25;
                case 6 -> tower26;
                case 7 -> tower27;
                default -> null;
            };
        }
    }

   private void updateisland0(Island i){
       int green=0, red=0, yellow=0, pink=0, blue=0;
       for(Student s: i.getStudents()){
           if(s.getColour().ordinal() == 0)
               green++;
           else if (s.getColour().ordinal() == 1)
               red++;
           else if (s.getColour().ordinal() == 2)
               yellow++;
           else if (s.getColour().ordinal() == 3)
               pink++;
           else if (s.getColour().ordinal() == 4)
               blue++;
       }
       if(green == 0){
           greenIsland0.setVisible(false);
           greenText0.setVisible(false);
       } else {
           greenIsland0.setVisible(true);
           greenText0.setVisible(true);
           greenText0.setText(String.valueOf(green));
       }
       if(red == 0){
           redIsland0.setVisible(false);
           redText0.setVisible(false);
       } else {
           redIsland0.setVisible(true);
           redText0.setVisible(true);
           redText0.setText(String.valueOf(red));
       }
       if(yellow == 0){
           yellowIsland0.setVisible(false);
           yellowText0.setVisible(false);
       } else {
           yellowIsland0.setVisible(true);
           yellowText0.setVisible(true);
           yellowText0.setText(String.valueOf(yellow));
       }
       if(pink == 0){
           pinkIsland0.setVisible(false);
           pinkText0.setVisible(false);
       } else {
           pinkIsland0.setVisible(true);
           pinkText0.setVisible(true);
           pinkText0.setText(String.valueOf(pink));
       }
       if(blue == 0){
           blueIsland0.setVisible(false);
           blueText0.setVisible(false);
       } else {
           blueIsland0.setVisible(true);
           blueText0.setVisible(true);
           blueText0.setText(String.valueOf(blue));
       }

       if(i.getNumTower() == 0){
           towerIsland0.setImage(null);
           towerText0.setVisible(false);
       } else {
           if(i.getTowerColor().equals(TowerColour.Black))
               towerIsland0.setImage(new Image(Objects.requireNonNull(getClass().getResourceAsStream("/Graphics/black_tower.png"))));
           else if (i.getTowerColor().equals(TowerColour.White)) {
               towerIsland0.setImage(new Image(Objects.requireNonNull(getClass().getResourceAsStream("/Graphics/white_tower.png"))));
           } else if (i.getTowerColor().equals(TowerColour.Grey)) {
               towerIsland0.setImage(new Image(Objects.requireNonNull(getClass().getResourceAsStream("/Graphics/grey_tower.png"))));
           }
           towerText0.setVisible(true);
           towerText0.setText(String.valueOf(i.getNumTower()));
       }

       mothernature0.setVisible(model.getGameBoard().getMotherNature() == 0);
   }
    private void updateisland1(Island i){
        int green=0, red=0, yellow=0, pink=0, blue=0;
        for(Student s: i.getStudents()){
            if(s.getColour().ordinal() == 0)
                green++;
            else if (s.getColour().ordinal() == 1)
                red++;
            else if (s.getColour().ordinal() == 2)
                yellow++;
            else if (s.getColour().ordinal() == 3)
                pink++;
            else if (s.getColour().ordinal() == 4)
                blue++;
        }
        if(green == 0){
            greenIsland1.setVisible(false);
            greenText1.setVisible(false);
        } else {
            greenIsland1.setVisible(true);
            greenText1.setVisible(true);
            greenText1.setText(String.valueOf(green));
        }
        if(red == 0){
            redIsland1.setVisible(false);
            redText1.setVisible(false);
        } else {
            redIsland1.setVisible(true);
            redText1.setVisible(true);
            redText1.setText(String.valueOf(red));
        }
        if(yellow == 0){
            yellowIsland1.setVisible(false);
            yellowText1.setVisible(false);
        } else {
            yellowIsland1.setVisible(true);
            yellowText1.setVisible(true);
            yellowText1.setText(String.valueOf(yellow));
        }
        if(pink == 0){
            pinkIsland1.setVisible(false);
            pinkText1.setVisible(false);
        } else {
            pinkIsland1.setVisible(true);
            pinkText1.setVisible(true);
            pinkText1.setText(String.valueOf(pink));
        }
        if(blue == 0){
            blueIsland1.setVisible(false);
            blueText1.setVisible(false);
        } else {
            blueIsland1.setVisible(true);
            blueText1.setVisible(true);
            blueText1.setText(String.valueOf(blue));
        }

        if(i.getNumTower() == 0){
            towerIsland1.setImage(null);
            towerText1.setVisible(false);
        } else {
            if(i.getTowerColor().equals(TowerColour.Black))
                towerIsland1.setImage(new Image(Objects.requireNonNull(getClass().getResourceAsStream("/Graphics/black_tower.png"))));
            else if (i.getTowerColor().equals(TowerColour.White)) {
                towerIsland1.setImage(new Image(Objects.requireNonNull(getClass().getResourceAsStream("/Graphics/white_tower.png"))));
            } else if (i.getTowerColor().equals(TowerColour.Grey)) {
                towerIsland1.setImage(new Image(Objects.requireNonNull(getClass().getResourceAsStream("/Graphics/grey_tower.png"))));
            }
            towerText1.setVisible(true);
            towerText1.setText(String.valueOf(i.getNumTower()));
        }

        mothernature1.setVisible(model.getGameBoard().getMotherNature() == 1);
    }
    private void updateisland2(Island i){
        int green=0, red=0, yellow=0, pink=0, blue=0;
        for(Student s: i.getStudents()){
            if(s.getColour().ordinal() == 0)
                green++;
            else if (s.getColour().ordinal() == 1)
                red++;
            else if (s.getColour().ordinal() == 2)
                yellow++;
            else if (s.getColour().ordinal() == 3)
                pink++;
            else if (s.getColour().ordinal() == 4)
                blue++;
        }
        if(green == 0){
            greenIsland2.setVisible(false);
            greenText2.setVisible(false);
        } else {
            greenIsland2.setVisible(true);
            greenText2.setVisible(true);
            greenText2.setText(String.valueOf(green));
        }
        if(red == 0){
            redIsland2.setVisible(false);
            redText2.setVisible(false);
        } else {
            redIsland2.setVisible(true);
            redText2.setVisible(true);
            redText2.setText(String.valueOf(red));
        }
        if(yellow == 0){
            yellowIsland2.setVisible(false);
            yellowText2.setVisible(false);
        } else {
            yellowIsland2.setVisible(true);
            yellowText2.setVisible(true);
            yellowText2.setText(String.valueOf(yellow));
        }
        if(pink == 0){
            pinkIsland2.setVisible(false);
            pinkText2.setVisible(false);
        } else {
            pinkIsland2.setVisible(true);
            pinkText2.setVisible(true);
            pinkText2.setText(String.valueOf(pink));
        }
        if(blue == 0){
            blueIsland2.setVisible(false);
            blueText2.setVisible(false);
        } else {
            blueIsland2.setVisible(true);
            blueText2.setVisible(true);
            blueText2.setText(String.valueOf(blue));
        }

        if(i.getNumTower() == 0){
            towerIsland2.setImage(null);
            towerText2.setVisible(false);
        } else {
            if(i.getTowerColor().equals(TowerColour.Black))
                towerIsland2.setImage(new Image(Objects.requireNonNull(getClass().getResourceAsStream("/Graphics/black_tower.png"))));
            else if (i.getTowerColor().equals(TowerColour.White)) {
                towerIsland2.setImage(new Image(Objects.requireNonNull(getClass().getResourceAsStream("/Graphics/white_tower.png"))));
            } else if (i.getTowerColor().equals(TowerColour.Grey)) {
                towerIsland2.setImage(new Image(Objects.requireNonNull(getClass().getResourceAsStream("/Graphics/grey_tower.png"))));
            }
            towerText2.setVisible(true);
            towerText2.setText(String.valueOf(i.getNumTower()));
        }

        mothernature2.setVisible(model.getGameBoard().getMotherNature() == 2);
    }

    private void updateisland3(Island i){
        int green=0, red=0, yellow=0, pink=0, blue=0;
        for(Student s: i.getStudents()){
            if(s.getColour().ordinal() == 0)
                green++;
            else if (s.getColour().ordinal() == 1)
                red++;
            else if (s.getColour().ordinal() == 2)
                yellow++;
            else if (s.getColour().ordinal() == 3)
                pink++;
            else if (s.getColour().ordinal() == 4)
                blue++;
        }
        if(green == 0){
            greenIsland3.setVisible(false);
            greenText3.setVisible(false);
        } else {
            greenIsland3.setVisible(true);
            greenText3.setVisible(true);
            greenText3.setText(String.valueOf(green));
        }
        if(red == 0){
            redIsland3.setVisible(false);
            redText3.setVisible(false);
        } else {
            redIsland3.setVisible(true);
            redText3.setVisible(true);
            redText3.setText(String.valueOf(red));
        }
        if(yellow == 0){
            yellowIsland3.setVisible(false);
            yellowText3.setVisible(false);
        } else {
            yellowIsland3.setVisible(true);
            yellowText3.setVisible(true);
            yellowText3.setText(String.valueOf(yellow));
        }
        if(pink == 0){
            pinkIsland3.setVisible(false);
            pinkText3.setVisible(false);
        } else {
            pinkIsland3.setVisible(true);
            pinkText3.setVisible(true);
            pinkText3.setText(String.valueOf(pink));
        }
        if(blue == 0){
            blueIsland3.setVisible(false);
            blueText3.setVisible(false);
        } else {
            blueIsland3.setVisible(true);
            blueText3.setVisible(true);
            blueText3.setText(String.valueOf(blue));
        }

        if(i.getNumTower() == 0){
            towerIsland3.setImage(null);
            towerText3.setVisible(false);
        } else {
            if(i.getTowerColor().equals(TowerColour.Black))
                towerIsland3.setImage(new Image(Objects.requireNonNull(getClass().getResourceAsStream("/Graphics/black_tower.png"))));
            else if (i.getTowerColor().equals(TowerColour.White)) {
                towerIsland3.setImage(new Image(Objects.requireNonNull(getClass().getResourceAsStream("/Graphics/white_tower.png"))));
            } else if (i.getTowerColor().equals(TowerColour.Grey)) {
                towerIsland3.setImage(new Image(Objects.requireNonNull(getClass().getResourceAsStream("/Graphics/grey_tower.png"))));
            }
            towerText3.setVisible(true);
            towerText3.setText(String.valueOf(i.getNumTower()));
        }

        mothernature3.setVisible(model.getGameBoard().getMotherNature() == 3);
    }

    private void updateisland4(Island i){
        int green=0, red=0, yellow=0, pink=0, blue=0;
        for(Student s: i.getStudents()){
            if(s.getColour().ordinal() == 0)
                green++;
            else if (s.getColour().ordinal() == 1)
                red++;
            else if (s.getColour().ordinal() == 2)
                yellow++;
            else if (s.getColour().ordinal() == 3)
                pink++;
            else if (s.getColour().ordinal() == 4)
                blue++;
        }
        if(green == 0){
            greenIsland4.setVisible(false);
            greenText4.setVisible(false);
        } else {
            greenIsland4.setVisible(true);
            greenText4.setVisible(true);
            greenText4.setText(String.valueOf(green));
        }
        if(red == 0){
            redIsland4.setVisible(false);
            redText4.setVisible(false);
        } else {
            redIsland4.setVisible(true);
            redText4.setVisible(true);
            redText4.setText(String.valueOf(red));
        }
        if(yellow == 0){
            yellowIsland4.setVisible(false);
            yellowText4.setVisible(false);
        } else {
            yellowIsland4.setVisible(true);
            yellowText4.setVisible(true);
            yellowText4.setText(String.valueOf(yellow));
        }
        if(pink == 0){
            pinkIsland4.setVisible(false);
            pinkText4.setVisible(false);
        } else {
            pinkIsland4.setVisible(true);
            pinkText4.setVisible(true);
            pinkText4.setText(String.valueOf(pink));
        }
        if(blue == 0){
            blueIsland4.setVisible(false);
            blueText4.setVisible(false);
        } else {
            blueIsland4.setVisible(true);
            blueText4.setVisible(true);
            blueText4.setText(String.valueOf(blue));
        }

        if(i.getNumTower() == 0){
            towerIsland4.setImage(null);
            towerText4.setVisible(false);
        } else {
            if(i.getTowerColor().equals(TowerColour.Black))
                towerIsland4.setImage(new Image(Objects.requireNonNull(getClass().getResourceAsStream("/Graphics/black_tower.png"))));
            else if (i.getTowerColor().equals(TowerColour.White)) {
                towerIsland4.setImage(new Image(Objects.requireNonNull(getClass().getResourceAsStream("/Graphics/white_tower.png"))));
            } else if (i.getTowerColor().equals(TowerColour.Grey)) {
                towerIsland4.setImage(new Image(Objects.requireNonNull(getClass().getResourceAsStream("/Graphics/grey_tower.png"))));
            }
            towerText4.setVisible(true);
            towerText4.setText(String.valueOf(i.getNumTower()));
        }

        mothernature4.setVisible(model.getGameBoard().getMotherNature() == 4);
    }

    private void updateisland5(Island i){
        int green=0, red=0, yellow=0, pink=0, blue=0;
        for(Student s: i.getStudents()){
            if(s.getColour().ordinal() == 0)
                green++;
            else if (s.getColour().ordinal() == 1)
                red++;
            else if (s.getColour().ordinal() == 2)
                yellow++;
            else if (s.getColour().ordinal() == 3)
                pink++;
            else if (s.getColour().ordinal() == 4)
                blue++;
        }
        if(green == 0){
            greenIsland5.setVisible(false);
            greenText5.setVisible(false);
        } else {
            greenIsland5.setVisible(true);
            greenText5.setVisible(true);
            greenText5.setText(String.valueOf(green));
        }
        if(red == 0){
            redIsland5.setVisible(false);
            redText5.setVisible(false);
        } else {
            redIsland5.setVisible(true);
            redText5.setVisible(true);
            redText5.setText(String.valueOf(red));
        }
        if(yellow == 0){
            yellowIsland5.setVisible(false);
            yellowText5.setVisible(false);
        } else {
            yellowIsland5.setVisible(true);
            yellowText5.setVisible(true);
            yellowText5.setText(String.valueOf(yellow));
        }
        if(pink == 0){
            pinkIsland5.setVisible(false);
            pinkText5.setVisible(false);
        } else {
            pinkIsland5.setVisible(true);
            pinkText5.setVisible(true);
            pinkText5.setText(String.valueOf(pink));
        }
        if(blue == 0){
            blueIsland5.setVisible(false);
            blueText5.setVisible(false);
        } else {
            blueIsland5.setVisible(true);
            blueText5.setVisible(true);
            blueText5.setText(String.valueOf(blue));
        }

        if(i.getNumTower() == 0){
            towerIsland5.setImage(null);
            towerText5.setVisible(false);
        } else {
            if(i.getTowerColor().equals(TowerColour.Black))
                towerIsland5.setImage(new Image(Objects.requireNonNull(getClass().getResourceAsStream("/Graphics/black_tower.png"))));
            else if (i.getTowerColor().equals(TowerColour.White)) {
                towerIsland5.setImage(new Image(Objects.requireNonNull(getClass().getResourceAsStream("/Graphics/white_tower.png"))));
            } else if (i.getTowerColor().equals(TowerColour.Grey)) {
                towerIsland5.setImage(new Image(Objects.requireNonNull(getClass().getResourceAsStream("/Graphics/grey_tower.png"))));
            }
            towerText5.setVisible(true);
            towerText5.setText(String.valueOf(i.getNumTower()));
        }

        mothernature5.setVisible(model.getGameBoard().getMotherNature() == 5);
    }

    private void updateisland6(Island i){
        int green=0, red=0, yellow=0, pink=0, blue=0;
        for(Student s: i.getStudents()){
            if(s.getColour().ordinal() == 0)
                green++;
            else if (s.getColour().ordinal() == 1)
                red++;
            else if (s.getColour().ordinal() == 2)
                yellow++;
            else if (s.getColour().ordinal() == 3)
                pink++;
            else if (s.getColour().ordinal() == 4)
                blue++;
        }
        if(green == 0){
            greenIsland6.setVisible(false);
            greenText6.setVisible(false);
        } else {
            greenIsland6.setVisible(true);
            greenText6.setVisible(true);
            greenText6.setText(String.valueOf(green));
        }
        if(red == 0){
            redIsland6.setVisible(false);
            redText6.setVisible(false);
        } else {
            redIsland6.setVisible(true);
            redText6.setVisible(true);
            redText6.setText(String.valueOf(red));
        }
        if(yellow == 0){
            yellowIsland6.setVisible(false);
            yellowText6.setVisible(false);
        } else {
            yellowIsland6.setVisible(true);
            yellowText6.setVisible(true);
            yellowText6.setText(String.valueOf(yellow));
        }
        if(pink == 0){
            pinkIsland6.setVisible(false);
            pinkText6.setVisible(false);
        } else {
            pinkIsland6.setVisible(true);
            pinkText6.setVisible(true);
            pinkText6.setText(String.valueOf(pink));
        }
        if(blue == 0){
            blueIsland6.setVisible(false);
            blueText6.setVisible(false);
        } else {
            blueIsland6.setVisible(true);
            blueText6.setVisible(true);
            blueText6.setText(String.valueOf(blue));
        }

        if(i.getNumTower() == 0){
            towerIsland6.setImage(null);
            towerText6.setVisible(false);
        } else {
            if(i.getTowerColor().equals(TowerColour.Black))
                towerIsland6.setImage(new Image(Objects.requireNonNull(getClass().getResourceAsStream("/Graphics/black_tower.png"))));
            else if (i.getTowerColor().equals(TowerColour.White)) {
                towerIsland6.setImage(new Image(Objects.requireNonNull(getClass().getResourceAsStream("/Graphics/white_tower.png"))));
            } else if (i.getTowerColor().equals(TowerColour.Grey)) {
                towerIsland6.setImage(new Image(Objects.requireNonNull(getClass().getResourceAsStream("/Graphics/grey_tower.png"))));
            }
            towerText6.setVisible(true);
            towerText6.setText(String.valueOf(i.getNumTower()));
        }

        mothernature6.setVisible(model.getGameBoard().getMotherNature() == 6);
    }

    private void updateisland7(Island i){
        int green=0, red=0, yellow=0, pink=0, blue=0;
        for(Student s: i.getStudents()){
            if(s.getColour().ordinal() == 0)
                green++;
            else if (s.getColour().ordinal() == 1)
                red++;
            else if (s.getColour().ordinal() == 2)
                yellow++;
            else if (s.getColour().ordinal() == 3)
                pink++;
            else if (s.getColour().ordinal() == 4)
                blue++;
        }
        if(green == 0){
            greenIsland7.setVisible(false);
            greenText7.setVisible(false);
        } else {
            greenIsland7.setVisible(true);
            greenText7.setVisible(true);
            greenText7.setText(String.valueOf(green));
        }
        if(red == 0){
            redIsland7.setVisible(false);
            redText7.setVisible(false);
        } else {
            redIsland7.setVisible(true);
            redText7.setVisible(true);
            redText7.setText(String.valueOf(red));
        }
        if(yellow == 0){
            yellowIsland7.setVisible(false);
            yellowText7.setVisible(false);
        } else {
            yellowIsland7.setVisible(true);
            yellowText7.setVisible(true);
            yellowText7.setText(String.valueOf(yellow));
        }
        if(pink == 0){
            pinkIsland7.setVisible(false);
            pinkText7.setVisible(false);
        } else {
            pinkIsland7.setVisible(true);
            pinkText7.setVisible(true);
            pinkText7.setText(String.valueOf(pink));
        }
        if(blue == 0){
            blueIsland7.setVisible(false);
            blueText7.setVisible(false);
        } else {
            blueIsland7.setVisible(true);
            blueText7.setVisible(true);
            blueText7.setText(String.valueOf(blue));
        }

        if(i.getNumTower() == 0){
            towerIsland7.setImage(null);
            towerText7.setVisible(false);
        } else {
            if(i.getTowerColor().equals(TowerColour.Black))
                towerIsland7.setImage(new Image(Objects.requireNonNull(getClass().getResourceAsStream("/Graphics/black_tower.png"))));
            else if (i.getTowerColor().equals(TowerColour.White)) {
                towerIsland7.setImage(new Image(Objects.requireNonNull(getClass().getResourceAsStream("/Graphics/white_tower.png"))));
            } else if (i.getTowerColor().equals(TowerColour.Grey)) {
                towerIsland7.setImage(new Image(Objects.requireNonNull(getClass().getResourceAsStream("/Graphics/grey_tower.png"))));
            }
            towerText7.setVisible(true);
            towerText7.setText(String.valueOf(i.getNumTower()));
        }

        mothernature7.setVisible(model.getGameBoard().getMotherNature() == 7);
    }

    private void updateisland8(Island i){
        int green=0, red=0, yellow=0, pink=0, blue=0;
        for(Student s: i.getStudents()){
            if(s.getColour().ordinal() == 0)
                green++;
            else if (s.getColour().ordinal() == 1)
                red++;
            else if (s.getColour().ordinal() == 2)
                yellow++;
            else if (s.getColour().ordinal() == 3)
                pink++;
            else if (s.getColour().ordinal() == 4)
                blue++;
        }
        if(green == 0){
            greenIsland8.setVisible(false);
            greenText8.setVisible(false);
        } else {
            greenIsland8.setVisible(true);
            greenText8.setVisible(true);
            greenText8.setText(String.valueOf(green));
        }
        if(red == 0){
            redIsland8.setVisible(false);
            redText8.setVisible(false);
        } else {
            redIsland8.setVisible(true);
            redText8.setVisible(true);
            redText8.setText(String.valueOf(red));
        }
        if(yellow == 0){
            yellowIsland8.setVisible(false);
            yellowText8.setVisible(false);
        } else {
            yellowIsland8.setVisible(true);
            yellowText8.setVisible(true);
            yellowText8.setText(String.valueOf(yellow));
        }
        if(pink == 0){
            pinkIsland8.setVisible(false);
            pinkText8.setVisible(false);
        } else {
            pinkIsland8.setVisible(true);
            pinkText8.setVisible(true);
            pinkText8.setText(String.valueOf(pink));
        }
        if(blue == 0){
            blueIsland8.setVisible(false);
            blueText8.setVisible(false);
        } else {
            blueIsland8.setVisible(true);
            blueText8.setVisible(true);
            blueText8.setText(String.valueOf(blue));
        }

        if(i.getNumTower() == 0){
            towerIsland8.setImage(null);
            towerText8.setVisible(false);
        } else {
            if(i.getTowerColor().equals(TowerColour.Black))
                towerIsland8.setImage(new Image(Objects.requireNonNull(getClass().getResourceAsStream("/Graphics/black_tower.png"))));
            else if (i.getTowerColor().equals(TowerColour.White)) {
                towerIsland8.setImage(new Image(Objects.requireNonNull(getClass().getResourceAsStream("/Graphics/white_tower.png"))));
            } else if (i.getTowerColor().equals(TowerColour.Grey)) {
                towerIsland8.setImage(new Image(Objects.requireNonNull(getClass().getResourceAsStream("/Graphics/grey_tower.png"))));
            }
            towerText8.setVisible(true);
            towerText8.setText(String.valueOf(i.getNumTower()));
        }

        mothernature8.setVisible(model.getGameBoard().getMotherNature() == 8);
    }

    private void updateisland9(Island i){
        int green=0, red=0, yellow=0, pink=0, blue=0;
        for(Student s: i.getStudents()){
            if(s.getColour().ordinal() == 0)
                green++;
            else if (s.getColour().ordinal() == 1)
                red++;
            else if (s.getColour().ordinal() == 2)
                yellow++;
            else if (s.getColour().ordinal() == 3)
                pink++;
            else if (s.getColour().ordinal() == 4)
                blue++;
        }
        if(green == 0){
            greenIsland9.setVisible(false);
            greenText9.setVisible(false);
        } else {
            greenIsland9.setVisible(true);
            greenText9.setVisible(true);
            greenText9.setText(String.valueOf(green));
        }
        if(red == 0){
            redIsland9.setVisible(false);
            redText9.setVisible(false);
        } else {
            redIsland9.setVisible(true);
            redText9.setVisible(true);
            redText9.setText(String.valueOf(red));
        }
        if(yellow == 0){
            yellowIsland9.setVisible(false);
            yellowText9.setVisible(false);
        } else {
            yellowIsland9.setVisible(true);
            yellowText9.setVisible(true);
            yellowText9.setText(String.valueOf(yellow));
        }
        if(pink == 0){
            pinkIsland9.setVisible(false);
            pinkText9.setVisible(false);
        } else {
            pinkIsland9.setVisible(true);
            pinkText9.setVisible(true);
            pinkText9.setText(String.valueOf(pink));
        }
        if(blue == 0){
            blueIsland9.setVisible(false);
            blueText9.setVisible(false);
        } else {
            blueIsland9.setVisible(true);
            blueText9.setVisible(true);
            blueText9.setText(String.valueOf(blue));
        }

        if(i.getNumTower() == 0){
            towerIsland9.setImage(null);
            towerText9.setVisible(false);
        } else {
            if(i.getTowerColor().equals(TowerColour.Black))
                towerIsland9.setImage(new Image(Objects.requireNonNull(getClass().getResourceAsStream("/Graphics/black_tower.png"))));
            else if (i.getTowerColor().equals(TowerColour.White)) {
                towerIsland9.setImage(new Image(Objects.requireNonNull(getClass().getResourceAsStream("/Graphics/white_tower.png"))));
            } else if (i.getTowerColor().equals(TowerColour.Grey)) {
                towerIsland9.setImage(new Image(Objects.requireNonNull(getClass().getResourceAsStream("/Graphics/grey_tower.png"))));
            }
            towerText9.setVisible(true);
            towerText9.setText(String.valueOf(i.getNumTower()));
        }

        mothernature9.setVisible(model.getGameBoard().getMotherNature() == 9);
    }

    private void updateisland10(Island i){
        int green=0, red=0, yellow=0, pink=0, blue=0;
        for(Student s: i.getStudents()){
            if(s.getColour().ordinal() == 0)
                green++;
            else if (s.getColour().ordinal() == 1)
                red++;
            else if (s.getColour().ordinal() == 2)
                yellow++;
            else if (s.getColour().ordinal() == 3)
                pink++;
            else if (s.getColour().ordinal() == 4)
                blue++;
        }
        if(green == 0){
            greenIsland10.setVisible(false);
            greenText10.setVisible(false);
        } else {
            greenIsland10.setVisible(true);
            greenText10.setVisible(true);
            greenText10.setText(String.valueOf(green));
        }
        if(red == 0){
            redIsland10.setVisible(false);
            redText10.setVisible(false);
        } else {
            redIsland10.setVisible(true);
            redText10.setVisible(true);
            redText10.setText(String.valueOf(red));
        }
        if(yellow == 0){
            yellowIsland10.setVisible(false);
            yellowText10.setVisible(false);
        } else {
            yellowIsland10.setVisible(true);
            yellowText10.setVisible(true);
            yellowText10.setText(String.valueOf(yellow));
        }
        if(pink == 0){
            pinkIsland10.setVisible(false);
            pinkText10.setVisible(false);
        } else {
            pinkIsland10.setVisible(true);
            pinkText10.setVisible(true);
            pinkText10.setText(String.valueOf(pink));
        }
        if(blue == 0){
            blueIsland10.setVisible(false);
            blueText10.setVisible(false);
        } else {
            blueIsland10.setVisible(true);
            blueText10.setVisible(true);
            blueText10.setText(String.valueOf(blue));
        }

        if(i.getNumTower() == 0){
            towerIsland10.setImage(null);
            towerText10.setVisible(false);
        } else {
            if(i.getTowerColor().equals(TowerColour.Black))
                towerIsland10.setImage(new Image(Objects.requireNonNull(getClass().getResourceAsStream("/Graphics/black_tower.png"))));
            else if (i.getTowerColor().equals(TowerColour.White)) {
                towerIsland10.setImage(new Image(Objects.requireNonNull(getClass().getResourceAsStream("/Graphics/white_tower.png"))));
            } else if (i.getTowerColor().equals(TowerColour.Grey)) {
                towerIsland10.setImage(new Image(Objects.requireNonNull(getClass().getResourceAsStream("/Graphics/grey_tower.png"))));
            }
            towerText10.setVisible(true);
            towerText10.setText(String.valueOf(i.getNumTower()));
        }

        mothernature10.setVisible(model.getGameBoard().getMotherNature() == 10);
    }


    private void updateisland11(Island i){
        int green=0, red=0, yellow=0, pink=0, blue=0;
        for(Student s: i.getStudents()){
            if(s.getColour().ordinal() == 0)
                green++;
            else if (s.getColour().ordinal() == 1)
                red++;
            else if (s.getColour().ordinal() == 2)
                yellow++;
            else if (s.getColour().ordinal() == 3)
                pink++;
            else if (s.getColour().ordinal() == 4)
                blue++;
        }
        if(green == 0){
            greenIsland11.setVisible(false);
            greenText11.setVisible(false);
        } else {
            greenIsland11.setVisible(true);
            greenText11.setVisible(true);
            greenText11.setText(String.valueOf(green));
        }
        if(red == 0){
            redIsland11.setVisible(false);
            redText11.setVisible(false);
        } else {
            redIsland11.setVisible(true);
            redText11.setVisible(true);
            redText11.setText(String.valueOf(red));
        }
        if(yellow == 0){
            yellowIsland11.setVisible(false);
            yellowText11.setVisible(false);
        } else {
            yellowIsland11.setVisible(true);
            yellowText11.setVisible(true);
            yellowText11.setText(String.valueOf(yellow));
        }
        if(pink == 0){
            pinkIsland11.setVisible(false);
            pinkText11.setVisible(false);
        } else {
            pinkIsland11.setVisible(true);
            pinkText11.setVisible(true);
            pinkText11.setText(String.valueOf(pink));
        }
        if(blue == 0){
            blueIsland11.setVisible(false);
            blueText11.setVisible(false);
        } else {
            blueIsland11.setVisible(true);
            blueText11.setVisible(true);
            blueText11.setText(String.valueOf(blue));
        }

        if(i.getNumTower() == 0){
            towerIsland11.setImage(null);
            towerText11.setVisible(false);
        } else {
            if(i.getTowerColor().equals(TowerColour.Black))
                towerIsland11.setImage(new Image(Objects.requireNonNull(getClass().getResourceAsStream("/Graphics/black_tower.png"))));
            else if (i.getTowerColor().equals(TowerColour.White)) {
                towerIsland11.setImage(new Image(Objects.requireNonNull(getClass().getResourceAsStream("/Graphics/white_tower.png"))));
            } else if (i.getTowerColor().equals(TowerColour.Grey)) {
                towerIsland11.setImage(new Image(Objects.requireNonNull(getClass().getResourceAsStream("/Graphics/grey_tower.png"))));
            }
            towerText11.setVisible(true);
            towerText11.setText(String.valueOf(i.getNumTower()));
        }

        mothernature11.setVisible(model.getGameBoard().getMotherNature() == 11);
    }













}
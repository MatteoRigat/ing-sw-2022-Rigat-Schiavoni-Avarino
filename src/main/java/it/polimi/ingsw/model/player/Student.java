package it.polimi.ingsw.model.player;

import it.polimi.ingsw.model.enumeration.Colour;

import java.io.Serializable;

/** Class Student has a Constructor, a getter and an override toString method
 * which returns a coloured circle of the corresponding color */
public class Student implements Serializable {
    private Colour colour;

    public Student(Colour colour) {
        this.colour = colour;
    }

    /**
     *Method getColour returns the colour of the student.
     * @return colour
     */
    public Colour getColour(){
        return this.colour;
    }

    @Override
    public String toString() {
        int colorInt = colour.ordinal();

        String operSys = System.getProperty("os.name").toLowerCase();
        if (operSys.contains("mac os x")) {
            switch(colorInt) {
                case (0) : return "ð¢"; //""\033[38;2;31;224;44mGreen\033[0m";
                case (1) : return "ð´"; //"\033[31mRed\033[0m";
                case (2) : return "ð¡"; //"\033[93mYellow\033[0m";
                case (3) : return "ð£"; //"\033[38;2;249;177;250mPink\033[0m";
                case (4) : return "ðµ"; //"\033[38;2;85;99;250mBlue\033[0m";
            }
        } else {
            switch(colorInt) {
                case (0) : return "green";//"\033[32mâ\033[0m";
                case (1) : return "red";//"\033[31mâ\033[0m";
                case (2) : return "yellow";//"\033[93mâ\033[0m";
                case (3) : return "pink";//"\033[95mâ\033[0m";
                case (4) : return "blue";//"\033[34mâ\033[0m";
            }
        }

        return null;
    }
}


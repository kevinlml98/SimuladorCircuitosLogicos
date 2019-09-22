package sample;

import javafx.scene.layout.AnchorPane;
import javafx.scene.shape.Line;


public class drawGraphicLine {

    //__________ Atributos
    private static AnchorPane circuitPane;

    Line lineConector = new Line();

    drawGraphicLine nextLine;

    private double firstPointX = 0;
    private double firstPointY = 0;
    private double lastPointX = 0;
    private double lastPointY = 0;

    private int IdLine = 0;





    //___________________ Método Contructor
    public drawGraphicLine(double startPointX, double startPointY, double endPointX, double endPointY, int numberLine) {

        firstPointX = startPointX;
        firstPointY = startPointY;
        lastPointX = endPointX;
        lastPointY = endPointY;
        IdLine = numberLine;

    }



    //_________________ Método para añadir el circuitPane
    public void includeCircuitPane(AnchorPane n){
        this.circuitPane = n;
    }

    //__________________ Método para enviar el nodo al circuitPane
    public void setLinetoCircuitPane(){
        lineConector.setStartX(firstPointX);
        lineConector.setStartY(firstPointY);
        lineConector.setEndX(this.lastPointX);
        lineConector.setEndY(this.lastPointY);
        circuitPane.getChildren().add(lineConector);
        System.out.println("Se crea la linea con las direcciones: Inicia en " + this.firstPointX + " " + this.firstPointY +
                " finaliza en " + this.lastPointX + " " + this.lastPointY);

    }






    //______________________________________ Getters and Setters __________________________________//
    public double getFirstPointX() {
        return firstPointX;
    }

    public void setFirstPointX(double firstPointX) {
        this.firstPointX = firstPointX;
    }

    public double getFirstPointY() {
        return firstPointY;
    }

    public void setFirstPointY(double firstPointY) {
        this.firstPointY = firstPointY;
    }

    public double getLastPointX() {
        return lastPointX;
    }

    public void setLastPointX(double lastPointX) {
        this.lastPointX = lastPointX;
    }

    public double getLastPointY() {
        return lastPointY;
    }

    public void setLastPointY(double lastPointY) {
        this.lastPointY = lastPointY;
    }
}

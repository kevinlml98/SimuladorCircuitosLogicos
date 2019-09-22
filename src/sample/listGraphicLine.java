package sample;

import javafx.scene.layout.AnchorPane;

public class listGraphicLine {

    drawGraphicLine firstLine;
    public static boolean firstPointType = false;
    private static AnchorPane circuitPane;

    private double startPointX = 0;
    private double startPointY = 0;
    private double endPointX = 0;
    private double endPointY = 0;

    private boolean valFeetGate = false;
    private String nameGateSelected;

    private static int countLine = 0;



    //_______________________ Método contructor
    public listGraphicLine(){
        this.firstLine = null;
    }


    //______________________ Primera parte: Primer checkeo del boton iniciado
    public void pointPull (double pointX, double pointY){
        startPointX = pointX;
        startPointY = pointY;
        firstPointType = true;
    }

    //______________________ Segunda parte: Creación de la linea en los puntos especificados
    public void pointPush (double pointX, double pointY){
        endPointX = pointX;
        endPointY = pointY;
        System.out.println("Puntos de linea: x " + endPointX + " y " + endPointY);
        if(this.firstLine == null){
            this.firstLine = new drawGraphicLine(startPointX,startPointY,endPointX,endPointY, countLine);
            this.firstLine.includeCircuitPane(circuitPane);
            this.firstLine.setLinetoCircuitPane();
            countLine++;
        }else {
            drawGraphicLine n = new drawGraphicLine(startPointX,startPointY,endPointX,endPointY, countLine);
            n.nextLine = this.firstLine;
            this.firstLine = n;
            this.firstLine.includeCircuitPane(circuitPane);
            this.firstLine.setLinetoCircuitPane();
            countLine++;
        }
        System.out.println("Linea creada");
        firstPointType = false;

    }



    //____________________ Incluir el circuitPane en el listGraphicLine
    public void includeCircuitPane(AnchorPane n){
        this.circuitPane = n;
    }



    //________________________ Setters and Getters

    public void setValFeetGate(boolean valFeetGate) {
        this.valFeetGate = valFeetGate;
    }

    public boolean getValFeetGate() {
        return valFeetGate;
    }


    public String getNameGateSelected() {
        return nameGateSelected;
    }

    public void setNameGateSelected(String nameGateSelected) {
        this.nameGateSelected = nameGateSelected;
    }
}

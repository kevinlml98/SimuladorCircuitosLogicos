package sample;

import javafx.event.EventHandler;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.shape.Rectangle;

public class node {

    //___________________   Se declaran los argumentos del nodo; entradas conectadas, valor que posee las entradas, salida y nombre de la compuerta

    node nextNode;
    private boolean inPut1Val;
    private boolean inPut2Val;
    private boolean outPut;

    private String gateName;
    private String inPut1Name;
    private String inPut2Name;
    private String outPutName;



    private GridPane gridPaneGate;


    public node(String a, int b){
        String c = String.valueOf(b);
        gateName = a + c;
        inPut1Val = true;
        inPut2Val = true;
        inPut1Name = "FREE";
        inPut2Name = "FREE";
        if(a.equals("NOT")){
            outPut = typeGate(inPut1Val);
        }else{
            outPut = typeGate(a,inPut1Val,inPut2Val);
        }
        gridPaneGate = compuertaGrafica(a,b);
        System.out.println(a + " input1 " + inPut1Val + " input2 " + inPut2Val + " salida " + outPut);
    }

    //______________________ Crear el GridPane de la compuerta
    private GridPane compuertaGrafica(String a,int numberOfGate) {
        //___________Crea el GridPane que contiene los elementos de la compuerta

        String c = String.valueOf(numberOfGate);
        GridPane gridGate = new GridPane();

        //___________ Etiquetas de las  patillas de las compuertas; entradas y salida.
        Label gateName = new Label(a + c);
        GridPane.setConstraints(gateName, 1, 0);
        Label input1 = new Label("i1<" + inPut1Val + ">");
        GridPane.setConstraints(input1, 0, 0);
        Label input2 = new Label("i2<" + inPut2Val + ">");
        GridPane.setConstraints(input2, 0, 2);
        Label output = new Label("0<" + outPut + ">");
        GridPane.setConstraints(output, 2, 1);

        //________________________Imagen de la compuerta
        Rectangle imageGate = new Rectangle(50, 50);
        GridPane.setConstraints(imageGate, 1, 1);

        //_______________ Introducir todos los elementos en el GridPane
        gridGate.getChildren().addAll(gateName, imageGate, input1, input2, output);


        //_________________________ Método para mover las compuertas
        imageGate.setOnMouseDragged(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {

                double x = event.getSceneX();
                double y = event.getSceneY();

                gridGate.setLayoutX(x - 185);
                gridGate.setLayoutY(y - 15);


            }
        });

        return gridGate;
    }




    //_____________________ Método para configurar
    private boolean typeGate(boolean inPut1Val){
        if(inPut1Val == true){
            return false;
        }else{
            return true;
        }

    }

    private boolean typeGate(String nombre, boolean inPut1Val, boolean inPut2Val) {

        boolean resultOut = false;
        System.out.println(nombre);
        switch (nombre)
        {
            case "AND":
                if((inPut1Val == true) & (inPut2Val == true)){
                    resultOut = true;
                }else{
                    resultOut = false;
                }break;

            case "NAND":
                if((inPut1Val == true) & (inPut2Val == true)){
                    resultOut = false;
                }else{
                    resultOut = true;
                }break;

            case "OR":
                if((inPut1Val == true) | (inPut2Val == true)){
                    resultOut = true;
                }else{
                    resultOut = false;
                }System.out.println(resultOut);break;

            case "NOR":
                if((inPut1Val == true) | (inPut2Val == true)){
                    resultOut = false;
                }else{
                    resultOut = true;
                }break;

            case "XOR":
                if(inPut1Val == inPut2Val){
                    resultOut = false;
                }else{
                    resultOut = true;
                }break;

            case "XNOR":
                if(inPut1Val == inPut2Val){
                    resultOut = true;
                }else{
                    resultOut = false;
                }break;

        }

        return resultOut;

    }












    public boolean isInPut1Val() {
        return inPut1Val;
    }

    public void setInPut1Val(boolean inPut1Val) {
        this.inPut1Val = inPut1Val;
    }

    public boolean isInPut2Val() {
        return inPut2Val;
    }

    public void setInPut2Val(boolean inPut2Val) {
        this.inPut2Val = inPut2Val;
    }

    public boolean isOutPut() {
        return outPut;
    }

    public void setOutPut(boolean outPut) {
        this.outPut = outPut;
    }

    public String getGateName() {
        return gateName;
    }

    public void setGateName(String gateName) {
        this.gateName = gateName;
    }

    public String getInPut1Name() {
        return inPut1Name;
    }

    public void setInPut1Name(String inPut1Name) {
        this.inPut1Name = inPut1Name;
    }

    public String getInPut2Name() {
        return inPut2Name;
    }

    public void setInPut2Name(String inPut2Name) {
        this.inPut2Name = inPut2Name;
    }

    public GridPane getGridPaneGate() {
        return gridPaneGate;
    }

    public void setGridPaneGate(GridPane gridPaneGate) {
        this.gridPaneGate = gridPaneGate;
    }


}

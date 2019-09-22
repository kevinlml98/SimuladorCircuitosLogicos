package sample;

import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.*;


public class node {


    //___________________   Se declaran los argumentos del nodo; entradas conectadas, valor que posee las entradas, salida y nombre de la compuerta

    node nextNode;
    private boolean inPut1Val;
    private boolean inPut2Val;
    private boolean outPut;

    private String gateName;
    private String gateType;
    private String inPut1Name;
    private String inPut2Name;
    private listGraphicLine listLine;


    private GridPane gridPaneGate;


    public node(String a, int b){
        String c = String.valueOf(b);
        gateType = a;
        gateName = a + c;
        inPut1Val = true;
        inPut2Val = true;
        inPut1Name = "FREE";
        inPut2Name = "FREE";
        if(a.equals("NOT")){
            outPut = typeGate(inPut1Val);
        }else{
            outPut = typeGate(gateType,inPut1Val,inPut2Val);
        }
        gridPaneGate = compuertaGrafica(gateType,b);
    }




    //______________________ Crear el GridPane de la compuerta
    private GridPane compuertaGrafica(String a,int numberOfGate) {
        //___________Crea el GridPane que contiene los elementos de la compuerta

            String c = String.valueOf(numberOfGate);
            GridPane gridGate = new GridPane();

        //___________ Etiquetas de las  patillas de las compuertas; entradas y salida.
            Label input1 = new Label("i1<" + inPut1Name + ">");
                GridPane.setConstraints(input1, 0, 0);
            Label input2 = new Label("i2<" + inPut2Name + ">");
            GridPane.setConstraints(input2, 0, 2);
            Label output = new Label("0<" + outPut + ">");
            GridPane.setConstraints(output, 1, 1);

        //________________________Imagen de la compuerta
            String minuscula = a.toLowerCase();
            BackgroundImage backgroundImage = new BackgroundImage( new Image( getClass().getResource("img/"+ minuscula +".png").toExternalForm()), BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT, BackgroundSize.DEFAULT);
            Background background = new Background(backgroundImage);
            Button imageGate = new Button(c);
            imageGate.setBackground(background);
            imageGate.setPrefHeight(60);
            imageGate.setPrefWidth(100);
            GridPane.setConstraints(imageGate, 0, 1);

        //_______________ Introducir todos los elementos en el GridPane
            gridGate.getChildren().addAll(imageGate, input1, input2, output);


        //__________________ Método para seleccionar entradas y salidas
        input1.setOnMouseClicked(new EventHandler<MouseEvent>(){
            @Override
            public void handle(MouseEvent event) {
                //_____________________ Inicia la creación de la linea
                double x = gridGate.getLayoutX();
                double y = gridGate.getLayoutY();

                if(listLine.firstPointType == true) {
                    inPut1Name = listLine.getNameGateSelected();
                    inPut1Val = listLine.getValFeetGate();
                    input1.setText("i1<" + inPut1Name + ">");
                    listLine.pointPush(x + 5,y + 35);
                    String a = inPut1Name.substring(0,3);
                    System.out.println(a + " " + gateType);
                    if(a.equals("NOT")){
                        outPut = typeGate(inPut1Val);
                        output.setText("0<" + outPut + ">");
                    }else{
                        outPut = typeGate(gateType,inPut1Val,inPut2Val);
                        output.setText("0<" + outPut + ">");
                    }
                }

            }
        });


        input2.setOnMouseClicked(new EventHandler<MouseEvent>(){
            @Override
            public void handle(MouseEvent event) {
                //_____________________ Inicia la creación de la linea
                double x = gridGate.getLayoutX();
                double y = gridGate.getLayoutY();

                if(listLine.firstPointType == true) {
                    inPut2Name = listLine.getNameGateSelected();
                    inPut2Val = listLine.getValFeetGate();
                    input2.setText("i1<" + inPut2Name + ">");
                    listLine.pointPush(x + 5,y + 60);
                    String a = inPut1Name.substring(0,3);
                    System.out.println(a + " " + gateType);
                    if(a.equals("NOT")){
                        outPut = typeGate(inPut1Val);
                        output.setText("0<" + outPut + ">");
                    }else{
                        outPut = typeGate(gateType,inPut1Val,inPut2Val);
                        output.setText("0<" + outPut + ">");
                    }
                }
            }
        });


        output.setOnMouseClicked(new EventHandler<MouseEvent>(){
            @Override
            public void handle(MouseEvent event) {
                //_____________________ Inicia la creación de la linea
                double x = gridGate.getLayoutX();
                double y = gridGate.getLayoutY();

                if(listLine.firstPointType == false){
                    listLine.pointPull(x + 97, y + 47);
                    listLine.setValFeetGate(outPut);
                    listLine.setNameGateSelected(gateName);
                }
            }
        });


        //_________________________ Método para mover las compuertas
        imageGate.setOnMouseDragged(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {

                double x = event.getSceneX();
                double y = event.getSceneY();

                gridGate.setLayoutX(x - 200);
                gridGate.setLayoutY(y - 30);


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
                }break;

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


    //______________________ Incluir lista de direccionamiento
    public void includeListGraphicLine(listGraphicLine listLine){
        this.listLine = listLine;
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

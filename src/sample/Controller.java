package sample;


import javafx.fxml.FXML;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import java.io.FileNotFoundException;


public class Controller {

    lista compuertas = new lista();


    @FXML
    private AnchorPane parent;

    @FXML
    private AnchorPane circuitPane;

    @FXML
    private VBox vBox1;


    @FXML
    private Button btnAND;

    @FXML
    private Button btnNAND;

    @FXML
    private Button btnOR;

    @FXML
    private Button btnNOR;

    @FXML
    private Button btnXOR;

    @FXML
    private Button btnXNOR;

    @FXML
    private Button btnNOT;

    @FXML
    private Button btnSave;

    @FXML
    private Button btnDelete;

    @FXML
    private Button btnAdd;



    @FXML
    public void createGateAND(MouseEvent event) throws FileNotFoundException {
        //__________________Generar nodo de la compuerta
        compuertas.addfirst("AND",1);
        circuitPane.getChildren().add(compuertas.addGridPane());
    }

    @FXML
    public void createGateOR(MouseEvent event) throws FileNotFoundException {
        //__________________Generar nodo de la compuerta
        compuertas.addfirst("OR",3);
        circuitPane.getChildren().add(compuertas.addGridPane());
    }

    @FXML
    public void createGateXOR(MouseEvent event) throws FileNotFoundException {
        //__________________Generar nodo de la compuerta
        compuertas.addfirst("XOR",5);
        circuitPane.getChildren().add(compuertas.addGridPane());
    }

    @FXML
    public void createGateNOT(MouseEvent event) throws FileNotFoundException {
        //__________________Generar nodo de la compuerta
        compuertas.addfirst("NOT",7);
        circuitPane.getChildren().add(compuertas.addGridPane());
    }

    @FXML
    public void createGateNAND(MouseEvent event) throws FileNotFoundException {
        //__________________Generar nodo de la compuerta
        compuertas.addfirst("NAND",2);
        circuitPane.getChildren().add(compuertas.addGridPane());
    }

    @FXML
    public void createGateNOR(MouseEvent event) throws FileNotFoundException {
        //__________________Generar nodo de la compuerta
        compuertas.addfirst("NOR",4);
        circuitPane.getChildren().add(compuertas.addGridPane());
    }

    @FXML
    public void createGateXNOR(MouseEvent event) throws FileNotFoundException {
        //__________________Generar nodo de la compuerta
        compuertas.addfirst("XNOR",6);
        circuitPane.getChildren().add(compuertas.addGridPane());
    }








}



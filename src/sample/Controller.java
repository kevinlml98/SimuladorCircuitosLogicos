package sample;


import javafx.fxml.FXML;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.fxml.Initializable;


import java.io.FileNotFoundException;
import java.net.URL;
import java.util.ResourceBundle;


public class Controller  implements Initializable{
    lista compuertas = new lista();
    listGraphicLine listUnionGate = new listGraphicLine();



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
    private void createGateAND(MouseEvent event) throws FileNotFoundException {
        //__________________Generar nodo de la compuerta
        compuertas.addfirst("AND",1 );
        includeGateToCircuitPane(compuertas.addGridPane());
    }

    @FXML
    private void createGateOR(MouseEvent event) throws FileNotFoundException {
        //__________________Generar nodo de la compuerta
        compuertas.addfirst("OR",3);
        includeGateToCircuitPane(compuertas.addGridPane());
    }

    @FXML
    private void createGateXOR(MouseEvent event) throws FileNotFoundException {
        //__________________Generar nodo de la compuerta
        compuertas.addfirst("XOR",5);
        includeGateToCircuitPane(compuertas.addGridPane());
    }

    @FXML
    private void createGateNOT(MouseEvent event) throws FileNotFoundException {
        //__________________Generar nodo de la compuerta
        compuertas.addfirst("NOT",7);
        includeGateToCircuitPane(compuertas.addGridPane());
    }

    @FXML
    private void createGateNAND(MouseEvent event) throws FileNotFoundException {
        //__________________Generar nodo de la compuerta
        compuertas.addfirst("NAND",2);
        includeGateToCircuitPane(compuertas.addGridPane());
    }

    @FXML
    private void createGateNOR(MouseEvent event) throws FileNotFoundException {
        //__________________Generar nodo de la compuerta
        compuertas.addfirst("NOR",4);
        includeGateToCircuitPane(compuertas.addGridPane());
    }

    @FXML
    private void createGateXNOR(MouseEvent event) throws FileNotFoundException {
        //__________________Generar nodo de la compuerta
        compuertas.addfirst("XNOR",6);
        includeGateToCircuitPane(compuertas.addGridPane());
    }




    //________________ Incluir los GridPane de las compuertas al circuitPane
    private void includeGateToCircuitPane(GridPane gridGate){
        circuitPane.getChildren().add(gridGate);
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        listUnionGate.includeCircuitPane(circuitPane);
        System.out.println("Bienvenido al Simulador de Circuitos Lógicos (SiCLo)");
    }


    //______________ Getters and Setters


}



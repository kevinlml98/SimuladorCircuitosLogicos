package sample;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.shape.Rectangle;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;

public class Controller {

    lista compuertas = new lista();
    int countAND = 0;
    int countNAND = 0;
    int countOR = 0;
    int countNOR = 0;
    int countXOR = 0;
    int countXNOR = 0;
    int countNOT = 0;

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
    public void crear(MouseEvent event) {
        Rectangle gateAND = new Rectangle(50, 50);

        compuertas.addfirst("AND");
        gateAND.setOnMouseDragged(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                double x = event.getSceneX();
                double y = event.getSceneY();
                double a = gateAND.getLayoutX();
                double b = gateAND.getLayoutY();
                //System.out.println("mouse x: " + x + " mouse y: " + y);
                //System.out.println("square x: " + a + " square 7: " + b);
                gateAND.setLayoutX(x - 100);
                gateAND.setLayoutY(y);
            }
        });

        circuitPane.getChildren().add(gateAND);


    }




}



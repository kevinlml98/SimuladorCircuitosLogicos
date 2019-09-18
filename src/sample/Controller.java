package sample;


import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
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
        GridPane gateContainer = new GridPane();

        //___________ Etiquetas de las  patillas de las compuertas; entradas y salida.

        Label input1 = new Label("i<1," + countAND + ">");
        GridPane.setConstraints(input1, 0, 0);

        Label input2 = new Label("i<2," + countAND + ">");
        GridPane.setConstraints(input2, 0, 2);

        Label output = new Label("0<" + countAND + ">");
        GridPane.setConstraints(output, 2, 1);

        //_______________ Imagen de la compuerta
        Image urlImageGate = new Image("img/or.png");
        //ImageView gateImage = new ImageView(urlImageGate);
        //GridPane.setConstraints(gateImage, 1, 1);

        //_______________ Introducir todos los elementos en el GridPane
        gateContainer.getChildren().addAll(input1,input2,output);

        circuitPane.getChildren().add(gateContainer);

       // compuertas.addfirst("AND");

        //_________________________ Método para mover las compuertas
/*
        gateAND.setOnMouseDragged(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                double a = gateAND.getLayoutX();
                double b = gateAND.getLayoutY();

                double x = event.getSceneX();
                double y = event.getSceneY();

                double m = gateAND.getLayoutX();
                double n = gateAND.getLayoutY();

                System.out.println("mouse x: " + (x-150) + " mouse y: " + y + " square x: " + a + " square y: " + b);
                System.out.println("m " + m + "n " + n);


                gateAND.setLayoutX(x - 150);
                gateAND.setLayoutY(y);


            }
        });
*/
        //circuitPane.getChildren().add(gateAND);



    }




}



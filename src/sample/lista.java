package sample;

import javafx.scene.layout.GridPane;

public class lista {

    //____________Se instancia el Nodo

    node nodeFirst;
    private int listLenght = 0;
    private int numberGateAND = 0;
    private int numberGateNAND = 0;
    private int numberGateOR = 0;
    private int numberGateNOR = 0;
    private int numberGateXOR = 0;
    private int numberGateXNOR = 0;
    private int numberGateNOT = 0;

    public int checkNumberGate (int b){
        int a = 0;
        switch (b){
            case 1: numberGateAND++ ; a = numberGateAND;break;
            case 2: numberGateNAND++; a = numberGateNAND; break;
            case 3: numberGateOR++; a = numberGateOR; break;
            case 4: numberGateNOR++; a = numberGateNOR; break;
            case 5: numberGateXOR++; a = numberGateXOR; break;
            case 6: numberGateXNOR++; a = numberGateXNOR; break;
            case 7: numberGateNOT++; a = numberGateNOT; break;
        }
        System.out.println(numberGateAND + " " + numberGateOR + " " + numberGateXOR);
        return a;
    }

    //__________________ Méto constructor de lista, para instansiar
    public lista(){
        this.nodeFirst = null;
    }

    //__________________ Función para añadir nodos al inicio
    public void addfirst (String gateName, int number){
        if (this.nodeFirst == null){
            this.nodeFirst = new node(gateName, checkNumberGate(number));
            listLenght++;
            System.out.println("Compuerta creada: " + listLenght);
        }else{
            node n = new node(gateName, checkNumberGate(number));
            n.nextNode =  this.nodeFirst;
            this.nodeFirst = n;
            listLenght++;
            System.out.println("Compuerta creada: " + listLenght);
        }
    }


    //__________________    Método para seleccionar nodo
    public GridPane addGridPane(){
        node temp = this.nodeFirst;
        return temp.getGridPaneGate();
    }




    //________________      Método para imprimir la lista de los nodos
    public void printList(){
        node temp = this.nodeFirst;
        while(temp != null){
            System.out.println(temp.getGateName());
            temp = temp.nextNode;
        }
    }


}

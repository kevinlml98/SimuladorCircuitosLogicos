package sample;

public class lista {

    //____________Se instancia el Nodo

    node nodeFirst;
    private int listLenght = 0;

    public lista(){
        this.nodeFirst = null;
    }

    //__________________Función para añadir nodos al inicio
    public void addfirst (String gateName){
        if (this.nodeFirst == null){
            this.nodeFirst = new node(gateName);
            listLenght++;
            System.out.println("Compuerta creada");
        }else{
            node n = new node(gateName);
            n.nextNode =  this.nodeFirst;
            this.nodeFirst = n;
            listLenght++;
        }
    }

    //________________      Función para imprimir la lista de los nodos
    public void printList(){
        node temp = this.nodeFirst;
        while(temp != null){
            System.out.println(temp.getGateName());
            temp = temp.nextNode;
        }
    }


}

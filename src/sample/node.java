package sample;

public class node {

    //___________________   Se declaran los argumentos del nodo; entradas conectadas, valor que posee las entradas, salida y nombre de la compuerta

    node nextNode;
    private boolean inPut1Val;
    private boolean inPut2Val;
    private boolean outPut;

    private String gateName;
    private String inPut1Name;
    private String inPut2Name;


    public node(String a){
        gateName = a;
        inPut1Val = false;
        inPut2Val = false;
        inPut1Name = "FREE";
        inPut2Name = "FREE";
        if(a.equals("NOT")){
            outPut = typeGate(inPut1Val);
        }else{
            outPut = typeGate(a,inPut1Val,inPut2Val);
        }
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

        System.out.println("Inicia la asignación salidas según el nombre de la compuerta");
        switch (nombre)
        {
            case "AND":
                if((inPut1Val == true) & (inPut2Val == true)){
                    return true;
                }else{
                    return false;
                }
            case "NAND":
                if((inPut1Val == true) & (inPut2Val == true)){
                    return false;
                }else{
                    return true;
                }

            case "OR":
                if((inPut1Val == true) | (inPut2Val == true)){
                    return true;
                }else{
                    return false;
                }
            case "NOR":
                if((inPut1Val == true) | (inPut2Val == true)){
                    return false;
                }else{
                    return true;
                }
            case "XOR":
                if(inPut1Val == inPut2Val){
                    return false;
                }else{
                    return true;
                }
            case "XNOR":
                if(inPut1Val == inPut2Val){
                    return true;
                }else{
                    return false;
                }

            default:
                System.out.println("Error al asignar valor a la compuerta");
                return false;
        }

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



}

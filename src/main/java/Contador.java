//Clase Contador
public class Contador {

    //Propiedades
    private int cont;

    //Constructor por defecto
    public Contador(){
    }

    //Constructor con parámetros
    public Contador(int cont){
        if(cont < 0){
            this.cont = 0;
        } else{
            this.cont = cont;
        }
    }

    //Constructor por copia
    public Contador(final Contador c){
        cont = c.cont;
    }

    //Getter
    public int getCont() {
        return cont;
    }

    //Setter
    public void setCont(int cont) {
        if(cont < 0){
            this.cont = 0;
        }else{
            this.cont = cont;
        }
    }

    //Método incrementar contador
    public void incrementar(){
        cont++;
    }

    //Método decrementar contador
    public void decrementar(){
        cont--;
        if(cont < 0){
            cont = 0;
        }
    }
}

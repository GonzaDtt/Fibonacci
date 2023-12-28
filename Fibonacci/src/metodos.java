
public class metodos {
    public int numero;

    public metodos(int numero) {
        this.numero = numero;
    }
    
    public int hacerMulti(){
        int n1=0, n2=1 ,rta;
        
        for(int i=0; i<numero; i++){
            rta = n1;
            n1 = n2;
            n2 = rta+n1;
            if(n2>numero){
               break; 
            }
            System.out.println(" "+n2);
        }
      
      return n2;
    }
}

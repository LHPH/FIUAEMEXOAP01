package organizacion;

public class Hash {
    public Hash() {
        super();
    }
    
    
    public int formula(String clave){
        int [] u = new int[4];
        int i,ind=0,n;
        for(i=0;i<4;i++){
            u[i]=Integer.parseInt(""+(clave.charAt(i)));      
        }
        n=0;
        for(i=0;i<4;i++){
            n=n+u[i];
            }
        n=n*100;
        ind= ((int)(n / 4)) + 1;
        return ind;
        }
    

}

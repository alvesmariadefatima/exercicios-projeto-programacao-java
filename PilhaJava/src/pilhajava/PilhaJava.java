package pilhajava;


public class PilhaJava {
    String objeto1;
    String objeto2;
    String objeto3;
    String codigo1;
    String codigo2;
    String codigo3;
    
    PilhaJava(String objeto1, String objeto2, String objeto3){
        this.objeto1 = objeto1;
        this.objeto2 = objeto2;
        this.objeto3 = objeto3;
        this.codigo1 = codigo1;
        this.codigo2 = codigo2;
        this.codigo3 = codigo3;
        
    }

    PilhaJava(String uva, String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public String getObjeto1(){
        return this.objeto1;
    }
    public void setObjeto1(){
        this.objeto1 = objeto1;
    }
    public String getObjeto2(){
        return this.objeto2;
    }
    public void setObjeto2(){
        this.objeto2 = objeto2;
    }
    public String setObjeto3(){
        return this.objeto3;
    }
    public void getObjeto3(){
        this.objeto3 = objeto3;
    }
    public String getCodigo1(){
        return this.codigo1;
    }
    public void setCodigo1(){
        this.codigo1 = codigo1;
    }
    public String getCodigo2(){
        return this.codigo2;
    }
    public void setCodigo2(){
        this.codigo2 = codigo2;
    }
    public String getCodigo3(){
        return this.codigo3;
    }
    public void setCodigo3(){
        this.codigo3 = codigo3;
    }
    public String toString(){
        return "Nome do objeto: " + this.objeto1 + "Código: " + this.codigo1;
    
}
    
}

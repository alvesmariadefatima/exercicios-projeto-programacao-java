package cartaoweb;

public class Main {
    public static void main(String [] args){
     DiaDosNamorados diadosnamorados = new DiaDosNamorados("João");
     Aniversario aniversario = new Aniversario("Maria");
     Natal natal = new Natal("Jessica");
     
     diadosnamorados.showMessage();
     aniversario.showMessage();
     natal.showMessage();
    }

}

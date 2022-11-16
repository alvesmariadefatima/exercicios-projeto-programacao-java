package cartaoweb;

public class DiaDosNamorados extends CartaoWeb{
    
    DiaDosNamorados(String destinatario){
        super(destinatario);
    }

    @Override
    public void showMessage() {
        System.out.println("12/06 - Feliz dia dos damorados, " + destinatario + "!");
    }
}

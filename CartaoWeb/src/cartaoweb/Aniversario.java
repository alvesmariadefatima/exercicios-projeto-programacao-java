package cartaoweb;

public class Aniversario extends CartaoWeb{
    
    Aniversario(String destinatario){
        super(destinatario);
    }

    public void showMessage() {
        System.out.println("05/06 - Feliz Aniversário, " + destinatario + "!");
    }
}

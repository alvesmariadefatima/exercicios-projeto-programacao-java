package cartaoweb;

public class Natal extends CartaoWeb {
    
    Natal(String destinatario){
        super(destinatario);
    }

    public void showMessage() {
        System.out.println("25/12 - Feliz Natal, " + destinatario + "!");
    }
}

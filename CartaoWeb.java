package cartaoweb;

public abstract class CartaoWeb {
    String destinatario;
    CartaoWeb(String destinatario){
        this.destinatario = destinatario;
    }
    public abstract void showMessage();
}

package colecoes;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class Main {
    public static void main(String [] args){
        Livro livro1 = new Livro("O Diário de Anne Frank", "54324");
        Livro livro2 = new Livro("A Culpa é Das Estrelas", "76633");
        Livro livro3 = new Livro("Harry Potter", "647383");
        
        List<Livro> listaLivros = new ArrayList<Livro>();
        Stack<Livro> pilhaLivros = new Stack<Livro>();
        Queue <Livro> filaLivros = new LinkedList <Livro>();
        
        filaLivros.add(livro1);
        filaLivros.add(livro2);
        
            listaLivros.add(livro1);
            listaLivros.add(livro2);
            
            pilhaLivros.push(livro1);
            pilhaLivros.push(livro2);
            
            listaLivros.add(livro3);
            listaLivros.add(livro3);
            
            pilhaLivros.push(livro2);
            pilhaLivros.push(livro3);
            
            pilhaLivros.pop();
            
            System.out.println("Pilha: \n " + pilhaLivros);
            System.out.println("Topo: " + pilhaLivros.peek());
        
            //for (int i = 0; i < listaLivros.size(); i++){
           //     System.out.println(listaLivros.get(i));
           // }
            
    }
}

package heranca;

public class Main {
    public static void main(String [] args){
        Aluno aluno = new Aluno("1234", "Maria", "98543");
        
        Professor professor = new Professor("Yana", "9843", 1245);
        
        System.out.println(aluno.getNome());
        System.out.println(professor.getNome());
    }
}

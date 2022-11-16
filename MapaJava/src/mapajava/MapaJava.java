package mapajava;

import java.util.HashMap;
import java.util.Map;

public class MapaJava {
    
    public static void main(String[] args) {
        Map<String, String> agenda = new HashMap<String, String>();
        
        agenda.put("Maria de Fatima", "(82) 99834-3593");
        agenda.put("Júlia", "8583-5543");
        agenda.put("Marcela", "8745-9807");
        
        String removerContato = "Julia";
        
        for(String remover: agenda.keySet()){
            if(agenda.equals(removerContato)){
                agenda.remove(removerContato);
            }
        }
        for(String remover: agenda.keySet()){
            System.out.println("Nome Completo: " + remover + " \n Contato: " + agenda.get(remover));
        }
        
    }
    
}

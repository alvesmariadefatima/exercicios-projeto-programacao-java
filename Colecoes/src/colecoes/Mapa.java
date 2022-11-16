package colecoes;

import java.util.HashMap;
import java.util.Map;

public class Mapa {
    public static void main(String[] args) {
        Map<String, String> mapaDDD = new HashMap<String, String>();
        
        mapaDDD.put("Alagoas", "082");
        mapaDDD.put("Pernambuco", "087");
        mapaDDD.put("Bahia", "088");
        
        String estadoR = "Bahia";
        
        for(String estado: mapaDDD.keySet()){
            if(estado.equals(estadoR)){
                mapaDDD.remove(estado);
            }
        }
        
       for(String estado: mapaDDD.keySet()){
           System.out.println("Estado: " + estado + " DDD: " + mapaDDD.get(estado));
       }
    }
}

package cursojava.devdojo.maratonajava.javacore.Ycolecoes.test;

import java.util.HashMap;
import java.util.Map;

public class MapTest01 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("Teklado", "Teclado");
        map.put("Mouze", "Mouse");
        map.put("Vc", "voce");
        map.putIfAbsent("Vc", "voce2");

        System.out.println(map);
        for (String key: map.keySet()) {
            System.out.println(key + ": "+ map.get(key));
            
        }
        System.out.println("------------");
        for (String value: map.values()) {
            System.out.println(value);
            
        }
        System.out.println("----------");
        for (Map.Entry<String, String > entry: map.entrySet())
        System.out.println(entry.getKey()+"-"+entry.getValue());

    }
}

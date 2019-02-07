package tp2ex6;

import java.util.HashMap;
import java.util.Map;

public class Card {
    
    private int value;
    private Color color;
    private String name;
    
    private Map <String,Integer> initialiseMap (){
        
        Map <String,Integer> map = new HashMap <>();
        
        map.put("as",1);
        map.put("deux", 2);
        map.put("trois",3);
        map.put("quatre",4);
        map.put("cinq", 5);
        map.put("six",6);
        map.put("sept",7);
        map.put("huit",8);
        map.put("neuf",9);
        map.put("dix",10);
        map.put("valet",10);
        map.put("reine",10);
        map.put("roi",10);
        map.put("jack", 11);
                
        return map;
    }
            
    public Card (Color c, int v){
        
    }
    
}

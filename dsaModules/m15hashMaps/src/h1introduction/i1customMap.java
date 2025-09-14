package h1introduction;

public class i1customMap {
    private Entity[] entities;

    public i1customMap(){
        entities = new Entity[100];
    }

    private class Entity{
        String key;
        int value;

        public Entity(String key, int value){
            this.key = key;
            this.value = value;
        }
    }

    public void put(String key, int value){
        int hash = Math.abs(key.hashCode() % entities.length);
        entities[hash] = new Entity(key, value);
    }

    public int get(String key){
        int hash = Math.abs(key.hashCode() % entities.length);
        if(entities[hash] != null && entities[hash].key.equals(key) ){
            return entities[hash].value;
        }
        return 0;
    }

    public void remove(String key){
        int hash = Math.abs(key.hashCode() % entities.length);
        if(entities[hash] != null && entities[hash].key.equals(key)){
            entities[hash] = null;
        }
    }


    public static void main(String[] args) {
        i1customMap map = new i1customMap();
        map.put("sandip", 70);
        map.put("anup", 82);
        map.put("ayush", 95);
        map.put("madam", 89);

        System.out.println(map.get("anup"));
        System.out.println(map.get("madam"));
    }
}

package h1introduction;

import javax.swing.text.html.parser.Entity;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class i2finalMap<K, V> {
    private ArrayList<LinkedList<Entity>> list;
    private int size = 0;
    private float lf = 0.5f;

    public i2finalMap(){
        list = new ArrayList<>();
        for(int i=0; i<10; i++){
            list.add(new LinkedList<>());
        }
    }

    private class Entity{
        K key;
        V value;

        public Entity(K key, V value){
            this.key = key;
            this.value = value;
        }
    }

    public void put(K key, V value){
        int hash = Math.abs(key.hashCode() % list.size());
        LinkedList<Entity> LL = list.get(hash);
        for(Entity entity : LL){
            if(entity.key.equals(key)){
                entity.value = value;
            }
        }

        if(size / list.size() > lf){
            reHash();
        }
        LL.add(new Entity(key, value));
        size++;
    }
    private void reHash(){
        ArrayList<LinkedList<Entity>> old = list;
        list = new ArrayList<>();

        for(int i=0; i<old.size()*2; i++){
            list.add(new LinkedList<>());
        }

        for(LinkedList<Entity> LL : old) {
            for (Entity entity : LL) {
                put(entity.key, entity.value);
            }
        }
    }

    public V get(K key){
        int hash = Math.abs(key.hashCode() % list.size());
        LinkedList<Entity> LL = list.get(hash);
        for(Entity entity : LL){
            if(entity.key.equals(key)){
                return entity.value;
            }
        }
        return null;
    }

    public void remove(K key){
        int hash = Math.abs(key.hashCode() % list.size());
        LinkedList<Entity> LL = list.get(hash);
        Entity target = null;
        for(Entity entity : LL){
            if(entity.key.equals(key)){
                target = entity;
                break;
            }
        }

        LL.remove(target);
        size--;
    }

    public static void main(String[] args) {

    }
}

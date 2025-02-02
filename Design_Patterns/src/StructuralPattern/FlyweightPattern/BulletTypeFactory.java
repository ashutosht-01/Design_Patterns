package StructuralPattern.FlyweightPattern;

import java.util.HashMap;
import java.util.Map;

public class BulletTypeFactory {
    private static Map<String,BulletType> cache= new HashMap<>();

    public static BulletType  getBulletTypeInstance(String type){
        if(cache.containsKey(type)){
            return cache.get(type);
        }
        BulletType bulletType = new BulletType(type);
        cache.put(type,bulletType);
        return bulletType;
    }

}

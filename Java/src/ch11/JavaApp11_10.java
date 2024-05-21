package ch11;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

public class JavaApp11_10 {
    public static void main(String[] args) {
        //创建哈希映射hm存放西游记人物信息，键是编号，值是任务姓名
        HashMap<String,String> hm=new HashMap<>();
        //添加元素
        hm.put("006", "唐僧");
        hm.put("007", "孙悟空");
        hm.put("008", "猪八戒");
        hm.put("009", "沙和尚");
        hm.put("010", "白龙马");
        System.out.println(hm);
        //获得hm的所有键所形成的集合视图
        Set<String> keys=hm.keySet();
        Iterator<String> it=keys.iterator();
        while (it.hasNext()) {
            String key =it.next();
            String name=hm.get(key);
            System.out.println(key+name);
        }
        TreeMap<String,String> tm=new TreeMap<>();
        tm.putAll(tm);
    }
}

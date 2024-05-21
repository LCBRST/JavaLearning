package ch11;

import java.util.HashSet;

import java.util.Iterator;
import java.util.TreeSet;

public class JavaApp11_9 {
    public static void main(String[] args) {
        //程序运行时将在命令行方式下输入的每个字符串添加到哈希集合中，集合中已经有的元素不能添加，并将重复元素输出，最后对集合进行遍历输出其所有元素

        //创建哈希集合 hs
        HashSet<String> hs=new HashSet<>();
        
        //遍历args字符串数组
        // for(int i=0;i<args.length;i++){
        //     hs.add(args[i]);
        // }
        for(String e: args){
            if(!hs.add(e)){
                System.out.print(e);
            }
        }
        //遍历hs中的所有元素
        System.out.println(hs);
        //利用迭代器遍历哈希集合hs
        //首先获得hs的遍历器
        Iterator<String> it =hs.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        System.out.println("哈希集合为"+hs);

        //然后再利用hs创建树集合对象ts，之后利用树集合的相应方法输出某些元素
        //利用hs创建树集合ts
        TreeSet<String> ts=new TreeSet<>(hs);
        System.out.println("树集合为"+ts);
        System.out.println(ts.first());
        System.out.println(ts.last());

        System.out.println(ts.headSet("a"));
        System.out.println(ts.tailSet("b"));

    }
}

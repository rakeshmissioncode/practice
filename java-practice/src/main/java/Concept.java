import java.awt.*;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

public class Concept {

    public static void main(String[] args) {

        Map map=new ConcurrentHashMap();

        List<String> list= new CopyOnWriteArrayList<>();

        list.add("rakesh");
        list.add("Sinha");

        Iterator it= list.iterator();

        list.stream().forEach(s-> {
            System.out.println(s);
            list.add("just");
        });



    }


}

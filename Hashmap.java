import java.util.*;

public class Hashmap
{
    public static void main(String[] args)
    {
        HashMap<String,Integer> hashMap = new HashMap<>();

        hashMap.put("A", 6);
        hashMap.put("B", 2);
        hashMap.put("C", 19);
        hashMap.put("D", 9);
        hashMap.put("E", 13);
        hashMap.put("F", 1);

        List<Map.Entry<String,Integer>> list = new LinkedList<>(hashMap.entrySet());

        Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> v1, Map.Entry<String, Integer> v2)
            {
                return (v1.getValue().compareTo(v2.getValue()));
            }
        });

        HashMap<String,Integer> sortedMap = new LinkedHashMap<>();
        for (Map.Entry<String, Integer> aa : list)
        {
            sortedMap.put(aa.getKey(),aa.getValue());
        }
        System.out.println(sortedMap);
    }
}
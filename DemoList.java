import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class DemoList {
    public static void main(String[] args)
    {
        List<Float> list= new ArrayList<Float>();
        Scanner scanner= new Scanner(System.in);
        for(int i=0;i<5;i++)
        {
            list.add(scanner.nextFloat());
        }
        Iterator<Float> iterator= list.iterator();
        while (iterator.hasNext())
        {
            System.out.println(iterator.next());
        }

    }
}

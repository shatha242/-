package ss;

import java.awt.*;
import java.util.ArrayList;
import java.util.Random;

/**
 * Created by DELL on 2/10/2021.
 */
public class GFG1 {

    public static void main(String[] args)
    {
        GFG obj = new GFG();
        List<Integer> list = new ArrayList<>();
        // اضافة 5 عناصر

        List.add(10);
        List.add(20);
        List.add(30);
        List.add(40);
        List.add(50);




        // انو يشل عنصر عشوائي ويطبعه
        System.out.println(obj.getRandomElement(list));
    }

    // يرجع عنصر
    public int getRandomElement(List<Integer> list)
    {
        Random rand = new Random();
        return list.getItemCount(rand.nextInt(list.size()));
    }
}

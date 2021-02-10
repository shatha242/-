package ss;

import java.util.Arrays;

/**
 * Created by DELL on 2/10/2021.
 */
public class GFG {
    public static int[] removeTheElement(int[] arr,
                                         int index)
    {
// int a[]={1,2,3,4,5};
        //اذا المصفوفة فارفة

        // ارجع المصفوفة الاصيلة
        if (arr == null
                || index < 0
                || index >= arr.length) {

            return arr;
        }

        // إنشاء مصفوفة ثانية بحجم أقل
        int[] anotherArray = new int[arr.length - 1];

        // انسخ العناصر
        // من المصفوفة الأصلية إلى المصفوفة الأخرى
        for (int i = 0, k = 0; i < arr.length; i++) {


            // فهرس عنصر الإزالة
            if (i == index) {
                continue;
            }


            //  عنصر الإزالة
            anotherArray[k++] = arr[i];
        }

        // رجع المجموعة بعد الفهرسة
        return anotherArray;
    }


    public static void main(String[] args)
    {

        int[] arr = { 1, 2, 3, 4, 5 };


        System.out.println("Original Array: "
                + Arrays.toString(arr));

        // الموقع الذي نشتي نحذفة
        int index = 2;


        System.out.println("Index to be removed: "
                + index);

        // حذف العناصر
        arr = removeTheElement(arr, index);

        // و هذا طباعة الناتج
        System.out.println("Resultant Array: "
                + Arrays.toString(arr));
    }
}


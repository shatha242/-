package ss;

import java.net.SocketPermission;

/**
 * Created by DELL on 2/8/2021.
 */
public class main2 {

    public static void main(String[] args) {
       int a[]={1,2,3,4};
        int b[]=new int[a.length];
        for (int i=0;i<a.length;i++) {
            b=a;
        }
      //  b=a;
      //  b[0]++;
        a[2]=100;



        System.out.println("content of a[] ");
        for (int i=0;i<a.length;i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println("\n\ncontent of b[] ");
        for (int i=0;i<b.length;i++)
            System.out.print(b[i]+" ");
    }
}

package ss;

/**
 * Created by DELL on 2/8/2021.
 */
public class main {
    public static void main(String[] args) {
        Integer[] intAarray={1,2,3,4,5};
        System.out.println(" original Array:");
        for (int i=0;i<intAarray.length;i++)
            System.out.print(intAarray[i]+" ");
       System.out.println();
        System.out.println("original Array printed in reverse order");
        for (int i=intAarray.length-1;i>=0;i--)
            System.out.print(intAarray [i]+" ");
    }
}

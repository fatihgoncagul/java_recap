package arrays;

import java.util.Arrays;

public class Java2DArrays {

    public static void main(String[] args) {

        int[][] array = {{1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        //we can initialize a two dimensional array without specifying the size
        //here we specified only the outer size, length
        //rowth,columnth
        int[][] newArr= new int[3][];
        int[][] newarr2= new int[4][4];
        System.out.println("newarr2 length: " + newarr2.length);
        for (int[] outer: newarr2){
            System.out.println(Arrays.toString(outer));
        }
        for (int i = 0; i < newarr2.length; i++) {
            var innerArray = newarr2[i];
            for (int j = 0; j <innerArray.length; j++) {
                System.out.println(newarr2[i][j] + " " );
            }
            System.out.println();

        }

        System.out.println("-".repeat(20));

        for (var outer: newarr2){
            for(var element:outer){
                System.out.print(element+" ");
            }
            System.out.println();
        }

        for (int i = 0; i < newarr2.length; i++) {
            var innerArray = newarr2[i];
            for (int j = 0; j <innerArray.length; j++) {
                newarr2[i][j] = (i*10)+(j+1);
                System.out.print(newarr2[i][j] + " " );
            }
            System.out.println();

        }

        System.out.println(Arrays.deepToString(newarr2));
        newarr2[1] = new int[]{10,20,30};
        System.out.println(Arrays.deepToString(newarr2));
        //third dimensional arrays
        Object[] anyArr= new Object[3];
        System.out.println(Arrays.toString(anyArr));
        anyArr[0] = new String[] {"a","b","c"};
        System.out.println(Arrays.deepToString(anyArr));
        anyArr[1] = new int[][]{{1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        anyArr[2] = new int[2][2][2];
        System.out.println(Arrays.deepToString(anyArr));

        for (Object element: anyArr){
            System.out.println("element type: "+element.getClass().getSimpleName());
            System.out.println("element toString() = "+element);
            System.out.println(Arrays.deepToString((Object[]) element));
        }
        //stringler Object'e cast edilemez
        //array kullanırken spesifik şekilde dizi kullanmalıyız



    }


}

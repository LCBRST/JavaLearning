package ch05;

public class JavaApp5_4 {

    public static void main(String[] args){
        //声明二维数组，并开辟空间
        // int[][] a=new int[2][3];
        // 声明二维数组
        int[][] a;
        // 开辟空间
        a=new int[3][2];
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                System.out.println(a[i][j]+" ");
            }
            System.out.println();
        }
        // for (int[] row : a) {
        //     for (int col : row) {
        //         System.out.println(col+" ");
        //     }
        // System.out.println();
        // }
    }
}
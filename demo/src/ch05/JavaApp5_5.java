package ch05;

public class JavaApp5_5 {
    // 杨辉三角
    public static void main(String[] args) {
        int n=10;
        int[][] yh=new int[n][];
        for(int i=0;i<yh.length;i++){
            yh[i]=new int[i+1];
        }
        yh[0][0]=1;
        for(int i=1;i<yh.length;i++){
            yh[i][0]=1;
            yh[i][yh.length-1]=1;
            for(int j=1;j<yh[i].length-1;j++){
                yh[i][j]=yh[i-1][j]+yh[i-1][j-1];
            }
        }
        for(int[] row:yh){
            for(int col:row){
                System.out.println(col+" ");
            }
            System.out.println();
        }
    }
}

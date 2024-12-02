package Threads.Problems;
class ThreadMatrix extends Thread{
    int [][]a;
    int [][]b;
    int [][]c;
    int row ,col;
    ThreadMatrix(int [][]a,int [][]b,int [][]c,int row,int col){
        this.a = a;
        this.b = b;
        this.c = c;
        this.row = row;
        this.col = col;
    }
        public void run() {
        int sum=0;
        for(int i=0;i<b.length;i++){
           sum+=a[row][i]*b[i][col];
        }
        c[row][col]=sum;
    }
}
public class MatrixMultiplication {
    public static void main(String[] args) {
        int a[][]={{1,2,3},
                   {4,5,6}};

        int b[][]={{7,8},
                   {9,10},
                   {11,12}};
        int row=a.length;
        int col=b[0].length;
        int d[][]=new int[row][col];

        Thread[][] obj=new Thread[row][col];

        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){

                obj[i][j]=new ThreadMatrix(a,b,d,row,col) ;
                obj[i][j].start();
            }
        }

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                try {
                    obj[i][j].join(); // Ensure this thread completes
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }


        System.out.println("Resultant Matrix:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(d[i][j] + " ");
            }
            System.out.println();
        }
    }
}

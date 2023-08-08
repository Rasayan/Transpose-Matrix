import java.util.Scanner;
public class transposeMatrix {
    int [][]arr;
    int [][]brr;
    int n;
    void input() {

        Scanner sc= new Scanner(System.in);
        System.out.println(".........Enter Dimension..........");
        n= sc.nextInt();
        System.out.println("............Enter Elements...............");
        arr= new int[n][n];
        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("...The Array Is...");

        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    void checkTranspose() {
        brr = new int[n][n];
        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                brr[j][i] = arr[i][j];
            }
        }
    }

    void display() {
        System.out.println("Elements after Transposing is .............");
        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                System.out.print(brr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        transposeMatrix trn = new transposeMatrix();
        trn.input();
        trn.checkTranspose();
        trn.display();

    }
}

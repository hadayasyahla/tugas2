/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Matriks;

/**
 *
 * @author AVITA
 */
public class No2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int [][] A={
            {2,4},
            {6,1},
            {20,13}
        };
        int [][] B ={
            {31,12},
            {43,32},
            {25,22},
        };
        if((A.length == B.length) && (A[0].length == B[0].length)){
            int [][] C = new int[A.length][A[0].length];
            for(int i=0; i<A.length; i++){
                for(int j=0; j<A[0].length; j++){
                    C[i][j] += A[i][j]-B[i][j];
                }
            }
            for (int []c :C){
                for(int q : c){
                    System.out.print(q+" ");
                }
                System.out.println();
        }
        } else {
            System.out.println("Ukuran Matrix Tidak Sama");
        }
        System.out.println("Nurul Lia Syahla Hadaya");
    }
    
}

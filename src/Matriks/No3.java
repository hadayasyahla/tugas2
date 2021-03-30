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
public class No3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         int [][] A={
            {3,8,5},
            {16,12,20}
        };
        int [][] B ={
            {3,5},
            {10,8},
            {15,20}
        };
        if(A.length == B[0].length){
            int C[][]= new int[A.length][B[0].length];
            for(int i=0; i<A.length; i++){
                for(int j=0; j<B[0].length; j++){
                    for(int k=0; k<A[0].length; k++){
                        C[i][j] += A[i][k]*B[k][j];
                }
                }
            }
            for (int []c :C){
                for(int i : c){
                    System.out.print(i+" ");
                }
                System.out.println();
           }
        } else {
            System.out.println("Ukuran Baris A tidak Sama Dengan Kolom B");
        }
        System.out.println();
        System.out.println("Nurul Lita Syahla Hadaya");
    }
    
}

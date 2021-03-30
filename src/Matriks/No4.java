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
public class No4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int [][] B={
            {3,7,8},
            {2,4,6}
        };
        System.out.println("Matriks Sebelum Tranpose: ") ;
        int[][]Btranpose = new int[3][2];
        for(int i=0;i<B.length; i++){
            for(int j=0; j<B[0].length; j++){
                System.out.print(B[i][j]+" ");
            }
            System.out.println();
        }
        for(int i=0; i<B.length; i++){
            for(int j=0; j<B[0].length;j++){
                Btranpose[j][i]= B[i][j];
            }
        }
        System.out.println("Matriks Sesudah Tranpose : ");
        for(int i=0;i<B[0].length; i++){
            for(int j=0; j<B.length;j++){
                System.out.print(Btranpose[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("Nurul Lita Syahla Hadaya");

    }
    
}

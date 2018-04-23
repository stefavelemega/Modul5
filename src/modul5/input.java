/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul5;

import java.util.Scanner;

/**
 *
 * @author WINDOWS 10
 */

public final class input{
    public float NIM;
    public float kelompok;
     public float hasil;
    proses pro;
    public input(){
     pro = new proses();//inisialisasi obkject ope dari class proses
     inputdata(); //memanggil method input data
    }
    public void inputdata(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Masukan NIM anda(2112001-2112100)");
        NIM = scan.nextInt();
        pro.NIM = this.NIM;
}   

    public void kel(){
        
        if(pro.proses1() >= 2112001 && pro.proses1()<2112021){
            kelompok = 1;
        }
        else if(pro.proses1() >= 2112021 && pro.proses1()<2112041){
            kelompok = 2;}
        else if(pro.proses1() >= 2112041 && pro.proses1()<2112061){
            kelompok = 3;
        }
        else if(pro.proses1() >= 2112061 && pro.proses1()<2112081){
            kelompok = 4;
        }
        else if(pro.proses1() >= 2112081 && pro.proses1()<2112100){
            kelompok = 5;
        }
        else{
            kelompok=0;
        }
        System.out.println("Program Selesai");
    }
    public void print(){
        System.out.println("Anda kelompok " + kelompok);
    }
    }


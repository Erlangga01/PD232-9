
import java.io.*;
public class pert9 {
    public static int totalSPP;//variabel global (bisa dibaca disemua blok program)
    public static void main (String [] args){
        //step 3
        BufferedReader a = new BufferedReader
        (new InputStreamReader (System.in));
        //soal latihan1
        //step 2
        try {

            do { 
                //logika program
            String nim, nama;
            int jml_semester;

            //MENU DG SWITCH CASE
            System.out.println("-----------------");
            System.out.println("1.input data");
            System.out.println("2.output data");
            System.out.println("3.log out");
            System.out.println("-----------------");
            System.out.print("pilih menu : ");
            //inputan dg bufferdreader (tipe: int)
            int menu = Integer.parseInt(a.readLine());
            switch (menu) {
                case 1://menu 1  
                    System.out.print("nim : ");
                    //input bufferdreader tipe string
                    nim = a.readLine();
                    System.out.print("nama : ");
                    nama = a.readLine();
                    System.out.print("semester yang ditempuh : ");
                    jml_semester = Integer.parseInt(a.readLine());
                    totalSPP(jml_semester);
                    System.out.print("total SPP : " + totalSPP(jml_semester));

                    break;//program break 1
                case 2://menu 2
                    //cetak data (nim,nama,jml semester,totalSPP)
                    break;          
                default://else
                    System.exit(0);//perintah keluar program
                }
            } while (true);
            
            }catch (Exception e){
            //jika ada kesalahan dari blok try
            //kelebihan:error mudah dipahami
            System.out.println("eror adalah: " + e.getMessage());
        }   
    }
    //membuat fungsi
    static public int totalSPP(int smt){
        //nilai yang dikembalikan = totalSPP
        totalSPP = smt * 15000000;
        return totalSPP;

    }
    //membuat prosedur
    static public void cetakData(){

    }

}
 
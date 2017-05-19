package tugaspbo;

//mengimport library
import java.util.HashMap;
import java.util.Scanner;
import java.util.ArrayList;

public class TugasPBO {
    public static void main(String[] args) {
        //buat object ArrayList, HashMap, Scanner
        ArrayList<Sosmed> list = new ArrayList<>();
        ArrayList<Sosmed> list2 = new ArrayList<>();
        HashMap<String, ArrayList> dataHash = new HashMap<String, ArrayList>();
        Scanner input = new Scanner(System.in);
        
        //membuat tipe data
        String nama, email, jenisKelamin;
        int mengulang;
        int group;
        
        System.out.println("------------------------------------");
        System.out.println("            SOSIAL MEDIA            ");
        System.out.println("------------------------------------");
        
         //membuat try catch
        try{
            //membuat perulangan do while untuk inputan data
            do{
                System.out.print("PILIH GROUP SOSIAL MEDIA ANTARA 1/2 : ");
                group = input.nextInt();
                
                if(group == 1){
                    System.out.print("Masukkan nama  : ");
                    nama = input.next();
            
                    System.out.print("Masukkan email : ");
                    email = input.next();
            
                    System.out.print("Masukkan jenis kelamin : ");
                    jenisKelamin = input.next();
            
                    list.add(new Sosmed(nama, email, jenisKelamin));
                }
                else{
                    System.out.print("Masukkan nama  : ");
                    nama = input.next();
            
                    System.out.print("Masukkan email : ");
                    email = input.next();
            
                    System.out.print("Masukkan jenis kelamin : ");
                    jenisKelamin = input.next();
            
                    list2.add(new Sosmed(nama, email, jenisKelamin));
                }
            
                System.out.print("\nTekan 1 untuk menambah data dan 0 untuk berhenti : ");
                mengulang = input.nextInt();
                System.out.println("");
            }
            while(mengulang != 0);
        }
        catch(java.util.InputMismatchException a){
            System.err.println("INPUTAN SALAH, INPUT GROUP HARUS ANGKA!");
        }
        System.out.println("--------------------------------");
        dataHash.put("group1",list);
        dataHash.put("group2", list2);
        
        System.out.println("GROUP 1");
        list.forEach((a) -> { 
            System.out.println("Nama : "+a.getNama()+"\nEmail : "+a.getEmail()+"\nJenis Kelamin : "+a.getJenisKelamin());
        });
        System.out.println();
        System.out.println("GROUP 2");
        list2.forEach((b) -> {
            System.out.println("Nama : "+b.getNama()+"\nEmail : "+b.getEmail()+"\nJenis Kelamin : "+b.getJenisKelamin());
        });
    }
}

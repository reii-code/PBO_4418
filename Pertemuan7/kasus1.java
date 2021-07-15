/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kasus1;

/**
 *
 * @author raka
 */
import java.util.Scanner;
import java.util.ArrayList;

class Universitas{
    public String matkul, mtkuliah, setjdwl, nmdsn, nmmhs, nim, nidn, matkulpengampu;
    public int nilaimatkulpokok;
    public int nilaimatkultmb;
    int nilaiakhir;
    ArrayList<String> dosen=new ArrayList<String>();
    public static ArrayList<ArrayList<String>> jadwal = new ArrayList<ArrayList<String>>();
    public static ArrayList<ArrayList<String>> mahasiswa = new ArrayList<ArrayList<String>>();
    public static ArrayList<ArrayList<String>> pengampu1 = new ArrayList<ArrayList<String>>();
    public static ArrayList<ArrayList<String>> pengampu2 = new ArrayList<ArrayList<String>>();
    public static ArrayList<ArrayList<String>> mapelmhs = new ArrayList<ArrayList<String>>();
    
    public int set_nilaimatkulpokok(){
        Scanner inputnilai=new Scanner(System.in);
        System.out.print("\nSilahkan masukkan nilai matakuliah pokok: ");
        nilaimatkulpokok=inputnilai.nextInt();
        return nilaimatkulpokok;   
    }
    
    public int set_nilaimatkultmb(){
        Scanner inputnilaitambah=new Scanner(System.in);
        System.out.print("\nSilahkan masukkan nilai matakuliah tambah: ");
        nilaimatkultmb=inputnilaitambah.nextInt();
        return nilaimatkultmb;   
    }
    
    public int get_nilaiakhir(){
        nilaiakhir=(((60/100)*nilaimatkulpokok)+((40/100)*nilaimatkultmb));
            System.out.print(nilaiakhir);
        return nilaiakhir;
    }
    
    public void set_matkul(){
        this.matkul=matkul;
    }
    
    public void set_nmmhs(){
        Scanner inputmhs=new Scanner(System.in);
        System.out.print("\nSilahkan masukkan nama Mahasiswa: ");  
        nmmhs=inputmhs.nextLine();
        this.nmmhs=nmmhs;
    }
    
    public void set_nim(){
        Scanner inputmhs=new Scanner(System.in);
        System.out.print("\nSilahkan masukkan nim anda: ");
        nim=inputmhs.nextLine();
        this.nim=nim;
    }
    
    public void set_mtkuliah(){
        Scanner inputmhs=new Scanner(System.in);
        System.out.print("\nSilahkan masukkan matakuliah yang ingin anda ambil: ");
        mtkuliah=inputmhs.nextLine();
        this.mtkuliah=mtkuliah;
    }
    
    public void set_nmdsn(){
        Scanner inputdosen=new Scanner(System.in);
        System.out.print("\nSilahkan masukkan nama Dosen: ");
        nmdsn=inputdosen.nextLine();
        this.nmdsn=nmdsn;
    }
    
    public void set_nidn(){
        Scanner inputdosen=new Scanner(System.in);
        System.out.print("\nSilahkan masukkan nip anda: ");
        nidn=inputdosen.nextLine();
        this.nidn=nidn;
    }

    public void set_matkulpengampu(){
        Scanner inputdata=new Scanner(System.in);
        System.out.print("\nSilahkan masukkan matakuliah yang anda ampu: ");
        matkulpengampu=inputdata.nextLine();
        this.matkulpengampu=matkulpengampu;
    }
    
    public void get_datadosen(){
        System.out.println("_____________________________");
        System.out.println("Data Dosen: ");
        for(int i=0; i < pengampu2.size(); i++){
            int x = i+1;
            System.out.println("Data ke-"+x);
            System.out.println("Nama     :"+pengampu2.get(i).get(0));
            System.out.println("NIP      :"+pengampu2.get(i).get(1));
            System.out.println("Matkul yang di ampu "+pengampu2.get(i).get(2));
            System.out.println("");
        }
    }
    
    public void set_dosenpengampu(){
        int p=pengampu2.size();
        
        set_nmdsn();
        set_nidn();
        set_matkulpengampu();
        pengampu2.add(new ArrayList<String>());
        pengampu2.get(p).add(0,nmdsn);
        pengampu2.get(p).add(1,nidn);
        pengampu2.get(p).add(2,matkulpengampu);
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kasus1;

/**
 *
 * @author DEVI
 */
import java.util.Scanner;
import java.util.ArrayList;

class Universitas{
    public String matkul, mtkuliah, setjdwl, nmdsn, nmmhs, nim, nidn, matkulpengampu;
    public int nilaimatkulpokok;
    public int nilaimatkultmb;
    int nilaiakhir;
    ArrayList<String> dosen=new ArrayList<String>();
    public static ArrayList<ArrayList<String>> jadwal = new ArrayList<ArrayList<String>>();
    public static ArrayList<ArrayList<String>> mahasiswa = new ArrayList<ArrayList<String>>();
    public static ArrayList<ArrayList<String>> pengampu1 = new ArrayList<ArrayList<String>>();
    public static ArrayList<ArrayList<String>> pengampu2 = new ArrayList<ArrayList<String>>();
    public static ArrayList<ArrayList<String>> mapelmhs = new ArrayList<ArrayList<String>>();
    
    public int set_nilaimatkulpokok(){
        Scanner inputnilai=new Scanner(System.in);
        System.out.print("\nSilahkan masukkan nilai matakuliah pokok: ");
        nilaimatkulpokok=inputnilai.nextInt();
        return nilaimatkulpokok;   
    }
    
    public int set_nilaimatkultmb(){
        Scanner inputnilaitambah=new Scanner(System.in);
        System.out.print("\nSilahkan masukkan nilai matakuliah tambah: ");
        nilaimatkultmb=inputnilaitambah.nextInt();
        return nilaimatkultmb;   
    }
    
    public int get_nilaiakhir(){
        nilaiakhir=(((60/100)*nilaimatkulpokok)+((40/100)*nilaimatkultmb));
            System.out.print(nilaiakhir);
        return nilaiakhir;
    }
    
    public void set_matkul(){
        this.matkul=matkul;
    }
    
    public void set_nmmhs(){
        Scanner inputmhs=new Scanner(System.in);
        System.out.print("\nSilahkan masukkan nama Mahasiswa: ");  
        nmmhs=inputmhs.nextLine();
        this.nmmhs=nmmhs;
    }
    
    public void set_nim(){
        Scanner inputmhs=new Scanner(System.in);
        System.out.print("\nSilahkan masukkan nim anda: ");
        nim=inputmhs.nextLine();
        this.nim=nim;
    }
    
    public void set_mtkuliah(){
        Scanner inputmhs=new Scanner(System.in);
        System.out.print("\nSilahkan masukkan matakuliah yang ingin anda ambil: ");
        mtkuliah=inputmhs.nextLine();
        this.mtkuliah=mtkuliah;
    }
    
    public void set_nmdsn(){
        Scanner inputdosen=new Scanner(System.in);
        System.out.print("\nSilahkan masukkan nama Dosen: ");
        nmdsn=inputdosen.nextLine();
        this.nmdsn=nmdsn;
    }
    
    public void set_nidn(){
        Scanner inputdosen=new Scanner(System.in);
        System.out.print("\nSilahkan masukkan nip anda: ");
        nidn=inputdosen.nextLine();
        this.nidn=nidn;
    }

    public void set_matkulpengampu(){
        Scanner inputdata=new Scanner(System.in);
        System.out.print("\nSilahkan masukkan matakuliah yang anda ampu: ");
        matkulpengampu=inputdata.nextLine();
        this.matkulpengampu=matkulpengampu;
    }
    
    public void get_datadosen(){
        System.out.println("_____________________________");
        System.out.println("Data Dosen: ");
        for(int i=0; i < pengampu2.size(); i++){
            int x = i+1;
            System.out.println("Data ke-"+x);
            System.out.println("Nama     :"+pengampu2.get(i).get(0));
            System.out.println("NIP      :"+pengampu2.get(i).get(1));
            System.out.println("Matkul yang di ampu "+pengampu2.get(i).get(2));
            System.out.println("");
        }
    }
    
    public void set_dosenpengampu(){
        int p=pengampu2.size();
        
        set_nmdsn();
        set_nidn();
        set_matkulpengampu();
        pengampu2.add(new ArrayList<String>());
        pengampu2.get(p).add(0,nmdsn);
        pengampu2.get(p).add(1,nidn);
        pengampu2.get(p).add(2,matkulpengampu);
       
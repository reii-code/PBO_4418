/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author asus
 */
package bukuu;



public class bukuu {
    public static void main(String[] args) {
        Buku Foundation = new Buku("Foundation ActionScript", "Sham Bangal", "friends of ED", 2000);
        
        Foundation.cetakBuku();
       
    }
}

class Buku {
    private String judul;
    private String pengarang;
    private String penerbit;
    private int tahun;

    Buku() {

    }

    public Buku(String judul, String pengarang, String penerbit, int tahun) {
        this.judul = judul;
        this.pengarang = pengarang;
        this.penerbit = penerbit;
        this.tahun = tahun;
    }

    public void cetakBuku() {
        System.out.println(this.judul + ", " + this.pengarang + ", " + this.penerbit + ", " + this.tahun);
    }
}

    public class bukuu{
        
    
            
    /**
     * @param args the command line arguments
     */
     public static void main(String[] args) {
                
        bukuu buku = new buku();
                
        // atribut
        buku.judul = "Foundation ActioScript";
        buku.pengarang = "Sham Bangal";
        buku.penerbit = "friends of ED";
        buku.tahun = 2000;
                
        System.out.printin("judul" + bukujudul);
        System.out.printin("pengarang" + buku.pengarang);
        System.out.printin("penerbit" + buku.penerbit);
        System.out.printin("tahun" + buku.tahun);
                
            }
            
    }
package latihan1;

public class latihan4 {

    public static void main(String[] args) {    
        // Deklarasi variabel
        int a = 5;
        int b = 5;
        int sukusaatini;
        
        for(int i=0; i<5;i++){// Membuat pola angka ke bawah
            for(int j=i; j<5; j++){// Membuat pola angka ke samping
                sukusaatini = a;
                a += b;
                System.out.print(sukusaatini+" ");// Menampilkan nilai berikutnya dan membuat space antara angka        
            }
            System.out.println("");// Untuk mengakhiri baris dan membuat baris baru 
                    
         }
     }
  }
    


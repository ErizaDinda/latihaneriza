package latihan1;

public class latihan3 {

    public static void main(String[] args) {
        // Deklarasi variabel
        int a = 5;
        int b = 5;
        int sukusaatini;
        
        for(int i=1;i<=4;i++){// Membuat pola angka kebawah
            for(int j=0;j<i;j++){// Membuat pola angka kesamping
                sukusaatini = a;
                a += b;
                System.out.print(sukusaatini+" ");// Menampilkan nilai berikutnya dan membuat space diantara angka
            }
            System.out.println("");// Mengakhiri baris dan membuat baris baru
        }
    }
  }
   

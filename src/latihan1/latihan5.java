package latihan1;

public class latihan5 {

    public static void main(String[] args) {
     int matriksA [] [] = {{1, 6}, {5, 3}}; //Deklarasi matriks A dengan ordo 2.2
     int matriksB [] [] = {{2}, {3}}; //Deklarasi matriks B dengan ordo 1.1
     int hasilKali [] [] = new int [matriksA.length] [matriksB[0].length]; //Mendeklarasi hasil kali matriks dengan ordo dari matriks A dan matriks B
     //Matriks A (baris) Matriks B (kolom)
  
        System.out.println("Matriks A * Matriks B : ");
        
        for (int i = 0; i < matriksA.length; i++ ){         //Baris Matriks A
            for (int j = 0; j < matriksB[0].length; j++){   //Kolom Matriks B
                
                for (int k =0; k < matriksB.length; k++){   //Kolom Matriks A atau Baris  Matriks B 
                    hasilKali [i] [j] += matriksA [i] [k] * matriksB [k] [j]; //Operasi menghitung hasil jumlah kedua matriks
                }
                    System.out.print(hasilKali [i] [j] + "  "); //Mencetak matriks hasil kali
            }
                    System.out.println(" ");
        }   
         
    }
    
}
    
    


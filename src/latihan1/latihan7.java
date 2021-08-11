package latihan1;

public class latihan7 {

    public static void main(String[] args) {
    int matriksA [] [] = {{1}, {3}, {6}};//Deklarasi matriks A
    int matriksB [] [] = {{2, 4, 6}};//Deklarasi matriks B
    int hasilKali [] [] = new int [matriksA.length] [matriksB[0].length];//Mendeklarasi hasil kali matriks dengan ordo dari matriks A dan matriks B
    
        System.out.println("Matriks A * Matriks B : ");
       
         for (int i = 0; i < matriksA.length; i++ ){//Baris Matriks A
            for (int j = 0; j < matriksB[0].length; j++){//Kolom Matriks B
                
                for (int k =0; k < matriksB.length; k++){//Kolom Matriks A atau Baris  Matriks B 
                    hasilKali [i] [j] += matriksA [i] [k] * matriksB [k] [j];//Operasi menghitung hasil jumlah kedua matriks
                }
                    System.out.print(hasilKali [i] [j] + "     ");//Mencetak matriks hasil kali
            }
                    System.out.println(" ");
        }
     }
    
}
   

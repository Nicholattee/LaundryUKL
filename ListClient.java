package laundry;

/**
 *
 * @author ZAKARIA
 */
public class ListClient {
    /** pemeberian nilai pada array "list" dengan tipe class Client */
    Client[] list = {
        new Client(1, "JoJo", "Malang", "0341", 50000),
        new Client(2, "Dio", "Surabaya", "031", 100000),
        new Client(3, "Jono", "Madura", "0331", 150000)
    };
    
    /** method untuk menampilkan data list client */
     public void viewListClient(){
        System.out.println("--- List Laundry ---");
        System.out.println("ID \t Nama \t Alamat \t Saldo");
        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i].getIdClient()+" \t "
            + list[i].getNama()+ " \t "
            + list[i].getAlamat() + " \t "
            + list[i].getSaldo());
        }
    }
    
    public int cariClient(int id){
        int foundIndex = 0;
        /** pencarian data berdasarkan id */
        for (int i = 0; i < list.length; i++) {
            
            /** jika id yang dicari ditemukan */
            if(list[i].getIdClient()== id){
                foundIndex = i; /** menyimpan nilai index dari data yg ditemukan */
            }
        }
        return foundIndex;
    }
}

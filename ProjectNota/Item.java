public class Item {
    private KertasHVS[] krhvs;
    private BukuTulis[] bktulis;
    private Pulpen[] pen;

    public Item(KertasHVS[]){

    }
    public Item(BukuTulis[]){

    }
    public Item(Pulpen[]){

    }
    public Item(BukuTulis[],Pulpen[]){

    }
    public Item(KertasHVS[],Pulpen[]){

    }
    public Item(BukuTulis[],KertasHVS[]){

    }
    public Item(BukuTulis[],KertasHVS[],Pulpen[]){

    }

    //get dan set
    public int getJumlahBukuTulis(){

    }

    public int getJumlahPen(){

    }

    public Pulpen[] getPen() {
        return pen;
    }

    public int getJumlahKertasHVS(){

    }

    public BukuTulis[] getBktulis() {
        return bktulis;
    }

    public KertasHVS[] getKrhvs() {
        return krhvs;
    }
}
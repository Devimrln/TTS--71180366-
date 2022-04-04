public class Nota {
    private String nonota;
    private String notelppembeli;
    private Item items;
    private String namapembeli;

    public Nota(String nonota, String namapembeli, String notelppembeli, Item items){

    }

    public void setNotelppembeli(String notelppembeli) {
        this.notelppembeli = notelppembeli;
    }

    public void getNamapembeli(String namapembeli) {
        return namapembeli;
    }

    public String getNonota() {
        return nonota;
    }

    public String getNamapembeli() {
        return namapembeli;
    }

    public void setNonota(String nonota) {
        this.nonota = nonota;
    }

    public void tampilNota(){

    }

    public String getNotelppembeli() {
        return notelppembeli;
    }

    public int hitungTotalBayar(){

    }
}

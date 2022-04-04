public class Main_71180366 {
    public double FeetIncToCm(int inch){
        if (inch<0 && inch!=0){
            double sisa = inch % 12;
            double inc = inch - sisa;
            System.out.println(inch +"inc = "+inc+"feet"+sisa+"inc");
            FeetIncToCm(sisa, inc);
        }
        else{
            return -1;
        }
    }
    public double FeetIncToCm(double feet, double inch){
        if (feet<= 12 && inch<=12 && feet>0 && inch>0){
            double cm = inch * 2,54;
            System.out.println("Nilai dalam centimeter: " + cm +"cm");
        }
        else{
            return -1;
        }
    }

    public void main(String[]){
        FeetIncToCm(1,3);
        FeetIncToCm(15);
    }
}

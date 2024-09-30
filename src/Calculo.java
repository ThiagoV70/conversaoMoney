public class Calculo {
    public int price;
    public double dollar;

    public double conversor(){
    double taxa = (dollar * 6)/100 + dollar;
    return price * taxa;

    }
}

package Dinero;

public class Individo extends Contribuinte{
    private double gastosSaude;

    public void setGastosSaude(double gastosSaude) {
        this.gastosSaude = gastosSaude;
    }

    public Individo(String nome, double rendaAnual, double gastosSaude) {
        super(nome, rendaAnual);
        this.gastosSaude = gastosSaude;
    }

    public Individo() {
    }

    @Override
    public double imposto() {
        double percentual = 0.25;
        if (this.getRendaAnual() < 20000){
            percentual = 0.15;
        }

        double taxa = (percentual * this.getRendaAnual()) - (gastosSaude/2);
        return taxa;
    }
}

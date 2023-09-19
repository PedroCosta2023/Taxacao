package Dinero;

public class Empresa extends Contribuinte{
    private int quantidadeFuncionarios;

    public Empresa(String nome, double rendaAnual, int quantidadeFuncionarios) {
        super(nome, rendaAnual);
        this.quantidadeFuncionarios = quantidadeFuncionarios;
    }

    public Empresa() {
    }

    public int getQuantidadeFuncionarios() {
        return quantidadeFuncionarios;
    }

    public void setQuantidadeFuncionarios(int quantidadeFuncionarios) {
        this.quantidadeFuncionarios = quantidadeFuncionarios;
    }

    @Override
    public double imposto() {
        double percentual = 0.16;
        if (quantidadeFuncionarios > 10){
            percentual = 0.14;
        }

        double taxa = this.getRendaAnual() * percentual;
        return taxa;
    }
}

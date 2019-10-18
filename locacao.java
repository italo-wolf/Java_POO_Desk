package trabalho_de_.n2;

/**
 *
 * @author Italo
 */
public class locacao {

    private int cod_Loca;
    private Cliente cliente;
    private Veiculo veiculo;
    private String dataLocacao;
    private String dataDevolucao;
    private String status_loca;

    public locacao() {
    }

    public locacao(int cod_Loca, Cliente cliente, Veiculo veiculo, String dataLocacao, String dataDevolucao,String status_loca) {
        this.cod_Loca = cod_Loca;
        this.cliente = cliente;
        this.veiculo = veiculo;
        this.dataLocacao = dataLocacao;
        this.dataDevolucao = dataDevolucao;
        this.status_loca = status_loca;
    }

    public int getCod_Loca() {
        return cod_Loca;
    }

    public void setCod_Loca(int cod_Loca) {
        this.cod_Loca = cod_Loca;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    public String getDataLocacao() {
        return dataLocacao;
    }

    public void setDataLocacao(String dataLocacao) {
        this.dataLocacao = dataLocacao;
    }

    public String getDataDevolucao() {
        return dataDevolucao;
    }

    public void setDataDevolucao(String dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }

    @Override
    public String toString() {

        return this.getVeiculo().getPlaca();

    }

    /**
     * @return the status_loca
     */
    public String getStatus_loca() {
        return status_loca;
    }

    /**
     * @param status_loca the status_loca to set
     */
    public void setStatus_loca(String status_loca) {
        this.status_loca = status_loca;
    }

}

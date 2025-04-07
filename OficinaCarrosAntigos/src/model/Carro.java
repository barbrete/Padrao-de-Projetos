package src.model;
import java.time.LocalDate;
import src.Enum.StatusCarro;

public class Carro {

    private String marca;
    private String modelo;
    private int ano;
    private String placa;
    private StatusCarro status;
    private Cliente dono;
    private static int TotalCarros;

    @Override
    public String toString() {
        return  "marca: " + marca + 
                "\nmodelo: " + modelo + 
                "\nano: " + ano +
                "\nplaca: " + placa + 
                "\nstatus: " + status +
                "\nInformações do Cliente = " + dono.apresentacao();
                
    }

    public Carro() {
    }

    public Carro(String marca, String modelo, int ano, String placa, Cliente dono) {
        this.marca = marca;
        this.dono = dono;
        this.modelo = modelo;
        this.ano = ano;
        this.placa = placa;
        this.status = StatusCarro.RECEBIDO;
        Carro.TotalCarros ++;
    }
    
    //getters e setters
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public int getAno() {
        return ano;
    }
    public void setAno(int ano) {
        this.ano = ano;
    }
    public String getPlaca() {
        return placa;
    }
    public void setPlaca(String placa) {
        this.placa = placa;
    }
    public StatusCarro getStatus() {
        return status;
    }
    public void setStatus(StatusCarro status) {
        this.status = status;
    }
    public Cliente getDono() {
        return dono;
    }

    public void setDono(Cliente dono) {
        this.dono = dono;
    }
    public static int getTotalContas() { 
        return TotalCarros;
    }

    public static boolean VerificaSeCarroEClassico(int ano){
        LocalDate dataAtual = LocalDate.now();

        int anoAtual = dataAtual.getYear();
        int diferenca = anoAtual - ano;

        if (diferenca < 30){
            return false;
        }
        else{
            return true;
        }
    }

}

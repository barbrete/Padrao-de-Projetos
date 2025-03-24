package src.Model;
import java.time.LocalDate;

import src.Enum.StatusCarro;

public class Carro {

    private String marca;
    private String modelo;
    private int ano;
    private String placa;
    private StatusCarro status;
    private static int TotalCarros;

    public Carro(String marca, String modelo, int ano, String placa, StatusCarro status) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.placa = placa;
        this.status = status;
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
    public static int getTotalContas() { 
        return TotalCarros;
    }

    @Override
    public String toString() {
        return "Carro [marca=" + marca + ", modelo=" + modelo + ", ano=" + ano + ", placa=" + placa + ", status="
                + status + "]";
    }

    public boolean VerificaSeCarroEClassico(int ano){
        LocalDate dataAtual = LocalDate.now();

        int anoAtual = dataAtual.getYear();
        int diferenca = anoAtual - ano;

        if (diferenca < 30){
            return true;
        }
        else{
            return false;
        }
    }


}

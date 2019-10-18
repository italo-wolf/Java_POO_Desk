
package trabalho_de_.n2;

import java.io.Reader;

/**
 *
 * @author Italo
 */
public class Veiculo {
         
     private int codigo_v;
     private String placa;
     private String marca;
     private String modelo;
     private String locado;

    public Veiculo() {
    }

    public Veiculo(int codigo_v, String placa, String marca, String modelo, String locado) {
        this.codigo_v = codigo_v;
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.locado = locado;
    }

    
    
    public int getCodigo_v() {
        return codigo_v;
    }

    
    public void setCodigo_v(int codigo_v) {
        this.codigo_v = codigo_v;
    }

    
    public String getPlaca() {
        return placa;
    }

   
    public void setPlaca(String placa) {
        this.placa = placa;
    }

    
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

   
    public String getLocado() {
        return locado;
    }

   
    public void setLocado(String locado) {
        this.locado = locado;
    }
    public String toString(){
        return this.modelo;
       
    }
     
}

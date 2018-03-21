package cadastrocliente;

import java.util.Collection;

public class Pais {

    private String nomePais;
    private String sigla;

    public Pais(String nomePais, String sigla) {
        this.nomePais = nomePais;
        this.sigla = sigla;
    }

    public String getNomePais() {
        return nomePais;
    }

    public void setNomePais(String nomePais) {
        this.nomePais = nomePais;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    @Override
    public String toString() {
        return "Pais{" + "nomePais=" + nomePais + ", sigla=" + sigla + '}';
    }

    public boolean verificarNome(Collection<Pais> p) {

        boolean existe = false;

        for (Pais pais : p) {
            if (pais.getNomePais().equals(this.getNomePais())) {
                existe = true;
            }
        }
        return existe;
    }
}

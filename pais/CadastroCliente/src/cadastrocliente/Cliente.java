package cadastrocliente;

import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.GregorianCalendar;

public class Cliente {
    private String nome;
    private String telefone;
    private double limiteCredito;
    private Pais pais;
    private GregorianCalendar dataNasc;
    
    public Cliente() {
    }

    public Cliente(String nome) {
        this.nome = nome;
    }

    public Cliente(String nome, String telefone, double limiteCredito, Pais pais, GregorianCalendar dataNasc) {
        this.nome = nome;
        this.telefone = telefone;
        this.limiteCredito = limiteCredito;
        this.pais = pais;
        this.dataNasc = dataNasc;
    }

    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public double getLimiteCredito() {
        return limiteCredito;
    }

    public void setLimiteCredito(double limiteCredito) {
        this.limiteCredito = limiteCredito;
    }

    public Pais getPais() {
        return pais;
    }

    public void setPais(Pais pais) {
        this.pais = pais;
    }

    public GregorianCalendar getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(GregorianCalendar dataNasc) {
        this.dataNasc = dataNasc;
    }

    @Override
    public String toString() {
        return "Cliente{" + "nome=" + nome + ", telefone=" + telefone + ", limiteCredito=" + limiteCredito + ", pais=" + pais + ", dataNasc=" + dataNasc + '}';
    }

    
    
    
    public void cadastrarCliente(Cliente cliente){
        this.nome = cliente.getNome();
    }
    
    
    public boolean verificarNome(Collection<Cliente> c) {

        boolean existe = false;

        for (Cliente cliente : c) {
            if (cliente.getNome().equals(this.getNome())) {
                existe = true;
            }
        }
        return existe;
    }

    public boolean tamNome(){
        if(this.getNome().length() < 5){
            return false;
        }
        return true;
    }
    
     public boolean tamPais(){
        if(this.getPais() == null){
            return false;
        }
        return true;
    }
    
    
        public void atribuirLimite(){
            GregorianCalendar dataAtual = new GregorianCalendar();
            String local = pais.getNomePais();
            
            int idade = dataAtual.get(Calendar.YEAR) - this.getDataNasc().get(Calendar.YEAR);
            double credito = 0;
            
            
            if(idade <= 18){
                credito = 100;
            }else if(idade > 18 && idade <= 35){
                credito = 300;
            }else{
                credito = 500;
            }
            if(local.equals("brasil")){
             credito += 100;   
            }
            
            
            this.setLimiteCredito(credito);
        }
    }

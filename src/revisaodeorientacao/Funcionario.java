
package revisaodeorientacao;

public class Funcionario extends Pessoa {
    private int matricula;
    private String senha;
    private double valorHora;

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Double getValorHora() {
        return valorHora;
    }

    public void setValorHora(Double valorHora) {
        this.valorHora = valorHora;
    }
    
    public double calcularSalario(){
        return this.valorHora * 30;

    }
    public double calcularSalario(double descontos){
        return (this.valorHora * 30) - descontos;
      
    }
    public double gerarBonus(){
        return calcularSalario() * 0.1; 
        
    }
}

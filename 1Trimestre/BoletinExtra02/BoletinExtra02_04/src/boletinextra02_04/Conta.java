package boletinextra02_04;

import javax.swing.JOptionPane;

public class Conta {

    private String nome;
    private String nConta;
    private double tipoInterese;
    private double saldo;

    public Conta() {

    }

    public Conta(String nome, String nConta, double tipoInterese, double saldo) {
        this.nome = nome;
        this.nConta = nConta;
        this.tipoInterese = tipoInterese;
        this.saldo = saldo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getnConta() {
        return nConta;
    }

    public void setnConta(String nConta) {
        this.nConta = nConta;
    }

    public double getTipoInterese() {
        return tipoInterese;
    }

    public void setTipoInterese(double tipoInterese) {
        this.tipoInterese = tipoInterese;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void ingreso() {
        double cantidade = Double.parseDouble(JOptionPane.showInputDialog("Introduce a cantidade a ingresar: "));
        if (cantidade < 0) {
            System.out.println("La cantidad no puede ser menor que 0.");
        } else {
            saldo = saldo + cantidade;
            System.out.println("El saldo después del ingreso es: " + saldo + ".");
        }
    }

    public void reintegro() {
        double cantidade = Double.parseDouble(JOptionPane.showInputDialog("Introduce a cantidade a reintegrar: "));
        if (cantidade < 0) {
            System.out.println("La cantidad no puede ser menor que 0.");
        } else if (saldo < cantidade) {
            System.out.println("Saldo insuficiente para realizar el reintegro.");
        } else {
            saldo = saldo - cantidade;
            System.out.println("El saldo después del reintegro es: " + saldo + ".");
        }
    }

    public void transferencia(Conta cuentaDestino) {
        double importe = Double.parseDouble(JOptionPane.showInputDialog("Introduce a cantidade a transferir: "));
        if (importe < 0) {
            System.out.println("El importe de la transferencia no puede ser negativo.");
        } else if (saldo < importe) {
            System.out.println("Saldo insuficiente para realizar la transferencia.");
        } else {
            saldo -= importe;
            cuentaDestino.ingreso();
            System.out.println("Transferencia exitosa de " + importe + " a " + cuentaDestino.getNome() + ".");
        }
    }
}

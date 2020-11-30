package aula05;

public class ContaBanco {

    //Atributos
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;

    //metodos especiais

    public int getNumConta() {
        return numConta;
    }
    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }
    public void setDono(String dono) {
        this.dono = dono;
    }

    public float getSaldo() {
        return saldo;
    }
    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean getStatus() {
        return status;
    }
    public void setStatus(boolean status) {
        this.status = status;
    }

    // Construtor
    public ContaBanco(){
        this.saldo = 0;
        this.status = false;
    }

    public void estadoAtual(){
        System.out.println("--------------------------------");
        System.out.println("conta:"+this.getNumConta());
        System.out.println("nome:"+this.getDono());
        System.out.println("tipo:"+this.getTipo());
        System.out.println("saldo:"+this.getSaldo());
        System.out.println("status:"+this.getStatus());
    }

    public void abrirconta(String t){
        this.setTipo(t);
        this.setStatus(true);
        if (t.equals("CC")){
            this.saldo = 50;
        }else if (t.equals("CP")){
            this.saldo = 150;
        }
        System.out.println("Conta aberta com sucusso!");
    }

    public void fecharconta(){
        if(this.getSaldo() > 0){
            System.out.println("Conta nao pode ser fecchado prq ainda tem dinheiro");
        }else if(this.getSaldo() < 0){
            System.out.println("Conta noa pode ser fechada pois tem débito");
        }else {
            this.setStatus(false);
            System.out.println("Conta fechada com sucesso!");
        }
    }

    public void depositar(float v){
        if (this.getStatus()){
            //this.saldo = this.saldo = v;
            this.setSaldo(this.getSaldo()+v);
            System.out.println("deposito realixado na conta de "+this.getDono());
        }else{
            System.out.println("impossivel depositar em uma conta fechadad");
        }
    }

    public void sacar(float v){
        if(this.getStatus()){
            if (this.getSaldo() >= v){
                this.setSaldo(this.getSaldo()-v);
                System.out.println("Saque realizado na conta de "+this.getDono());
            }else{
                System.out.println("saldo insuficiente para saque");
            }
        }else{
            System.out.println("impossivel sacar de um conta fechada!");
        }
    }

    public void pagamensal(){
        int v = 0;
        if(this.getTipo() == "CC"){
            v = 12;
        }else if(this.getTipo() == "CP"){
            v = 20;
        }
        if (this.getStatus()){
            this.setSaldo(this.getSaldo() - v);
            System.out.println("mensasiladade paga com sucesso por "+this.getDono());
        }else{
            System.out.println("impossivel pagar uma conta fechada!");
        }
    }



}

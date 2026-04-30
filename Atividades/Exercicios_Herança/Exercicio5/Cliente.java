public class Cliente implements Autenticavel{
    private String nome;
    private int cpf;

    public Cliente(String nome, int cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    //Embora a senha do cliente aqui seja igual do Gerente, podem ser diferentes, inclusive o metódo de autenticação pode ser diferente contanto que eles compartilhem o "contrato" em si
    @Override
    public boolean autenticar(String senha) {
        return senha.equals("123");
    }

    public void exibirDados() {
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf);
    }
    
}
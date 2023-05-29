import br.com.alura.bytebank.template.CurrentAccount;

public class Test {
    public static void main(String[] args) {
        CurrentAccount currentAccount = new CurrentAccount();
        currentAccount.depositInAccount(1000);
        System.out.println(currentAccount.getBalance());
    }
}

package oop_concepts.heapnstack;

public class Account {


    int accountId;
    String accountName;

    public Account(int accountId, String accountName) {
        this.accountId = accountId;
        this.accountName = accountName;
    }

    public static void main(String[] args) {
        int accountId = 12;
        String accountName = "Fatih Goncagül";

        Account account =null;
        account = printfAccount(accountId,accountName);
    }

    static Account printfAccount(int accountId,String accountName){
        return new Account(accountId,accountName);//obje için de ayrı bi alan açılıyor heapte, stackte ise mem adress var
        
    }
}

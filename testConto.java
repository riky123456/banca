public class testConto {

    public static void main(String[] args) {

        Conto c1 = null;
        c1 = new Conto(15822, "GRIRCR95D03L304B", 1000, 0,100);

        if (c1.Prelievo() > 0 && c1.getPrel() != 0) {
            System.out.println("Prelievo effettuato. Saldo residuo:" + c1.Prelievo());
        }

        if (c1.Prelievo() < 0 && c1.getDep() != 0) {
            System.out.println("Importo richiesto superiore alla disponibilita' residua");
        }

        if (c1.getDep() > 0) {
            System.out.println("Deposito effettuato. Nuovo saldo:" +c1.Deposito());
        }
    }
}

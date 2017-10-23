 public class Conto {

        private int iban;
        private String cf;
        private double saldo;
        private double prel;
        private double dep;


/* stronzi */


        public Conto(int iban, String cf, double s, double p, double d) {
            this.iban = iban;
            this.cf = cf;
            saldo = s;
            prel = p;
            dep = d;
        }


        public double getPrel() {
            return prel;
        }

        public double getDep() {
            return dep;
        }



        public double Prelievo() {



            return saldo - prel;

        }

        public double Deposito () {          /*int i, double d, double s*/


            return saldo + dep;
        }
    }


public class Banca {

        private String nome;
        private String IBAN;
        private Conto[] conti;
        private int ContiInseriti;

        public Banca (String nome, int nConti) {
            this.conti = new Conto[nConti];
            ContiInseriti = 0;
            this.nome = nome;
            IBAN = "IT00000" + nome;

        }
    }

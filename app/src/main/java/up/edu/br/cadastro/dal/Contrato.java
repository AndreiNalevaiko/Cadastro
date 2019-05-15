package up.edu.br.cadastro.dal;

import android.provider.BaseColumns;

public final class Contrato {

    private Contrato(){

    }

    public abstract static class Tabela_Cidade implements BaseColumns {
        public static final String TABLE_NAME = "tb_Cidades";
        public static final String COLUNA_ID =  "CidadeId";
        public static final String COLUNA_NOME = "Nome";
        public static final String COLUNA_POPULACAO = "Populacao";
        public static final String COLUNA_ESTADO = "Estado";
    }


}

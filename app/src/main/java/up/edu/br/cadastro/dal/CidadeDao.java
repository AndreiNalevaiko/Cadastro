package up.edu.br.cadastro.dal;

import android.content.Context;

import up.edu.br.cadastro.model.Cidade;

public class CidadeDao {

    public static long cadastrarCidade(Context context, Cidade cidade ){
        Banco banco = new Banco(context);
        return banco.cadastrarCidade(cidade);
    }

}

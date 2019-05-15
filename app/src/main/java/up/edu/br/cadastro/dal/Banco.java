package up.edu.br.cadastro.dal;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import up.edu.br.cadastro.model.Cidade;

public class Banco extends SQLiteOpenHelper {

    private static final String NOME_DO_BANCO = "Cidades.db";
    private static final int VERSAO_DO_BANCO = 1;

    private static final String TEXT = " TEXT";
    private static final String INT = " INTEGER";

    public static final String CREATE_TABLE_CIDADE = "CREATE TABLE IF NOT EXISTS " + Contrato.Tabela_Cidade.TABLE_NAME + " ( " +
            Contrato.Tabela_Cidade.COLUNA_ID + INT +" NOT NULL PRIMARY KEY AUTOINCREMENT, " +
            Contrato.Tabela_Cidade.COLUNA_NOME + TEXT +", " +
            Contrato.Tabela_Cidade.COLUNA_POPULACAO + INT + ", " +
            Contrato.Tabela_Cidade.COLUNA_ESTADO + TEXT + " )";

    private static final String SQL_DROP_TABLE = "DROP TABLE IF NOT EXISTS " + Contrato.Tabela_Cidade.TABLE_NAME;

    public Banco(Context context) {
        super(context, NOME_DO_BANCO, null, VERSAO_DO_BANCO);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(CREATE_TABLE_CIDADE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL(SQL_DROP_TABLE);
    }

    public long cadastrarCidade(Cidade cidade){
        SQLiteDatabase db = getWritableDatabase();

        ContentValues values = new ContentValues();
        values.put(Contrato.Tabela_Cidade.COLUNA_NOME, cidade.getNome());
        values.put(Contrato.Tabela_Cidade.COLUNA_ESTADO, cidade.getEstado());
        values.put(Contrato.Tabela_Cidade.COLUNA_POPULACAO, cidade.getPopulacao());

        return db.insert(Contrato.Tabela_Cidade.TABLE_NAME, null, values);
    }
}


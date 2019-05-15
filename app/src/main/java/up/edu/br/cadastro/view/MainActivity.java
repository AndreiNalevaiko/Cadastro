package up.edu.br.cadastro.view;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import up.edu.br.cadastro.R;
import up.edu.br.cadastro.dal.CidadeDao;
import up.edu.br.cadastro.model.Cidade;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Cidade c = new Cidade();
        c.setEstado("Paraná");
        c.setNome("Curitiba");
        c.setPopulacao(1765000);

        long id = CidadeDao.cadastrarCidade(this, c);
        Toast.makeText(this, "Id " + id, Toast.LENGTH_SHORT).show();


    }
}

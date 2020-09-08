package br.edu.unifametro.gasolinaoualcool;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText editPrecoAlcool;
    private EditText editPrecoGasolina;
    private TextView textResultado;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Atribuição de variáveis aos IDs
        editPrecoAlcool = findViewById(R.id.editAlcool);
        editPrecoGasolina = findViewById(R.id.editGasolina);
        textResultado = findViewById(R.id.textResultado);
    }

    public void calcularPreco(View view){

        //Faz a conversão de string para number
        Double precoAlcool = Double.parseDouble(editPrecoAlcool.getText().toString());
        Double precoGasolina = Double.parseDouble(editPrecoGasolina.getText().toString());

        //Lógica
        /*
        * (precoAcool / precoGasolina)
        * Se o resultado for >= 0.7 melhor utilizar Gasolina
        * Se não, melhor utilizar Álcool
        * */

        Double resultado = precoAlcool / precoGasolina;

        if (resultado >= 0.7){
            textResultado.setText("Melhor utilizar GASOLINA!!");
        }else{
            textResultado.setText("Melhor utilizar ÁCOOL!!");
        }
    }
}
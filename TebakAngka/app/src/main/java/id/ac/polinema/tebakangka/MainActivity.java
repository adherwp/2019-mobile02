package id.ac.polinema.tebakangka;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;
import android.widget.Button;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

	//  TODO: deklarasikan variabel di sini
	private EditText angkaInput;
	int hasilRandom,min = 1,max = 100;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		// TODO: bind layout di sini
		angkaInput = findViewById(R.id.number_input);
		this.initRandomNumber();
	}

	// TODO: generate angka random di sini
	private void initRandomNumber() {
		Random angka = new Random();
		hasilRandom = angka.nextInt((max - min) + 1) + min;
	}

	public void handleGuess(View view) {
		// TODO: Tambahkan logika untuk melakukan pengecekan angka
		String ubah= angkaInput.getText().toString();
		int angka=Integer.parseInt(ubah);

		if(angka==hasilRandom){
			Toast.makeText(this,"Tebakan anda benar",Toast.LENGTH_SHORT).show();
		}else if(angka>hasilRandom){
			Toast.makeText(this,"Tebakan anda terlalu besar",Toast.LENGTH_SHORT).show();
		}else{
			Toast.makeText(this,"Teabakan anda terlalu kecil",Toast.LENGTH_SHORT).show();
		}

	}

	public void handleReset(View view) {
		// TODO: Reset tampilan
		angkaInput.setText(null);
		this.initRandomNumber();
	}
}

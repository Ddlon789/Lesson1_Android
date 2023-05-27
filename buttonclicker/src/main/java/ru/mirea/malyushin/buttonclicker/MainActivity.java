package ru.mirea.malyushin.buttonclicker;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private TextView textViewStudent;
    private Button btnWhoIAm;
    private Button btnItIsNotMe;
    private CheckBox checkBox;
    private Button btnCheckBox;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textViewStudent = findViewById(R.id.tvOut);
        btnItIsNotMe = findViewById(R.id.btnItIsNotMe);
        btnWhoIAm = findViewById(R.id.btnWhoAmI);
        checkBox = findViewById(R.id.checkBox);
        btnCheckBox = findViewById(R.id.btnCheckBox);

        View.OnClickListener oclClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textViewStudent.setText("Мой номер по списку 17");
            }
        };

        btnWhoIAm.setOnClickListener(oclClickListener);

        View.OnClickListener onClickListener2 = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkBox.setChecked(!checkBox.isChecked());
            }
        };

        btnCheckBox.setOnClickListener(onClickListener2);
    }

    public void onMyButtonClick2(View view) {
        Toast.makeText(this, "Это не я писал", Toast.LENGTH_LONG).show();
    }
}
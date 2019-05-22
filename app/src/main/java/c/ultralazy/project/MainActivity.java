package c.ultralazy.project;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayShowTitleEnabled(false);
        }
        Button instrB=(Button) findViewById(R.id.InstructionsB);
        instrB.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                builder.setTitle("Инструкция")
                        .setMessage("1.Тут нет сохранений.\n" +
                                    "2.Управление: просто нажимайте на одну из двух кнопок.\n" +
                                "3.Сюжет банальный.")
                        .setCancelable(false)
                        .setNegativeButton("Закрыть",
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int id) {
                                        dialog.cancel();
                                    }
                                });
                AlertDialog alert = builder.create();
                alert.show();
            }
        });
        Button beginB=(Button) findViewById(R.id.StartB);
        beginB.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent begin1=new Intent(MainActivity.this, Beginning.class);
                startActivity(begin1);
            }
        });
    }
}

package com.example.joker.mili;

import android.app.DatePickerDialog;
import android.app.ProgressDialog;
import android.app.TimePickerDialog;
import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TimePicker;
import android.widget.Toast;

public class Dialog extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dialog);

        Button btnprogress=(Button) findViewById(R.id.btn_progress);
        final Button btnalert=(Button) findViewById(R.id.btn_alert);
        final Button btntime=(Button) findViewById(R.id.btn_time);
        final Button btndate=(Button) findViewById(R.id.btn_date);


            btnprogress.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            final ProgressDialog progressDialog=new ProgressDialog(Dialog.this);
            progressDialog.setTitle("Connecting Through Server");
            progressDialog.setMessage("Please Wait ...");
            progressDialog.setCancelable(false);
            progressDialog.setButton("Close", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    progressDialog.dismiss();
                }
                   });
                    progressDialog.show();
                }
                });

            btnalert.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    final AlertDialog.Builder builder=new AlertDialog.Builder(Dialog.this);
                    builder.setMessage("Are you Sure?");
                    builder.setPositiveButton("yes", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            Toast.makeText(Dialog.this, "Your Answer was Yes", Toast.LENGTH_SHORT).show();
                        }
                    });
                    builder.setNegativeButton("No", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            Toast.makeText(Dialog.this, "Your Answer Was No", Toast.LENGTH_SHORT).show();
                        }
                    });
                    builder.setNeutralButton("Cancel", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            Toast.makeText(Dialog.this, "Your Answer Was Cancel", Toast.LENGTH_SHORT).show();;
                        }
                    });
                    builder.setCancelable(false);
                    builder.create().show();
                    }
                    });


            btntime.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    TimePickerDialog time=new TimePickerDialog(Dialog.this, new TimePickerDialog.OnTimeSetListener() {
                        @Override
                        public void onTimeSet(TimePicker timePicker, int i, int i1) {
                            Toast.makeText(Dialog.this,  i + ":" +i1, Toast.LENGTH_SHORT).show();
                        }
                    },7,45,false);
                    time.show();
                }
            });

            btndate.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    DatePickerDialog date=new DatePickerDialog(Dialog.this, new DatePickerDialog.OnDateSetListener() {
                        @Override
                        public void onDateSet(DatePicker datePicker, int i, int i1, int i2) {
                            Toast.makeText(Dialog.this, i+"/"+i1 +"/"+ i2, Toast.LENGTH_SHORT).show();
                        }
                    },2020,5,7);
                    date.show();
                }
            });

    }

}

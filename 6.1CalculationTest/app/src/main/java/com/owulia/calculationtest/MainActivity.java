package com.owulia.calculationtest;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.NavigationUI;

import android.content.DialogInterface;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    NavController controller;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        controller = Navigation.findNavController(this, R.id.fragment);
        NavigationUI.setupActionBarWithNavController(this, controller);

    }

    @Override
    public boolean onSupportNavigateUp() {

        if (controller.getCurrentDestination().getId() == R.id.questionFragment) {
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setTitle(getString(R.string.quit_dialog_title));
            builder.setPositiveButton(getString(R.string.dialog_positive_message), new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    controller.navigateUp();
                }
            });
            builder.setNegativeButton(getString(R.string.dialog_negative_message), new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                }
            });
            AlertDialog alertDialog = builder.create();
            alertDialog.show();
        } else {
            controller.navigate(R.id.titleFragment);
        }

        return super.onSupportNavigateUp();
    }

    @Override
    public void onBackPressed() {
//        super.onBackPressed();
        onSupportNavigateUp();
    }
}

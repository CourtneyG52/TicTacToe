package com.example.tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class PlayerSetup extends AppCompatActivity {

    private EditText playerOne;
    private EditText playerTwo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_player_setup);

        playerOne = findViewById(R.id.playerOneName);
        playerTwo = findViewById(R.id.playerTwoName);
    }

    public void enterSetUpButton(View view) {

        String playerOneName = playerOne.getText().toString();
        String playerTwoName = playerTwo.getText().toString();

        Intent intent = new Intent(this, GameDisplay.class);

        intent.putExtra("PLAYER_NAMES", new String[] {playerOneName, playerTwoName});
        startActivity(intent);
    }
}
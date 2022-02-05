package com.example.tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.view.View;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class GameDisplay extends AppCompatActivity {

    private TicTacBoard ticTacBoard;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_display);

        Button playAgain = findViewById(R.id.playAgainButton);
        Button goHome = findViewById(R.id.goHomeButton);
        TextView playerTurn = findViewById(R.id.playerDisplay);

        playAgain.setVisibility(View.GONE);
        goHome.setVisibility(View.GONE);

        String[] playerNames = getIntent().getStringArrayExtra("PLAYER_NAMES");

        if (playerNames != null) {
            playerTurn.setText((playerNames[0] + "'s Turn"));
        }


        ticTacBoard = findViewById(R.id.ticTacBoard);

        ticTacBoard.setUpGame(playAgain, goHome, playerTurn, playerNames);
    }

    public void playAgainButton (View view) {
        ticTacBoard.resetGame();
        ticTacBoard.invalidate();
    }

    public void goHomeButton (View view) {

        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);

    }
}
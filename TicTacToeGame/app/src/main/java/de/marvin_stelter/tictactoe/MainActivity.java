package de.marvin_stelter.tictactoe;

import android.app.*;
import android.os.*;
import android.view.*;
import android.widget.*;

public class MainActivity extends Activity 
{
	Button b1, b2, b3, b4, b5 , b6, b7, b8, b9;
	TextView tv_anzeige;
	String active_player = "X";
	int wins_x = 0;
	int wins_o = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
		iniViews();
		onClickListener();
		
		
    }
	private void iniViews(){
		b1 = (Button)findViewById(R.id.b1);
		b2 = (Button)findViewById(R.id.b2);
		b3 = (Button)findViewById(R.id.b3);
		b4 = (Button)findViewById(R.id.b4);
		b5 = (Button)findViewById(R.id.b5);
		b6 = (Button)findViewById(R.id.b6);
		b7 = (Button)findViewById(R.id.b7);
		b8 = (Button)findViewById(R.id.b8);
		b9 = (Button)findViewById(R.id.b9);
		tv_anzeige = (TextView)findViewById(R.id.tv_anzeige);		
		tv_anzeige.setText("Spieler X: " + Integer.toString(wins_x) + " Siege" + "\n" + "Spieler O: " + Integer.toString(wins_o) + " Siege");
	}
	
	private void onClickListener(){
		b1.setOnClickListener(new View.OnClickListener(){
				@Override
				public void onClick(View v){
					if(b1.getText().toString().length() <= 0){
						if(active_player == "X"){
							b1.setText(active_player);
							active_player = "O";
						}else{
							b1.setText(active_player);
							active_player = "X";
						}
					}
					checkForWin();
				}
			});
		b2.setOnClickListener(new View.OnClickListener(){
				@Override
				public void onClick(View v){
					if(b2.getText().toString().length() <= 0){
						if(active_player == "X"){
							b2.setText(active_player);
							active_player = "O";
						}else{
							b2.setText(active_player);
							active_player = "X";
						}
					}
					checkForWin();
				}
			});
		b3.setOnClickListener(new View.OnClickListener(){
				@Override
				public void onClick(View v){
					if(b3.getText().toString().length() <= 0){
						if(active_player == "X"){
							b3.setText(active_player);
							active_player = "O";
						}else{
							b3.setText(active_player);
							active_player = "X";
						}
					}
					checkForWin();
				}
			});
		b4.setOnClickListener(new View.OnClickListener(){
				@Override
				public void onClick(View v){
					if(b4.getText().toString().length() <= 0){
						if(active_player == "X"){
							b4.setText(active_player);
							active_player = "O";
						}else{
							b4.setText(active_player);
							active_player = "X";
						}
					}
					checkForWin();
				}
			});
		b5.setOnClickListener(new View.OnClickListener(){
				@Override
				public void onClick(View v){
					if(b5.getText().toString().length() <= 0){
						if(active_player == "X"){
							b5.setText(active_player);
							active_player = "O";
						}else{
							b5.setText(active_player);
							active_player = "X";
						}
					}
					checkForWin();
				}
			});
		b6.setOnClickListener(new View.OnClickListener(){
				@Override
				public void onClick(View v){
					if(b6.getText().toString().length() <= 0){
						if(active_player == "X"){
							b6.setText(active_player);
							active_player = "O";
						}else{
							b6.setText(active_player);
							active_player = "X";
						}
					}
					checkForWin();
				}
			});
		b7.setOnClickListener(new View.OnClickListener(){
				@Override
				public void onClick(View v){
					if(b7.getText().toString().length() <= 0){
						if(active_player == "X"){
							b7.setText(active_player);
							active_player = "O";
						}else{
							b7.setText(active_player);
							active_player = "X";
						}
					}
					checkForWin();
				}
			});
		b8.setOnClickListener(new View.OnClickListener(){
				@Override
				public void onClick(View v){
					if(b8.getText().toString().length() <= 0){
						if(active_player == "X"){
							b8.setText(active_player);
							active_player = "O";
						}else{
							b8.setText(active_player);
							active_player = "X";
						}
					}
					checkForWin();
				}
			});
		b9.setOnClickListener(new View.OnClickListener(){
				@Override
				public void onClick(View v){
					if(b9.getText().toString().length() <= 0){
						if(active_player == "X"){
							b9.setText(active_player);
							active_player = "O";
						}else{
							b9.setText(active_player);
							active_player = "X";
						}
					}
					checkForWin();
				}
			});
	}
	private void checkForWin(){
		
		//X
		if(b1.getText().toString() == "X" && b2.getText().toString() == "X" && b3.getText().toString() == "X" ){
			wins_x ++;
			tv_anzeige.setText("Spieler X: " + Integer.toString(wins_x) + " Siege" + "\n" + "Spieler O: " + Integer.toString(wins_o) + " Siege");
			restartGame();
		}
		if(b4.getText().toString() == "X" && b5.getText().toString() == "X" && b6.getText().toString() == "X"){
			wins_x ++;
			tv_anzeige.setText("Spieler X: " + Integer.toString(wins_x) + " Siege" + "\n" + "Spieler O: " + Integer.toString(wins_o) + " Siege");
			restartGame();
		}
		if(b7.getText().toString() == "X" && b8.getText().toString() == "X" && b9.getText().toString() == "X"){
			wins_x ++;
			tv_anzeige.setText("Spieler X: " + Integer.toString(wins_x) + " Siege" + "\n" + "Spieler O: " + Integer.toString(wins_o) + " Siege");
			restartGame();
		}
		
		if(b1.getText().toString() == "X" && b4.getText().toString() == "X" && b7.getText().toString() == "X" ){
			wins_x ++;
			tv_anzeige.setText("Spieler X: " + Integer.toString(wins_x) + " Siege" + "\n" + "Spieler O: " + Integer.toString(wins_o) + " Siege");
			restartGame();
		}
		if(b2.getText().toString() == "X" && b5.getText().toString() == "X" && b8.getText().toString() == "X"){
			wins_x ++;
			tv_anzeige.setText("Spieler X: " + Integer.toString(wins_x) + " Siege" + "\n" + "Spieler O: " + Integer.toString(wins_o) + " Siege");
			restartGame();
		}
		if(b3.getText().toString() == "X" && b6.getText().toString() == "X" && b9.getText().toString() == "X"){
			wins_x ++;
			tv_anzeige.setText("Spieler X: " + Integer.toString(wins_x) + " Siege" + "\n" + "Spieler O: " + Integer.toString(wins_o) + " Siege");
			restartGame();
		}
		
		if(b1.getText().toString() == "X" && b5.getText().toString() == "X" && b9.getText().toString() == "X" ){
			wins_x ++;
			tv_anzeige.setText("Spieler X: " + Integer.toString(wins_x) + " Siege" + "\n" + "Spieler O: " + Integer.toString(wins_o) + " Siege");
			restartGame();
		}
		if(b3.getText().toString() == "X" && b5.getText().toString() == "X" && b7.getText().toString() == "X"){
			wins_x ++;
			tv_anzeige.setText("Spieler X: " + Integer.toString(wins_x) + " Siege" + "\n" + "Spieler O: " + Integer.toString(wins_o) + " Siege");
			restartGame();
		}
		//O
		if(b1.getText().toString() == "O" && b2.getText().toString() == "O" && b3.getText().toString() == "O" ){
			wins_o ++;
			tv_anzeige.setText("Spieler X: " + Integer.toString(wins_x) + " Siege" + "\n" + "Spieler O: " + Integer.toString(wins_o) + " Siege");
			restartGame();
		}
		if(b4.getText().toString() == "O" && b5.getText().toString() == "O" && b6.getText().toString() == "O"){
			wins_o ++;
			tv_anzeige.setText("Spieler X: " + Integer.toString(wins_x) + " Siege" + "\n" + "Spieler O: " + Integer.toString(wins_o) + " Siege");
			restartGame();
		}
		if(b7.getText().toString() == "O" && b8.getText().toString() == "O" && b9.getText().toString() == "O"){
			wins_o ++;
			tv_anzeige.setText("Spieler X: " + Integer.toString(wins_x) + " Siege" + "\n" + "Spieler O: " + Integer.toString(wins_o) + " Siege");
			restartGame();
		}

		if(b1.getText().toString() == "O" && b4.getText().toString() == "O" && b7.getText().toString() == "O" ){
			wins_o ++;
			tv_anzeige.setText("Spieler X: " + Integer.toString(wins_x) + " Siege" + "\n" + "Spieler O: " + Integer.toString(wins_o) + " Siege");
			restartGame();
		}
		if(b2.getText().toString() == "O" && b5.getText().toString() == "O" && b8.getText().toString() == "O"){
			wins_o ++;
			tv_anzeige.setText("Spieler X: " + Integer.toString(wins_x) + " Siege" + "\n" + "Spieler O: " + Integer.toString(wins_o) + " Siege");
			restartGame();
		}
		if(b3.getText().toString() == "O" && b6.getText().toString() == "O" && b9.getText().toString() == "O"){
			wins_o ++;
			tv_anzeige.setText("Spieler X: " + Integer.toString(wins_x) + " Siege" + "\n" + "Spieler O: " + Integer.toString(wins_o) + " Siege");
			restartGame();
		}

		if(b1.getText().toString() == "O" && b5.getText().toString() == "O" && b9.getText().toString() == "O" ){
			wins_o ++;
			tv_anzeige.setText("Spieler X: " + Integer.toString(wins_x) + " Siege" + "\n" + "Spieler O: " + Integer.toString(wins_o) + " Siege");
			restartGame();
		}
		if(b3.getText().toString() == "O" && b5.getText().toString() == "O" && b7.getText().toString() == "O"){
			wins_o ++;
			tv_anzeige.setText("Spieler X: " + Integer.toString(wins_x) + " Siege" + "\n" + "Spieler O: " + Integer.toString(wins_o) + " Siege");
			restartGame();
		}
		if(b1.getText().toString().length() > 0 && b2.getText().toString().length() > 0 && b3.getText().toString().length() > 0 && b4.getText().toString().length() > 0 && b5.getText().toString().length() > 0 && b6.getText().toString().length() > 0 && b7.getText().toString().length() > 0 && b8.getText().toString().length() > 0 && b9.getText().toString().length() > 0){
			restartGame();
		}
	}
	private void restartGame(){
		b1.setText("");
		b2.setText("");
		b3.setText("");
		b4.setText("");
		b5.setText("");
		b6.setText("");
		b7.setText("");
		b8.setText("");
		b9.setText("");
		active_player = "X";
	}
}
	

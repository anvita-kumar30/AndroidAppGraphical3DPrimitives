package com.example.myapplicationexp2.ui;
import androidx.appcompat.app.AppCompatActivity;
import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.drawable.BitmapDrawable;
import android.widget.ImageView;
import android.os.Bundle;

import com.example.myapplicationexp2.R;

public class MainActivity extends AppCompatActivity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Creating a Bitmap
        Bitmap bg = Bitmap.createBitmap(720, 1280, Bitmap.Config.ARGB_8888);
        ImageView i = (ImageView) findViewById(R.id.imageView);
        i.setBackgroundDrawable(new BitmapDrawable(bg));
        //Creating the Canvas Object
        Canvas canvas = new Canvas(bg);
        //Creating the Paint Object and set its color & TextSize
        Paint paintBlack = new Paint();
        paintBlack.setColor(Color.BLACK);
        paintBlack.setTextSize(80);
        Paint paintBlue = new Paint();
        paintBlue.setColor(Color.BLUE);
        paintBlue.setTextSize(100);
        //To draw a Cube
        canvas.drawText("Cube", 50, 100, paintBlack);
        float[] p1 = {
                300,100,600,100,
                600,100,600,400,
                600,400,500,450,
                500,450,200,450,
                200,450,200,150,
                200,150,300,100,
                200,150,500,150,
                500,150,500,450,
                300,100,300,400,
                300,400,600,400,
                500,150,600,100,
                200,450,300,400
        };
        canvas.drawLines(p1, paintBlue);
        //To draw prism
        canvas.drawText("Prism", 400, 800, paintBlack);
        float[] points1 = {450, 950, 400, 1150, 450, 950, 500, 1150, 400, 1150, 500, 1150};
        canvas.drawLines(points1, paintBlue);
        float[] points2 = {650, 900, 600, 1100, 650, 900, 700, 1100, 600, 1100, 700, 1100};
        canvas.drawLines(points2, paintBlue);
        float[] points3 = {450, 950, 650, 900, 500, 1150, 700, 1100, 400, 1150, 600, 1100,};
        canvas.drawLines(points3, paintBlue);
    }
}

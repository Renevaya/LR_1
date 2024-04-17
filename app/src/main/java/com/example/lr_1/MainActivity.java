package com.example.lr_1;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity { //Он наследуется от AppCompatActivity, что предоставляет поддержку старых версий Android.

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState); //для выполнения базовой инициализации активности
        EdgeToEdge.enable(this); //включает полноэкранный режим
        setContentView(new DrawView(this)); //устанавливает макет для активности. Макет определяет визуальную структуру экрана
    }
    class DrawView extends View {
        Paint paint1; //Объект Paint используется для настройки кисти рисования
        Paint paint2;
        Paint paint3;
        Paint paint4;
        public DrawView(Context context){
            super(context); //вызывает конструктор родительского класса (View)
            paint1=new Paint();
            paint2=new Paint();
            paint3=new Paint();
            paint4=new Paint();
            paint1.setColor(Color.WHITE);
            paint2.setColor(Color.BLUE);
            paint3.setColor(Color.GREEN);
            paint4.setColor(Color.BLACK);
        }

        @Override
        protected void onDraw(Canvas canvas){ //это метод, который вызывается системой для отрисовки содержимого элемента View
            canvas.drawRect(50,50,900,900, paint3);
            canvas.drawCircle(200,1500,100,paint4);
            canvas.drawCircle(600,1500,100,paint4);
            canvas.drawCircle(200,1500,90,paint1);
            canvas.drawCircle(600,1500,90,paint1);

            canvas.drawRect(200, 1320, 600,1300, paint4);
            canvas.drawRect(200, 1500, 220,1300, paint4);
            canvas.drawRect(600, 1500, 620,1200, paint4);
            canvas.drawRect(600, 1220, 700,1200, paint4);
        }
    }
}
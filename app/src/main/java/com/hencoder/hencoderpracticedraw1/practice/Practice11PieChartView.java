package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice11PieChartView extends View {

    public Practice11PieChartView(Context context) {
        super(context);
    }

    public Practice11PieChartView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice11PieChartView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        //        综合练习
        //        练习内容：使用各种 Canvas.drawXXX() 方法画饼图
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(Color.RED);
        paint.setAntiAlias(true);
        RectF rectF1 = new RectF(130, 30, 630, 530);
        canvas.drawArc(rectF1, 180, 120, true, paint);

        RectF rectF = new RectF(150, 50, 650, 550);
        paint.setColor(Color.YELLOW);
        canvas.drawArc(rectF,300,60,true,paint);

        paint.setColor(Color.MAGENTA);
        canvas.drawArc(rectF,5,17,true,paint);

        paint.setColor(Color.GRAY);
        canvas.drawArc(rectF,23,20,true,paint);

        paint.setColor(Color.CYAN);
        canvas.drawArc(rectF,45,30,true,paint);

        paint.setColor(Color.BLUE);
        canvas.drawArc(rectF,80,95,true,paint);
    }
}

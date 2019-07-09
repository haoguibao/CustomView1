package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice10HistogramView extends View {

    public Practice10HistogramView(Context context) {
        super(context);
    }

    public Practice10HistogramView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice10HistogramView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        //        综合练习
        //        练习内容：使用各种 Canvas.drawXXX() 方法画直方图
        //柱状图宽度
        int myWidth = 100;
        //间隔宽度
        int myInterval = 20;
        String[] arrText = {"Froyo", "GB", "ICS", "JB", "KitKat", "L", "M"};

        Paint paint = new Paint();
        paint.setColor(Color.WHITE);
        paint.setStyle(Paint.Style.STROKE);
        Path path = new Path();
        path.moveTo(100, 500);
        path.lineTo(1000, 500);
        path.moveTo(100, 500);
        path.lineTo(100, 50);
        canvas.drawPath(path, paint);

        for (int i = 0; i < 7; i++) {
            Rect rect = new Rect();
            int left = 100 + myInterval * (i + 1)+myWidth*i;
            rect.set(left, (int)(Math.random()*10*50), left + myWidth, 500);
            paint.setColor(Color.GREEN);
            paint.setStyle(Paint.Style.FILL);
            canvas.drawRect(rect, paint);
            paint.setColor(Color.WHITE);
            paint.setTextSize(30);
            paint.setTextAlign(Paint.Align.CENTER);
            canvas.drawText(arrText[i], left+myWidth*1/2, 530, paint);
        }
    }
}

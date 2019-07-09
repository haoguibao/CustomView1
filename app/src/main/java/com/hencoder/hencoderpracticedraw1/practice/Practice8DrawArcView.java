package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice8DrawArcView extends View {

    public Practice8DrawArcView(Context context) {
        super(context);
    }

    public Practice8DrawArcView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice8DrawArcView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        练习内容：使用 canvas.drawArc() 方法画弧形和扇形
        Paint paint = new Paint();
        paint.setStrokeWidth(2);
        //弧线
        paint.setStyle(Paint.Style.STROKE);
        RectF rectF = new RectF(300, 200, 600, 500);
        canvas.drawArc(rectF,180,60,false,paint);
        //弧形
        paint.setStyle(Paint.Style.FILL);
        rectF.set(400,300,700,500);
        canvas.drawArc(rectF,0,180,false,paint);
        //扇形
        //paint.setStyle(Paint.Style.FILL);
        rectF.set(400,200,700,500);
        canvas.drawArc(rectF,230,110,true,paint);
    }
}

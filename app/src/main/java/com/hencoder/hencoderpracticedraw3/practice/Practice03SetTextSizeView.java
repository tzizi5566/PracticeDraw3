package com.hencoder.hencoderpracticedraw3.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice03SetTextSizeView extends View {

  Paint paint = new Paint(Paint.ANTI_ALIAS_FLAG);
  String text = "Hello HenCoder";

  public Practice03SetTextSizeView(Context context) {
    this(context, null);
  }

  public Practice03SetTextSizeView(Context context, @Nullable AttributeSet attrs) {
    this(context, attrs, 0);
  }

  public Practice03SetTextSizeView(Context context, @Nullable AttributeSet attrs,
      int defStyleAttr) {
    super(context, attrs, defStyleAttr);
  }

  @Override
  protected void onDraw(Canvas canvas) {
    super.onDraw(canvas);

    int y = 100;

    // 使用 paint.setTextSize() 来设置不同大小的文字

    // 第一处：文字大小 16
    paint.setTextSize(16f);
    canvas.drawText(text, 50, y, paint);

    y += 30;
    // 第一处：文字大小 24
    paint.setTextSize(24f);
    canvas.drawText(text, 50, y, paint);

    y += 55;
    // 第一处：文字大小 48
    paint.setTextSize(48f);
    canvas.drawText(text, 50, y, paint);

    y += 80;
    // 第一处：文字大小 72
    paint.setTextSize(72f);
    canvas.drawText(text, 50, y, paint);
  }
}
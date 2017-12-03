package com.hencoder.hencoderpracticedraw3.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.View;

public class Practice02StaticLayoutView extends View {

  TextPaint textPaint = new TextPaint(Paint.ANTI_ALIAS_FLAG);
  String text = "Hello\nHenCoder";
  private StaticLayout mStaticLayout;

  public Practice02StaticLayoutView(Context context) {
    this(context, null);
  }

  public Practice02StaticLayoutView(Context context, @Nullable AttributeSet attrs) {
    this(context, attrs, 0);
  }

  public Practice02StaticLayoutView(Context context, @Nullable AttributeSet attrs,
      int defStyleAttr) {
    super(context, attrs, defStyleAttr);
    mStaticLayout = new StaticLayout(
        text,
        textPaint,
        600,
        Layout.Alignment.ALIGN_NORMAL,
        1,
        0,
        true);
  }

  {
    textPaint.setTextSize(60);
  }

  @Override
  protected void onDraw(Canvas canvas) {
    super.onDraw(canvas);

    // 使用 StaticLayout 代替 Canvas.drawText() 来绘制文字，
    // 以绘制出带有换行的文字
    //canvas.drawText(text, 50, 100, textPaint);
    canvas.save();
    canvas.translate(50, 40);
    mStaticLayout.draw(canvas);
    canvas.restore();
  }
}

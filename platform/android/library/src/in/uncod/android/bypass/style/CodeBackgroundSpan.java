package in.uncod.android.bypass.style;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.text.style.LineBackgroundSpan;

/**
 * Shows a nice background behind code blocks
 */
public class CodeBackgroundSpan implements LineBackgroundSpan {

    private static final int GRAY = Color.argb(255, 236, 239, 241);

    private int mIndent;

    private Paint mPaint;

    public CodeBackgroundSpan(int indent) {
        mIndent = indent;

        mPaint = new Paint();
        mPaint.setColor(GRAY);
    }

    @Override
    public void drawBackground(
        Canvas c, Paint p, int left, int right, int top, int baseline, int bottom, CharSequence text, int start,
        int end, int lnum) {
        c.drawRect(left + mIndent - 4, top - 4, right, bottom, mPaint);
    }
}

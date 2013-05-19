package com.mws.llc.libs.asquare;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.TextView;

public class SquareTextView extends TextView {
	public SquareTextView(Context context) {
		super(context);
	}

	public SquareTextView(Context context, AttributeSet attrs) {
		super(context, attrs);
	}

	public SquareTextView(Context context, AttributeSet attrs, int defStyle) {
		super(context, attrs, defStyle);
	}

	// Override onMeasure to make the layout square
	@Override
	@SuppressLint("NewApi")
	public final void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
		boolean isJellyBean = android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.JELLY_BEAN;
		int minWidth = isJellyBean ? getMinimumWidth() : 0;
		int minHeight = isJellyBean ? getMinimumHeight() : 0;
		int maxWidth = isJellyBean ? getMaxWidth() : 0;
		int maxHeight = isJellyBean ? getMaxHeight() : 0;

		int size = Utils.measure(widthMeasureSpec, minWidth, maxWidth,
				heightMeasureSpec, minHeight, maxHeight);
		super.setMeasuredDimension(size, size);
	}
}

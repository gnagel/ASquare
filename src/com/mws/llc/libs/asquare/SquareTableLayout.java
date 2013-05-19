package com.mws.llc.libs.asquare;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.TableLayout;

public class SquareTableLayout extends TableLayout {
	public SquareTableLayout(Context context, AttributeSet attrs) {
		super(context, attrs);
	}

	public SquareTableLayout(Context context) {
		super(context);
	}

	// Override onMeasure to make the layout square
	@Override
	@SuppressLint("NewApi")
	public final void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
		boolean isJellyBean = android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.JELLY_BEAN;
		int minWidth = isJellyBean ? getMinimumWidth() : 0;
		int minHeight = isJellyBean ? getMinimumHeight() : 0;

		int size = Utils.measure(widthMeasureSpec, minWidth, 0,
				heightMeasureSpec, minHeight, 0);
		super.setMeasuredDimension(size, size);
	}
}

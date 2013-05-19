package com.mws.llc.libs.asquare;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.TableLayout;

public class SquareTableLayout extends TableLayout {
	private static final int ATTR_MAX_HEIGHT = R.styleable.SquareTableLayout_android_maxHeight;
	private static final int ATTR_MAX_WIDTH = R.styleable.SquareTableLayout_android_maxWidth;
	private static final int[] ATTRS = R.styleable.SquareTableLayout;
	private int mMaxWidth;
	private int mMaxHeight;

	public SquareTableLayout(Context context, AttributeSet attrs) {
		super(context, attrs);

		TypedArray a = context.obtainStyledAttributes(attrs, ATTRS, 0, 0);
		this.mMaxWidth = a.getDimensionPixelSize(ATTR_MAX_WIDTH, 0);
		this.mMaxHeight = a.getDimensionPixelSize(ATTR_MAX_HEIGHT, 0);
		a.recycle();
	}

	public SquareTableLayout(Context context) {
		super(context);

		TypedArray a = context.obtainStyledAttributes(null, ATTRS, 0, 0);
		this.mMaxWidth = a.getDimensionPixelSize(ATTR_MAX_WIDTH, 0);
		this.mMaxHeight = a.getDimensionPixelSize(ATTR_MAX_HEIGHT, 0);
		a.recycle();
	}

	// Override onMeasure to make the layout square
	@Override
	@SuppressLint("NewApi")
	public final void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
		boolean isJellyBean = android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.JELLY_BEAN;
		int minWidth = isJellyBean ? getMinimumWidth() : 0;
		int minHeight = isJellyBean ? getMinimumHeight() : 0;

		int size = Utils.measure(widthMeasureSpec, minWidth, mMaxWidth,
				heightMeasureSpec, minHeight, mMaxHeight);
		super.setMeasuredDimension(size, size);
	}
}

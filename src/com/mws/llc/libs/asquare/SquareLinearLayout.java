package com.mws.llc.libs.asquare;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.LinearLayout;

public class SquareLinearLayout extends LinearLayout {
	private static final int ATTR_MAX_HEIGHT = R.styleable.SquareLinearLayout_android_maxHeight;
	private static final int ATTR_MAX_WIDTH = R.styleable.SquareLinearLayout_android_maxWidth;
	private static final int[] ATTRS = R.styleable.SquareLinearLayout;
	private int mMaxWidth;
	private int mMaxHeight;

	@TargetApi(Build.VERSION_CODES.HONEYCOMB)
	public SquareLinearLayout(Context context, AttributeSet attrs, int defStyle) {
		super(context, attrs, defStyle);

		TypedArray a = context.obtainStyledAttributes(attrs, ATTRS, 0, 0);
		this.mMaxWidth = a.getDimensionPixelSize(ATTR_MAX_WIDTH, 0);
		this.mMaxHeight = a.getDimensionPixelSize(ATTR_MAX_HEIGHT, 0);
		a.recycle();
	}

	public SquareLinearLayout(Context context, AttributeSet attrs) {
		super(context, attrs);

		TypedArray a = context.obtainStyledAttributes(attrs, ATTRS, 0, 0);
		this.mMaxWidth = a.getDimensionPixelSize(ATTR_MAX_WIDTH, 0);
		this.mMaxHeight = a.getDimensionPixelSize(ATTR_MAX_HEIGHT, 0);
		a.recycle();
	}

	public SquareLinearLayout(Context context) {
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

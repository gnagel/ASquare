package com.mws.llc.libs.asquare;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.ImageView;

public class SquareImageView extends ImageView {
	private Utils utils;
	private static final int STYLE_ATTRS[] = com.mws.llc.libs.asquare.R.styleable.SquareImageView;
	private static final int STYLE_MIN_WIDTH = com.mws.llc.libs.asquare.R.styleable.SquareImageView_android_minWidth;

	public SquareImageView(Context context) {
		super(context);

		TypedArray a = context.obtainStyledAttributes(null, STYLE_ATTRS, 0, 0);
		this.utils = new Utils(context, a, STYLE_MIN_WIDTH);
		a.recycle();
	}

	public SquareImageView(Context context, AttributeSet attrs) {
		super(context, attrs);

		TypedArray a = context.obtainStyledAttributes(attrs, STYLE_ATTRS, 0, 0);
		this.utils = new Utils(context, a, STYLE_MIN_WIDTH);
		a.recycle();
	}

	public SquareImageView(Context context, AttributeSet attrs, int defStyle) {
		super(context, attrs, defStyle);

		TypedArray a = context.obtainStyledAttributes(attrs, STYLE_ATTRS, 0, 0);
		this.utils = new Utils(context, a, STYLE_MIN_WIDTH);
		a.recycle();
	}

	// Override onMeasure to make the layout square
	@Override
	public final void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
		int size = utils.measure(widthMeasureSpec, heightMeasureSpec);
		super.setMeasuredDimension(size, size);
	}
}

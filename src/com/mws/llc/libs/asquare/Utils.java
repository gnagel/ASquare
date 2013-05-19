package com.mws.llc.libs.asquare;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.view.View;
import android.view.View.MeasureSpec;

final class Utils extends ContextWrapper {
	private int minWidth;

	public Utils(Context context, TypedArray typedArray, int styleableSize) {
		super(context);

		if (null != typedArray)
			this.minWidth = typedArray.getDimensionPixelSize(styleableSize, 0);
		else
			this.minWidth = 0;
	}

	public final int measure(int widthMeasureSpec, int heightMeasureSpec) {
		int width = measureSpec(widthMeasureSpec);
		int height = measureSpec(heightMeasureSpec);
		int size = Math.min(width, height);
		int output = MeasureSpec.makeMeasureSpec(size, MeasureSpec.EXACTLY);
		return output;
	}

	public final int measureDefaultSize() {
		return minWidth;
	}

	public final int measureSpec(int measureSpec) {
		int mode = MeasureSpec.getMode(measureSpec);
		int size = MeasureSpec.getSize(measureSpec);

		// No size specified?
		// then use the default from the resources
		if (MeasureSpec.UNSPECIFIED == mode)
			return measureDefaultSize();

		// Exact dimensions?
		if (MeasureSpec.EXACTLY == mode)
			return size;

		// Fill all available space
		return size;
	}
}

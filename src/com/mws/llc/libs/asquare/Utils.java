package com.mws.llc.libs.asquare;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.view.View;
import android.view.View.MeasureSpec;

final class Utils {
	public static final int measure(int widthMeasureSpec, int minimumWidth,
			int maximumWidth, int heightMeasureSpec, int minimumHeight,
			int maximumHeight) {
		int width = measureSpec(widthMeasureSpec, minimumWidth, maximumWidth);
		int height = measureSpec(heightMeasureSpec, minimumHeight,
				maximumHeight);
		int size = Math.min(width, height);
		int output = MeasureSpec.makeMeasureSpec(size, MeasureSpec.EXACTLY);
		return size;
	}

	public static final int measureSpec(int measureSpec, int minimumSize,
			int maximumSize) {
		int mode = MeasureSpec.getMode(measureSpec);
		int size = MeasureSpec.getSize(measureSpec);

		if (minimumSize > 0)
			size = Math.max(size, minimumSize);

		if (maximumSize > 0) {
			size = Math.min(size, maximumSize);
		}

		// No size specified?
		// then use the default from the resources
		if (MeasureSpec.UNSPECIFIED == mode)
			return minimumSize > 0 ? minimumSize : 100;

		// Exact dimensions?
		if (MeasureSpec.EXACTLY == mode)
			return size;

		// Fill all available space
		return size;
	}
}

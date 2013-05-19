ASquare
=======

ASquare is a library for rendering square widgets: ImageView, TextView, LinearLayout, FrameLayout, RelativeLayout, and TableLayout.

Use them in place of your regular views to render perfectly square views.


android:maxXXX
================
The view groups have been extended to support android:maxWidth and android:maxHeight (LinearLayout, FrameLayout, RelativeLayout, and TableLayout).


Example:
========
```xml
    <!-- Support Max Height field -->
    <!-- Support Min Width field -->
    <com.mws.llc.libs.asquare.SquareFrameLayout
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        android:maxHeight="250dip"
        android:minWidth="50dip" />
```

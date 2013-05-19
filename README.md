ASquare
=======

ASquare is a library for rendering square widgets: ImageView, TextView, LinearLayout, FrameLayout, RelativeLayout, and TableLayout.

Use them in place of your regular views to render perfectly square views.

![Example Image][https://raw.github.com/gnagel/ASquare/master/demo/ImageViews.png]


android:maxXXX
================
The view groups have been extended to support android:maxWidth and android:maxHeight (LinearLayout, FrameLayout, RelativeLayout, and TableLayout).



Example Usage:
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


Developed By
============

* Glenn Nagel - <glenn@mercury-wireless.com>



License
=======

    Copyright 2013 Glenn Nagel

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.


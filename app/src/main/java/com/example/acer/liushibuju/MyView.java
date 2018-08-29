package com.example.acer.liushibuju;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;

/**
 * Created by acer on 2018/8/24.
 */

public class MyView extends ViewGroup {
    private int leftManger = 20;
    private int topManger = 20;
    public MyView(Context context) {
        this(context,null);
    }

    public MyView(Context context, AttributeSet attrs) {
        this(context, attrs,0);
    }

    public MyView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        measureChildren(widthMeasureSpec,heightMeasureSpec);

        int leftm = leftManger;
        int topm = topManger;

        int width = 0;
        int heigh = 0;

        int widthSize = MeasureSpec.getSize(widthMeasureSpec);
        int widthMode = MeasureSpec.getMode(widthMeasureSpec);
        int heighSize = MeasureSpec.getSize(heightMeasureSpec);
        int heighMode = MeasureSpec.getMode(heightMeasureSpec);

        switch (heighMode){
            case MeasureSpec.AT_MOST:
                int measureHeigh = 0;
                for (int i = 0 ; i < getChildCount();i++){
                    int measureWidth = getChildAt(i).getMeasuredWidth();
                    measureHeigh = getChildAt(i).getMeasuredHeight();
                }
        }

    }

    @Override
    protected void onLayout(boolean changed, int l, int t, int r, int b) {

    }
}

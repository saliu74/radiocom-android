<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> development
/*
 *
 *  * Copyright © 2016 @ Fernando Souto González
 *  *
 *  * Licensed under the Apache License, Version 2.0 (the "License");
 *  * you may not use this file except in compliance with the License.
 *  * You may obtain a copy of the License at
 *  *
 *  * http://www.apache.org/licenses/LICENSE-2.0
 *  *
 *  * Unless required by applicable law or agreed to in writing, software
 *  * distributed under the License is distributed on an "AS IS" BASIS,
 *  * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  * See the License for the specific language governing permissions and
 *  * limitations under the License.
 *
 */

<<<<<<< HEAD
=======
>>>>>>> development
=======
>>>>>>> development
=======
>>>>>>> development
package justforcommunity.radiocom.views.discrollview;

import android.animation.ArgbEvaluator;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;

<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
/**
 *
 */
>>>>>>> development
=======
/**
 *
 */
>>>>>>> development
=======
>>>>>>> development
public class DiscrollvableView extends FrameLayout implements Discrollvable {

    private static final int TRANSLATION_FROM_TOP = 0x01;
    private static final int TRANSLATION_FROM_BOTTOM = 0x02;
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
    private static final int TRANSLATION_FROM_LEFT = 0x04;
=======
    private static final int TRANSLATION_FROM_LEFT = 0x04;;
>>>>>>> development
=======
    private static final int TRANSLATION_FROM_LEFT = 0x04;;
>>>>>>> development
=======
    private static final int TRANSLATION_FROM_LEFT = 0x04;
>>>>>>> development
    private static final int TRANSLATION_FROM_RIGHT = 0x08;

    private static ArgbEvaluator sArgbEvaluator = new ArgbEvaluator();

    private float mDiscrollveThreshold;
    private int mDiscrollveFromBgColor;
    private int mDiscrollveToBgColor;
    private boolean mDiscrollveAlpha;
    private int mDiscrollveTranslation;
    private boolean mDiscrollveScaleX;
    private boolean mDiscrollveScaleY;

    private int mWidth;
    private int mHeight;

    public DiscrollvableView(Context context) {
        super(context);
    }

    public DiscrollvableView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public DiscrollvableView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onFinishInflate() {
        super.onFinishInflate();
        onResetDiscrollve();
    }

    @Override
    protected void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
        mWidth = w;
        mHeight = h;
    }

    public void setDiscrollveTranslation(int discrollveTranslation) {
        mDiscrollveTranslation = discrollveTranslation;
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
        if (isDiscrollveTranslationFrom(TRANSLATION_FROM_BOTTOM) && isDiscrollveTranslationFrom(TRANSLATION_FROM_TOP)) {
            throw new IllegalArgumentException("cannot translate from bottom and top");
        }
        if (isDiscrollveTranslationFrom(TRANSLATION_FROM_LEFT) && isDiscrollveTranslationFrom(TRANSLATION_FROM_RIGHT)) {
=======
=======
>>>>>>> development
        if(isDiscrollveTranslationFrom(TRANSLATION_FROM_BOTTOM) && isDiscrollveTranslationFrom(TRANSLATION_FROM_TOP)) {
            throw new IllegalArgumentException("cannot translate from bottom and top");
        }
        if(isDiscrollveTranslationFrom(TRANSLATION_FROM_LEFT) && isDiscrollveTranslationFrom(TRANSLATION_FROM_RIGHT)) {
<<<<<<< HEAD
>>>>>>> development
=======
>>>>>>> development
=======
        if (isDiscrollveTranslationFrom(TRANSLATION_FROM_BOTTOM) && isDiscrollveTranslationFrom(TRANSLATION_FROM_TOP)) {
            throw new IllegalArgumentException("cannot translate from bottom and top");
        }
        if (isDiscrollveTranslationFrom(TRANSLATION_FROM_LEFT) && isDiscrollveTranslationFrom(TRANSLATION_FROM_RIGHT)) {
>>>>>>> development
            throw new IllegalArgumentException("cannot translate from left and right");
        }
    }

    public void setDiscrollveThreshold(float discrollveThreshold) {
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
        if (discrollveThreshold < 0.0f || discrollveThreshold > 1.0f) {
=======
        if(discrollveThreshold < 0.0f || discrollveThreshold > 1.0f) {
>>>>>>> development
=======
        if(discrollveThreshold < 0.0f || discrollveThreshold > 1.0f) {
>>>>>>> development
=======
        if (discrollveThreshold < 0.0f || discrollveThreshold > 1.0f) {
>>>>>>> development
            throw new IllegalArgumentException("threshold must be >= 0.0f and <= 1.0f");
        }
        mDiscrollveThreshold = discrollveThreshold;
    }

    public void setDiscrollveFromBgColor(int discrollveFromBgColor) {
        mDiscrollveFromBgColor = discrollveFromBgColor;
    }

    public void setDiscrollveToBgColor(int discrollveToBgColor) {
        mDiscrollveToBgColor = discrollveToBgColor;
    }

    public void setDiscrollveAlpha(boolean discrollveAlpha) {
        mDiscrollveAlpha = discrollveAlpha;
    }

    public void setDiscrollveScaleX(boolean discrollveScaleX) {
        mDiscrollveScaleX = discrollveScaleX;
    }

    public void setDiscrollveScaleY(boolean discrollveScaleY) {
        mDiscrollveScaleY = discrollveScaleY;
    }

    @Override
    public void onDiscrollve(float ratio) {
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
        if (ratio >= mDiscrollveThreshold) {
            ratio = withThreshold(ratio);
            float ratioInverse = 1 - ratio;

            if (mDiscrollveAlpha) {
                setAlpha(ratio);
            }
            if (isDiscrollveTranslationFrom(TRANSLATION_FROM_BOTTOM)) {
                setTranslationY(mHeight * ratioInverse);
            }
            if (isDiscrollveTranslationFrom(TRANSLATION_FROM_TOP)) {
                setTranslationY(-mHeight * ratioInverse);
            }
            if (isDiscrollveTranslationFrom(TRANSLATION_FROM_LEFT)) {
                setTranslationX(-mWidth * ratioInverse);
            }
            if (isDiscrollveTranslationFrom(TRANSLATION_FROM_RIGHT)) {
                setTranslationX(mWidth * ratioInverse);
            }
            if (mDiscrollveScaleX) {
                setScaleX(ratio);
            }
            if (mDiscrollveScaleY) {
                setScaleY(ratio);
            }
            if (mDiscrollveFromBgColor != -1 && mDiscrollveToBgColor != -1) {
=======
=======
>>>>>>> development
        if(ratio >= mDiscrollveThreshold) {
=======
        if (ratio >= mDiscrollveThreshold) {
>>>>>>> development
            ratio = withThreshold(ratio);
            float ratioInverse = 1 - ratio;

            if (mDiscrollveAlpha) {
                setAlpha(ratio);
            }
            if (isDiscrollveTranslationFrom(TRANSLATION_FROM_BOTTOM)) {
                setTranslationY(mHeight * ratioInverse);
            }
            if (isDiscrollveTranslationFrom(TRANSLATION_FROM_TOP)) {
                setTranslationY(-mHeight * ratioInverse);
            }
            if (isDiscrollveTranslationFrom(TRANSLATION_FROM_LEFT)) {
                setTranslationX(-mWidth * ratioInverse);
            }
            if (isDiscrollveTranslationFrom(TRANSLATION_FROM_RIGHT)) {
                setTranslationX(mWidth * ratioInverse);
            }
            if (mDiscrollveScaleX) {
                setScaleX(ratio);
            }
            if (mDiscrollveScaleY) {
                setScaleY(ratio);
            }
<<<<<<< HEAD
            if(mDiscrollveFromBgColor != -1 && mDiscrollveToBgColor != -1) {
<<<<<<< HEAD
>>>>>>> development
=======
>>>>>>> development
=======
            if (mDiscrollveFromBgColor != -1 && mDiscrollveToBgColor != -1) {
>>>>>>> development
                setBackgroundColor((Integer) sArgbEvaluator.evaluate(ratio, mDiscrollveFromBgColor, mDiscrollveToBgColor));
            }
        }
    }

    private float withThreshold(float ratio) {
        return (ratio - mDiscrollveThreshold) / (1.0f - mDiscrollveThreshold);
    }

    @Override
    public void onResetDiscrollve() {
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
        if (mDiscrollveAlpha) {
            setAlpha(0.0f);
        }
        if (isDiscrollveTranslationFrom(TRANSLATION_FROM_BOTTOM)) {
            setTranslationY(mHeight);
        }
        if (isDiscrollveTranslationFrom(TRANSLATION_FROM_TOP)) {
            setTranslationY(-mHeight);
        }
        if (isDiscrollveTranslationFrom(TRANSLATION_FROM_LEFT)) {
            setTranslationX(-mWidth);
        }
        if (isDiscrollveTranslationFrom(TRANSLATION_FROM_RIGHT)) {
            setTranslationX(mWidth);
        }
        if (mDiscrollveScaleX) {
            setScaleX(0.0f);
        }
        if (mDiscrollveScaleY) {
            setScaleY(0.0f);
        }
        if (mDiscrollveFromBgColor != -1 && mDiscrollveToBgColor != -1) {
=======
=======
>>>>>>> development
        if(mDiscrollveAlpha) {
=======
        if (mDiscrollveAlpha) {
>>>>>>> development
            setAlpha(0.0f);
        }
        if (isDiscrollveTranslationFrom(TRANSLATION_FROM_BOTTOM)) {
            setTranslationY(mHeight);
        }
        if (isDiscrollveTranslationFrom(TRANSLATION_FROM_TOP)) {
            setTranslationY(-mHeight);
        }
        if (isDiscrollveTranslationFrom(TRANSLATION_FROM_LEFT)) {
            setTranslationX(-mWidth);
        }
        if (isDiscrollveTranslationFrom(TRANSLATION_FROM_RIGHT)) {
            setTranslationX(mWidth);
        }
        if (mDiscrollveScaleX) {
            setScaleX(0.0f);
        }
        if (mDiscrollveScaleY) {
            setScaleY(0.0f);
        }
<<<<<<< HEAD
        if(mDiscrollveFromBgColor != -1 && mDiscrollveToBgColor != -1) {
<<<<<<< HEAD
>>>>>>> development
=======
>>>>>>> development
=======
        if (mDiscrollveFromBgColor != -1 && mDiscrollveToBgColor != -1) {
>>>>>>> development
            setBackgroundColor(mDiscrollveFromBgColor);
        }
    }

    private boolean isDiscrollveTranslationFrom(int translationMask) {
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
        if (mDiscrollveTranslation == -1) {
=======
        if(mDiscrollveTranslation == -1) {
>>>>>>> development
=======
        if(mDiscrollveTranslation == -1) {
>>>>>>> development
=======
        if (mDiscrollveTranslation == -1) {
>>>>>>> development
            return false;
        }
        return (mDiscrollveTranslation & translationMask) == translationMask;
    }
}
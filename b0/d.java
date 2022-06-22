package b0;

import android.view.animation.Interpolator;

/* access modifiers changed from: package-private */
public abstract class d implements Interpolator {

    /* renamed from: a  reason: collision with root package name */
    private final float[] f1645a;

    /* renamed from: b  reason: collision with root package name */
    private final float f1646b;

    protected d(float[] fArr) {
        this.f1645a = fArr;
        this.f1646b = 1.0f / ((float) (fArr.length - 1));
    }

    public float getInterpolation(float f5) {
        if (f5 >= 1.0f) {
            return 1.0f;
        }
        if (f5 <= 0.0f) {
            return 0.0f;
        }
        float[] fArr = this.f1645a;
        int min = Math.min((int) (((float) (fArr.length - 1)) * f5), fArr.length - 2);
        float f6 = this.f1646b;
        float f7 = (f5 - (((float) min) * f6)) / f6;
        float[] fArr2 = this.f1645a;
        return fArr2[min] + (f7 * (fArr2[min + 1] - fArr2[min]));
    }
}

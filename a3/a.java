package a3;

import l2.j;
import z2.k;

public abstract class a extends k {

    /* renamed from: a  reason: collision with root package name */
    private final int[] f37a = new int[4];

    /* renamed from: b  reason: collision with root package name */
    private final int[] f38b;

    /* renamed from: c  reason: collision with root package name */
    private final float[] f39c;

    /* renamed from: d  reason: collision with root package name */
    private final float[] f40d;

    /* renamed from: e  reason: collision with root package name */
    private final int[] f41e;

    /* renamed from: f  reason: collision with root package name */
    private final int[] f42f;

    protected a() {
        int[] iArr = new int[8];
        this.f38b = iArr;
        this.f39c = new float[4];
        this.f40d = new float[4];
        this.f41e = new int[(iArr.length / 2)];
        this.f42f = new int[(iArr.length / 2)];
    }

    protected static void i(int[] iArr, float[] fArr) {
        int i5 = 0;
        float f5 = fArr[0];
        for (int i6 = 1; i6 < iArr.length; i6++) {
            if (fArr[i6] < f5) {
                f5 = fArr[i6];
                i5 = i6;
            }
        }
        iArr[i5] = iArr[i5] - 1;
    }

    protected static void p(int[] iArr, float[] fArr) {
        int i5 = 0;
        float f5 = fArr[0];
        for (int i6 = 1; i6 < iArr.length; i6++) {
            if (fArr[i6] > f5) {
                f5 = fArr[i6];
                i5 = i6;
            }
        }
        iArr[i5] = iArr[i5] + 1;
    }

    protected static boolean q(int[] iArr) {
        int i5 = iArr[0] + iArr[1];
        float f5 = ((float) i5) / ((float) ((iArr[2] + i5) + iArr[3]));
        if (f5 >= 0.7916667f && f5 <= 0.89285713f) {
            int i6 = Integer.MAX_VALUE;
            int i7 = Integer.MIN_VALUE;
            for (int i8 : iArr) {
                if (i8 > i7) {
                    i7 = i8;
                }
                if (i8 < i6) {
                    i6 = i8;
                }
            }
            if (i7 < i6 * 10) {
                return true;
            }
        }
        return false;
    }

    protected static int r(int[] iArr, int[][] iArr2) {
        for (int i5 = 0; i5 < iArr2.length; i5++) {
            if (k.f(iArr, iArr2[i5], 0.45f) < 0.2f) {
                return i5;
            }
        }
        throw j.a();
    }

    /* access modifiers changed from: protected */
    public final int[] j() {
        return this.f38b;
    }

    /* access modifiers changed from: protected */
    public final int[] k() {
        return this.f37a;
    }

    /* access modifiers changed from: protected */
    public final int[] l() {
        return this.f42f;
    }

    /* access modifiers changed from: protected */
    public final float[] m() {
        return this.f40d;
    }

    /* access modifiers changed from: protected */
    public final int[] n() {
        return this.f41e;
    }

    /* access modifiers changed from: protected */
    public final float[] o() {
        return this.f39c;
    }
}

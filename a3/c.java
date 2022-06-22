package a3;

import l2.p;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    private final int f45a;

    /* renamed from: b  reason: collision with root package name */
    private final int[] f46b;

    /* renamed from: c  reason: collision with root package name */
    private final p[] f47c;

    public c(int i5, int[] iArr, int i6, int i7, int i8) {
        this.f45a = i5;
        this.f46b = iArr;
        float f5 = (float) i8;
        this.f47c = new p[]{new p((float) i6, f5), new p((float) i7, f5)};
    }

    public p[] a() {
        return this.f47c;
    }

    public int[] b() {
        return this.f46b;
    }

    public int c() {
        return this.f45a;
    }

    public boolean equals(Object obj) {
        return (obj instanceof c) && this.f45a == ((c) obj).f45a;
    }

    public int hashCode() {
        return this.f45a;
    }
}

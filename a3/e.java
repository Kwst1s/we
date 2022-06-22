package a3;

import c.j;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import l2.a;
import l2.n;
import l2.p;
import l2.q;
import z2.k;

public final class e extends a {

    /* renamed from: i  reason: collision with root package name */
    private static final int[] f50i = {1, 10, 34, 70, j.I0};

    /* renamed from: j  reason: collision with root package name */
    private static final int[] f51j = {4, 20, 48, 81};

    /* renamed from: k  reason: collision with root package name */
    private static final int[] f52k = {0, 161, 961, 2015, 2715};

    /* renamed from: l  reason: collision with root package name */
    private static final int[] f53l = {0, 336, 1036, 1516};

    /* renamed from: m  reason: collision with root package name */
    private static final int[] f54m = {8, 6, 4, 3, 1};

    /* renamed from: n  reason: collision with root package name */
    private static final int[] f55n = {2, 4, 6, 8};

    /* renamed from: o  reason: collision with root package name */
    private static final int[][] f56o = {new int[]{3, 8, 2, 1}, new int[]{3, 5, 5, 1}, new int[]{3, 3, 7, 1}, new int[]{3, 1, 9, 1}, new int[]{2, 7, 4, 1}, new int[]{2, 5, 6, 1}, new int[]{2, 3, 8, 1}, new int[]{1, 5, 7, 1}, new int[]{1, 3, 9, 1}};

    /* renamed from: g  reason: collision with root package name */
    private final List<d> f57g = new ArrayList();

    /* renamed from: h  reason: collision with root package name */
    private final List<d> f58h = new ArrayList();

    private static void s(Collection<d> collection, d dVar) {
        if (dVar != null) {
            boolean z5 = false;
            Iterator<d> it = collection.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                d next = it.next();
                if (next.b() == dVar.b()) {
                    next.e();
                    z5 = true;
                    break;
                }
            }
            if (!z5) {
                collection.add(dVar);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0025, code lost:
        if (r1 < 4) goto L_0x003f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x003d, code lost:
        if (r1 < 4) goto L_0x003f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x003f, code lost:
        r2 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0041, code lost:
        r2 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0042, code lost:
        r5 = false;
     */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0097  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x00ac  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x00b9  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x00ce  */
    /* JADX WARNING: Removed duplicated region for block: B:83:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void t(boolean r10, int r11) {
        /*
        // Method dump skipped, instructions count: 228
        */
        throw new UnsupportedOperationException("Method not decompiled: a3.e.t(boolean, int):void");
    }

    private static boolean u(d dVar, d dVar2) {
        int a5 = (dVar.a() + (dVar2.a() * 16)) % 79;
        int c5 = (dVar.d().c() * 9) + dVar2.d().c();
        if (c5 > 72) {
            c5--;
        }
        if (c5 > 8) {
            c5--;
        }
        return a5 == c5;
    }

    private static n v(d dVar, d dVar2) {
        String valueOf = String.valueOf((((long) dVar.b()) * 4537077) + ((long) dVar2.b()));
        StringBuilder sb = new StringBuilder(14);
        for (int length = 13 - valueOf.length(); length > 0; length--) {
            sb.append('0');
        }
        sb.append(valueOf);
        int i5 = 0;
        for (int i6 = 0; i6 < 13; i6++) {
            int charAt = sb.charAt(i6) - '0';
            if ((i6 & 1) == 0) {
                charAt *= 3;
            }
            i5 += charAt;
        }
        int i7 = 10 - (i5 % 10);
        if (i7 == 10) {
            i7 = 0;
        }
        sb.append(i7);
        p[] a5 = dVar.d().a();
        p[] a6 = dVar2.d().a();
        return new n(sb.toString(), null, new p[]{a5[0], a5[1], a6[0], a6[1]}, a.RSS_14);
    }

    private b w(r2.a aVar, c cVar, boolean z5) {
        int[] j5 = j();
        for (int i5 = 0; i5 < j5.length; i5++) {
            j5[i5] = 0;
        }
        int[] b5 = cVar.b();
        if (z5) {
            k.h(aVar, b5[0], j5);
        } else {
            k.g(aVar, b5[1] + 1, j5);
            int i6 = 0;
            for (int length = j5.length - 1; i6 < length; length--) {
                int i7 = j5[i6];
                j5[i6] = j5[length];
                j5[length] = i7;
                i6++;
            }
        }
        int i8 = z5 ? 16 : 15;
        float d5 = ((float) s2.a.d(j5)) / ((float) i8);
        int[] n5 = n();
        int[] l5 = l();
        float[] o5 = o();
        float[] m5 = m();
        for (int i9 = 0; i9 < j5.length; i9++) {
            float f5 = ((float) j5[i9]) / d5;
            int i10 = (int) (0.5f + f5);
            if (i10 <= 0) {
                i10 = 1;
            } else if (i10 > 8) {
                i10 = 8;
            }
            int i11 = i9 / 2;
            if ((i9 & 1) == 0) {
                n5[i11] = i10;
                o5[i11] = f5 - ((float) i10);
            } else {
                l5[i11] = i10;
                m5[i11] = f5 - ((float) i10);
            }
        }
        t(z5, i8);
        int i12 = 0;
        int i13 = 0;
        for (int length2 = n5.length - 1; length2 >= 0; length2--) {
            i12 = (i12 * 9) + n5[length2];
            i13 += n5[length2];
        }
        int i14 = 0;
        int i15 = 0;
        for (int length3 = l5.length - 1; length3 >= 0; length3--) {
            i14 = (i14 * 9) + l5[length3];
            i15 += l5[length3];
        }
        int i16 = i12 + (i14 * 3);
        if (z5) {
            if ((i13 & 1) != 0 || i13 > 12 || i13 < 4) {
                throw l2.j.a();
            }
            int i17 = (12 - i13) / 2;
            int i18 = f54m[i17];
            return new b((f.b(n5, i18, false) * f50i[i17]) + f.b(l5, 9 - i18, true) + f52k[i17], i16);
        } else if ((i15 & 1) != 0 || i15 > 10 || i15 < 4) {
            throw l2.j.a();
        } else {
            int i19 = (10 - i15) / 2;
            int i20 = f55n[i19];
            return new b((f.b(l5, 9 - i20, false) * f51j[i19]) + f.b(n5, i20, true) + f53l[i19], i16);
        }
    }

    private d x(r2.a aVar, boolean z5, int i5, Map<l2.e, ?> map) {
        try {
            int[] y5 = y(aVar, z5);
            c z6 = z(aVar, i5, z5, y5);
            q qVar = map == null ? null : (q) map.get(l2.e.NEED_RESULT_POINT_CALLBACK);
            if (qVar != null) {
                float f5 = ((float) (y5[0] + y5[1])) / 2.0f;
                if (z5) {
                    f5 = ((float) (aVar.g() - 1)) - f5;
                }
                qVar.a(new p(f5, (float) i5));
            }
            b w5 = w(aVar, z6, true);
            b w6 = w(aVar, z6, false);
            return new d((w5.b() * 1597) + w6.b(), w5.a() + (w6.a() * 4), z6);
        } catch (l2.j unused) {
            return null;
        }
    }

    private int[] y(r2.a aVar, boolean z5) {
        int[] k5 = k();
        k5[0] = 0;
        k5[1] = 0;
        k5[2] = 0;
        k5[3] = 0;
        int g5 = aVar.g();
        int i5 = 0;
        boolean z6 = false;
        while (i5 < g5) {
            z6 = !aVar.c(i5);
            if (z5 == z6) {
                break;
            }
            i5++;
        }
        int i6 = i5;
        int i7 = 0;
        while (i5 < g5) {
            if (aVar.c(i5) != z6) {
                k5[i7] = k5[i7] + 1;
            } else {
                if (i7 != 3) {
                    i7++;
                } else if (a.q(k5)) {
                    return new int[]{i6, i5};
                } else {
                    i6 += k5[0] + k5[1];
                    k5[0] = k5[2];
                    k5[1] = k5[3];
                    k5[2] = 0;
                    k5[3] = 0;
                    i7--;
                }
                k5[i7] = 1;
                z6 = !z6;
            }
            i5++;
        }
        throw l2.j.a();
    }

    private c z(r2.a aVar, int i5, boolean z5, int[] iArr) {
        int i6;
        int i7;
        boolean c5 = aVar.c(iArr[0]);
        int i8 = iArr[0] - 1;
        while (i8 >= 0 && c5 != aVar.c(i8)) {
            i8--;
        }
        int i9 = i8 + 1;
        int[] k5 = k();
        System.arraycopy(k5, 0, k5, 1, k5.length - 1);
        k5[0] = iArr[0] - i9;
        int r5 = a.r(k5, f56o);
        int i10 = iArr[1];
        if (z5) {
            i6 = (aVar.g() - 1) - i10;
            i7 = (aVar.g() - 1) - i9;
        } else {
            i6 = i10;
            i7 = i9;
        }
        return new c(r5, new int[]{i9, iArr[1]}, i7, i6, i5);
    }

    @Override // l2.l, z2.k
    public void c() {
        this.f57g.clear();
        this.f58h.clear();
    }

    @Override // z2.k
    public n d(int i5, r2.a aVar, Map<l2.e, ?> map) {
        s(this.f57g, x(aVar, false, i5, map));
        aVar.j();
        s(this.f58h, x(aVar, true, i5, map));
        aVar.j();
        for (d dVar : this.f57g) {
            if (dVar.c() > 1) {
                for (d dVar2 : this.f58h) {
                    if (dVar2.c() > 1 && u(dVar, dVar2)) {
                        return v(dVar, dVar2);
                    }
                }
                continue;
            }
        }
        throw l2.j.a();
    }
}

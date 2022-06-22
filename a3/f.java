package a3;

public final class f {
    private static int a(int i5, int i6) {
        int i7 = i5 - i6;
        if (i7 > i6) {
            i7 = i6;
            i6 = i7;
        }
        int i8 = 1;
        int i9 = 1;
        while (i5 > i6) {
            i8 *= i5;
            if (i9 <= i7) {
                i8 /= i9;
                i9++;
            }
            i5--;
        }
        while (i9 <= i7) {
            i8 /= i9;
            i9++;
        }
        return i8;
    }

    public static int b(int[] iArr, int i5, boolean z5) {
        int[] iArr2 = iArr;
        int i6 = 0;
        for (int i7 : iArr2) {
            i6 += i7;
        }
        int length = iArr2.length;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        while (true) {
            int i11 = length - 1;
            if (i8 >= i11) {
                return i9;
            }
            int i12 = 1 << i8;
            i10 |= i12;
            int i13 = 1;
            while (i13 < iArr2[i8]) {
                int i14 = i6 - i13;
                int i15 = length - i8;
                int i16 = i15 - 2;
                int a5 = a(i14 - 1, i16);
                if (z5 && i10 == 0) {
                    int i17 = i15 - 1;
                    if (i14 - i17 >= i17) {
                        a5 -= a(i14 - i15, i16);
                    }
                }
                if (i15 - 1 > 1) {
                    int i18 = 0;
                    for (int i19 = i14 - i16; i19 > i5; i19--) {
                        i18 += a((i14 - i19) - 1, i15 - 3);
                    }
                    a5 -= i18 * (i11 - i8);
                } else if (i14 > i5) {
                    a5--;
                }
                i9 += a5;
                i13++;
                i10 &= ~i12;
                iArr2 = iArr;
            }
            i6 -= i13;
            i8++;
            iArr2 = iArr;
        }
    }
}

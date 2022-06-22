package a1;

import android.content.Context;
import android.content.pm.PackageInfo;

public class a {

    /* renamed from: a  reason: collision with root package name */
    private final Context f14a;

    public a(Context context) {
        this.f14a = context;
    }

    public PackageInfo a(String str, int i5) {
        return this.f14a.getPackageManager().getPackageInfo(str, i5);
    }
}

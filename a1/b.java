package a1;

import android.content.Context;

public class b {

    /* renamed from: b  reason: collision with root package name */
    private static b f15b = new b();

    /* renamed from: a  reason: collision with root package name */
    private a f16a = null;

    public static a a(Context context) {
        return f15b.b(context);
    }

    private final synchronized a b(Context context) {
        if (this.f16a == null) {
            if (context.getApplicationContext() != null) {
                context = context.getApplicationContext();
            }
            this.f16a = new a(context);
        }
        return this.f16a;
    }
}

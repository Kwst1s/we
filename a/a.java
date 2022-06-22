package a;

import android.content.Context;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    private final Set<b> f5a = new CopyOnWriteArraySet();

    /* renamed from: b  reason: collision with root package name */
    private volatile Context f6b;

    public void a(b bVar) {
        if (this.f6b != null) {
            bVar.a(this.f6b);
        }
        this.f5a.add(bVar);
    }

    public void b() {
        this.f6b = null;
    }

    public void c(Context context) {
        this.f6b = context;
        for (b bVar : this.f5a) {
            bVar.a(context);
        }
    }
}

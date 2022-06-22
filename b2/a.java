package b2;

import g1.d0;

public class a<T> {

    /* renamed from: a  reason: collision with root package name */
    private final Class<T> f1705a;

    /* renamed from: b  reason: collision with root package name */
    private final T f1706b;

    public a(Class<T> cls, T t5) {
        this.f1705a = (Class) d0.b(cls);
        this.f1706b = (T) d0.b(t5);
    }

    public Class<T> a() {
        return this.f1705a;
    }

    public String toString() {
        return String.format("Event{type: %s, payload: %s}", this.f1705a, this.f1706b);
    }
}

package a2;

import android.util.Base64;
import android.util.JsonWriter;
import java.io.Writer;
import java.util.Collection;
import java.util.Date;
import java.util.Map;
import y1.b;
import y1.c;
import y1.d;
import y1.f;
import y1.g;

/* access modifiers changed from: package-private */
public final class e implements y1.e, g {

    /* renamed from: a  reason: collision with root package name */
    private e f30a = null;

    /* renamed from: b  reason: collision with root package name */
    private boolean f31b = true;

    /* renamed from: c  reason: collision with root package name */
    private final JsonWriter f32c;

    /* renamed from: d  reason: collision with root package name */
    private final Map<Class<?>, d<?>> f33d;

    /* renamed from: e  reason: collision with root package name */
    private final Map<Class<?>, f<?>> f34e;

    /* renamed from: f  reason: collision with root package name */
    private final d<Object> f35f;

    /* renamed from: g  reason: collision with root package name */
    private final boolean f36g;

    e(Writer writer, Map<Class<?>, d<?>> map, Map<Class<?>, f<?>> map2, d<Object> dVar, boolean z5) {
        this.f32c = new JsonWriter(writer);
        this.f33d = map;
        this.f34e = map2;
        this.f35f = dVar;
        this.f36g = z5;
    }

    private boolean q(Object obj) {
        return obj == null || obj.getClass().isArray() || (obj instanceof Collection) || (obj instanceof Date) || (obj instanceof Enum) || (obj instanceof Number);
    }

    private e t(String str, Object obj) {
        v();
        this.f32c.name(str);
        if (obj != null) {
            return i(obj, false);
        }
        this.f32c.nullValue();
        return this;
    }

    private e u(String str, Object obj) {
        if (obj == null) {
            return this;
        }
        v();
        this.f32c.name(str);
        return i(obj, false);
    }

    private void v() {
        if (this.f31b) {
            e eVar = this.f30a;
            if (eVar != null) {
                eVar.v();
                this.f30a.f31b = false;
                this.f30a = null;
                this.f32c.endObject();
                return;
            }
            return;
        }
        throw new IllegalStateException("Parent context used since this context was created. Cannot use this context anymore.");
    }

    @Override // y1.e
    public y1.e a(c cVar, int i5) {
        return k(cVar.a(), i5);
    }

    @Override // y1.e
    public y1.e b(c cVar, long j5) {
        return l(cVar.a(), j5);
    }

    @Override // y1.e
    public y1.e d(c cVar, Object obj) {
        return m(cVar.a(), obj);
    }

    @Override // y1.e
    public y1.e f(c cVar, boolean z5) {
        return n(cVar.a(), z5);
    }

    public e g(int i5) {
        v();
        this.f32c.value((long) i5);
        return this;
    }

    public e h(long j5) {
        v();
        this.f32c.value(j5);
        return this;
    }

    /* access modifiers changed from: package-private */
    public e i(Object obj, boolean z5) {
        int i5 = 0;
        if (z5 && q(obj)) {
            Object[] objArr = new Object[1];
            objArr[0] = obj == null ? null : obj.getClass();
            throw new b(String.format("%s cannot be encoded inline", objArr));
        } else if (obj == null) {
            this.f32c.nullValue();
            return this;
        } else if (obj instanceof Number) {
            this.f32c.value((Number) obj);
            return this;
        } else if (obj.getClass().isArray()) {
            if (obj instanceof byte[]) {
                return p((byte[]) obj);
            }
            this.f32c.beginArray();
            if (obj instanceof int[]) {
                int[] iArr = (int[]) obj;
                int length = iArr.length;
                while (i5 < length) {
                    this.f32c.value((long) iArr[i5]);
                    i5++;
                }
            } else if (obj instanceof long[]) {
                long[] jArr = (long[]) obj;
                int length2 = jArr.length;
                while (i5 < length2) {
                    h(jArr[i5]);
                    i5++;
                }
            } else if (obj instanceof double[]) {
                double[] dArr = (double[]) obj;
                int length3 = dArr.length;
                while (i5 < length3) {
                    this.f32c.value(dArr[i5]);
                    i5++;
                }
            } else if (obj instanceof boolean[]) {
                boolean[] zArr = (boolean[]) obj;
                int length4 = zArr.length;
                while (i5 < length4) {
                    this.f32c.value(zArr[i5]);
                    i5++;
                }
            } else if (obj instanceof Number[]) {
                for (Number number : (Number[]) obj) {
                    i(number, false);
                }
            } else {
                for (Object obj2 : (Object[]) obj) {
                    i(obj2, false);
                }
            }
            this.f32c.endArray();
            return this;
        } else if (obj instanceof Collection) {
            this.f32c.beginArray();
            for (Object obj3 : (Collection) obj) {
                i(obj3, false);
            }
            this.f32c.endArray();
            return this;
        } else if (obj instanceof Map) {
            this.f32c.beginObject();
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                Object key = entry.getKey();
                try {
                    m((String) key, entry.getValue());
                } catch (ClassCastException e5) {
                    throw new b(String.format("Only String keys are currently supported in maps, got %s of type %s instead.", key, key.getClass()), e5);
                }
            }
            this.f32c.endObject();
            return this;
        } else {
            d<?> dVar = this.f33d.get(obj.getClass());
            if (dVar != null) {
                return s(dVar, obj, z5);
            }
            f<?> fVar = this.f34e.get(obj.getClass());
            if (fVar != null) {
                fVar.a(obj, this);
                return this;
            } else if (!(obj instanceof Enum)) {
                return s(this.f35f, obj, z5);
            } else {
                c(((Enum) obj).name());
                return this;
            }
        }
    }

    /* renamed from: j */
    public e c(String str) {
        v();
        this.f32c.value(str);
        return this;
    }

    public e k(String str, int i5) {
        v();
        this.f32c.name(str);
        return g(i5);
    }

    public e l(String str, long j5) {
        v();
        this.f32c.name(str);
        return h(j5);
    }

    public e m(String str, Object obj) {
        return this.f36g ? u(str, obj) : t(str, obj);
    }

    public e n(String str, boolean z5) {
        v();
        this.f32c.name(str);
        return e(z5);
    }

    /* renamed from: o */
    public e e(boolean z5) {
        v();
        this.f32c.value(z5);
        return this;
    }

    public e p(byte[] bArr) {
        v();
        if (bArr == null) {
            this.f32c.nullValue();
        } else {
            this.f32c.value(Base64.encodeToString(bArr, 2));
        }
        return this;
    }

    /* access modifiers changed from: package-private */
    public void r() {
        v();
        this.f32c.flush();
    }

    /* access modifiers changed from: package-private */
    public e s(d<Object> dVar, Object obj, boolean z5) {
        if (!z5) {
            this.f32c.beginObject();
        }
        dVar.a(obj, this);
        if (!z5) {
            this.f32c.endObject();
        }
        return this;
    }
}

package a2;

import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import y1.e;
import y1.f;
import y1.g;

public final class d implements z1.b<d> {

    /* renamed from: e  reason: collision with root package name */
    private static final y1.d<Object> f20e = a.f17a;

    /* renamed from: f  reason: collision with root package name */
    private static final f<String> f21f = c.f19a;

    /* renamed from: g  reason: collision with root package name */
    private static final f<Boolean> f22g = b.f18a;

    /* renamed from: h  reason: collision with root package name */
    private static final b f23h = new b(null);

    /* renamed from: a  reason: collision with root package name */
    private final Map<Class<?>, y1.d<?>> f24a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    private final Map<Class<?>, f<?>> f25b = new HashMap();

    /* renamed from: c  reason: collision with root package name */
    private y1.d<Object> f26c = f20e;

    /* renamed from: d  reason: collision with root package name */
    private boolean f27d = false;

    class a implements y1.a {
        a() {
        }

        @Override // y1.a
        public String a(Object obj) {
            StringWriter stringWriter = new StringWriter();
            try {
                b(obj, stringWriter);
            } catch (IOException unused) {
            }
            return stringWriter.toString();
        }

        @Override // y1.a
        public void b(Object obj, Writer writer) {
            e eVar = new e(writer, d.this.f24a, d.this.f25b, d.this.f26c, d.this.f27d);
            eVar.i(obj, false);
            eVar.r();
        }
    }

    private static final class b implements f<Date> {

        /* renamed from: a  reason: collision with root package name */
        private static final DateFormat f29a;

        static {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
            f29a = simpleDateFormat;
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        }

        private b() {
        }

        /* synthetic */ b(a aVar) {
            this();
        }

        /* renamed from: b */
        public void a(Date date, g gVar) {
            gVar.c(f29a.format(date));
        }
    }

    public d() {
        p(String.class, f21f);
        p(Boolean.class, f22g);
        p(Date.class, f23h);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void l(Object obj, e eVar) {
        throw new y1.b("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void n(Boolean bool, g gVar) {
        gVar.e(bool.booleanValue());
    }

    public y1.a i() {
        return new a();
    }

    public d j(z1.a aVar) {
        aVar.a(this);
        return this;
    }

    public d k(boolean z5) {
        this.f27d = z5;
        return this;
    }

    /* renamed from: o */
    public <T> d a(Class<T> cls, y1.d<? super T> dVar) {
        this.f24a.put(cls, dVar);
        this.f25b.remove(cls);
        return this;
    }

    public <T> d p(Class<T> cls, f<? super T> fVar) {
        this.f25b.put(cls, fVar);
        this.f24a.remove(cls);
        return this;
    }
}

package com.p000a.p001a.p002a;

import com.p000a.p001a.p002a.C0384c.C0378a;
import com.p000a.p001a.p002a.C0384c.C0381b;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public class C0379a extends C0378a {
    public C0379a(C0387f c0387f, C0381b c0381b, long j, int i) throws IOException {
        ByteBuffer allocate = ByteBuffer.allocate(4);
        allocate.order(c0381b.f16a ? ByteOrder.BIG_ENDIAN : ByteOrder.LITTLE_ENDIAN);
        long j2 = ((long) (i * 8)) + j;
        this.a = c0387f.m30c(allocate, j2);
        this.b = c0387f.m30c(allocate, j2 + 4);
    }
}

package com.p000a.p001a.p002a;

import com.p000a.p001a.p002a.C0384c.C0381b;
import com.p000a.p001a.p002a.C0384c.C0382c;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public class C0389h extends C0382c {
    public C0389h(C0387f c0387f, C0381b c0381b, long j) throws IOException {
        ByteBuffer allocate = ByteBuffer.allocate(8);
        allocate.order(c0381b.f16a ? ByteOrder.BIG_ENDIAN : ByteOrder.LITTLE_ENDIAN);
        long j2 = c0381b.f18c + (((long) c0381b.f20e) * j);
        this.a = c0387f.m30c(allocate, j2);
        this.b = c0387f.m28b(allocate, 8 + j2);
        this.c = c0387f.m28b(allocate, 16 + j2);
        this.d = c0387f.m28b(allocate, j2 + 40);
    }
}

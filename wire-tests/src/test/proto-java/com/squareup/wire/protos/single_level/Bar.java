// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: samebasename/single_level.proto
package com.squareup.wire.protos.single_level;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.StringBuilder;
import kotlin.jvm.JvmClassMappingKt;
import okio.ByteString;

public final class Bar extends Message<Bar, Bar.Builder> {
  public static final ProtoAdapter<Bar> ADAPTER = new ProtoAdapter_Bar();

  private static final long serialVersionUID = 0L;

  public static final Integer DEFAULT_BAZ = 0;

  @WireField(
      tag = 1,
      adapter = "com.squareup.wire.ProtoAdapter#INT32"
  )
  public final Integer baz;

  public Bar(Integer baz) {
    this(baz, ByteString.EMPTY);
  }

  public Bar(Integer baz, ByteString unknownFields) {
    super(ADAPTER, unknownFields);
    this.baz = baz;
  }

  @Override
  public Builder newBuilder() {
    Builder builder = new Builder();
    builder.baz = baz;
    builder.addUnknownFields(unknownFields());
    return builder;
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof Bar)) return false;
    Bar o = (Bar) other;
    return unknownFields().equals(o.unknownFields())
        && Internal.equals(baz, o.baz);
  }

  @Override
  public int hashCode() {
    int result = super.hashCode;
    if (result == 0) {
      result = unknownFields().hashCode();
      result = result * 37 + (baz != null ? baz.hashCode() : 0);
      super.hashCode = result;
    }
    return result;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    if (baz != null) builder.append(", baz=").append(baz);
    return builder.replace(0, 2, "Bar{").append('}').toString();
  }

  public static final class Builder extends Message.Builder<Bar, Builder> {
    public Integer baz;

    public Builder() {
    }

    public Builder baz(Integer baz) {
      this.baz = baz;
      return this;
    }

    @Override
    public Bar build() {
      return new Bar(baz, super.buildUnknownFields());
    }
  }

  private static final class ProtoAdapter_Bar extends ProtoAdapter<Bar> {
    public ProtoAdapter_Bar() {
      super(FieldEncoding.LENGTH_DELIMITED, JvmClassMappingKt.getKotlinClass(Bar.class));
    }

    @Override
    public int encodedSize(Bar value) {
      return ProtoAdapter.INT32.encodedSizeWithTag(1, value.baz)
          + value.unknownFields().size();
    }

    @Override
    public void encode(ProtoWriter writer, Bar value) throws IOException {
      ProtoAdapter.INT32.encodeWithTag(writer, 1, value.baz);
      writer.writeBytes(value.unknownFields());
    }

    @Override
    public Bar decode(ProtoReader reader) throws IOException {
      Builder builder = new Builder();
      long token = reader.beginMessage();
      for (int tag; (tag = reader.nextTag()) != -1;) {
        switch (tag) {
          case 1: builder.baz(ProtoAdapter.INT32.decode(reader)); break;
          default: {
            FieldEncoding fieldEncoding = reader.peekFieldEncoding();
            Object value = fieldEncoding.rawProtoAdapter().decode(reader);
            builder.addUnknownField(tag, fieldEncoding, value);
          }
        }
      }
      reader.endMessage(token);
      return builder.build();
    }

    @Override
    public Bar redact(Bar value) {
      Builder builder = value.newBuilder();
      builder.clearUnknownFields();
      return builder.build();
    }
  }
}

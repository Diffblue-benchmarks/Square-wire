// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: map.proto
package com.squareup.wire.map;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.StringBuilder;
import kotlin.jvm.JvmClassMappingKt;
import okio.ByteString;

public final class Thing extends Message<Thing, Thing.Builder> {
  public static final ProtoAdapter<Thing> ADAPTER = new ProtoAdapter_Thing();

  private static final long serialVersionUID = 0L;

  public static final String DEFAULT_NAME = "";

  @WireField(
      tag = 1,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final String name;

  public Thing(String name) {
    this(name, ByteString.EMPTY);
  }

  public Thing(String name, ByteString unknownFields) {
    super(ADAPTER, unknownFields);
    this.name = name;
  }

  @Override
  public Builder newBuilder() {
    Builder builder = new Builder();
    builder.name = name;
    builder.addUnknownFields(unknownFields());
    return builder;
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof Thing)) return false;
    Thing o = (Thing) other;
    return unknownFields().equals(o.unknownFields())
        && Internal.equals(name, o.name);
  }

  @Override
  public int hashCode() {
    int result = super.hashCode;
    if (result == 0) {
      result = unknownFields().hashCode();
      result = result * 37 + (name != null ? name.hashCode() : 0);
      super.hashCode = result;
    }
    return result;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    if (name != null) builder.append(", name=").append(name);
    return builder.replace(0, 2, "Thing{").append('}').toString();
  }

  public static final class Builder extends Message.Builder<Thing, Builder> {
    public String name;

    public Builder() {
    }

    public Builder name(String name) {
      this.name = name;
      return this;
    }

    @Override
    public Thing build() {
      return new Thing(name, super.buildUnknownFields());
    }
  }

  private static final class ProtoAdapter_Thing extends ProtoAdapter<Thing> {
    public ProtoAdapter_Thing() {
      super(FieldEncoding.LENGTH_DELIMITED, JvmClassMappingKt.getKotlinClass(Thing.class));
    }

    @Override
    public int encodedSize(Thing value) {
      return ProtoAdapter.STRING.encodedSizeWithTag(1, value.name)
          + value.unknownFields().size();
    }

    @Override
    public void encode(ProtoWriter writer, Thing value) throws IOException {
      ProtoAdapter.STRING.encodeWithTag(writer, 1, value.name);
      writer.writeBytes(value.unknownFields());
    }

    @Override
    public Thing decode(ProtoReader reader) throws IOException {
      Builder builder = new Builder();
      long token = reader.beginMessage();
      for (int tag; (tag = reader.nextTag()) != -1;) {
        switch (tag) {
          case 1: builder.name(ProtoAdapter.STRING.decode(reader)); break;
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
    public Thing redact(Thing value) {
      Builder builder = value.newBuilder();
      builder.clearUnknownFields();
      return builder.build();
    }
  }
}

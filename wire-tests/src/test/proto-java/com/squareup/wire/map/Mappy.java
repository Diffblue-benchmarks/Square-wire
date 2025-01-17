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
import java.util.Map;
import kotlin.jvm.JvmClassMappingKt;
import okio.ByteString;

public final class Mappy extends Message<Mappy, Mappy.Builder> {
  public static final ProtoAdapter<Mappy> ADAPTER = new ProtoAdapter_Mappy();

  private static final long serialVersionUID = 0L;

  @WireField(
      tag = 1,
      keyAdapter = "com.squareup.wire.ProtoAdapter#STRING",
      adapter = "com.squareup.wire.map.Thing#ADAPTER"
  )
  public final Map<String, Thing> things;

  public Mappy(Map<String, Thing> things) {
    this(things, ByteString.EMPTY);
  }

  public Mappy(Map<String, Thing> things, ByteString unknownFields) {
    super(ADAPTER, unknownFields);
    this.things = Internal.immutableCopyOf("things", things);
  }

  @Override
  public Builder newBuilder() {
    Builder builder = new Builder();
    builder.things = Internal.copyOf("things", things);
    builder.addUnknownFields(unknownFields());
    return builder;
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof Mappy)) return false;
    Mappy o = (Mappy) other;
    return unknownFields().equals(o.unknownFields())
        && things.equals(o.things);
  }

  @Override
  public int hashCode() {
    int result = super.hashCode;
    if (result == 0) {
      result = unknownFields().hashCode();
      result = result * 37 + things.hashCode();
      super.hashCode = result;
    }
    return result;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    if (!things.isEmpty()) builder.append(", things=").append(things);
    return builder.replace(0, 2, "Mappy{").append('}').toString();
  }

  public static final class Builder extends Message.Builder<Mappy, Builder> {
    public Map<String, Thing> things;

    public Builder() {
      things = Internal.newMutableMap();
    }

    public Builder things(Map<String, Thing> things) {
      Internal.checkElementsNotNull(things);
      this.things = things;
      return this;
    }

    @Override
    public Mappy build() {
      return new Mappy(things, super.buildUnknownFields());
    }
  }

  private static final class ProtoAdapter_Mappy extends ProtoAdapter<Mappy> {
    private final ProtoAdapter<Map<String, Thing>> things = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, Thing.ADAPTER);

    public ProtoAdapter_Mappy() {
      super(FieldEncoding.LENGTH_DELIMITED, JvmClassMappingKt.getKotlinClass(Mappy.class));
    }

    @Override
    public int encodedSize(Mappy value) {
      return things.encodedSizeWithTag(1, value.things)
          + value.unknownFields().size();
    }

    @Override
    public void encode(ProtoWriter writer, Mappy value) throws IOException {
      things.encodeWithTag(writer, 1, value.things);
      writer.writeBytes(value.unknownFields());
    }

    @Override
    public Mappy decode(ProtoReader reader) throws IOException {
      Builder builder = new Builder();
      long token = reader.beginMessage();
      for (int tag; (tag = reader.nextTag()) != -1;) {
        switch (tag) {
          case 1: builder.things.putAll(things.decode(reader)); break;
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
    public Mappy redact(Mappy value) {
      Builder builder = value.newBuilder();
      Internal.redactElements(builder.things, Thing.ADAPTER);
      builder.clearUnknownFields();
      return builder.build();
    }
  }
}

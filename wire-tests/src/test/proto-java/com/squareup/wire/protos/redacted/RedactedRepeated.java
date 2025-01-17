// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: redacted_test.proto
package com.squareup.wire.protos.redacted;

import com.google.protobuf.FieldOptions;
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
import java.util.Collections;
import java.util.List;
import kotlin.jvm.JvmClassMappingKt;
import okio.ByteString;

public final class RedactedRepeated extends Message<RedactedRepeated, RedactedRepeated.Builder> {
  public static final ProtoAdapter<RedactedRepeated> ADAPTER = new ProtoAdapter_RedactedRepeated();

  private static final long serialVersionUID = 0L;

  public static final FieldOptions FIELD_OPTIONS_A = new FieldOptions.Builder()
      .redacted(true)
      .build();

  @WireField(
      tag = 1,
      adapter = "com.squareup.wire.ProtoAdapter#STRING",
      label = WireField.Label.REPEATED,
      redacted = true
  )
  public final List<String> a;

  /**
   * Values in the repeated type need redacting.
   */
  @WireField(
      tag = 2,
      adapter = "com.squareup.wire.protos.redacted.Redacted#ADAPTER",
      label = WireField.Label.REPEATED
  )
  public final List<Redacted> b;

  public RedactedRepeated(List<String> a, List<Redacted> b) {
    this(a, b, ByteString.EMPTY);
  }

  public RedactedRepeated(List<String> a, List<Redacted> b, ByteString unknownFields) {
    super(ADAPTER, unknownFields);
    this.a = Internal.immutableCopyOf("a", a);
    this.b = Internal.immutableCopyOf("b", b);
  }

  @Override
  public Builder newBuilder() {
    Builder builder = new Builder();
    builder.a = Internal.copyOf("a", a);
    builder.b = Internal.copyOf("b", b);
    builder.addUnknownFields(unknownFields());
    return builder;
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof RedactedRepeated)) return false;
    RedactedRepeated o = (RedactedRepeated) other;
    return unknownFields().equals(o.unknownFields())
        && a.equals(o.a)
        && b.equals(o.b);
  }

  @Override
  public int hashCode() {
    int result = super.hashCode;
    if (result == 0) {
      result = unknownFields().hashCode();
      result = result * 37 + a.hashCode();
      result = result * 37 + b.hashCode();
      super.hashCode = result;
    }
    return result;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    if (!a.isEmpty()) builder.append(", a=██");
    if (!b.isEmpty()) builder.append(", b=").append(b);
    return builder.replace(0, 2, "RedactedRepeated{").append('}').toString();
  }

  public static final class Builder extends Message.Builder<RedactedRepeated, Builder> {
    public List<String> a;

    public List<Redacted> b;

    public Builder() {
      a = Internal.newMutableList();
      b = Internal.newMutableList();
    }

    public Builder a(List<String> a) {
      Internal.checkElementsNotNull(a);
      this.a = a;
      return this;
    }

    /**
     * Values in the repeated type need redacting.
     */
    public Builder b(List<Redacted> b) {
      Internal.checkElementsNotNull(b);
      this.b = b;
      return this;
    }

    @Override
    public RedactedRepeated build() {
      return new RedactedRepeated(a, b, super.buildUnknownFields());
    }
  }

  private static final class ProtoAdapter_RedactedRepeated extends ProtoAdapter<RedactedRepeated> {
    public ProtoAdapter_RedactedRepeated() {
      super(FieldEncoding.LENGTH_DELIMITED, JvmClassMappingKt.getKotlinClass(RedactedRepeated.class));
    }

    @Override
    public int encodedSize(RedactedRepeated value) {
      return ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(1, value.a)
          + Redacted.ADAPTER.asRepeated().encodedSizeWithTag(2, value.b)
          + value.unknownFields().size();
    }

    @Override
    public void encode(ProtoWriter writer, RedactedRepeated value) throws IOException {
      ProtoAdapter.STRING.asRepeated().encodeWithTag(writer, 1, value.a);
      Redacted.ADAPTER.asRepeated().encodeWithTag(writer, 2, value.b);
      writer.writeBytes(value.unknownFields());
    }

    @Override
    public RedactedRepeated decode(ProtoReader reader) throws IOException {
      Builder builder = new Builder();
      long token = reader.beginMessage();
      for (int tag; (tag = reader.nextTag()) != -1;) {
        switch (tag) {
          case 1: builder.a.add(ProtoAdapter.STRING.decode(reader)); break;
          case 2: builder.b.add(Redacted.ADAPTER.decode(reader)); break;
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
    public RedactedRepeated redact(RedactedRepeated value) {
      Builder builder = value.newBuilder();
      builder.a = Collections.emptyList();
      Internal.redactElements(builder.b, Redacted.ADAPTER);
      builder.clearUnknownFields();
      return builder.build();
    }
  }
}

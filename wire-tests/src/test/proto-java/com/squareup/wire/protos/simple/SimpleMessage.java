// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: simple_message.proto
package com.squareup.wire.protos.simple;

import com.google.protobuf.EnumOptions;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireEnum;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import com.squareup.wire.protos.foreign.ForeignEnum;
import java.io.IOException;
import java.lang.Boolean;
import java.lang.Deprecated;
import java.lang.Double;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.StringBuilder;
import java.util.List;
import kotlin.jvm.JvmClassMappingKt;
import okio.ByteString;

/**
 * A message for testing.
 */
public final class SimpleMessage extends Message<SimpleMessage, SimpleMessage.Builder> {
  public static final ProtoAdapter<SimpleMessage> ADAPTER = new ProtoAdapter_SimpleMessage();

  private static final long serialVersionUID = 0L;

  public static final Integer DEFAULT_OPTIONAL_INT32 = 123;

  public static final NestedEnum DEFAULT_DEFAULT_NESTED_ENUM = NestedEnum.BAZ;

  public static final Integer DEFAULT_REQUIRED_INT32 = 456;

  public static final ForeignEnum DEFAULT_DEFAULT_FOREIGN_ENUM = ForeignEnum.BAX;

  public static final ForeignEnum DEFAULT_NO_DEFAULT_FOREIGN_ENUM = ForeignEnum.BAV;

  public static final String DEFAULT_PACKAGE_ = "";

  public static final String DEFAULT_RESULT = "";

  public static final String DEFAULT_OTHER = "";

  public static final String DEFAULT_O = "";

  /**
   * An optional int32
   */
  @WireField(
      tag = 1,
      adapter = "com.squareup.wire.ProtoAdapter#INT32"
  )
  public final Integer optional_int32;

  /**
   * An optional NestedMessage, deprecated
   */
  @WireField(
      tag = 2,
      adapter = "com.squareup.wire.protos.simple.SimpleMessage$NestedMessage#ADAPTER"
  )
  @Deprecated
  public final NestedMessage optional_nested_msg;

  /**
   * An optional ExternalMessage
   */
  @WireField(
      tag = 3,
      adapter = "com.squareup.wire.protos.simple.ExternalMessage#ADAPTER"
  )
  public final ExternalMessage optional_external_msg;

  @WireField(
      tag = 4,
      adapter = "com.squareup.wire.protos.simple.SimpleMessage$NestedEnum#ADAPTER"
  )
  public final NestedEnum default_nested_enum;

  /**
   * A required int32
   */
  @WireField(
      tag = 5,
      adapter = "com.squareup.wire.ProtoAdapter#INT32",
      label = WireField.Label.REQUIRED
  )
  public final Integer required_int32;

  /**
   * A repeated double, deprecated
   */
  @WireField(
      tag = 6,
      adapter = "com.squareup.wire.ProtoAdapter#DOUBLE",
      label = WireField.Label.REPEATED
  )
  @Deprecated
  public final List<Double> repeated_double;

  /**
   * enum from another package with an explicit default
   */
  @WireField(
      tag = 7,
      adapter = "com.squareup.wire.protos.foreign.ForeignEnum#ADAPTER"
  )
  public final ForeignEnum default_foreign_enum;

  /**
   * enum from another package without an explicit default
   */
  @WireField(
      tag = 8,
      adapter = "com.squareup.wire.protos.foreign.ForeignEnum#ADAPTER"
  )
  public final ForeignEnum no_default_foreign_enum;

  /**
   * field with the same name as a Java keyword
   */
  @WireField(
      tag = 9,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final String package_;

  /**
   * field with the name "result"
   */
  @WireField(
      tag = 10,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final String result;

  /**
   * field with the name "other"
   */
  @WireField(
      tag = 11,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final String other;

  /**
   * field with the name "o"
   */
  @WireField(
      tag = 12,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final String o;

  public SimpleMessage(Integer optional_int32, NestedMessage optional_nested_msg,
      ExternalMessage optional_external_msg, NestedEnum default_nested_enum, Integer required_int32,
      List<Double> repeated_double, ForeignEnum default_foreign_enum,
      ForeignEnum no_default_foreign_enum, String package_, String result, String other, String o) {
    this(optional_int32, optional_nested_msg, optional_external_msg, default_nested_enum, required_int32, repeated_double, default_foreign_enum, no_default_foreign_enum, package_, result, other, o, ByteString.EMPTY);
  }

  public SimpleMessage(Integer optional_int32, NestedMessage optional_nested_msg,
      ExternalMessage optional_external_msg, NestedEnum default_nested_enum, Integer required_int32,
      List<Double> repeated_double, ForeignEnum default_foreign_enum,
      ForeignEnum no_default_foreign_enum, String package_, String result, String other, String o,
      ByteString unknownFields) {
    super(ADAPTER, unknownFields);
    this.optional_int32 = optional_int32;
    this.optional_nested_msg = optional_nested_msg;
    this.optional_external_msg = optional_external_msg;
    this.default_nested_enum = default_nested_enum;
    this.required_int32 = required_int32;
    this.repeated_double = Internal.immutableCopyOf("repeated_double", repeated_double);
    this.default_foreign_enum = default_foreign_enum;
    this.no_default_foreign_enum = no_default_foreign_enum;
    this.package_ = package_;
    this.result = result;
    this.other = other;
    this.o = o;
  }

  @Override
  public Builder newBuilder() {
    Builder builder = new Builder();
    builder.optional_int32 = optional_int32;
    builder.optional_nested_msg = optional_nested_msg;
    builder.optional_external_msg = optional_external_msg;
    builder.default_nested_enum = default_nested_enum;
    builder.required_int32 = required_int32;
    builder.repeated_double = Internal.copyOf("repeated_double", repeated_double);
    builder.default_foreign_enum = default_foreign_enum;
    builder.no_default_foreign_enum = no_default_foreign_enum;
    builder.package_ = package_;
    builder.result = result;
    builder.other = other;
    builder.o = o;
    builder.addUnknownFields(unknownFields());
    return builder;
  }

  @Override
  public boolean equals(Object other_) {
    if (other_ == this) return true;
    if (!(other_ instanceof SimpleMessage)) return false;
    SimpleMessage o_ = (SimpleMessage) other_;
    return unknownFields().equals(o_.unknownFields())
        && Internal.equals(optional_int32, o_.optional_int32)
        && Internal.equals(optional_nested_msg, o_.optional_nested_msg)
        && Internal.equals(optional_external_msg, o_.optional_external_msg)
        && Internal.equals(default_nested_enum, o_.default_nested_enum)
        && required_int32.equals(o_.required_int32)
        && repeated_double.equals(o_.repeated_double)
        && Internal.equals(default_foreign_enum, o_.default_foreign_enum)
        && Internal.equals(no_default_foreign_enum, o_.no_default_foreign_enum)
        && Internal.equals(package_, o_.package_)
        && Internal.equals(result, o_.result)
        && Internal.equals(other, o_.other)
        && Internal.equals(o, o_.o);
  }

  @Override
  public int hashCode() {
    int result_ = super.hashCode;
    if (result_ == 0) {
      result_ = unknownFields().hashCode();
      result_ = result_ * 37 + (optional_int32 != null ? optional_int32.hashCode() : 0);
      result_ = result_ * 37 + (optional_nested_msg != null ? optional_nested_msg.hashCode() : 0);
      result_ = result_ * 37 + (optional_external_msg != null ? optional_external_msg.hashCode() : 0);
      result_ = result_ * 37 + (default_nested_enum != null ? default_nested_enum.hashCode() : 0);
      result_ = result_ * 37 + required_int32.hashCode();
      result_ = result_ * 37 + repeated_double.hashCode();
      result_ = result_ * 37 + (default_foreign_enum != null ? default_foreign_enum.hashCode() : 0);
      result_ = result_ * 37 + (no_default_foreign_enum != null ? no_default_foreign_enum.hashCode() : 0);
      result_ = result_ * 37 + (package_ != null ? package_.hashCode() : 0);
      result_ = result_ * 37 + (result != null ? result.hashCode() : 0);
      result_ = result_ * 37 + (other != null ? other.hashCode() : 0);
      result_ = result_ * 37 + (o != null ? o.hashCode() : 0);
      super.hashCode = result_;
    }
    return result_;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    if (optional_int32 != null) builder.append(", optional_int32=").append(optional_int32);
    if (optional_nested_msg != null) builder.append(", optional_nested_msg=").append(optional_nested_msg);
    if (optional_external_msg != null) builder.append(", optional_external_msg=").append(optional_external_msg);
    if (default_nested_enum != null) builder.append(", default_nested_enum=").append(default_nested_enum);
    builder.append(", required_int32=").append(required_int32);
    if (!repeated_double.isEmpty()) builder.append(", repeated_double=").append(repeated_double);
    if (default_foreign_enum != null) builder.append(", default_foreign_enum=").append(default_foreign_enum);
    if (no_default_foreign_enum != null) builder.append(", no_default_foreign_enum=").append(no_default_foreign_enum);
    if (package_ != null) builder.append(", package=").append(package_);
    if (result != null) builder.append(", result=").append(result);
    if (other != null) builder.append(", other=").append(other);
    if (o != null) builder.append(", o=").append(o);
    return builder.replace(0, 2, "SimpleMessage{").append('}').toString();
  }

  public static final class Builder extends Message.Builder<SimpleMessage, Builder> {
    public Integer optional_int32;

    public NestedMessage optional_nested_msg;

    public ExternalMessage optional_external_msg;

    public NestedEnum default_nested_enum;

    public Integer required_int32;

    public List<Double> repeated_double;

    public ForeignEnum default_foreign_enum;

    public ForeignEnum no_default_foreign_enum;

    public String package_;

    public String result;

    public String other;

    public String o;

    public Builder() {
      repeated_double = Internal.newMutableList();
    }

    /**
     * An optional int32
     */
    public Builder optional_int32(Integer optional_int32) {
      this.optional_int32 = optional_int32;
      return this;
    }

    /**
     * An optional NestedMessage, deprecated
     */
    @Deprecated
    public Builder optional_nested_msg(NestedMessage optional_nested_msg) {
      this.optional_nested_msg = optional_nested_msg;
      return this;
    }

    /**
     * An optional ExternalMessage
     */
    public Builder optional_external_msg(ExternalMessage optional_external_msg) {
      this.optional_external_msg = optional_external_msg;
      return this;
    }

    public Builder default_nested_enum(NestedEnum default_nested_enum) {
      this.default_nested_enum = default_nested_enum;
      return this;
    }

    /**
     * A required int32
     */
    public Builder required_int32(Integer required_int32) {
      this.required_int32 = required_int32;
      return this;
    }

    /**
     * A repeated double, deprecated
     */
    @Deprecated
    public Builder repeated_double(List<Double> repeated_double) {
      Internal.checkElementsNotNull(repeated_double);
      this.repeated_double = repeated_double;
      return this;
    }

    /**
     * enum from another package with an explicit default
     */
    public Builder default_foreign_enum(ForeignEnum default_foreign_enum) {
      this.default_foreign_enum = default_foreign_enum;
      return this;
    }

    /**
     * enum from another package without an explicit default
     */
    public Builder no_default_foreign_enum(ForeignEnum no_default_foreign_enum) {
      this.no_default_foreign_enum = no_default_foreign_enum;
      return this;
    }

    /**
     * field with the same name as a Java keyword
     */
    public Builder package_(String package_) {
      this.package_ = package_;
      return this;
    }

    /**
     * field with the name "result"
     */
    public Builder result(String result) {
      this.result = result;
      return this;
    }

    /**
     * field with the name "other"
     */
    public Builder other(String other) {
      this.other = other;
      return this;
    }

    /**
     * field with the name "o"
     */
    public Builder o(String o) {
      this.o = o;
      return this;
    }

    @Override
    public SimpleMessage build() {
      if (required_int32 == null) {
        throw Internal.missingRequiredFields(required_int32, "required_int32");
      }
      return new SimpleMessage(optional_int32, optional_nested_msg, optional_external_msg, default_nested_enum, required_int32, repeated_double, default_foreign_enum, no_default_foreign_enum, package_, result, other, o, super.buildUnknownFields());
    }
  }

  public static final class NestedMessage extends Message<NestedMessage, NestedMessage.Builder> {
    public static final ProtoAdapter<NestedMessage> ADAPTER = new ProtoAdapter_NestedMessage();

    private static final long serialVersionUID = 0L;

    public static final Integer DEFAULT_BB = 0;

    /**
     * An optional int32
     */
    @WireField(
        tag = 1,
        adapter = "com.squareup.wire.ProtoAdapter#INT32"
    )
    public final Integer bb;

    public NestedMessage(Integer bb) {
      this(bb, ByteString.EMPTY);
    }

    public NestedMessage(Integer bb, ByteString unknownFields) {
      super(ADAPTER, unknownFields);
      this.bb = bb;
    }

    @Override
    public Builder newBuilder() {
      Builder builder = new Builder();
      builder.bb = bb;
      builder.addUnknownFields(unknownFields());
      return builder;
    }

    @Override
    public boolean equals(Object other) {
      if (other == this) return true;
      if (!(other instanceof NestedMessage)) return false;
      NestedMessage o = (NestedMessage) other;
      return unknownFields().equals(o.unknownFields())
          && Internal.equals(bb, o.bb);
    }

    @Override
    public int hashCode() {
      int result = super.hashCode;
      if (result == 0) {
        result = unknownFields().hashCode();
        result = result * 37 + (bb != null ? bb.hashCode() : 0);
        super.hashCode = result;
      }
      return result;
    }

    @Override
    public String toString() {
      StringBuilder builder = new StringBuilder();
      if (bb != null) builder.append(", bb=").append(bb);
      return builder.replace(0, 2, "NestedMessage{").append('}').toString();
    }

    public static final class Builder extends Message.Builder<NestedMessage, Builder> {
      public Integer bb;

      public Builder() {
      }

      /**
       * An optional int32
       */
      public Builder bb(Integer bb) {
        this.bb = bb;
        return this;
      }

      @Override
      public NestedMessage build() {
        return new NestedMessage(bb, super.buildUnknownFields());
      }
    }

    private static final class ProtoAdapter_NestedMessage extends ProtoAdapter<NestedMessage> {
      public ProtoAdapter_NestedMessage() {
        super(FieldEncoding.LENGTH_DELIMITED, JvmClassMappingKt.getKotlinClass(NestedMessage.class));
      }

      @Override
      public int encodedSize(NestedMessage value) {
        return ProtoAdapter.INT32.encodedSizeWithTag(1, value.bb)
            + value.unknownFields().size();
      }

      @Override
      public void encode(ProtoWriter writer, NestedMessage value) throws IOException {
        ProtoAdapter.INT32.encodeWithTag(writer, 1, value.bb);
        writer.writeBytes(value.unknownFields());
      }

      @Override
      public NestedMessage decode(ProtoReader reader) throws IOException {
        Builder builder = new Builder();
        long token = reader.beginMessage();
        for (int tag; (tag = reader.nextTag()) != -1;) {
          switch (tag) {
            case 1: builder.bb(ProtoAdapter.INT32.decode(reader)); break;
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
      public NestedMessage redact(NestedMessage value) {
        Builder builder = value.newBuilder();
        builder.clearUnknownFields();
        return builder.build();
      }
    }
  }

  public enum NestedEnum implements WireEnum {
    FOO(1, null),

    BAR(2, null),

    BAZ(3, null),

    @Deprecated
    BUZ(3, true);

    public static final ProtoAdapter<NestedEnum> ADAPTER = new ProtoAdapter_NestedEnum();

    public static final EnumOptions ENUM_OPTIONS = new EnumOptions.Builder()
        .allow_alias(true)
        .build();

    private final int value;

    public final Boolean deprecated;

    NestedEnum(int value, Boolean deprecated) {
      this.value = value;
      this.deprecated = deprecated;
    }

    /**
     * Return the constant for {@code value} or null.
     */
    public static NestedEnum fromValue(int value) {
      switch (value) {
        case 1: return FOO;
        case 2: return BAR;
        case 3: return BAZ;
        default: return null;
      }
    }

    @Override
    public int getValue() {
      return value;
    }

    private static final class ProtoAdapter_NestedEnum extends EnumAdapter<NestedEnum> {
      ProtoAdapter_NestedEnum() {
        super(JvmClassMappingKt.getKotlinClass(NestedEnum.class));
      }

      @Override
      protected NestedEnum fromValue(int value) {
        return NestedEnum.fromValue(value);
      }
    }
  }

  private static final class ProtoAdapter_SimpleMessage extends ProtoAdapter<SimpleMessage> {
    public ProtoAdapter_SimpleMessage() {
      super(FieldEncoding.LENGTH_DELIMITED, JvmClassMappingKt.getKotlinClass(SimpleMessage.class));
    }

    @Override
    public int encodedSize(SimpleMessage value) {
      return ProtoAdapter.INT32.encodedSizeWithTag(1, value.optional_int32)
          + NestedMessage.ADAPTER.encodedSizeWithTag(2, value.optional_nested_msg)
          + ExternalMessage.ADAPTER.encodedSizeWithTag(3, value.optional_external_msg)
          + NestedEnum.ADAPTER.encodedSizeWithTag(4, value.default_nested_enum)
          + ProtoAdapter.INT32.encodedSizeWithTag(5, value.required_int32)
          + ProtoAdapter.DOUBLE.asRepeated().encodedSizeWithTag(6, value.repeated_double)
          + ForeignEnum.ADAPTER.encodedSizeWithTag(7, value.default_foreign_enum)
          + ForeignEnum.ADAPTER.encodedSizeWithTag(8, value.no_default_foreign_enum)
          + ProtoAdapter.STRING.encodedSizeWithTag(9, value.package_)
          + ProtoAdapter.STRING.encodedSizeWithTag(10, value.result)
          + ProtoAdapter.STRING.encodedSizeWithTag(11, value.other)
          + ProtoAdapter.STRING.encodedSizeWithTag(12, value.o)
          + value.unknownFields().size();
    }

    @Override
    public void encode(ProtoWriter writer, SimpleMessage value) throws IOException {
      ProtoAdapter.INT32.encodeWithTag(writer, 1, value.optional_int32);
      NestedMessage.ADAPTER.encodeWithTag(writer, 2, value.optional_nested_msg);
      ExternalMessage.ADAPTER.encodeWithTag(writer, 3, value.optional_external_msg);
      NestedEnum.ADAPTER.encodeWithTag(writer, 4, value.default_nested_enum);
      ProtoAdapter.INT32.encodeWithTag(writer, 5, value.required_int32);
      ProtoAdapter.DOUBLE.asRepeated().encodeWithTag(writer, 6, value.repeated_double);
      ForeignEnum.ADAPTER.encodeWithTag(writer, 7, value.default_foreign_enum);
      ForeignEnum.ADAPTER.encodeWithTag(writer, 8, value.no_default_foreign_enum);
      ProtoAdapter.STRING.encodeWithTag(writer, 9, value.package_);
      ProtoAdapter.STRING.encodeWithTag(writer, 10, value.result);
      ProtoAdapter.STRING.encodeWithTag(writer, 11, value.other);
      ProtoAdapter.STRING.encodeWithTag(writer, 12, value.o);
      writer.writeBytes(value.unknownFields());
    }

    @Override
    public SimpleMessage decode(ProtoReader reader) throws IOException {
      Builder builder = new Builder();
      long token = reader.beginMessage();
      for (int tag; (tag = reader.nextTag()) != -1;) {
        switch (tag) {
          case 1: builder.optional_int32(ProtoAdapter.INT32.decode(reader)); break;
          case 2: builder.optional_nested_msg(NestedMessage.ADAPTER.decode(reader)); break;
          case 3: builder.optional_external_msg(ExternalMessage.ADAPTER.decode(reader)); break;
          case 4: {
            try {
              builder.default_nested_enum(NestedEnum.ADAPTER.decode(reader));
            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
              builder.addUnknownField(tag, FieldEncoding.VARINT, (long) e.value);
            }
            break;
          }
          case 5: builder.required_int32(ProtoAdapter.INT32.decode(reader)); break;
          case 6: builder.repeated_double.add(ProtoAdapter.DOUBLE.decode(reader)); break;
          case 7: {
            try {
              builder.default_foreign_enum(ForeignEnum.ADAPTER.decode(reader));
            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
              builder.addUnknownField(tag, FieldEncoding.VARINT, (long) e.value);
            }
            break;
          }
          case 8: {
            try {
              builder.no_default_foreign_enum(ForeignEnum.ADAPTER.decode(reader));
            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
              builder.addUnknownField(tag, FieldEncoding.VARINT, (long) e.value);
            }
            break;
          }
          case 9: builder.package_(ProtoAdapter.STRING.decode(reader)); break;
          case 10: builder.result(ProtoAdapter.STRING.decode(reader)); break;
          case 11: builder.other(ProtoAdapter.STRING.decode(reader)); break;
          case 12: builder.o(ProtoAdapter.STRING.decode(reader)); break;
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
    public SimpleMessage redact(SimpleMessage value) {
      Builder builder = value.newBuilder();
      if (builder.optional_nested_msg != null) builder.optional_nested_msg = NestedMessage.ADAPTER.redact(builder.optional_nested_msg);
      if (builder.optional_external_msg != null) builder.optional_external_msg = ExternalMessage.ADAPTER.redact(builder.optional_external_msg);
      builder.clearUnknownFields();
      return builder.build();
    }
  }
}

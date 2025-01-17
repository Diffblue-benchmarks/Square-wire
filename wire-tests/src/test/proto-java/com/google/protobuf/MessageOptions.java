// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: google/protobuf/descriptor.proto
package com.google.protobuf;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import com.squareup.wire.protos.custom_options.FooBar;
import com.squareup.wire.protos.foreign.ForeignMessage;
import java.io.IOException;
import java.lang.Boolean;
import java.lang.Float;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.StringBuilder;
import java.util.List;
import kotlin.jvm.JvmClassMappingKt;
import okio.ByteString;

public final class MessageOptions extends Message<MessageOptions, MessageOptions.Builder> {
  public static final ProtoAdapter<MessageOptions> ADAPTER = new ProtoAdapter_MessageOptions();

  private static final long serialVersionUID = 0L;

  public static final Boolean DEFAULT_MESSAGE_SET_WIRE_FORMAT = false;

  public static final Boolean DEFAULT_NO_STANDARD_DESCRIPTOR_ACCESSOR = false;

  public static final Boolean DEFAULT_DEPRECATED = false;

  public static final Boolean DEFAULT_MAP_ENTRY = false;

  public static final Float DEFAULT_MY_MESSAGE_OPTION_TWO = 0.0f;

  public static final FooBar.FooBarBazEnum DEFAULT_MY_MESSAGE_OPTION_FOUR = FooBar.FooBarBazEnum.FOO;

  /**
   * Set true to use the old proto1 MessageSet wire format for extensions.
   * This is provided for backwards-compatibility with the MessageSet wire
   * format.  You should not use this for any other reason:  It's less
   * efficient, has fewer features, and is more complicated.
   *
   * The message must be defined exactly as follows:
   *   message Foo {
   *     option message_set_wire_format = true;
   *     extensions 4 to max;
   *   }
   * Note that the message cannot have any defined fields; MessageSets only
   * have extensions.
   *
   * All extensions of your type must be singular messages; e.g. they cannot
   * be int32s, enums, or repeated messages.
   *
   * Because this is an option, the above two restrictions are not enforced by
   * the protocol compiler.
   */
  @WireField(
      tag = 1,
      adapter = "com.squareup.wire.ProtoAdapter#BOOL"
  )
  public final Boolean message_set_wire_format;

  /**
   * Disables the generation of the standard "descriptor()" accessor, which can
   * conflict with a field of the same name.  This is meant to make migration
   * from proto1 easier; new code should avoid fields named "descriptor".
   */
  @WireField(
      tag = 2,
      adapter = "com.squareup.wire.ProtoAdapter#BOOL"
  )
  public final Boolean no_standard_descriptor_accessor;

  /**
   * Is this message deprecated?
   * Depending on the target platform, this can emit Deprecated annotations
   * for the message, or it will be completely ignored; in the very least,
   * this is a formalization for deprecating messages.
   */
  @WireField(
      tag = 3,
      adapter = "com.squareup.wire.ProtoAdapter#BOOL"
  )
  public final Boolean deprecated;

  /**
   * Whether the message is an automatically generated map entry type for the
   * maps field.
   *
   * For maps fields:
   *     map<KeyType, ValueType> map_field = 1;
   * The parsed descriptor looks like:
   *     message MapFieldEntry {
   *         option map_entry = true;
   *         optional KeyType key = 1;
   *         optional ValueType value = 2;
   *     }
   *     repeated MapFieldEntry map_field = 1;
   *
   * Implementations may choose not to generate the map_entry=true message, but
   * use a native map in the target language to hold the keys and values.
   * The reflection APIs in such implementions still need to work as
   * if the field is a repeated message field.
   *
   * NOTE: Do not set the option in .proto files. Always use the maps syntax
   * instead. The option should only be implicitly set by the proto compiler
   * parser.
   */
  @WireField(
      tag = 7,
      adapter = "com.squareup.wire.ProtoAdapter#BOOL"
  )
  public final Boolean map_entry;

  /**
   * javanano_as_lite
   * The parser stores options it doesn't recognize here. See above.
   */
  @WireField(
      tag = 999,
      adapter = "com.google.protobuf.UninterpretedOption#ADAPTER",
      label = WireField.Label.REPEATED
  )
  public final List<UninterpretedOption> uninterpreted_option;

  /**
   * Extension source: custom_options.proto
   */
  @WireField(
      tag = 50001,
      adapter = "com.squareup.wire.protos.custom_options.FooBar#ADAPTER"
  )
  public final FooBar my_message_option_one;

  /**
   * Extension source: custom_options.proto
   */
  @WireField(
      tag = 50002,
      adapter = "com.squareup.wire.ProtoAdapter#FLOAT"
  )
  public final Float my_message_option_two;

  /**
   * Extension source: custom_options.proto
   */
  @WireField(
      tag = 50003,
      adapter = "com.squareup.wire.protos.custom_options.FooBar#ADAPTER"
  )
  public final FooBar my_message_option_three;

  /**
   * Extension source: custom_options.proto
   */
  @WireField(
      tag = 50004,
      adapter = "com.squareup.wire.protos.custom_options.FooBar$FooBarBazEnum#ADAPTER"
  )
  public final FooBar.FooBarBazEnum my_message_option_four;

  /**
   * Extension source: custom_options.proto
   */
  @WireField(
      tag = 50005,
      adapter = "com.squareup.wire.protos.custom_options.FooBar#ADAPTER"
  )
  public final FooBar my_message_option_five;

  /**
   * Extension source: custom_options.proto
   */
  @WireField(
      tag = 50006,
      adapter = "com.squareup.wire.protos.custom_options.FooBar#ADAPTER"
  )
  public final FooBar my_message_option_six;

  /**
   * Extension source: foreign.proto
   */
  @WireField(
      tag = 50007,
      adapter = "com.squareup.wire.protos.foreign.ForeignMessage#ADAPTER"
  )
  public final ForeignMessage foreign_message_option;

  public MessageOptions(Boolean message_set_wire_format, Boolean no_standard_descriptor_accessor,
      Boolean deprecated, Boolean map_entry, List<UninterpretedOption> uninterpreted_option,
      FooBar my_message_option_one, Float my_message_option_two, FooBar my_message_option_three,
      FooBar.FooBarBazEnum my_message_option_four, FooBar my_message_option_five,
      FooBar my_message_option_six, ForeignMessage foreign_message_option) {
    this(message_set_wire_format, no_standard_descriptor_accessor, deprecated, map_entry, uninterpreted_option, my_message_option_one, my_message_option_two, my_message_option_three, my_message_option_four, my_message_option_five, my_message_option_six, foreign_message_option, ByteString.EMPTY);
  }

  public MessageOptions(Boolean message_set_wire_format, Boolean no_standard_descriptor_accessor,
      Boolean deprecated, Boolean map_entry, List<UninterpretedOption> uninterpreted_option,
      FooBar my_message_option_one, Float my_message_option_two, FooBar my_message_option_three,
      FooBar.FooBarBazEnum my_message_option_four, FooBar my_message_option_five,
      FooBar my_message_option_six, ForeignMessage foreign_message_option,
      ByteString unknownFields) {
    super(ADAPTER, unknownFields);
    this.message_set_wire_format = message_set_wire_format;
    this.no_standard_descriptor_accessor = no_standard_descriptor_accessor;
    this.deprecated = deprecated;
    this.map_entry = map_entry;
    this.uninterpreted_option = Internal.immutableCopyOf("uninterpreted_option", uninterpreted_option);
    this.my_message_option_one = my_message_option_one;
    this.my_message_option_two = my_message_option_two;
    this.my_message_option_three = my_message_option_three;
    this.my_message_option_four = my_message_option_four;
    this.my_message_option_five = my_message_option_five;
    this.my_message_option_six = my_message_option_six;
    this.foreign_message_option = foreign_message_option;
  }

  @Override
  public Builder newBuilder() {
    Builder builder = new Builder();
    builder.message_set_wire_format = message_set_wire_format;
    builder.no_standard_descriptor_accessor = no_standard_descriptor_accessor;
    builder.deprecated = deprecated;
    builder.map_entry = map_entry;
    builder.uninterpreted_option = Internal.copyOf("uninterpreted_option", uninterpreted_option);
    builder.my_message_option_one = my_message_option_one;
    builder.my_message_option_two = my_message_option_two;
    builder.my_message_option_three = my_message_option_three;
    builder.my_message_option_four = my_message_option_four;
    builder.my_message_option_five = my_message_option_five;
    builder.my_message_option_six = my_message_option_six;
    builder.foreign_message_option = foreign_message_option;
    builder.addUnknownFields(unknownFields());
    return builder;
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof MessageOptions)) return false;
    MessageOptions o = (MessageOptions) other;
    return unknownFields().equals(o.unknownFields())
        && Internal.equals(message_set_wire_format, o.message_set_wire_format)
        && Internal.equals(no_standard_descriptor_accessor, o.no_standard_descriptor_accessor)
        && Internal.equals(deprecated, o.deprecated)
        && Internal.equals(map_entry, o.map_entry)
        && uninterpreted_option.equals(o.uninterpreted_option)
        && Internal.equals(my_message_option_one, o.my_message_option_one)
        && Internal.equals(my_message_option_two, o.my_message_option_two)
        && Internal.equals(my_message_option_three, o.my_message_option_three)
        && Internal.equals(my_message_option_four, o.my_message_option_four)
        && Internal.equals(my_message_option_five, o.my_message_option_five)
        && Internal.equals(my_message_option_six, o.my_message_option_six)
        && Internal.equals(foreign_message_option, o.foreign_message_option);
  }

  @Override
  public int hashCode() {
    int result = super.hashCode;
    if (result == 0) {
      result = unknownFields().hashCode();
      result = result * 37 + (message_set_wire_format != null ? message_set_wire_format.hashCode() : 0);
      result = result * 37 + (no_standard_descriptor_accessor != null ? no_standard_descriptor_accessor.hashCode() : 0);
      result = result * 37 + (deprecated != null ? deprecated.hashCode() : 0);
      result = result * 37 + (map_entry != null ? map_entry.hashCode() : 0);
      result = result * 37 + uninterpreted_option.hashCode();
      result = result * 37 + (my_message_option_one != null ? my_message_option_one.hashCode() : 0);
      result = result * 37 + (my_message_option_two != null ? my_message_option_two.hashCode() : 0);
      result = result * 37 + (my_message_option_three != null ? my_message_option_three.hashCode() : 0);
      result = result * 37 + (my_message_option_four != null ? my_message_option_four.hashCode() : 0);
      result = result * 37 + (my_message_option_five != null ? my_message_option_five.hashCode() : 0);
      result = result * 37 + (my_message_option_six != null ? my_message_option_six.hashCode() : 0);
      result = result * 37 + (foreign_message_option != null ? foreign_message_option.hashCode() : 0);
      super.hashCode = result;
    }
    return result;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    if (message_set_wire_format != null) builder.append(", message_set_wire_format=").append(message_set_wire_format);
    if (no_standard_descriptor_accessor != null) builder.append(", no_standard_descriptor_accessor=").append(no_standard_descriptor_accessor);
    if (deprecated != null) builder.append(", deprecated=").append(deprecated);
    if (map_entry != null) builder.append(", map_entry=").append(map_entry);
    if (!uninterpreted_option.isEmpty()) builder.append(", uninterpreted_option=").append(uninterpreted_option);
    if (my_message_option_one != null) builder.append(", my_message_option_one=").append(my_message_option_one);
    if (my_message_option_two != null) builder.append(", my_message_option_two=").append(my_message_option_two);
    if (my_message_option_three != null) builder.append(", my_message_option_three=").append(my_message_option_three);
    if (my_message_option_four != null) builder.append(", my_message_option_four=").append(my_message_option_four);
    if (my_message_option_five != null) builder.append(", my_message_option_five=").append(my_message_option_five);
    if (my_message_option_six != null) builder.append(", my_message_option_six=").append(my_message_option_six);
    if (foreign_message_option != null) builder.append(", foreign_message_option=").append(foreign_message_option);
    return builder.replace(0, 2, "MessageOptions{").append('}').toString();
  }

  public static final class Builder extends Message.Builder<MessageOptions, Builder> {
    public Boolean message_set_wire_format;

    public Boolean no_standard_descriptor_accessor;

    public Boolean deprecated;

    public Boolean map_entry;

    public List<UninterpretedOption> uninterpreted_option;

    public FooBar my_message_option_one;

    public Float my_message_option_two;

    public FooBar my_message_option_three;

    public FooBar.FooBarBazEnum my_message_option_four;

    public FooBar my_message_option_five;

    public FooBar my_message_option_six;

    public ForeignMessage foreign_message_option;

    public Builder() {
      uninterpreted_option = Internal.newMutableList();
    }

    /**
     * Set true to use the old proto1 MessageSet wire format for extensions.
     * This is provided for backwards-compatibility with the MessageSet wire
     * format.  You should not use this for any other reason:  It's less
     * efficient, has fewer features, and is more complicated.
     *
     * The message must be defined exactly as follows:
     *   message Foo {
     *     option message_set_wire_format = true;
     *     extensions 4 to max;
     *   }
     * Note that the message cannot have any defined fields; MessageSets only
     * have extensions.
     *
     * All extensions of your type must be singular messages; e.g. they cannot
     * be int32s, enums, or repeated messages.
     *
     * Because this is an option, the above two restrictions are not enforced by
     * the protocol compiler.
     */
    public Builder message_set_wire_format(Boolean message_set_wire_format) {
      this.message_set_wire_format = message_set_wire_format;
      return this;
    }

    /**
     * Disables the generation of the standard "descriptor()" accessor, which can
     * conflict with a field of the same name.  This is meant to make migration
     * from proto1 easier; new code should avoid fields named "descriptor".
     */
    public Builder no_standard_descriptor_accessor(Boolean no_standard_descriptor_accessor) {
      this.no_standard_descriptor_accessor = no_standard_descriptor_accessor;
      return this;
    }

    /**
     * Is this message deprecated?
     * Depending on the target platform, this can emit Deprecated annotations
     * for the message, or it will be completely ignored; in the very least,
     * this is a formalization for deprecating messages.
     */
    public Builder deprecated(Boolean deprecated) {
      this.deprecated = deprecated;
      return this;
    }

    /**
     * Whether the message is an automatically generated map entry type for the
     * maps field.
     *
     * For maps fields:
     *     map<KeyType, ValueType> map_field = 1;
     * The parsed descriptor looks like:
     *     message MapFieldEntry {
     *         option map_entry = true;
     *         optional KeyType key = 1;
     *         optional ValueType value = 2;
     *     }
     *     repeated MapFieldEntry map_field = 1;
     *
     * Implementations may choose not to generate the map_entry=true message, but
     * use a native map in the target language to hold the keys and values.
     * The reflection APIs in such implementions still need to work as
     * if the field is a repeated message field.
     *
     * NOTE: Do not set the option in .proto files. Always use the maps syntax
     * instead. The option should only be implicitly set by the proto compiler
     * parser.
     */
    public Builder map_entry(Boolean map_entry) {
      this.map_entry = map_entry;
      return this;
    }

    /**
     * javanano_as_lite
     * The parser stores options it doesn't recognize here. See above.
     */
    public Builder uninterpreted_option(List<UninterpretedOption> uninterpreted_option) {
      Internal.checkElementsNotNull(uninterpreted_option);
      this.uninterpreted_option = uninterpreted_option;
      return this;
    }

    public Builder my_message_option_one(FooBar my_message_option_one) {
      this.my_message_option_one = my_message_option_one;
      return this;
    }

    public Builder my_message_option_two(Float my_message_option_two) {
      this.my_message_option_two = my_message_option_two;
      return this;
    }

    public Builder my_message_option_three(FooBar my_message_option_three) {
      this.my_message_option_three = my_message_option_three;
      return this;
    }

    public Builder my_message_option_four(FooBar.FooBarBazEnum my_message_option_four) {
      this.my_message_option_four = my_message_option_four;
      return this;
    }

    public Builder my_message_option_five(FooBar my_message_option_five) {
      this.my_message_option_five = my_message_option_five;
      return this;
    }

    public Builder my_message_option_six(FooBar my_message_option_six) {
      this.my_message_option_six = my_message_option_six;
      return this;
    }

    public Builder foreign_message_option(ForeignMessage foreign_message_option) {
      this.foreign_message_option = foreign_message_option;
      return this;
    }

    @Override
    public MessageOptions build() {
      return new MessageOptions(message_set_wire_format, no_standard_descriptor_accessor, deprecated, map_entry, uninterpreted_option, my_message_option_one, my_message_option_two, my_message_option_three, my_message_option_four, my_message_option_five, my_message_option_six, foreign_message_option, super.buildUnknownFields());
    }
  }

  private static final class ProtoAdapter_MessageOptions extends ProtoAdapter<MessageOptions> {
    public ProtoAdapter_MessageOptions() {
      super(FieldEncoding.LENGTH_DELIMITED, JvmClassMappingKt.getKotlinClass(MessageOptions.class));
    }

    @Override
    public int encodedSize(MessageOptions value) {
      return ProtoAdapter.BOOL.encodedSizeWithTag(1, value.message_set_wire_format)
          + ProtoAdapter.BOOL.encodedSizeWithTag(2, value.no_standard_descriptor_accessor)
          + ProtoAdapter.BOOL.encodedSizeWithTag(3, value.deprecated)
          + ProtoAdapter.BOOL.encodedSizeWithTag(7, value.map_entry)
          + UninterpretedOption.ADAPTER.asRepeated().encodedSizeWithTag(999, value.uninterpreted_option)
          + FooBar.ADAPTER.encodedSizeWithTag(50001, value.my_message_option_one)
          + ProtoAdapter.FLOAT.encodedSizeWithTag(50002, value.my_message_option_two)
          + FooBar.ADAPTER.encodedSizeWithTag(50003, value.my_message_option_three)
          + FooBar.FooBarBazEnum.ADAPTER.encodedSizeWithTag(50004, value.my_message_option_four)
          + FooBar.ADAPTER.encodedSizeWithTag(50005, value.my_message_option_five)
          + FooBar.ADAPTER.encodedSizeWithTag(50006, value.my_message_option_six)
          + ForeignMessage.ADAPTER.encodedSizeWithTag(50007, value.foreign_message_option)
          + value.unknownFields().size();
    }

    @Override
    public void encode(ProtoWriter writer, MessageOptions value) throws IOException {
      ProtoAdapter.BOOL.encodeWithTag(writer, 1, value.message_set_wire_format);
      ProtoAdapter.BOOL.encodeWithTag(writer, 2, value.no_standard_descriptor_accessor);
      ProtoAdapter.BOOL.encodeWithTag(writer, 3, value.deprecated);
      ProtoAdapter.BOOL.encodeWithTag(writer, 7, value.map_entry);
      UninterpretedOption.ADAPTER.asRepeated().encodeWithTag(writer, 999, value.uninterpreted_option);
      FooBar.ADAPTER.encodeWithTag(writer, 50001, value.my_message_option_one);
      ProtoAdapter.FLOAT.encodeWithTag(writer, 50002, value.my_message_option_two);
      FooBar.ADAPTER.encodeWithTag(writer, 50003, value.my_message_option_three);
      FooBar.FooBarBazEnum.ADAPTER.encodeWithTag(writer, 50004, value.my_message_option_four);
      FooBar.ADAPTER.encodeWithTag(writer, 50005, value.my_message_option_five);
      FooBar.ADAPTER.encodeWithTag(writer, 50006, value.my_message_option_six);
      ForeignMessage.ADAPTER.encodeWithTag(writer, 50007, value.foreign_message_option);
      writer.writeBytes(value.unknownFields());
    }

    @Override
    public MessageOptions decode(ProtoReader reader) throws IOException {
      Builder builder = new Builder();
      long token = reader.beginMessage();
      for (int tag; (tag = reader.nextTag()) != -1;) {
        switch (tag) {
          case 1: builder.message_set_wire_format(ProtoAdapter.BOOL.decode(reader)); break;
          case 2: builder.no_standard_descriptor_accessor(ProtoAdapter.BOOL.decode(reader)); break;
          case 3: builder.deprecated(ProtoAdapter.BOOL.decode(reader)); break;
          case 7: builder.map_entry(ProtoAdapter.BOOL.decode(reader)); break;
          case 999: builder.uninterpreted_option.add(UninterpretedOption.ADAPTER.decode(reader)); break;
          case 50001: builder.my_message_option_one(FooBar.ADAPTER.decode(reader)); break;
          case 50002: builder.my_message_option_two(ProtoAdapter.FLOAT.decode(reader)); break;
          case 50003: builder.my_message_option_three(FooBar.ADAPTER.decode(reader)); break;
          case 50004: {
            try {
              builder.my_message_option_four(FooBar.FooBarBazEnum.ADAPTER.decode(reader));
            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
              builder.addUnknownField(tag, FieldEncoding.VARINT, (long) e.value);
            }
            break;
          }
          case 50005: builder.my_message_option_five(FooBar.ADAPTER.decode(reader)); break;
          case 50006: builder.my_message_option_six(FooBar.ADAPTER.decode(reader)); break;
          case 50007: builder.foreign_message_option(ForeignMessage.ADAPTER.decode(reader)); break;
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
    public MessageOptions redact(MessageOptions value) {
      Builder builder = value.newBuilder();
      Internal.redactElements(builder.uninterpreted_option, UninterpretedOption.ADAPTER);
      if (builder.my_message_option_one != null) builder.my_message_option_one = FooBar.ADAPTER.redact(builder.my_message_option_one);
      if (builder.my_message_option_three != null) builder.my_message_option_three = FooBar.ADAPTER.redact(builder.my_message_option_three);
      if (builder.my_message_option_five != null) builder.my_message_option_five = FooBar.ADAPTER.redact(builder.my_message_option_five);
      if (builder.my_message_option_six != null) builder.my_message_option_six = FooBar.ADAPTER.redact(builder.my_message_option_six);
      if (builder.foreign_message_option != null) builder.foreign_message_option = ForeignMessage.ADAPTER.redact(builder.foreign_message_option);
      builder.clearUnknownFields();
      return builder.build();
    }
  }
}

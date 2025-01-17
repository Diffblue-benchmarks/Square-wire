// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: roots.proto
package com.squareup.wire.protos.roots;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;
import java.lang.Override;
import kotlin.jvm.JvmClassMappingKt;

public enum G implements WireEnum {
  FOO(1),

  BAR(2);

  public static final ProtoAdapter<G> ADAPTER = new ProtoAdapter_G();

  private final int value;

  G(int value) {
    this.value = value;
  }

  /**
   * Return the constant for {@code value} or null.
   */
  public static G fromValue(int value) {
    switch (value) {
      case 1: return FOO;
      case 2: return BAR;
      default: return null;
    }
  }

  @Override
  public int getValue() {
    return value;
  }

  private static final class ProtoAdapter_G extends EnumAdapter<G> {
    ProtoAdapter_G() {
      super(JvmClassMappingKt.getKotlinClass(G.class));
    }

    @Override
    protected G fromValue(int value) {
      return G.fromValue(value);
    }
  }
}

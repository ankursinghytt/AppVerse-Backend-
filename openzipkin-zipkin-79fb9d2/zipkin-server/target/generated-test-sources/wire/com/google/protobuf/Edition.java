// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: google/protobuf/descriptor.proto
package com.google.protobuf;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import java.lang.Override;

/**
 * The full set of known editions.
 */
public enum Edition implements WireEnum {
  /**
   * A placeholder for an unknown edition value.
   */
  EDITION_UNKNOWN(0),

  /**
   * Legacy syntax "editions".  These pre-date editions, but behave much like
   * distinct editions.  These can't be used to specify the edition of proto
   * files, but feature definitions must supply proto2/proto3 defaults for
   * backwards compatibility.
   */
  EDITION_PROTO2(998),

  EDITION_PROTO3(999),

  /**
   * Editions that have been released.  The specific values are arbitrary and
   * should not be depended on, but they will always be time-ordered for easy
   * comparison.
   */
  EDITION_2023(1000),

  /**
   * Placeholder editions for testing feature resolution.  These should not be
   * used or relyed on outside of tests.
   */
  EDITION_1_TEST_ONLY(1),

  EDITION_2_TEST_ONLY(2),

  EDITION_99997_TEST_ONLY(99997),

  EDITION_99998_TEST_ONLY(99998),

  EDITION_99999_TEST_ONLY(99999);

  public static final ProtoAdapter<Edition> ADAPTER = new ProtoAdapter_Edition();

  private final int value;

  Edition(int value) {
    this.value = value;
  }

  /**
   * Return the constant for {@code value} or null.
   */
  public static Edition fromValue(int value) {
    switch (value) {
      case 0: return EDITION_UNKNOWN;
      case 998: return EDITION_PROTO2;
      case 999: return EDITION_PROTO3;
      case 1000: return EDITION_2023;
      case 1: return EDITION_1_TEST_ONLY;
      case 2: return EDITION_2_TEST_ONLY;
      case 99997: return EDITION_99997_TEST_ONLY;
      case 99998: return EDITION_99998_TEST_ONLY;
      case 99999: return EDITION_99999_TEST_ONLY;
      default: return null;
    }
  }

  @Override
  public int getValue() {
    return value;
  }

  private static final class ProtoAdapter_Edition extends EnumAdapter<Edition> {
    ProtoAdapter_Edition() {
      super(Edition.class, Syntax.PROTO_2, Edition.EDITION_UNKNOWN);
    }

    @Override
    protected Edition fromValue(int value) {
      return Edition.fromValue(value);
    }
  }
}

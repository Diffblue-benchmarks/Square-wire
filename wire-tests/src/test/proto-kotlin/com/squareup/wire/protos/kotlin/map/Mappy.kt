// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: map.proto
package com.squareup.wire.protos.kotlin.map

import com.squareup.wire.FieldEncoding
import com.squareup.wire.Message
import com.squareup.wire.ProtoAdapter
import com.squareup.wire.ProtoReader
import com.squareup.wire.ProtoWriter
import com.squareup.wire.TagHandler
import com.squareup.wire.WireField
import com.squareup.wire.internal.redactElements
import kotlin.AssertionError
import kotlin.Deprecated
import kotlin.DeprecationLevel
import kotlin.Int
import kotlin.Nothing
import kotlin.String
import kotlin.collections.Map
import kotlin.jvm.JvmField
import okio.ByteString

data class Mappy(
  @field:WireField(
    tag = 1,
    keyAdapter = "com.squareup.wire.ProtoAdapter#STRING",
    adapter = "com.squareup.wire.protos.kotlin.map.Thing#ADAPTER"
  )
  val things: Map<String, Thing>,
  val unknownFields: ByteString = ByteString.EMPTY
) : Message<Mappy, Nothing>(ADAPTER, unknownFields) {
  @Deprecated(
    message = "Shouldn't be used in Kotlin",
    level = DeprecationLevel.HIDDEN
  )
  override fun newBuilder(): Nothing {
    throw AssertionError()
  }

  companion object {
    @JvmField
    val ADAPTER: ProtoAdapter<Mappy> = object : ProtoAdapter<Mappy>(
      FieldEncoding.LENGTH_DELIMITED, 
      Mappy::class
    ) {
      private val thingsAdapter: ProtoAdapter<Map<String, Thing>> =
          ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, Thing.ADAPTER)

      override fun encodedSize(value: Mappy): Int = 
        thingsAdapter.encodedSizeWithTag(1, value.things) +
        value.unknownFields.size

      override fun encode(writer: ProtoWriter, value: Mappy) {
        thingsAdapter.encodeWithTag(writer, 1, value.things)
        writer.writeBytes(value.unknownFields)
      }

      override fun decode(reader: ProtoReader): Mappy {
        val things = mutableMapOf<String, Thing>()
        val unknownFields = reader.forEachTag { tag ->
          when (tag) {
            1 -> things.putAll(thingsAdapter.decode(reader))
            else -> TagHandler.UNKNOWN_TAG
          }
        }
        return Mappy(
          things = things,
          unknownFields = unknownFields
        )
      }

      override fun redact(value: Mappy): Mappy = value.copy(
        things = value.things.redactElements(Thing.ADAPTER),
        unknownFields = ByteString.EMPTY
      )
    }
  }
}

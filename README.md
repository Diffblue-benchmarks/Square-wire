Wire Protocol Buffers
=====================

*“A man got to have a code!”* - Omar Little

As our teams and programs grow, the variety and volume of data also grows. Success will turn your
simple data models into complex ones! Whether your application is storing data to disk or
transmitting it over a network, the structure and interpretation of that data should be clear.
Consumers work best with data they understand!

Schemas describe and document data models. If you have data, you should have a schema.

Protocol Buffers
----------------

[Google's Protocol Buffers][google_protos] are built around a great schema language:

 * It's cross platform and language independent. Whatever programming language you use, you'll be
   able to use proto schemas with your application.

 * Proto schemas are backwards-compatible and future-proof. You can evolve your schema as your
   application loses old features and gains new ones.

 * It's focused. Proto schemas describe your data models. That's it.

Here's a sample message definition:

```proto
syntax = "proto2";

package squareup.dinosaurs;

option java_package = "com.squareup.dinosaurs";

import "squareup/geology/period.proto";

message Dinosaur {
  // Common name of this dinosaur, like "Stegosaurus".
  optional string name = 1;

  // URLs with images of this dinosaur.
  repeated string picture_urls = 2;

  optional squareup.geology.Period period = 5;
}
```

And here's an enum definition:

```proto
syntax = "proto2";

package squareup.geology;

option java_package = "com.squareup.geology";

enum Period {
  // 145.5 million years ago — 66.0 million years ago.
  CRETACEOUS = 1;

  // 201.3 million years ago — 145.0 million years ago.
  JURASSIC = 2;

  // 252.17 million years ago — 201.3 million years ago.
  TRIASSIC = 3;
}
```

This schema language is Protocol Buffers' best feature. You might even use it purely for
documentation purposes, such as to describe a JSON API.

Protocol Buffers also defines a compact binary encoding of messages that conform to the schema. This
encoding is fast to encode, fast to decode, small to transmit, and small to store. The binary
encoding uses numeric tags from the schema, like the `5` for `period` above.

For example, let's encode this dinosaur:

```
{
  name: "Stegosaurus",
  period: JURASSIC
}
```

The encoded value is just 15 bytes:

```
Hex  Description
 0a  tag: name(1), field encoding: LENGTH_DELIMITED(2). 1 << 3 | 2
 0b  "Stegosaurus".length()
 53  'S'
 74  't'
 65  'e'
 67  'g'
 6f  'o'
 73  's'
 61  'a'
 75  'u'
 72  'r'
 75  'u'
 73  's'
 28  tag: period(5), field encoding: VARINT(0). 5 << 3 | 0
 02  JURASSIC(2)
```

Why Wire?
---------

The Protocol Buffers schema language and binary encoding are both defined by Google. Wire is an
independent implementation from Square that's specifically designed for Android and Java.

For each message type defined in the schema, Wire generates an immutable model class and its
builder. The generated code looks like code you'd write by hand: it's documented, formatted, and
simple. Wire's APIs should feel at home to programmers who like [Effective Java][effective_java].

That said, there are some interesting design decisions in Wire:

 * Wire messages declare `public final` fields instead of the usual getter methods. This cuts down
   on both code generated and code executed. Less code is particularly beneficial for Android
   programs.

 * Wire avoids case mapping. A field declared as `picture_urls` in a schema yields a Java field
   `picture_urls` and not the conventional `pictureUrls` camel case. Though the name feels awkward
   at first, it's fantastic whenever you use `grep` or more sophisticated search tools. No more
   mapping when navigating between schema, Java source code, and data. It also provides a gentle
   reminder to calling code that proto messages are a bit special.

 * Primitive types are always boxed. If a field is absent, its value is `null`. This is used for
   naturally optional fields, such as a dinosaur whose period is unknown. A field may also be null
   due to schema evolution: if tomorrow we add a `carnivore` boolean to our message definition,
   today's data won’t have a value for that field.

Here's the compact generated code for the `Dinosaur` message defined above:

```java
// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: squareup/dinosaurs/dinosaur.proto at 9:1
package com.squareup.dinosaurs;

import com.squareup.geology.Period;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireField;
import java.util.List;
import okio.ByteString;

public final class Dinosaur extends Message<Dinosaur, Dinosaur.Builder> {
  public static final ProtoAdapter<Dinosaur> ADAPTER = ProtoAdapter.newMessageAdapter(Dinosaur.class);

  private static final long serialVersionUID = 0L;

  public static final String DEFAULT_NAME = "";

  public static final Period DEFAULT_PERIOD = Period.CRETACEOUS;

  /**
   * Common name of this dinosaur, like "Stegosaurus".
   */
  @WireField(
      tag = 1,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final String name;

  /**
   * URLs with images of this dinosaur.
   */
  @WireField(
      tag = 2,
      adapter = "com.squareup.wire.ProtoAdapter#STRING",
      label = WireField.Label.REPEATED
  )
  public final List<String> picture_urls;

  @WireField(
      tag = 5,
      adapter = "com.squareup.geology.Period#ADAPTER"
  )
  public final Period period;

  public Dinosaur(String name, List<String> picture_urls, Period period) {
    this(name, picture_urls, period, ByteString.EMPTY);
  }

  public Dinosaur(String name, List<String> picture_urls, Period period, ByteString unknownFields) {
    super(unknownFields);
    this.name = name;
    this.picture_urls = immutableCopyOf("picture_urls", picture_urls);
    this.period = period;
  }

  @Override
  public Builder newBuilder() {
    Builder builder = new Builder();
    builder.name = name;
    builder.picture_urls = copyOf("picture_urls", picture_urls);
    builder.period = period;
    builder.addUnknownFields(unknownFields());
    return builder;
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof Dinosaur)) return false;
    Dinosaur o = (Dinosaur) other;
    return equals(unknownFields(), o.unknownFields())
        && equals(name, o.name)
        && equals(picture_urls, o.picture_urls)
        && equals(period, o.period);
  }

  @Override
  public int hashCode() {
    int result = super.hashCode;
    if (result == 0) {
      result = unknownFields().hashCode();
      result = result * 37 + (name != null ? name.hashCode() : 0);
      result = result * 37 + (picture_urls != null ? picture_urls.hashCode() : 1);
      result = result * 37 + (period != null ? period.hashCode() : 0);
      super.hashCode = result;
    }
    return result;
  }

  public static final class Builder extends com.squareup.wire.Message.Builder<Dinosaur, Builder> {
    public String name;

    public List<String> picture_urls;

    public Period period;

    public Builder() {
      picture_urls = newMutableList();
    }

    /**
     * Common name of this dinosaur, like "Stegosaurus".
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * URLs with images of this dinosaur.
     */
    public Builder picture_urls(List<String> picture_urls) {
      checkElementsNotNull(picture_urls);
      this.picture_urls = picture_urls;
      return this;
    }

    public Builder period(Period period) {
      this.period = period;
      return this;
    }

    @Override
    public Dinosaur build() {
      return new Dinosaur(name, picture_urls, period, buildUnknownFields());
    }
  }
}
```

The Java code to create and access proto models is compact and readable:

```java
Dinosaur stegosaurus = new Dinosaur.Builder()
    .name("Stegosaurus")
    .period(Period.JURASSIC)
    .build();

System.out.println("My favorite dinosaur existed in the " + stegosaurus.period + " period.");
```

Each type has a corresponding `ProtoAdapter` that can encode a message to bytes and decode bytes
back into a message.

```java
Dinosaur stegosaurus = ...
byte[] stegosaurusBytes = Dinosaur.ADAPTER.encode(stegosaurus);

byte[] tyrannosaurusBytes = ...
Dinosaur tyrannosaurus = Dinosaur.ADAPTER.decode(tyrannosaurusBytes);
```

When accessing a field, use `Wire.get()` to replace null values with the corresponding default:

```java
Period period = Wire.get(stegosaurus.period, Dinosaur.DEFAULT_PERIOD);
```

This is equivalent to the following:

```
Period period = stegosaurus.period != null ? stegosaurus.period : Dinosaur.DEFAULT_PERIOD;
```


Generating Code With Wire
-------------------------

Wire's compiler is available via a Maven plugin. Put `.proto` sources in your project's
`src/main/proto` directory, then use the plugin to generate `.java` files. The plugin will
automatically add the generated Java code to your project's source roots.

```xml
<build>
  <plugins>
    <plugin>
      <groupId>com.squareup.wire</groupId>
      <artifactId>wire-maven-plugin</artifactId>
      <version>${project.version}</version>
      <executions>
        <execution>
          <phase>generate-sources</phase>
          <goals>
            <goal>generate-sources</goal>
          </goals>
          <configuration>
            <includes>
              <!-- proto package names to generate code for -->
              <include>squareup.dinosaurs.*</include>
              <include>squareup.geology.*</include>
            </includes>
          </configuration>
        </execution>
      </executions>
    </plugin>
  </plugins>
</build>
```

Wire can read `.proto` files from the local file system and from within `.jar` files.

The compiler can optionally prune your schema to a subset of root types and their transitive
dependencies. This is useful when sharing a schema between projects: a Java service and Android app
may each use a subset of a larger shared schema.

If you don't use Maven, the compiler also has a command line interface. Just substitute
`wire-compiler-VERSION-jar-with-dependencies.jar` with the path to your jar. [Download](https://search.maven.org/remote_content?g=com.squareup.wire&a=wire-compiler&c=jar-with-dependencies&v=LATEST) the latest precompiled jar.

    % java -jar wire-compiler-VERSION-jar-with-dependencies.jar \
        --proto_path=src/main/proto \
        --java_out=out \
        squareup/dinosaurs/dinosaur.proto \
        squareup/geology/period.proto
    Writing com.squareup.dinosaurs.Dinosaur to out
    Writing com.squareup.geology.Period to out

Supplying the `--android` flag to the compiler causes Wire messages to implement `Parcelable`.

If you use Proguard, then you need to add `keep` rules.  The simplest option is to tell Proguard not
to touch the Wire runtime library and your generated protocol buffers (of course these simple rules
will miss opportunities to shrink and optimize the code):

    -keep class com.squareup.wire.** { *; }
    -keep class com.yourcompany.yourgeneratedcode.** { *; }


Get Wire
--------

The `wire-runtime` package contains runtime support libraries that must be included in applications
that use Wire-generated code.

With Maven:

```xml
<dependency>
  <groupId>com.squareup.wire</groupId>
  <artifactId>wire-runtime</artifactId>
  <version>2.2.0</version>
</dependency>
```

With Gradle:

```groovy
compile 'com.squareup.wire:wire-runtime:2.2.0'
```

### Wire 3 Alpha

With Maven:

```xml
<dependency>
  <groupId>com.squareup.wire</groupId>
  <artifactId>wire-runtime</artifactId>
  <version>3.0.0-alpha02</version>
</dependency>
```

With Gradle:

```groovy
api 'com.squareup.wire:wire-runtime:3.0.0-alpha02'
```

Snapshots of the development version are available in [Sonatype's `snapshots` repository][snap].


Unsupported
-----------

Wire does not support:

 * Groups - they are skipped when parsing binary input data

Wire supports custom options on messages and fields. Other custom options are ignored. Pass
`--excludes=google.protobuf.*` to the compiler to omit options from the generated code.


Further Documentation
---------------------

See [Google's excellent documentation][schema_docs] on the structure and syntax of proto schemas.

 [google_protos]: https://developers.google.com/protocol-buffers/docs/overview
 [effective_java]: https://www.amazon.ca/Effective-Java-3rd-Joshua-Bloch/dp/0134685997/
 [schema_docs]: https://developers.google.com/protocol-buffers/docs/proto
 [dl_runtime]: https://search.maven.org/remote_content?g=com.squareup.wire&a=wire-runtime&v=LATEST
 [dl_compiler]: https://search.maven.org/remote_content?g=com.squareup.wire&a=wire-compiler&v=LATEST&c=jar-with-dependencies
 [snap]: https://oss.sonatype.org/content/repositories/snapshots/

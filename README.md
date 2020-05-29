# leftpad

![build](https://github.com/asakaev/leftpad/workflows/build/badge.svg)
[![Maven Central](https://img.shields.io/maven-central/v/io.github.asakaev/leftpad_2.13.svg)](https://maven-badges.herokuapp.com/maven-central/io.github.asakaev/leftpad_2.13)

String left pad heavily inspired by [left-pad](https://github.com/left-pad/left-pad/).

### Install

```
libraryDependencies += "io.github.asakaev" %% "leftpad" % "0.1.1"
```

### Usage

```scala
import io.github.asakaev.leftpad.string._

leftPad("foo", 5)
// => "  foo"

leftPad("foobar", 6)
// => "foobar"

leftPad("1", 2, '0')
// => "01"

leftPad("17", 5, 0)
// => "00017"
```

## License

leftpad is licensed under the MIT license.

## leftpad

String left pad heavily inspired by [left-pad](https://github.com/left-pad/left-pad/).

## Install

```
libraryDependencies += "io.github.asakaev" %% "leftpad" % "0.1.0"
```

## Usage

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

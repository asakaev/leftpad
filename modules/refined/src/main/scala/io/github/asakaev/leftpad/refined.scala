package io.github.asakaev.leftpad

import eu.timepit.refined.types.numeric.PosInt

object refined {

  def leftPad(str: String, len: PosInt, ch: Char = ' '): String =
    core.leftPad(str.toList, len.value, ch).mkString

}

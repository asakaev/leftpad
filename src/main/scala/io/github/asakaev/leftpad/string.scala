package io.github.asakaev.leftpad

object string {

  def leftPad(str: String, len: Int, ch: Char = ' '): String =
    core.leftPad(str.toList, len, ch).mkString

}

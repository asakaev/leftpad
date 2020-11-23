package io.github.asakaev.leftpad

object core {

  def leftPad[A](as: List[A], n: Int, a: A): List[A] = {
    val size = as.size
    if (n <= size) as else List.fill(n - size)(a) ++ as
  }

}

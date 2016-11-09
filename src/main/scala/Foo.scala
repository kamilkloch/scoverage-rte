class Foo {
  def bar(): Unit = try {
    1
    return
  } finally {}
}

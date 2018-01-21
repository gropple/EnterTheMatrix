import enterthematrix.{Matrix4x4, Vector4}
import org.scalatest.FunSuite

class Examples extends FunSuite {
  test("example 1") {
    val m1 = Matrix4x4.identity
    val m2 = Matrix4x4.scale(1.0f)
    val m3 = Matrix4x4.rotateAroundXAxis(30.0f)
    val m4: Matrix4x4 = m3 * m2 * m1

    val v1 = Vector4(0.2f, 0.3f, 0.4f, 1.0f)
    val v2: Vector4 = m4 * v1
  }
}
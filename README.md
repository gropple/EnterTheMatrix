# Enter the Matrix
A simple immutable library for vector and matrix maths, written in Scala.

## Usage
Just clone and include in your project.

The library is very straightforward and basically works exactly how you'd expect:
```
    val m1 = Matrix4x4.identity
    val m2 = Matrix4x4.scale(1.0f)
    val m3 = Matrix4x4.rotateAroundXAxis(30.0f)
    val m4: Matrix4x4 = m3 * m2 * m1
    
    val v1 = Vector4(0.2f, 0.3f, 0.4f, 1.0f)
    val v2: Vector4 = m4 * v1
```

There are float (Matrix4x4, Vector3 and Vector4) and double (Matrix4x4d, Vector3d and Vector4d) of everything, so you can get the precision/performance that you need.

## Licence
It's released under the MIT licence so do as you please with it.  Please feel free to send PRs though.
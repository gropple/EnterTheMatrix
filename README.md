# Enter the Matrix
A simple immutable library for vector and matrix maths, written in Scala.

## Rational
The [LWJGL](http://www.lwjgl.org/) (Lightweight Java Games Library) is a great project, but version 3 removed the useful vector & matrix library.  

This project provides a very simple, lightweight zero-dependency library that you can use with LWJGL, and understand and use in seconds. 

## Usage
Just clone and include in your project.  There are no dependencies.

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

## With OpenGL LWJGL
To turn into a FloatBuffer ready for use with LWJGL OpenGL:
```
  import java.nio.FloatBuffer
  import org.lwjgl.BufferUtils

  def convertMatrixToBuffer(m: Matrix4x4): FloatBuffer = {
    val buffer = BufferUtils.createFloatBuffer(16)
    buffer.put(m.r0c0).put(m.r1c0).put(m.r2c0).put(m.r3c0)
    buffer.put(m.r0c1).put(m.r1c1).put(m.r2c1).put(m.r3c1)
    buffer.put(m.r0c2).put(m.r1c2).put(m.r2c2).put(m.r3c2)
    buffer.put(m.r0c3).put(m.r1c3).put(m.r2c3).put(m.r3c3)
    buffer.flip
    buffer
  }
```

## Licence
It's released under the MIT licence so do as you please with it.  Please feel free to send PRs though.
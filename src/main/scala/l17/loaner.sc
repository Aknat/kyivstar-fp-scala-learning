import java.io.InputStream._
import java.io._

def withFile(path: String) (block: InputStream => Unit): Unit = {

  var resource: InputStream = null
  try {

    resource = new FilterInputStream(new File(path))

    block(resource)

  } catch {
    case t: Throwable => println("error: " + t)
  } finally {
    if (resource != null) resource.close()
  }
}

withFile("1.json") { file =>
  val i = file.read()
}
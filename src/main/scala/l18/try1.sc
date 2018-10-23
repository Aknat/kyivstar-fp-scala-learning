import scala.util.Try

val divide = Try {
  1 / 0
}

divide

divide.isFailure

divide match {

  case scala.util.Success(value) => println(s"result = $value")
  case scala.util.Failure(exception) => println(s"exception text: ${exception.getMessage}")

}
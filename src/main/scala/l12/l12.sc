class Session(hosts:String, user:String, password:String) {

  def exec(sql: String): String = s"$sql was executed"
}
object Session {

  def validate(sql: String): Boolean = !sql.isEmpty

}

object DB {

  private val user = "user"
  private val password = "password"
  private val hosts = "127.0.0.1:9042, 127.0.0.1:9043"

  def connect(): Session = new Session(hosts, user, password)
}

val session = DB.connect()
session.exec(sql = "SELECT * FROM my.users")

Session.validate(sql = "234")


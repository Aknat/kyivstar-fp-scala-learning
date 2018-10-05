import java.util.UUID

import com.sun.tools.internal.xjc.reader.xmlschema.bindinfo.BIConversion.User

case class User(id: UUID, name: String)

object DB {

  private val id = UUID.fromString("635884a5-6f97-47af-9473-770afa5bb153")

  private val users = Map(
   id -> User(id, "Vasya")
  )

  def getUser(id: UUID) =  users.get(id)
}

val id = UUID.fromString("635884a5-6f97-47af-9473-770afa5bb153")

val user = DB.getUser(id)

user match {
  case Some(value) => println(s"user name is ${value.name}")
  case None => println(s"user not found in DB")
}

val u = User(id, "user2", Adress("blabla", 95))

val User(_, name, Adress(s, n)) = u

println(n)
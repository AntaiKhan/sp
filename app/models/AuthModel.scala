package models
import java.sql.Timestamp


case class ServiceProvider(id: Long, name: String, address: String, phoneNumber: String,
                           email: String, var verified: Boolean, var activated: Boolean, createdAt: Timestamp,
                           modifiedAt: Timestamp)

def create
class AuthModel {


}



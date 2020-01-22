package xyz.florentforest.sparkconfigexample

import com.typesafe.config.Config
import scala.collection.JavaConverters._

/**
 * @author lorenzoraimondi
 * Settings class for configuration.
 */
class Configuration(config: Config) extends Serializable {

    val string = config.getString("string")
    val int_number = config.getInt("int_number")

    val float_number = config.getFloat("float_number")
    val formatted_string = config.getString("formatted_string")

    val map_number = config.getInt("map.number")
    val map_string = config.getString("map.string")
    val map_long_string = config.getString("map.long_string")

}

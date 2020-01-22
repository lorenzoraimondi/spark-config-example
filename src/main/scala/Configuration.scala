package xyz.florentforest.sparkconfigexample

import com.typesafe.config.Config
import scala.collection.JavaConverters._

/**
 * @author lorenzoraimondi
 * Settings class for configuration.
 */
class Configuration(config: Config) extends Serializable {

    val env = config.getString("env")
    val app_db = config.getString("mdev_db")
    val data_db = config.getString("serving_db")

    val kudu_uri = config.getString("kudu.master")
    val kudu_prefix = config.getString("kudu.prefix")

    val table1 = config.getString("kudu.tables.project")
    val table2 = config.getString("kudu.tables.mapping")
    val table3 = config.getString("kudu.tables.logs")

}

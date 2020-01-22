package xyz.florentforest.sparkconfigexample

import org.apache.spark.sql.SparkSession
import org.apache.spark.sql.functions.{col, not, lower, desc}
import com.typesafe.config.{Config, ConfigFactory}

/**
 * @author lorenzo.raimondi
 * Example using JSON Superset features.
 */
object ConfigTypesTest {
    def main(args: Array[String]) {

        // Load configuration into Settings class
        val conf: Config = ConfigFactory.load()
        val settings: Configuration = new Configuration(conf)

        val spark: SparkSession = SparkSession.builder()
                                              .appName("Types Test (config)")
                                              .getOrCreate()
        import spark.implicits._

        // Business logic

        System.out.println(settings.string)
        System.out.println(settings.int_number)
        System.out.println(settings.float_number)
        System.out.println(settings.formatted_string)
        System.out.println(settings.map_number)
        System.out.println(settings.map_string)
        System.out.println(settings.map_long_string)

        spark.stop()

    }
}

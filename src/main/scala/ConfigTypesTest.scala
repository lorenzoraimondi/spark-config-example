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

        System.out.println("Environment: " + settings.env)
        System.out.println("Application DB: " + settings.app_db)
        System.out.println("Serving DB: " + settings.data_db)
        System.out.println("DB URI: " + settings.kudu_uri)
        System.out.println("DB Table Prefix: " + settings.kudu_prefix)
        System.out.println("Table 1: " + settings.table1)
        System.out.println("Table 2: " + settings.table2)
        System.out.println("Table 3: " + settings.table3)

        spark.stop()

    }
}

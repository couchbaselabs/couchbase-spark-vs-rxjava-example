package com.couchbase;

import com.couchbase.spark.japi.CouchbaseSparkContext;
import org.apache.spark.SparkConf;
import org.apache.spark.api.java.JavaSparkContext;

import static com.couchbase.spark.japi.CouchbaseSparkContext.couchbaseContext;

public class SimpleApp {
    public static void main(String[] args) {
        /*SparkConf conf = new SparkConf()
                .setAppName("Simple Application")
                .setMaster("local[*]")
                .set("com.couchbase.bucket.default", "");
        JavaSparkContext sc = new JavaSparkContext(conf);
        CouchbaseSparkContext csc = couchbaseContext(sc);
        Spark spark = new Spark(sc);
        spark.csvToCouchbase("/Users/nraboy/Desktop/couchbase-spark-vs-rxjava-example/data/NationalNames.csv");*/
        RxJava rxJava = new RxJava("http://localhost:8091", "default", "/Users/nraboy/Desktop/couchbase-spark-vs-rxjava-example/data/NationalNames.csv");
        rxJava.csvToCouchbase();
    }
}

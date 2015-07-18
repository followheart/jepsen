(defproject jepsen.mongodb-rocks "0.1.0-SNAPSHOT"
  :description "Jepsen tests for mongodb+rocksdb"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.6.0"]
                 [jepsen.mongodb "0.1.1-SNAPSHOT" :exclusions [jepsen]]
                 [jepsen "0.0.5-SNAPSHOT"]])

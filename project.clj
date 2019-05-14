(defproject wiktionary "0.0.3-SNAPSHOT"
  :description "Get word definitions from Wiktionary"
  :url "https://github.com/leonardiwagner/wiktionary"
  :license {:name "Apache License"
            :url  "http://www.apache.org/licenses/LICENSE-2.0"}
  :author "Wagner Leonardi"
  :profiles {:dev {:resource-paths ["test/resources"]}}
  :exclusions [org.clojure/clojure]
  :dependencies [[org.clojure/clojure "1.8.0"] [enlive "1.1.6"]]
  :main wiktionary.core)

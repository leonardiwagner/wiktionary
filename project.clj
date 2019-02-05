(defproject wiktionary "0.0.1-SNAPSHOT"
  :dependencies [
                 [org.clojure/clojure "1.8.0"]
                 [enlive "1.1.5"]]
  :main ^:skip-aot wiktionary.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})

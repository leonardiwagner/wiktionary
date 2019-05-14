(ns wiktionary.core-test
  (:require [clojure.test :refer :all]
            [wiktionary.page-reader :as page-reader]
            [wiktionary.core :as wiktionary]))

(defn read-page-stub [word]
  (-> (clojure.java.io/resource "apple.html")
      (slurp)))

(deftest get-word-definition
  (with-redefs [page-reader/read-page read-page-stub]
    (let [result (wiktionary/get-definitions "you" "english")
          expected-result ["pronoun" "determiner" "verb"]]
      (is (= result expected-result)))))

(ns wiktionary.core-test
  (:require [clojure.test :refer :all]
            [wiktionary.core :as wiktionary]))

(deftest get-word-definition
  (let [result (wiktionary/get-definitions "you")
        expected-result ["pronoun" "determiner" "verb"]]
    (is (= result expected-result))))

(deftest get-word-definition-from-other-language
  (let [result (wiktionary/get-definitions "zij" "dutch")
        expected-result ["pronoun" "noun" "verb"]]
    (is (= result expected-result))))

(deftest return-empty-if-word-is-inexistent
  (let [result (wiktionary/get-definitions "yalu")
        expected-result []]
    (is (= result expected-result))))

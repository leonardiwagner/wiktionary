(ns wiktionary.core-test
  (:require [clojure.test :refer :all]
            [wiktionary.html-reader :as html-reader]))

(deftest return-large-data-for-existing-word
  (let [result (html-reader/read "you")]
    (is (instance? String result))
    (is (> (count result) 500000))))

(deftest return-nil-for-non-existent-word
  (is (nil?
        (html-reader/read "yyyy"))))
